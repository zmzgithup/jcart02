package io.zmz.jcartadministrationback.controller;

import io.zmz.jcartadministrationback.dto.in.ProductCreateInDTO;
import io.zmz.jcartadministrationback.dto.in.ProductUpdateInDTO;
import io.zmz.jcartadministrationback.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/product")
    public PageOutDTO<ProductController> search(@RequestParam(required = false) String productCode,
                                                @RequestParam(required = false) String productName,
                                                @RequestParam(required = false) Double price,
                                                @RequestParam(required = false) Integer quantity,
                                                @RequestParam(required = false) Byte status,
                                                @RequestParam(required = false, defaultValue = "1") Integer pageNum){
        return null;
    }


    @PostMapping("/update")
    public void update(@RequestBody ProductUpdateInDTO productUpdateInDTO){

    }

    @PostMapping("/create")
    public Integer create(@RequestBody ProductCreateInDTO productCreateInDTO){
        return null;
    }
}
