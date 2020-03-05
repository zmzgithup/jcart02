package io.zmz.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.zmz.jcartadministrationback.dto.out.OrderListOutDTO;
import io.zmz.jcartadministrationback.dto.out.OrderShowOutDTO;

public interface OrderService {
    Page<OrderListOutDTO> search(Integer pageNum);

    OrderShowOutDTO getById(Long orderId);
}
