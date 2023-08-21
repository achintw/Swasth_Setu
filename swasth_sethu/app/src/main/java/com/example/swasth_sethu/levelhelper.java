package com.example.swasth_sethu;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class levelhelper extends SQLiteOpenHelper {
    private static final String TABLE4 = "level";
    public levelhelper(@Nullable Context context) {
        super(context,"level", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase qdb) {
        String table4 = "CREATE TABLE " +TABLE4+"(username TEXT PRIMARY KEY, one TEXT,second TEXT,third TEXT, fourth TEXT,foreign key (username) references users(username))";
        qdb.execSQL(table4);


    }

    @Override
    public void onUpgrade(SQLiteDatabase qdb, int i, int i1) {
        qdb.execSQL("DROP TABLE IF EXISTS " +TABLE4);
        onCreate(qdb);


    }
    public Boolean insertData2(String one,String second,String third,String fourth){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues2= new ContentValues();
        contentValues2.put("one", one);
        contentValues2.put("second", second);
        contentValues2.put("third", third);
        contentValues2.put("fourth", fourth);
        sqLiteDatabase.insert(TABLE4,null,contentValues2);
        return true;


    }
}
