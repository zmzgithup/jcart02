package io.zmz.jcartadministrationback.controller;

import com.github.pagehelper.Page;
import io.zmz.jcartadministrationback.dto.in.CustomerSetStatusInDTO;
import io.zmz.jcartadministrationback.dto.out.AddressShowOutDTO;
import io.zmz.jcartadministrationback.dto.out.CustomerListOutDTO;
import io.zmz.jcartadministrationback.dto.out.CustomerShowOutDTO;
import io.zmz.jcartadministrationback.dto.out.PageOutDTO;
import io.zmz.jcartadministrationback.po.Address;
import io.zmz.jcartadministrationback.po.Customer;
import io.zmz.jcartadministrationback.service.AddressService;
import io.zmz.jcartadministrationback.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private AddressService addressService;

    @GetMapping("/search")
    public PageOutDTO<CustomerListOutDTO> search(CustomerShowOutDTO customerShowOutDTO,
                                                 @RequestParam(required = false,defaultValue = "1") Integer pageNum){
        Page<Customer> page = customerService.search(pageNum);
        List<CustomerListOutDTO> customerListOutDTOS = page.stream().map(customer -> {
            CustomerListOutDTO customerListOutDTO = new CustomerListOutDTO();
            customerListOutDTO.setCustomerId(customer.getCustomerId());
            customerListOutDTO.setUsername(customer.getUsername());
            customerListOutDTO.setRealName(customer.getRealName());
            customerListOutDTO.setEmail(customer.getEmail());
            customerListOutDTO.setMobile(customer.getMobile());
            customerListOutDTO.setStatus(customer.getStatus());
            customerListOutDTO.setCreateTimestamp(customer.getCreateTime().getTime());
            return customerListOutDTO;
        }).collect(Collectors.toList());


        PageOutDTO<CustomerListOutDTO> pageOutDTO = new PageOutDTO<>();
        pageOutDTO.setTotal(page.getTotal());
        pageOutDTO.setPageNum(page.getPageNum());
        pageOutDTO.setPageSize(page.getPageSize());
        pageOutDTO.setList(customerListOutDTOS);
        return pageOutDTO;
    }

    @GetMapping("/getById")
    public CustomerShowOutDTO getById(@RequestParam Integer customerId){
        Customer customer = customerService.getById(customerId);


        CustomerShowOutDTO customerShowOutDTO = new CustomerShowOutDTO();
        customerShowOutDTO.setCustomerId(customerId);
        customerShowOutDTO.setUsername(customer.getUsername());
        customerShowOutDTO.setRealName(customer.getRealName());
        customerShowOutDTO.setMobile(customer.getMobile());
        customerShowOutDTO.setEmail(customer.getEmail());
        customerShowOutDTO.setAvatarUrl(customer.getAvatarUrl());
        customerShowOutDTO.setStatus(customer.getStatus());
        customerShowOutDTO.setRewordPoints(customer.getRewordPoints());
        customerShowOutDTO.setNewsSubscribed(customer.getNewsSubscribed());
        customerShowOutDTO.setCreateTimestamp(customer.getCreateTime().getTime());
        customerShowOutDTO.setDefaultAddressId(customer.getDefaultAddressId());

        Address defaultAddress = addressService.getById(customer.getDefaultAddressId());
        if (defaultAddress != null){
            customerShowOutDTO.setDefaultAddress(defaultAddress.getContent());
        }
        return customerShowOutDTO;
    }

    @PostMapping("/setStatus")
    public void setStatus(@RequestBody CustomerSetStatusInDTO customerSetStatusInDTO){
        customerService.setStatus(customerSetStatusInDTO);
    }
}
