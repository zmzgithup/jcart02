package io.zmz.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.zmz.jcartadministrationback.po.Administrator;

import java.util.List;

public interface AdministratorService {
    Administrator getByUsername(String username);

    Administrator getById(Integer administratorId);

    void update(Administrator administrator);

    Page<Administrator> getList(Integer pageNum);

    void delete(Integer adminstratorId);

    void deleteBatch(List<Integer> administratorIds);

    Integer insert(Administrator administrator);

    Administrator getByEmail(String email);
}
