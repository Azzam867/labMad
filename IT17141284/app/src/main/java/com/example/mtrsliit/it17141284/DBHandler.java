package com.example.mtrsliit.it17141284;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

import android.database.sqlite.SQLiteOpenHelper;

public class DBHandler extends SQLiteOpenHelper {

    private final static String DATABASE_NAME = "Mad.db";

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        string CREATE_TABLE = "CREATE_TABLE" + StudentProfile.Students.TABLE_NAME + "("
                StudentProfile.Students._ID + " INTEGER PRIMARY KEY," +
               StudentProfile.Students.COLUMN_authorID + " TEXT," +
                StudentProfile.Students.COLUMN_bookName + " TEXT," +
                StudentProfile.Students.COLUMN_bookCategory + " TEXT " )";

        sqLiteDatabase.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }


}
