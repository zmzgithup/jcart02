package io.zmz.jcartadministrationback.controller;

import io.zmz.jcartadministrationback.dto.in.*;
import io.zmz.jcartadministrationback.dto.out.AdministraiorListOutDTO;
import io.zmz.jcartadministrationback.dto.out.AdministratorGetProfileOutDTO;
import io.zmz.jcartadministrationback.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/administrator")
public class AdministratorController {

    @GetMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password){
        return  null;
    }


    @GetMapping("/getProfile")
    public AdministratorGetProfileOutDTO getProfile(Integer administraiorId){
        return null;
    }


    @PostMapping("updateProfile")
    public void updateProfile(@RequestBody AdministratorUpdateProfileInDTO administratorUpdateProfileInDTO){

    }

    @GetMapping("/getList")
    public PageOutDTO<AdministraiorListOutDTO> getList(@RequestParam Integer pageNum){
        return null;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody AdministartorCreateInDTO administartorCreateInDTO){
        return null;
    }

    @PostMapping("/update")
    public void update(@RequestBody AdministartorUpdateInDTO administartorUpdateInDTO){

    }

    @GetMapping("/sendPasswordResetCodeToEmail")
    public void sendPasswordResetCodeToEmail(@RequestParam String email){

    }

    @PostMapping("/restPassword")
    public void resetPasswordByEmail(@RequestBody AdministartorResetPwdEmailInDTO administartorResetPwdEmailInDTO){

    }

    @GetMapping("/sendPasswordResetCodeToMobile")
    public void sendPasswordResetCodeToMobile(@RequestParam String mobile){

    }

    @PostMapping("/resetPassword")
    public void resetPasswordByMobile(@RequestBody AdministartorResetPwdMobileInDTO administartorResetPwdMobileInDTO){

    }

}
