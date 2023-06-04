package com.dockit.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="tasks", schema = "public") 
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private int task_id;
    @Column
    private String title;
    @Column
    private String text;
    @Column
    private boolean is_checked;


    public int getId() {
        return this.task_id;
    }

    public void setId(int id) {
        this.task_id = id;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }


    public boolean getIsdone() {
        return this.is_checked;
    }

    public void setIsdone(boolean ischecked) {
        this.is_checked = ischecked;
    }

}
