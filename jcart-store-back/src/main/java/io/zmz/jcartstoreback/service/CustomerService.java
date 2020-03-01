package io.zmz.jcartstoreback.service;

import io.zmz.jcartstoreback.dto.in.CustomerRegisterInDTO;
import io.zmz.jcartstoreback.po.Customer;

public interface CustomerService {
    Integer register(CustomerRegisterInDTO customerRegisterInDTO);

    Customer getByUsername(String username);
}
