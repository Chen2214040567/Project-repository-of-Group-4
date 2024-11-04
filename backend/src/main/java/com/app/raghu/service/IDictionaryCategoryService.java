package com.app.raghu.service;

import java.util.List;

import com.app.raghu.entity.DictionaryCategory;

public interface IDictionaryCategoryService {

    List<DictionaryCategory> getAllCategories();

    void saveCategory(DictionaryCategory category);

    // 可以根据需要添加其他方法，如根据ID获取分类、更新分类、删除分类等
}