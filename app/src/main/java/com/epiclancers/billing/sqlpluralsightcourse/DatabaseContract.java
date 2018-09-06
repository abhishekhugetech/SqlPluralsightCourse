package com.epiclancers.billing.sqlpluralsightcourse;

public class DatabaseContract {


    // Adding Entry to class name is a convention
    public static final class CourseInfoEntry{
        // Storing the tablename and the column name as a static string
        public static final String table_name = "course_info";
        public static final String column_course_id = "course_id";
        public static final String column_course_info = "course_info";

        public static final String SQL_CREATE_TABLE =
                "CREATE TABLE " + table_name + " ( "+
                        column_course_id + " TEXT UNIQUE NOT NULL, " +
                        column_course_info + " TEXT NOT NULL )";
        
    }
    public static final class NoteInfoEntry{
        public static final String table_name = "note_info";
        public static final String column_course_id = "course_id";
        public static final String column_note_text = "note_text";
        public static final String column_note_title = "note_title";

        public static final String SQL_CREATE_TABLE =
                "CREATE TABLE " + table_name + " ( "+
                        column_course_id + " TEXT NOT NULL, " +
                        column_note_text + " , " +
                        column_note_title + " TEXT NOT NULL)";
        
    }

}
