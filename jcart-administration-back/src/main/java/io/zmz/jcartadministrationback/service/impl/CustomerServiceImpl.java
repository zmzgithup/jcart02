package io.zmz.jcartadministrationback.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import io.zmz.jcartadministrationback.dao.CustomerMapper;
import io.zmz.jcartadministrationback.dto.in.CustomerSetStatusInDTO;
import io.zmz.jcartadministrationback.dto.out.CustomerShowOutDTO;
import io.zmz.jcartadministrationback.po.Customer;
import io.zmz.jcartadministrationback.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public Customer getById(Integer customerId) {
        return customerMapper.selectByPrimaryKey(customerId);
    }

    @Override
    public Page<Customer> search(CustomerShowOutDTO customerShowOutDTO, Integer pageNum) {
        PageHelper.startPage(pageNum,10);

        return customerMapper.search(customerShowOutDTO.getUsername(),
                                    customerShowOutDTO.getRealName(),
                                    customerShowOutDTO.getMobile(),
                                    customerShowOutDTO.getEmail(),
                                    customerShowOutDTO.getStatus());
    }

    @Override
    public void setStatus(CustomerSetStatusInDTO customerSetStatusInDTO) {
        Customer customer = new Customer();
        customer.setCustomerId(customerSetStatusInDTO.getCustomerId());
        customer.setStatus(customerSetStatusInDTO.getStatus());
        customerMapper.updateByPrimaryKeySelective(customer);
    }
}
