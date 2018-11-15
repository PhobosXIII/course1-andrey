package com.example.user.people;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class PersonActivity extends AppCompatActivity {

    private static final String EXTRA_PERSON_ID = "com.example.user.people.extras.EXTRA_PERSON_ID";

    public static Intent getStartIntent(Context context, long personId){
        return new Intent(context, PersonActivity.class).putExtra(EXTRA_PERSON_ID, personId);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);
    }
}
