package com.example.user.people;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface PersonDao {
    @Query("SELECT * FROM people")
    List<Person> getAll();

    @Query("SELECT * FROM people WHERE id = :id")
    Person getById(long id);

    @Insert
    long insertPerson(Person person);
}
