package io.zmz.jcartstoreback.service;

import io.zmz.jcartstoreback.dto.in.OrderCheckoutInDTO;

public interface OrderService {
    Long checkout(OrderCheckoutInDTO orderCheckoutInDTO, Integer customerId);
}
