package com.epiclancers.billing.sqlpluralsightcourse;

public class DatabaseContract {

    
    public static final class CourseInfoEntry{
        public static final String table_name = "course_info";
        public static final String column_course_id = "course_id";
        public static final String column_course_info = "course_info";

        public static final String SQL_CREATE_TABLE =
                "CREATE TABLE " + table_name + " ( "+
                        column_course_id + " , " +
                        column_course_info + " )";
        
    }
    public static final class NoteInfoEntry{
        public static final String table_name = "note_info";
        public static final String column_course_id = "course_id";
        public static final String column_note_id = "note_id";
        public static final String column_note_info = "note_info";

        public static final String SQL_CREATE_TABLE =
                "CREATE TABLE " + table_name + " ( "+
                        column_course_id + " , " +
                        column_note_id + " , " +
                        column_note_info + " )";
        
    }

}
