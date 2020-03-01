package io.zmz.jcartadministrationback.service;

import io.zmz.jcartadministrationback.po.Administrator;

public interface AdministratorService {
    Administrator getByUsername(String username);
}
