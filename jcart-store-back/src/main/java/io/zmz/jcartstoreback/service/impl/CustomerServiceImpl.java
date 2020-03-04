package io.zmz.jcartstoreback.service.impl;

import at.favre.lib.crypto.bcrypt.BCrypt;
import io.zmz.jcartstoreback.dao.CustomerMapper;
import io.zmz.jcartstoreback.dto.in.CustomerRegisterInDTO;
import io.zmz.jcartstoreback.enumeration.CustomerStatus;
import io.zmz.jcartstoreback.po.Customer;
import io.zmz.jcartstoreback.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public Integer register(CustomerRegisterInDTO customerRegisterInDTO) {
        Customer customer = new Customer();
        customer.setUsername(customerRegisterInDTO.getUsername());
        customer.setRealName(customerRegisterInDTO.getRealName());
        customer.setEmail(customerRegisterInDTO.getEmail());
        customer.setEmailVerified(false);
        customer.setMobile(customerRegisterInDTO.getMobile());
        customer.setMobileVerified(false);
        customer.setNewsSubscribed(customerRegisterInDTO.getNewsSubscribed());
        customer.setCreateTime(new Date());
        customer.setStatus((byte)CustomerStatus.Enable.ordinal());
        customer.setRewordPoints(0);

        String password = customerRegisterInDTO.getPassword();
        String bcryptHashString = BCrypt.withDefaults().hashToString(12, password.toCharArray());
        customer.setEncryptedPassword(bcryptHashString);
        customerMapper.insertSelective(customer);
        Integer customerId = customer.getCustomerId();
        return customerId;
    }

    @Override
    public Customer getByUsername(String username) {
        Customer customer = customerMapper.selectByUserName(username);
        return customer;
    }

    @Override
    public Customer getById(Integer customerId) {
        return customerMapper.selectByPrimaryKey(customerId);
    }

    @Override
    public void update(Customer customer) {
        customerMapper.updateByPrimaryKeySelective(customer);
    }

    @Override
    public Customer getByEmail(String email) {
        return customerMapper.selectByEmail(email);
    }
}
