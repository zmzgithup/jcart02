package io.zmz.jcartadministrationback.service;

import io.zmz.jcartadministrationback.po.ReturnHistory;

import java.util.List;

public interface ReturnHistoryService {
    List<ReturnHistory> getListByReturnId(Integer returnId);

    Long create(ReturnHistory returnHistory);
}
