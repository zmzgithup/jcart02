package io.zmz.jcartstoreback.service;

import com.github.pagehelper.Page;
import io.zmz.jcartstoreback.dto.in.OrderCheckoutInDTO;
import io.zmz.jcartstoreback.dto.out.OrderShowOutDTO;
import io.zmz.jcartstoreback.po.Order;

public interface OrderService {
    Long checkout(OrderCheckoutInDTO orderCheckoutInDTO, Integer customerId);

    Page<Order> getByCustomerId(Integer pageNum,Integer customerId);

    OrderShowOutDTO getById(Long orderId);
}
