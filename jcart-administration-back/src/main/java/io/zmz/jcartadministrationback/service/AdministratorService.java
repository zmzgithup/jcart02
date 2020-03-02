package io.zmz.jcartadministrationback.service;

import io.zmz.jcartadministrationback.po.Administrator;

public interface AdministratorService {
    Administrator getByUsername(String username);

    Administrator getById(Integer adminstratorId);

    void update(Administrator administrator);
}
