package com.example.matt.paisesfifa.models.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.matt.paisesfifa.models.Pais;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by matt on 03/08/2014.
 */
public class PaisDAO {
   DatabaseHandler databaseHandler;
   private SQLiteDatabase db;

   public PaisDAO(Context context) {
      databaseHandler = new DatabaseHandler(context);
   }

   public void open() {
      Log.d(getClass().toString(), "open");
      db = databaseHandler.getWritableDatabase(); //abrimos la BD para soportar sentencias de escritura.
   }

   public void close() {
      Log.d(getClass().toString(), "close");
      db.close();
   }

   //CRUD methods
   public void save(Pais pais) {
      if (pais.getId() == 0) { //insert
         ContentValues values = new ContentValues();
         values.put(databaseHandler.KEY_NOMBRE, pais.getNombre());
         values.put(databaseHandler.KEY_IMAGEN, pais.getImagen());
         values.put(databaseHandler.KEY_DESCRIPCION, pais.getDescripcion());

         db.insert(databaseHandler.TABLE_PAISES, null, values);
         //db.close();//TODO ver de comentar si tira error.
         Log.d(getClass().toString(), "save() -> insert:" + pais.getNombre());
      } else { //update
         ContentValues values = new ContentValues();
         values.put(databaseHandler.KEY_NOMBRE, pais.getNombre());
         values.put(databaseHandler.KEY_IMAGEN, pais.getImagen());
         values.put(databaseHandler.KEY_DESCRIPCION, pais.getDescripcion());

         db.update(databaseHandler.TABLE_PAISES, values, databaseHandler.KEY_ID + " = ?",
               new String[]{String.valueOf(pais.getId())});

         Log.d(getClass().toString(), "save() -> update:" + pais.getNombre());
      }
   }

   public void delete(Pais pais) {
      db.delete(databaseHandler.TABLE_PAISES, databaseHandler.KEY_ID + " = ?",
            new String[]{String.valueOf(pais.getId())});
      Log.d(getClass().toString(), "save() -> delete:" + pais.getNombre());
      db.close();
   }

   public Pais get(int id) {
      Cursor cursor = db.query(databaseHandler.TABLE_PAISES, new String[]{databaseHandler.KEY_ID,
                  databaseHandler.KEY_NOMBRE, databaseHandler.KEY_IMAGEN, databaseHandler.KEY_DESCRIPCION}, databaseHandler.KEY_ID + "=?",
            new String[]{String.valueOf(id)}, null, null, null, null
      );
      if (cursor != null) {
         cursor.moveToFirst();

         Pais pais = new Pais(id, cursor.getString(0), Integer.parseInt(cursor.getString(1)), cursor.getString(2));
         Log.d(getClass().toString(), "get()-> " + pais.getNombre());
         return pais;
      } else {
         return null;
      }
   }

   // Getting All Contacts
   public List<Pais> getAll() {
      List<Pais> paisesList = new ArrayList<Pais>();

      String strSQL = "SELECT * FROM " + databaseHandler.TABLE_PAISES;
      Cursor cursor = db.rawQuery(strSQL, null);

      if (cursor.moveToFirst()) {
         do {
            Pais pais = new Pais(Integer.parseInt(cursor.getString(0)), cursor.getString(1), Integer.parseInt(cursor.getString(2)), cursor.getString(3));
            paisesList.add(pais);
         } while (cursor.moveToNext());
      }

      Log.d(getClass().toString(), "getAll()-> paises");
      return paisesList;
   }

   public int getCount() {
      String strSQL = "SELECT * FROM " + databaseHandler.TABLE_PAISES;
      Cursor cursor = db.rawQuery(strSQL, null);
      cursor.close();
      return cursor.getCount();
   }
}
