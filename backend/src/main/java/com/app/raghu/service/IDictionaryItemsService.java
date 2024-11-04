package com.app.raghu.service;

import java.util.List;

import com.app.raghu.entity.DictionaryItems;

public interface IDictionaryItemsService {

    List<DictionaryItems> getAllItems();

    void saveItem(DictionaryItems item);

    // 可以根据需要添加其他方法，如根据ID获取字典项、更新字典项、删除字典项等
}