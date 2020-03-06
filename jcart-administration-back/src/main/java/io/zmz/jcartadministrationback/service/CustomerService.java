package io.zmz.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.zmz.jcartadministrationback.dto.in.CustomerSetStatusInDTO;
import io.zmz.jcartadministrationback.po.Customer;

public interface CustomerService {
    Customer getById(Integer customerId);

    Page<Customer> search(Integer pageNum);

    void setStatus(CustomerSetStatusInDTO customerSetStatusInDTO);
}
