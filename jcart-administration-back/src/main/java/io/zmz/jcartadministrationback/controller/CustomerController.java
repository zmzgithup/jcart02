package io.zmz.jcartadministrationback.controller;

import io.zmz.jcartadministrationback.dto.out.CustomerListOutDTO;
import io.zmz.jcartadministrationback.dto.out.CustomerShowOutDTO;
import io.zmz.jcartadministrationback.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping("/search")
    public PageOutDTO<CustomerListOutDTO> search(CustomerShowOutDTO customerShowOutDTO,
                                                 @RequestParam(required = false) Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public CustomerShowOutDTO getById(@RequestParam Integer customerId){
        return null;
    }

    @PostMapping("/disable")
    public void disable(@RequestParam Integer customerId){

    }
}
