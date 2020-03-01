package io.zmz.jcartadministrationback.dao;

import io.zmz.jcartadministrationback.po.OrderHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderHistoryMapper {
    int deleteByPrimaryKey(Long orderHistoryId);

    int insert(OrderHistory record);

    int insertSelective(OrderHistory record);

    OrderHistory selectByPrimaryKey(Long orderHistoryId);

    int updateByPrimaryKeySelective(OrderHistory record);

    int updateByPrimaryKey(OrderHistory record);
}