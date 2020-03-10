package io.zmz.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.zmz.jcartadministrationback.dto.in.OrderSearchInDTO;
import io.zmz.jcartadministrationback.dto.out.OrderListOutDTO;
import io.zmz.jcartadministrationback.dto.out.OrderShowOutDTO;

public interface OrderService {
    Page<OrderListOutDTO> search(OrderSearchInDTO orderSearchInDTO, Integer pageNum);

    OrderShowOutDTO getById(Long orderId);
}
