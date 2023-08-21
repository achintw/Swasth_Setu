package com.example.swasth_sethu;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class focushelper extends SQLiteOpenHelper {
    private static final String TABLE3 = "focus";
    public focushelper(@Nullable Context context) {
        super(context, "focus", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase ourDb) {
        String table3 = "CREATE TABLE " +TABLE3+"(username TEXT PRIMARY KEY, fullbody TEXT,arm TEXT,abs TEXT, leg TEXT,foreign key (username) references users(username))";
        ourDb.execSQL(table3);
    }

    @Override
    public void onUpgrade(SQLiteDatabase ourDb, int i, int i1) {

        ourDb.execSQL("DROP TABLE IF EXISTS " +TABLE3);
        onCreate(ourDb);
    }

    public Boolean insertData2(String fullbody,String arm,String abs,String leg){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues2= new ContentValues();
        contentValues2.put("fullbody", fullbody);
        contentValues2.put("arm", arm);
        contentValues2.put("abs", abs);
        contentValues2.put("leg", leg);
        sqLiteDatabase.insert(TABLE3,null,contentValues2);
        return true;


    }
}
