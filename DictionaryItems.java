//第4组：7.“综合业务”功能-7.“业务入口”模块
// 2024-12-7照搬华便丽12-6可增删改查的代码DictionaryCategory
package com.app.raghu.entity.IntegratedService;

import java.time.LocalDateTime;
import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "dictionary_items")
@Data
public class DictionaryItems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    public DictionaryCategory category_id;

    @Column(name = "key1", nullable = false, unique = true, length = 100)
    public String key;

    @Column(name = "value", nullable = false, length = 255)
    public String value;

    @Column(name = "description", columnDefinition = "TEXT")
    public String description;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime created_at;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updated_at;

    // Add getters and setters if not using lombok

    @PrePersist
    public void prePersist() {
        this.created_at = LocalDateTime.now();
        this.updated_at = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate() {
        this.updated_at = LocalDateTime.now();
    }

}
