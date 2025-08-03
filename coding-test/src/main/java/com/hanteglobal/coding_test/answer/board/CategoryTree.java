package com.hanteglobal.coding_test.answer.board;

import java.util.HashMap;
import java.util.Map;

public class CategoryTree {
    private Map<Long, Category> categories;

    public CategoryTree() {
        this.categories = new HashMap<>();
    }

    public void addCategory(Category category) {
        if(!categories.containsKey(category.getId())) {
            categories.put(category.getId(), new Category(category));
        }
    }
}
