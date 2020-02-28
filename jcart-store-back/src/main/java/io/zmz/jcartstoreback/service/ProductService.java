package io.zmz.jcartstoreback.service;

import com.github.pagehelper.Page;
import io.zmz.jcartstoreback.dto.out.ProductListOutDTO;
import io.zmz.jcartstoreback.dto.out.ProductShowOutDTO;

public interface ProductService {
    Page<ProductListOutDTO> search(Integer pageNum);

    ProductShowOutDTO getById(Integer productId);
}
