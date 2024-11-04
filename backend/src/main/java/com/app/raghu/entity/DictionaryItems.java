package com.app.raghu.entity;

import java.time.LocalDateTime;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.app.raghu.entity.DictionaryCategory;
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
    private DictionaryCategory category;

    @Column(name = "key1", nullable = false, unique = true, length = 100)
    private String key;

    @Column(name = "value", nullable = false, length = 255)
    private String value;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime created_at;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updated_at;

    // Add getters and setters if not using lombok
}