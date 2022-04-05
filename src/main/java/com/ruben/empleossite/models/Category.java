package com.ruben.empleossite.models;


public class Category {

    private Long id;
    private String category;

    public Category() {
    }
    
    public Category(String category) {
        this.category = category;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    @Override
    public String toString() {
        return "Category [category=" + category + ", id=" + id + "]";
    }
    
    

}
