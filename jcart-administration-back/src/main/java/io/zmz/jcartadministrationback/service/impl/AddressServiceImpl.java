package io.zmz.jcartadministrationback.service.impl;

import io.zmz.jcartadministrationback.dao.AddressMapper;
import io.zmz.jcartadministrationback.po.Address;
import io.zmz.jcartadministrationback.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressMapper addressMapper;

    @Override
    public List<Address> getByCustomerId(Integer customerId) {
        return addressMapper.selectByCustomerId(customerId);
    }

    @Override
    public Address getById(Integer addressId) {
        return addressMapper.selectByPrimaryKey(addressId);
    }
}
