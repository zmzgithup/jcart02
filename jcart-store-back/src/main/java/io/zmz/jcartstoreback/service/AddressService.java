package io.zmz.jcartstoreback.service;

import io.zmz.jcartstoreback.po.Address;

import java.util.List;

public interface AddressService {
    List<Address> getByCustomerId(Integer customerId);

    void create(Address address);

    void update(Address address);

    void delete(Integer addressId);
}
