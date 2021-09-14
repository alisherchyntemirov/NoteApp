package com.example.navigatiodrawer.model;

import java.io.Serializable;

public class NoteModel implements Serializable {
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public NoteModel(String title) {
        this.title = title;
    }

    private String title;

}
