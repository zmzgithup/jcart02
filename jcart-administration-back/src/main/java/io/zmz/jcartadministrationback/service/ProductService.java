package io.zmz.jcartadministrationback.service;

import io.zmz.jcartadministrationback.dto.in.ProductCreateInDTO;
import io.zmz.jcartadministrationback.dto.in.ProductUpdateInDTO;

public interface ProductService {
    Integer create(ProductCreateInDTO productCreateInDTO);

    void update(ProductUpdateInDTO productUpdateInDTO);
}
