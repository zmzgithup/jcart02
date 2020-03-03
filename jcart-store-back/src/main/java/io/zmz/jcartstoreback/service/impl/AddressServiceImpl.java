package io.zmz.jcartstoreback.service.impl;

import io.zmz.jcartstoreback.dao.AddressMapper;
import io.zmz.jcartstoreback.po.Address;
import io.zmz.jcartstoreback.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressMapper addressMapper;

    @Override
    public List<Address> getByCustomerId(Integer customerId) {
        List<Address> address = addressMapper.selectByCustomerId(customerId);
        return address;
    }

    @Override
    public void create(Address address) {
        addressMapper.insertSelective(address);
    }

    @Override
    public void update(Address address) {
        addressMapper.updateByPrimaryKeySelective(address);
    }

    @Override
    public void delete(Integer addressId) {
        addressMapper.deleteByPrimaryKey(addressId);
    }


}
