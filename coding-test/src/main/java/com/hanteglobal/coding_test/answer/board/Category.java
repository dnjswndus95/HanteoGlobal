package com.hanteglobal.coding_test.answer.board;

import java.util.List;

public class Category {
    private Long id;
    private String name;
    private List<Category> childList;

    public Category(Long id, String name, List<Category> childList) {
        this.id = id;
        this.name = name;
        this.childList = childList;
    }

    public Category(Category category) {
        this.id = category.id;
        this.name = category.name;
        this.childList = category.childList;
    }

    public void addChild(Category category) {
        this.childList.add(category);
    }

    public Long getId() {
        return this.id;
    }
}
