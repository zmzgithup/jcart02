package io.zmz.jcartadministrationback.dao;

import io.zmz.jcartadministrationback.po.Product;
import io.zmz.jcartadministrationback.po.ProductDetail;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDetailMapper {
    int deleteByPrimaryKey(Integer productId);

    int insert(ProductDetail record);

    int insertSelective(ProductDetail record);

    ProductDetail selectByPrimaryKey(Integer productId);

    int updateByPrimaryKeySelective(ProductDetail record);

    int updateByPrimaryKeyWithBLOBs(ProductDetail record);

    int updateByPrimaryKey(ProductDetail record);

    void batchDelete(@Param("productIds") List<Integer> productIds);
}