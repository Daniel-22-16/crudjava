package com.example.crud;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.sql.SQLClientInfoException;

public class crudDaniel extends SQLiteOpenHelper {

    private static final String NOMBRE_BD="crudDaniel.bd";
    private static final int VERSION_BD=1;
    private static final String TABLA_REGISTRO="CREATE TABLE REGISTRO(NOMBRE TEXT PRIMARY KEY, APELLIDO TEXT, GMAIL TEXT)";

    public crudDaniel(Context context) {
        super(context, NOMBRE_BD, null, VERSION_BD);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(TABLA_REGISTRO);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+TABLA_REGISTRO);
        sqLiteDatabase.execSQL(TABLA_REGISTRO);
    }

    public void agregarREGISTRO(String NOMBRE, String APELLIDO, String GMAIL){
        SQLiteDatabase bd=getWritableDatabase();
        if(bd!=null){
            bd.execSQL("INSERT INTO REGISTRO VALUES('"+NOMBRE+"','"+APELLIDO+"','"+GMAIL+"')");
            bd.close();
        }
    }
}
