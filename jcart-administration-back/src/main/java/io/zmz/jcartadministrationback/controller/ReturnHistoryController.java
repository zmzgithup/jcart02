package io.zmz.jcartadministrationback.controller;

import io.zmz.jcartadministrationback.dto.in.ReturnHistoryCreateInDTO;
import io.zmz.jcartadministrationback.dto.out.ReturnHistoryListOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/returnhostory")
@CrossOrigin
public class ReturnHistoryController {

    @GetMapping("/getListByReturnId")
    public List<ReturnHistoryListOutDTO> getListByReturnId(@RequestParam Integer pageNum){
        return null;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody ReturnHistoryCreateInDTO returnHistoryCreateInDTO){
        return null;
    }
}
