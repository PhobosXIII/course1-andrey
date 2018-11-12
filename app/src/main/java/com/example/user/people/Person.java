package com.example.user.people;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "people")
public class Person {

    @PrimaryKey(autoGenerate = true)
    private long id;

    public Person() {
        this(0);
    }

    @Ignore
    public Person(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
