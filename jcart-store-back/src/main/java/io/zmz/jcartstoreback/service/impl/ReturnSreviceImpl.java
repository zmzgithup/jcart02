package io.zmz.jcartstoreback.service.impl;

import io.zmz.jcartstoreback.dao.ReturnMapper;
import io.zmz.jcartstoreback.po.Return;
import io.zmz.jcartstoreback.service.ReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReturnSreviceImpl implements ReturnService {
    @Autowired
    private ReturnMapper returnMapper;


    @Override
    public Integer create(Return aReturn) {
        returnMapper.insertSelective(aReturn);
        Integer returnId = aReturn.getReturnId();
        return returnId;
    }
}
