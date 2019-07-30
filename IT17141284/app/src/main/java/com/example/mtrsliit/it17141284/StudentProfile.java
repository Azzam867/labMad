package com.example.mtrsliit.it17141284;

import android.provider.BaseColumns;



public class StudentProfile {

    public static class Students implements BaseColumns {

        public final static String TABLE_NAME = "BookDetails";
        public final static String COLUMN_bookName = "BookName";
        public final static String COLUMN_authorID = "authorID";
        public final static String COLUMN_bookCategory = "BookCategory";

    }
}
    public static class Student implements BaseColumns {

        public final static String TABLE_NAME = "AuthorDetails";
        public final static String COLUMN_authorName = "AuthorName";

    }


