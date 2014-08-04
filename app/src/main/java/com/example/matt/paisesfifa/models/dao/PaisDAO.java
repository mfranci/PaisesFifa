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

         // Inserting Row
         db.insert(databaseHandler.TABLE_PAISES, null, values); // Contact Name
         db.close(); // Closing database connection
      } else { //update
         ContentValues values = new ContentValues();
         values.put(databaseHandler.KEY_NOMBRE, pais.getNombre());
         values.put(databaseHandler.KEY_IMAGEN, pais.getImagen());
         values.put(databaseHandler.KEY_DESCRIPCION, pais.getDescripcion());

         // updating row
         db.update(databaseHandler.TABLE_PAISES, values, databaseHandler.KEY_ID + " = ?",
               new String[]{String.valueOf(pais.getId())});
      }
   }

   public void delete(Pais pais) {
      db.delete(databaseHandler.TABLE_PAISES, databaseHandler.KEY_ID + " = ?",
            new String[]{String.valueOf(pais.getId())});
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
         return pais;
      } else {
         return null;
      }
   }

   // Getting All Contacts
   public List<Pais> getAllContacts() {
      List<Pais> paisesList = new ArrayList<Pais>();
      // Select All Query
      String selectQuery = "SELECT * FROM " + databaseHandler.TABLE_PAISES;

      Cursor cursor = db.rawQuery(selectQuery, null);

      // looping through all rows and adding to list
      if (cursor.moveToFirst()) {
         do {
            Pais pais = new Pais(Integer.parseInt(cursor.getString(0)), cursor.getString(1), Integer.parseInt(cursor.getString(2)), cursor.getString(3));
            paisesList.add(pais);
         } while (cursor.moveToNext());
      }

      // return contact list
      return paisesList;
   }

   public int getContactsCount() {
      String countQuery = "SELECT * FROM " + databaseHandler.TABLE_PAISES;
      Cursor cursor = db.rawQuery(countQuery, null);
      cursor.close();
      return cursor.getCount();
   }
}
