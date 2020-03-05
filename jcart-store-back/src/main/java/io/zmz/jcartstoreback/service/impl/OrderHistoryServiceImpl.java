package io.zmz.jcartstoreback.service.impl;

import io.zmz.jcartstoreback.dao.OrderHistoryMapper;
import io.zmz.jcartstoreback.po.OrderHistory;
import io.zmz.jcartstoreback.service.OrderHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderHistoryServiceImpl implements OrderHistoryService {

    @Autowired
    private OrderHistoryMapper orderHistoryMapper;
    @Override
    public List<OrderHistory> getByOrderId(Long orderId) {
        List<OrderHistory> orderHistory = orderHistoryMapper.selectByOrderId(orderId);
        return orderHistory;
    }
}
