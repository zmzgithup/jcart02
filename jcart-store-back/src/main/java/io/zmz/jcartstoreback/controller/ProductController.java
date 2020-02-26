package io.zmz.jcartstoreback.controller;

import io.zmz.jcartstoreback.dto.in.ProductSearchInDTO;
import io.zmz.jcartstoreback.dto.out.PageOutDTO;
import io.zmz.jcartstoreback.dto.out.ProductListOutDTO;
import io.zmz.jcartstoreback.dto.out.ProductShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,
                                                @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public ProductShowOutDTO getById(@RequestParam Integer productId){
        return null;
    }

}
