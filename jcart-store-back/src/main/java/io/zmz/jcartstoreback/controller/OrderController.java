package io.zmz.jcartstoreback.controller;

import io.zmz.jcartstoreback.dto.in.OrderCheckoutInDTO;
import io.zmz.jcartstoreback.dto.out.OrderListOutDTO;
import io.zmz.jcartstoreback.dto.out.OrderShowOutDTO;
import io.zmz.jcartstoreback.dto.out.PageOutDTO;
import io.zmz.jcartstoreback.dto.out.ProductShowOutDTO;
import io.zmz.jcartstoreback.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@CrossOrigin
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/checkout")
    public Long checkout(@RequestBody OrderCheckoutInDTO orderCheckoutInDTO,
                            @RequestAttribute Integer customerId){
        Long orderId = orderService.checkout(orderCheckoutInDTO,customerId);
        return orderId;
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
