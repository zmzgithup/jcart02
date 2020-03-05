package io.zmz.jcartadministrationback.service;

import io.zmz.jcartadministrationback.po.Customer;

public interface CustomerService {
    Customer getById(Integer customerId);
}
