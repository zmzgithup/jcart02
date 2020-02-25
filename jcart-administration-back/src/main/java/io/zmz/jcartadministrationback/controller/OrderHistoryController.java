package io.zmz.jcartadministrationback.controller;

import io.zmz.jcartadministrationback.dto.in.OrderHistoryCreateInDTO;
import io.zmz.jcartadministrationback.dto.out.OrderHistoryListOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orderhistory")
public class OrderHistoryController {

    @GetMapping("/getByOrderId")
    public List<OrderHistoryListOutDTO> getByOrderId(Long orderHistoryId){
        return null;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody OrderHistoryCreateInDTO orderHistoryCreateInDTO){
        return null;
    }
}
