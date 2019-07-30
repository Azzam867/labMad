package com.example.mtrsliit.it17141284;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    private Button AddAuthor, AddBook, UpdateBook, ViewBooks;

    private DBHandler dbHandler;

    public Home() {
        super();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }


    dbHandler = new DBHandler(this );

    ArrayList<Student> list = dbHandler.readAllInfo();

   AddAuthor  = findViewById(R.id.AddAuthor);
    AddBook = findViewById(R.id.AddBook);
    UpdateBook= findViewById(R.id.UpdateBook);
    ViewBooks = findViewById(R.id.ViewBooks);

    AddBook.setOnClickListener(new View.OnClickListener() {

        Intent intent = new Intent(Home.this, AddBook.class);
        startActivity(intent);

        AddAuthor.setOnClickListener(new View.OnClickListener();

Intent intent = new Intent(Home.this, AddAuthor.class );

}


    }
