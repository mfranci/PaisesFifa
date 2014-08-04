package com.example.matt.paisesfifa.models.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by matt on 03/08/2014.
 */
public class DatabaseHandler extends SQLiteOpenHelper {

   public static final int DATABASE_VERSION = 1; // versión de DB
   public static final String DATABASE_NAME = "paises.db"; // DB
   public static final String TABLE_PAISES = "paises"; // Tabla Paises
   // Paises columnas
   public static final String KEY_ID = "id";
   public static final String KEY_NOMBRE = "NOMBRE";
   public static final String KEY_IMAGEN = "imagen";
   public static final String KEY_DESCRIPCION = "descripcion";

   public DatabaseHandler(Context context) {
      super(context, DATABASE_NAME, null, DATABASE_VERSION);
   }

   @Override
   public void onCreate(SQLiteDatabase db) {
      String CREATE_CONTACTS_TABLE = "CREATE TABLE " + TABLE_PAISES + "("
            + KEY_ID + " INTEGER PRIMARY KEY,"
            + KEY_NOMBRE + " TEXT,"
            + KEY_IMAGEN + " INTEGER,"
            + KEY_DESCRIPCION + " TEXT" + ")";
      db.execSQL(CREATE_CONTACTS_TABLE);
   }

   @Override
   public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
      db.execSQL("DROP TABLE IF EXISTS " + TABLE_PAISES);

      //creamos nuevamente la DB
      onCreate(db);
   }
}
