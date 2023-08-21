package com.example.swasth_sethu;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "Login.db";
    private static final String TABLE1 = "users";

    public DBHelper(Context context) {
        super(context, "Login.db", null, 1);
    }

    @Override

    public void onCreate(SQLiteDatabase MyDB) {
       String table1 = "CREATE TABLE " +TABLE1+"(username TEXT PRIMARY KEY,password TEXT)";

       MyDB.execSQL(table1);
    }

    public boolean isBmiTableExists() {
        SQLiteDatabase MyDB = this.getReadableDatabase();

        Cursor cursor = MyDB.rawQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='bmi'", null);
        boolean exists = (cursor != null && cursor.getCount() > 0);
        if(cursor != null) {
            cursor.close();
        }
        return exists;
    }

    @Override
    public void onUpgrade(SQLiteDatabase MyDB, int i, int i1) {
        MyDB.execSQL("DROP TABLE IF EXISTS " +TABLE1);

        onCreate(MyDB);
    }

    public Boolean insertData(String username, String password){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();

        ContentValues contentValues1= new ContentValues();
        contentValues1.put("username", username);
        contentValues1.put("password", password);
        sqLiteDatabase.insert(TABLE1,null,contentValues1);
        return true;


    }



    public Boolean checkusername(String username) {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("Select * from users where username = ?", new String[]{username});
        if (cursor.getCount() > 0)
            return true;
        else
            return false;
    }

    public Boolean checkusernamepassword(String username, String password){
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("Select * from users where username = ? and password = ?", new String[] {username,password});
        if(cursor.getCount()>0)
            return true;
        else
            return false;
    }
}
