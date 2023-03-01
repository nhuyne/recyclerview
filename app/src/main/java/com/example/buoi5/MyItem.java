package com.example.buoi5;

public class MyItem {
    private int ResId;
    private String title;
    private String text;


    public MyItem(int imageResId, String title, String text) {
        this.ResId = imageResId;
        this.title = title;
        this.text = text;
    }

    public int getImageResId() {
        return ResId;
    }

    public void setImageResId(int imageResId) {
        this.ResId = imageResId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

