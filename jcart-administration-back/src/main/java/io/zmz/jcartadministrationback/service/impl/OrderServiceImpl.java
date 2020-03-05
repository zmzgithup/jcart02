package io.zmz.jcartadministrationback.service.impl;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import io.zmz.jcartadministrationback.dao.OrderDetailMapper;
import io.zmz.jcartadministrationback.dao.OrderMapper;
import io.zmz.jcartadministrationback.dto.out.OrderListOutDTO;
import io.zmz.jcartadministrationback.service.CustomerService;
import io.zmz.jcartadministrationback.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderDetailMapper orderDetailMapper;

    @Autowired
    private CustomerService customerService;
    @Override
    public Page<OrderListOutDTO> search(Integer pageNum) {
        PageHelper.startPage(pageNum,10);
        Page<OrderListOutDTO> page  = orderMapper.search();
        return page;
    }
}
