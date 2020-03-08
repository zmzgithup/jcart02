package io.zmz.jcartadministrationback.controller;

import io.zmz.jcartadministrationback.dto.in.ReturnHistoryCreateInDTO;
import io.zmz.jcartadministrationback.dto.out.ReturnHistoryListOutDTO;
import io.zmz.jcartadministrationback.po.ReturnHistory;
import io.zmz.jcartadministrationback.service.ReturnHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/returnhistory")
@CrossOrigin
public class ReturnHistoryController {
    @Autowired
    private ReturnHistoryService returnHistoryService;

    @GetMapping("/getListByReturnId")
    public List<ReturnHistoryListOutDTO> getListByReturnId(@RequestParam Integer returnId){
        List<ReturnHistory> returnHistories = returnHistoryService.getListByReturnId(returnId);


        List<ReturnHistoryListOutDTO> returnHistoryListOutDTOS = returnHistories.stream().map(returnHistory -> {
            ReturnHistoryListOutDTO returnHistoryListOutDTO = new ReturnHistoryListOutDTO();
            returnHistoryListOutDTO.setComment(returnHistory.getComment());
            returnHistoryListOutDTO.setCustomerNotified(returnHistory.getCustomerNotified());
            returnHistoryListOutDTO.setReturnHistoryId(returnHistory.getReturnHistoryId());
            returnHistoryListOutDTO.setReturnStatus(returnHistory.getReturnStatus());
            returnHistoryListOutDTO.setTimestamp(returnHistory.getTime().getTime());
            return returnHistoryListOutDTO;
        }).collect(Collectors.toList());


        return returnHistoryListOutDTOS;
    }

    @PostMapping("/create")
    public Long create(@RequestBody ReturnHistoryCreateInDTO returnHistoryCreateInDTO){
        ReturnHistory returnHistory = new ReturnHistory();

        returnHistory.setReturnId(returnHistoryCreateInDTO.getReturnId());
        returnHistory.setTime(new Date());
        returnHistory.setReturnStatus(returnHistoryCreateInDTO.getReturnStatus());
        returnHistory.setComment(returnHistoryCreateInDTO.getComment();
        Boolean customerNotifeid = returnHistoryCreateInDTO.getCustomerNotifeid();
        returnHistory.setCustomerNotified(customerNotifeid);

        Long returnHostoryId = returnHistoryService.create(returnHistory);

        if (customerNotifeid != null && customerNotifeid){
            //todo send notification to customer
        }
        return returnHostoryId;
    }
}
