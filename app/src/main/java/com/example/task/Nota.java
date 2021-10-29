package com.example.task;

public class Nota {
    private int ID;
    private String title;
    private String text;
    private int date;

    public Nota(String title, String text, int date){
        this.title = title;
        this.text = text;
        this.date = date;
    }
    //Getters

    public int getID() {
        return ID;
    }

    public String getTitle() {
        return title;
    }
    public String getText() {
        return text;
    }
    public int getDate() {
        return date;
    }
    //Setters

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setText(String text) {
        this.text = text;
    }
    public void setDate(int date) {
        this.date = date;
    }

    public void create(){
        ID =
    }
}
