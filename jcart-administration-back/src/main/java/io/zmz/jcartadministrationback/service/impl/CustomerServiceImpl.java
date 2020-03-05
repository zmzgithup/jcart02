package io.zmz.jcartadministrationback.service.impl;

import io.zmz.jcartadministrationback.dao.CustomerMapper;
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
}
