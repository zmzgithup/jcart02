package io.zmz.jcartadministrationback.controller;

import io.zmz.jcartadministrationback.dto.in.ProductCreateInDTO;
import io.zmz.jcartadministrationback.dto.in.ProductSearchInDTO;
import io.zmz.jcartadministrationback.dto.in.ProductUpdateInDTO;
import io.zmz.jcartadministrationback.dto.out.PageOutDTO;
import io.zmz.jcartadministrationback.dto.out.ProductListOutDTO;
import io.zmz.jcartadministrationback.dto.out.ProductShowOutDTO;
import io.zmz.jcartadministrationback.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,
                                                @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public ProductShowOutDTO getById(@RequestParam Integer productId){
        return null;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody ProductCreateInDTO productCreateInDTO){
        Integer productId = productService.create(productCreateInDTO);
        return productId;
    }

    @PostMapping("/update")
    public void update(@RequestBody ProductUpdateInDTO productUpdateInDTO){
        productService.update(productUpdateInDTO);
    }
}
