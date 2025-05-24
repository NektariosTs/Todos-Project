package com.nekta.springboot.todos.entity;

import jakarta.persistence.*;

@Table(name = "todos")
@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long id;


    @Column(nullable = false)
    private String title;


    @Column(nullable = false)
    private String description;


    @Column(nullable = false)
    private int priority;


    @Column(nullable = false)
    private boolean complete;

    // private User owner;

    //Default constructor(requried by JPA)
    public Todo() {}

    public Todo(String title, String description, int priority, boolean complete) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.complete = complete;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }
}
