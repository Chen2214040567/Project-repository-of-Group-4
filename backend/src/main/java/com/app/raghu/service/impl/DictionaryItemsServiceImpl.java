package com.app.raghu.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.raghu.entity.DictionaryItems;
import com.app.raghu.repository.DictionaryItemsRepository;
import com.app.raghu.service.IDictionaryItemsService;

@Service
public class DictionaryItemsServiceImpl implements IDictionaryItemsService {

    @Autowired
    private DictionaryItemsRepository dictionaryItemsRepository;

    @Override
    public List<DictionaryItems> getAllItems() {
        return dictionaryItemsRepository.findAll();
    }

    @Override
    public void saveItem(DictionaryItems item) {
        dictionaryItemsRepository.save(item);
    }

    // 可以根据需要添加其他方法的实现
}