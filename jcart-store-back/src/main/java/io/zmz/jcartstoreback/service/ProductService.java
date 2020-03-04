package io.zmz.jcartstoreback.service;

import com.github.pagehelper.Page;
import io.zmz.jcartstoreback.dto.out.ProductListOutDTO;
import io.zmz.jcartstoreback.dto.out.ProductShowOutDTO;
import io.zmz.jcartstoreback.po.Product;

public interface ProductService {

    Product getById(Integer productId);

    Page<ProductListOutDTO> search(Integer pageNum);

    ProductShowOutDTO getShowById(Integer productId);
}
