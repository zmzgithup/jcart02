package io.zmz.jcartadministrationback.service.impl;

import io.zmz.jcartadministrationback.dao.OrderHistoryMapper;
import io.zmz.jcartadministrationback.po.OrderHistory;
import io.zmz.jcartadministrationback.service.OrderHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderHistoryServiceImpl implements OrderHistoryService {
    @Autowired
    private OrderHistoryMapper orderHistoryMapper;

    @Override
    public List<OrderHistory> getByOrderId(Long orderId) {

        return orderHistoryMapper.selectByOrderId(orderId);
    }

    @Override
    public Long create(OrderHistory orderHistory) {
        orderHistoryMapper.insertSelective(orderHistory);
        Long orderHistoryId = orderHistory.getOrderHistoryId();
        return orderHistoryId;
    }
}
