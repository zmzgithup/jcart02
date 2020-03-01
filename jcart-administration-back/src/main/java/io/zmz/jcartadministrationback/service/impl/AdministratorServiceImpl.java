package io.zmz.jcartadministrationback.service.impl;

import io.zmz.jcartadministrationback.dao.AdministratorMapper;
import io.zmz.jcartadministrationback.po.Administrator;
import io.zmz.jcartadministrationback.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministratorServiceImpl implements AdministratorService {
    @Autowired
    private AdministratorMapper administratorMapper;

    @Override
    public Administrator getByUsername(String username) {
        Administrator administrator = administratorMapper.selectByUserName(username);
        return administrator;
    }
}
