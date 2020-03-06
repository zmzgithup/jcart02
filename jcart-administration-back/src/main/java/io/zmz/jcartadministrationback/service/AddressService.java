package io.zmz.jcartadministrationback.service;

import io.zmz.jcartadministrationback.po.Address;

import java.util.List;

public interface AddressService {
    List<Address> getByCustomerId(Integer customerId);

    Address getById(Integer addressId);
}
