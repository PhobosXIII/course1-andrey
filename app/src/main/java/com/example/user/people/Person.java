package com.example.user.people;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "people")
public class Person {

    @PrimaryKey(autoGenerate = true)
    private long id;
    private String name;

    public Person(String name) {
        this(0, name);
    }

    @Ignore
    public Person(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
