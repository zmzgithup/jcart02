package io.zmz.jcartstoreback.controller;

import io.zmz.jcartstoreback.dto.in.OrderCheckoutInDTO;
import io.zmz.jcartstoreback.dto.out.OrderListOutDTO;
import io.zmz.jcartstoreback.dto.out.OrderShowOutDTO;
import io.zmz.jcartstoreback.dto.out.PageOutDTO;
import io.zmz.jcartstoreback.dto.out.ProductShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @PostMapping("/checkout")
    public Integer checkout(@RequestBody OrderCheckoutInDTO orderCheckoutInDTO,
                            @RequestAttribute Integer customerId){
        return null;
    }

    @GetMapping("/getList")
    public PageOutDTO<OrderListOutDTO> getList(@RequestAttribute Integer customerId){
        return null;
    }

    @GetMapping("/getById")
    public OrderShowOutDTO getById(@RequestParam Long orderId){
        return null;
    }
}
