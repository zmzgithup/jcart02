package io.zmz.jcartadministrationback.service.impl;

import io.zmz.jcartadministrationback.dao.ReturnMapper;
import io.zmz.jcartadministrationback.po.Return;
import io.zmz.jcartadministrationback.service.ReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReturnServiceImpl implements ReturnService {
    @Autowired
    private ReturnMapper returnMapper;

    @Override
    public Return getById(Integer returnId) {
        return returnMapper.selectByPrimaryKey(returnId);
    }
}
