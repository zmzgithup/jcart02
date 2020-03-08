package io.zmz.jcartadministrationback.service.impl;

import io.zmz.jcartadministrationback.dao.ReturnHistoryMapper;
import io.zmz.jcartadministrationback.po.Return;
import io.zmz.jcartadministrationback.po.ReturnHistory;
import io.zmz.jcartadministrationback.service.ReturnHistoryService;
import io.zmz.jcartadministrationback.service.ReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class ReturnServiceHistoryImpl implements ReturnHistoryService {
    @Autowired
    private ReturnHistoryMapper returnHistoryMapper;

    @Autowired
    private ReturnService returnService;
    @Override
    public List<ReturnHistory> getListByReturnId(Integer returnId) {
        return returnHistoryMapper.selectByReturnId(returnId);
    }

    @Override
    @Transactional
    public Long create(ReturnHistory returnHistory) {
        returnHistoryMapper.insertSelective(returnHistory);
        Long returnHistoryId = returnHistory.getReturnHistoryId();

        Return aReturn = new Return();
        aReturn.setReturnId(returnHistory.getReturnId());
        aReturn.setUpdateTime(new Date());
        returnService.update(aReturn);
        return returnHistoryId;
    }
}
