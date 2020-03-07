package io.zmz.jcartstoreback.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
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

    @Override
    public Page<Return> getPageByCustomerId(Integer customerId, Integer pageNum) {
        PageHelper.startPage(pageNum,10);

        return returnMapper.selectPageByCustomerId(customerId);
    }

    @Override
    public Return getById(Integer returnId) {
        return returnMapper.selectByPrimaryKey(returnId);
    }
}
