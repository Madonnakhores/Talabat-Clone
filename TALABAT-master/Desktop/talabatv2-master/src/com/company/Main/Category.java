package com.company.Main;

import java.util.ArrayList;

public class Category {
    private int category_id;
    private String category_name;

    public Category(int category_id, String category_name) {
        this.category_id = category_id;
        this.category_name = category_name;
    }

    public int getCategory_id() {
        return category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public static ArrayList<Category> getCategoryList(){
        SelectRecords sr = new SelectRecords();
        return sr.retrieveCategoryList();
    }
    public static void displayCategoryList( ) {
        ArrayList<Category> categories = Category.getCategoryList();
        for (int j = 0; j < categories.size(); j++) {
            System.out.println("[" + (j+1) + "]  " + categories.get(j).getCategory_name());
        }
        System.out.println("__________________________________");



    }

}