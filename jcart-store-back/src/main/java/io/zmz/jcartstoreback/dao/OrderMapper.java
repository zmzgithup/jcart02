package io.zmz.jcartstoreback.dao;

import com.github.pagehelper.Page;
import io.zmz.jcartstoreback.po.Order;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMapper {
    int deleteByPrimaryKey(Long orderId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    Page<Order> getByCustomerId(@Param("customerId") Integer customerId);
}