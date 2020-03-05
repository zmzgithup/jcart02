package io.zmz.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.zmz.jcartadministrationback.dto.out.OrderListOutDTO;

public interface OrderService {
    Page<OrderListOutDTO> search(Integer pageNum);
}
