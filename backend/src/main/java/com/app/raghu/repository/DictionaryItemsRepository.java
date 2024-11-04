package com.app.raghu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.raghu.entity.DictionaryItems;

public interface DictionaryItemsRepository extends JpaRepository<DictionaryItems, Integer> {
    // 可以根据需要添加自定义查询方法
}