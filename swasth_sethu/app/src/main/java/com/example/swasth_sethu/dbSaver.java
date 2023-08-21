package com.example.swasth_sethu;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class dbSaver extends SQLiteOpenHelper {
    private static final String TABLE2 = "bmi";


    public dbSaver(@Nullable Context context) {
        super(context, "bmi", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase herDb) {
        String table2 = "CREATE TABLE " +TABLE2+"(username TEXT PRIMARY KEY, takeAge TEXT,takeHeight TEXT,takeWeight TEXT, foreign key (username) references users(username))";
        herDb.execSQL(table2);

    }

    @Override
    public void onUpgrade(SQLiteDatabase herDb, int i, int i1) {
        herDb.execSQL("DROP TABLE IF EXISTS " +TABLE2);
        onCreate(herDb);

    }
    public Boolean insertData2(String takeAge,String takeHeight,String takeWeight){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues2= new ContentValues();
        contentValues2.put("takeAge", takeAge);
        contentValues2.put("takeHeight", takeHeight);
        contentValues2.put("takeWeight", takeWeight);
        sqLiteDatabase.insert(TABLE2,null,contentValues2);
        return true;


    }
}
