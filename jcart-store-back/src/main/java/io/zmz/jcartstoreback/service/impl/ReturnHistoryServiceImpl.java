package io.zmz.jcartstoreback.service.impl;

import io.zmz.jcartstoreback.dao.ReturnHistoryMapper;
import io.zmz.jcartstoreback.po.ReturnHistory;
import io.zmz.jcartstoreback.service.ReturnHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReturnHistoryServiceImpl implements ReturnHistoryService {

    @Autowired
    private ReturnHistoryMapper returnHistoryMapper;

    @Override
    public List<ReturnHistory> getByReturnId(Integer returnId) {
        return returnHistoryMapper.selectByReturnId(returnId);
    }
}
