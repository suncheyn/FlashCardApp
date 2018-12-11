package com.example.cheyenne.flashcardapp;

public class Topics {
    private String title;
    private String id;

    public Topics()
    {
        title = "NA";
    }

    public Topics(String title, String id)
    {
        this.title = title;
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public String getID()
    {
        return id;
    }

    public String toString()
    {
        return title;
    }

}
