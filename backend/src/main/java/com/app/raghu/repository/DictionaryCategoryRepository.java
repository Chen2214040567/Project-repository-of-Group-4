/** **/
package com.app.raghu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.raghu.entity.DictionaryCategory;

public interface DictionaryCategoryRepository extends JpaRepository<DictionaryCategory, Integer> {
    // 可以根据需要添加自定义查询方法
}
