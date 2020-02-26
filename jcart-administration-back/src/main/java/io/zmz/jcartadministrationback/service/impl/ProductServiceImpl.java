package io.zmz.jcartadministrationback.service.impl;

import com.alibaba.fastjson.JSON;
import io.zmz.jcartadministrationback.dao.ProductDetailMapper;
import io.zmz.jcartadministrationback.dao.ProductMapper;
import io.zmz.jcartadministrationback.dto.in.ProductCreateInDTO;
import io.zmz.jcartadministrationback.dto.in.ProductUpdateInDTO;
import io.zmz.jcartadministrationback.po.Product;
import io.zmz.jcartadministrationback.po.ProductDetail;
import io.zmz.jcartadministrationback.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.Provider;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ProductDetailMapper productDetailMapper;



    @Override
    public Integer create(ProductCreateInDTO productCreateInDTO) {
        Product product = new Product();
        product.setProductCode(productCreateInDTO.getProductCode());
        product.setProductName(productCreateInDTO.getProductName());
        product.setPrice(productCreateInDTO.getPrice());
        product.setDiscount(productCreateInDTO.getDiscount());
        product.setStockQuantity(productCreateInDTO.getStockQuantity());
        product.setStatus(productCreateInDTO.getStatus());
        product.setMainPicUrl(productCreateInDTO.getMainPicUrl());
        product.setRewordPoints(productCreateInDTO.getRewordPoints());
        product.setSortOrder(productCreateInDTO.getSortOrder());
        String description = productCreateInDTO.getDescription();
        description.substring(0,Math.min(100,description.length()));
        product.setProductAbstract(description);
        productMapper.insertSelective(product);
        Integer productId = product.getProductId();
        ProductDetail productDetail = new ProductDetail();
        productDetail.setProductId(productId);
        productDetail.setDescription(productCreateInDTO.getDescription());
        List<String> otherPicUrls = productCreateInDTO.getOtherPicUrls();
        productDetail.setOtherPicUrls(JSON.toJSONString(otherPicUrls));
        productDetailMapper.insertSelective(productDetail);
        return productId;
    }

    @Override
    public void update(ProductUpdateInDTO productUpdateInDTO) {
        Product product = new Product();
        product.setProductId(productUpdateInDTO.getProductId());
        product.setProductName(productUpdateInDTO.getProductName());
        product.setPrice(productUpdateInDTO.getPrice());
        product.setDiscount(productUpdateInDTO.getDiscount());
        product.setStockQuantity(productUpdateInDTO.getStockQuantity());
        product.setStatus(productUpdateInDTO.getStatus());
        product.setMainPicUrl(productUpdateInDTO.getMainPicUrl());
        product.setRewordPoints(productUpdateInDTO.getRewordPoints());
        product.setSortOrder(productUpdateInDTO.getSortOrder());
        String description = productUpdateInDTO.getDescription();
        description.substring(0,Math.min(100,description.length()));
        product.setProductAbstract(description);
        productMapper.updateByPrimaryKeySelective(product);


        ProductDetail productDetail = new ProductDetail();
        productDetail.setProductId(productUpdateInDTO.getProductId());
        productDetail.setDescription(productUpdateInDTO.getDescription());
        List<String> otherPicUrls = productUpdateInDTO.getOtherPicUrls();
        productDetail.setOtherPicUrls(JSON.toJSONString(otherPicUrls));
        productDetailMapper.updateByPrimaryKeySelective(productDetail);
    }
}
