package com.example.sprintaction;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHandler extends SQLiteOpenHelper {

    public static  final String Database_name = "sprint_activity_sys";
    public static final int DATABASE_VERSION = 7;
    public static final String Table_name = "sprint_01";
    public static final String Table_name2 = "sprint_02";
    public static final String Table_name3 = "sprint_03";


    public static final String col_activityId1 ="activity_id_s1";
    public static final String col_todo1 ="todo_s1";
    public static final String col_on_prog1 ="on_progress_s1";
    public static final String col_done1 ="done_s1";

    public static final String col_activityId2 ="activity_id_s2";
    public static final String col_todo2 ="todo_s2";
    public static final String col_on_prog2 ="on_progress_s2";
    public static final String col_done2 ="done_s2";

    public static final String col_activityId3 ="activity_id_s3";
    public static final String col_todo3 ="todo_s3";
    public static final String col_on_prog3 ="on_progress_s3";
    public static final String col_done3 ="done_s3";

    public DBHandler( Context context ) {

        super(context, Database_name, null, 7);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + Table_name + " (" +
                col_activityId1 + " INTEGER PRIMARY KEY, " +
                col_todo1 + " TEXT, " +
                col_on_prog1 + " TEXT, " +
                col_done1 + " TEXT)");

        db.execSQL("CREATE TABLE " + Table_name2 + " (" +
                col_activityId2 + " INTEGER PRIMARY KEY, " +
                col_todo2 + " TEXT, " +
                col_on_prog2 + " TEXT, " +
                col_done2 + " TEXT)");

        db.execSQL("CREATE TABLE " + Table_name3 + " (" +
                col_activityId3 + " INTEGER PRIMARY KEY, " +
                col_todo3 + " TEXT, " +
                col_on_prog3 + " TEXT, " +
                col_done3 + " TEXT)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + Table_name);
        db.execSQL("DROP TABLE IF EXISTS " + Table_name2);
        db.execSQL("DROP TABLE IF EXISTS " + Table_name3);
        onCreate(db);

    }
//----------------------------------------SPRINT 1 ----------------------------------------------------------------
    public boolean insertData1(String activity_id_s1, String todo_s1, String on_progress_s1, String done_s1){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(col_activityId1, activity_id_s1);
        cv.put(col_todo1, todo_s1);
        cv.put(col_on_prog1, on_progress_s1);
        cv.put(col_done1, done_s1);
        long results = db.insert(Table_name, null, cv);
        if (results == -1){
            return false;
        } else{
            return true;
        }
    }

    public Integer delete1(String activity_id_s1)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete((Table_name), "activity_id_s1 = ?", new String[]{activity_id_s1});
    }

    //----------------------------------------SPRINT 2 ----------------------------------------------------------------
    public boolean insertData2(String activity_id_s2, String todo_s2, String on_progress_s2, String done_s2){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(col_activityId2, activity_id_s2);
        cv.put(col_todo2, todo_s2);
        cv.put(col_on_prog2, on_progress_s2);
        cv.put(col_done2, done_s2);
        long results = db.insert(Table_name2, null, cv);
        if (results == -1){
            return false;
        } else{
            return true;
        }
    }

    public Integer delete2(String activity_id_s2)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete((Table_name2), "activity_id_s2 = ?", new String[]{activity_id_s2});
    }

    public boolean insertData3(String activity_id_s3, String todo_s3, String on_progress_s3, String done_s3){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(col_activityId3, activity_id_s3);
        cv.put(col_todo3, todo_s3);
        cv.put(col_on_prog3, on_progress_s3);
        cv.put(col_done3, done_s3);
        long results = db.insert(Table_name3, null, cv);
        if (results == -1){
            return false;
        } else{
            return true;
        }
    }

    public Integer delete3(String activity_id_s3)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete((Table_name3), "activity_id_s3 = ?", new String[]{activity_id_s3});
    }


}
