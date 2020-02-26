package io.zmz.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.zmz.jcartadministrationback.dto.in.ProductCreateInDTO;
import io.zmz.jcartadministrationback.dto.in.ProductUpdateInDTO;
import io.zmz.jcartadministrationback.dto.out.ProductListOutDTO;
import io.zmz.jcartadministrationback.dto.out.ProductShowOutDTO;

import java.util.List;

public interface ProductService {
    Integer create(ProductCreateInDTO productCreateInDTO);

    void update(ProductUpdateInDTO productUpdateInDTO);

    ProductShowOutDTO getById(Integer productId);

    void delete(Integer productId);

    void batchdelete(List<Integer> productIds);

    Page<ProductListOutDTO> search(Integer pageNum);
}
