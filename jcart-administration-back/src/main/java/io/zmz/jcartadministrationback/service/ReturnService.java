package io.zmz.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.zmz.jcartadministrationback.dto.in.ReturnSearchInDTO;
import io.zmz.jcartadministrationback.po.Return;

public interface ReturnService {
    Return getById(Integer returnId);

    void update(Return aReturn);

    Page<Return> search(ReturnSearchInDTO returnSearchInDTO,Integer pageNum);
}
