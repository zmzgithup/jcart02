package io.zmz.jcartadministrationback.controller;

import com.sun.org.apache.xpath.internal.operations.Or;
import io.zmz.jcartadministrationback.dto.in.OrderHistoryCreateInDTO;
import io.zmz.jcartadministrationback.dto.out.OrderHistoryListOutDTO;
import io.zmz.jcartadministrationback.po.OrderHistory;
import io.zmz.jcartadministrationback.service.OrderHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/orderhistory")
@CrossOrigin
public class OrderHistoryController {
    @Autowired
    private OrderHistoryService orderHistoryService;

    @GetMapping("/getByOrderId")
    public List<OrderHistoryListOutDTO> getByOrderId(@RequestParam Long orderId){
        List<OrderHistory> orderHistories = orderHistoryService.getByOrderId(orderId);

        List<OrderHistoryListOutDTO> orderHistoryListOutDTOS = orderHistories.stream().map(orderHistory -> {
            OrderHistoryListOutDTO orderHistoryListOutDTO = new OrderHistoryListOutDTO();
            orderHistoryListOutDTO.setOrderHistoryId(orderHistory.getOrderHistoryId());
            orderHistoryListOutDTO.setTimestamp(orderHistory.getTime().getTime());
            orderHistoryListOutDTO.setOrderStatus(orderHistory.getOrderStatus());
            orderHistoryListOutDTO.setComment(orderHistory.getComment());
            orderHistoryListOutDTO.setCustomerNotified(orderHistory.getCustomerNotified());
            return orderHistoryListOutDTO;
        }).collect(Collectors.toList());
        return orderHistoryListOutDTOS;
    }

    @PostMapping("/create")
    public Long create(@RequestBody OrderHistoryCreateInDTO orderHistoryCreateInDTO){

        OrderHistory orderHistory = new OrderHistory();
        orderHistory.setOrderId(orderHistoryCreateInDTO.getOrderId());
        orderHistory.setTime(new Date());
        orderHistory.setOrderStatus(orderHistoryCreateInDTO.getOrderStatus());
        orderHistory.setComment(orderHistoryCreateInDTO.getComment());
        orderHistory.setCustomerNotified(orderHistoryCreateInDTO.getCustomerNotified());

        Long orderHistoryId = orderHistoryService.create(orderHistory);
        return orderHistoryId;
    }
}
