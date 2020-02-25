package io.zmz.jcartadministrationback.controller;

import io.zmz.jcartadministrationback.dto.out.AddressListOutDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {


    @GetMapping("/getListByCustomerId")
    public List<AddressListOutDTO> getListByCustomerId(){
        return null;
    }
}
