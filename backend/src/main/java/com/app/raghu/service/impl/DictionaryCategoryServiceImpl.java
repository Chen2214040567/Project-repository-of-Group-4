package com.app.raghu.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.raghu.entity.DictionaryCategory;
import com.app.raghu.repository.DictionaryCategoryRepository;
import com.app.raghu.service.IDictionaryCategoryService;

@Service
public class DictionaryCategoryServiceImpl implements IDictionaryCategoryService {

    @Autowired
    private DictionaryCategoryRepository dictionaryCategoryRepository;

    @Override
    public List<DictionaryCategory> getAllCategories() {
        return dictionaryCategoryRepository.findAll();
    }

    @Override
    public void saveCategory(DictionaryCategory category) {
        dictionaryCategoryRepository.save(category);
    }

    // 可以根据需要添加其他方法的实现
}