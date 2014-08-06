package com.example.matt.paisesfifa.models.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.matt.paisesfifa.R;
import com.example.matt.paisesfifa.models.Pais;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by matt on 03/08/2014.
 */
public class DatabaseHandler extends SQLiteOpenHelper {
   public static final int DATABASE_VERSION = 1; // versión de DB
   public static final String DATABASE_NAME = "paises.db"; // DB
   public static final String TABLE_PAISES = "paises"; // Tabla Paises
   // Paises columnas
   public static final String KEY_ID = "id";
   public static final String KEY_NOMBRE = "nombre";
   public static final String KEY_IMAGEN = "imagen";
   public static final String KEY_DESCRIPCION = "descripcion";

   public DatabaseHandler(Context context) {
      super(context, DATABASE_NAME, null, DATABASE_VERSION);
   }

   @Override
   public void onCreate(SQLiteDatabase db) {
      String strSQL = "CREATE TABLE " + TABLE_PAISES + "("
            + KEY_ID + " INTEGER PRIMARY KEY,"
            + KEY_NOMBRE + " TEXT,"
            + KEY_IMAGEN + " INTEGER,"
            + KEY_DESCRIPCION + " TEXT" + ")";
      db.execSQL(strSQL);
      Log.d(getClass().toString(), "onCreate-> se creó la tabla " + TABLE_PAISES + ", versión: " + DATABASE_VERSION);

      //cargo datos por primera vez
      List<Pais> paisesLst = new ArrayList();
      paisesLst.add(new Pais(1, "ALEMANIA", R.drawable.pais_alemania, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      paisesLst.add(new Pais(2, "ARGELIA", R.drawable.pais_argelia, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      paisesLst.add(new Pais(3, "ARGENTINA", R.drawable.pais_argentina, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      paisesLst.add(new Pais(4, "AUSTRALIA", R.drawable.pais_australia, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      paisesLst.add(new Pais(5, "BELGICA", R.drawable.pais_belgica, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      paisesLst.add(new Pais(6, "BOSNIA", R.drawable.pais_bosnia, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      paisesLst.add(new Pais(7, "BRASIL", R.drawable.pais_brasil, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      paisesLst.add(new Pais(8, "CAMERUN", R.drawable.pais_camerun, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      paisesLst.add(new Pais(9, "CHILE", R.drawable.pais_chile, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      paisesLst.add(new Pais(10, "COLOMBIA", R.drawable.pais_colombia, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      paisesLst.add(new Pais(11, "COREA", R.drawable.pais_corea, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      paisesLst.add(new Pais(12, "COSTA MARFIL", R.drawable.pais_costa_marfil, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      paisesLst.add(new Pais(13, "COSTA RICA", R.drawable.pais_costa_rica, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      paisesLst.add(new Pais(14, "CROACIA", R.drawable.pais_croacia, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      paisesLst.add(new Pais(15, "ECUADOR", R.drawable.pais_ecuador, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      paisesLst.add(new Pais(16, "ESPAÑA", R.drawable.pais_espania, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      paisesLst.add(new Pais(17, "ESTADOS UNIDOS", R.drawable.pais_estados_unidos, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      paisesLst.add(new Pais(18, "FRANCIA", R.drawable.pais_francia, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      paisesLst.add(new Pais(19, "GHANA", R.drawable.pais_ghana, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      paisesLst.add(new Pais(20, "GRECIA", R.drawable.pais_grecia, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      paisesLst.add(new Pais(21, "HOLANDA", R.drawable.pais_holanda, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      paisesLst.add(new Pais(22, "HONDURAS", R.drawable.pais_honduras, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      paisesLst.add(new Pais(23, "INGLATERRA", R.drawable.pais_inglaterra, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      paisesLst.add(new Pais(24, "IRAN", R.drawable.pais_iran, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      paisesLst.add(new Pais(25, "ITALIA", R.drawable.pais_italia, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      paisesLst.add(new Pais(26, "JAPON", R.drawable.pais_japon, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      paisesLst.add(new Pais(27, "MEXICO", R.drawable.pais_mexico, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      paisesLst.add(new Pais(28, "NIGERIA", R.drawable.pais_nigeria, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      paisesLst.add(new Pais(29, "PORTUGAL", R.drawable.pais_portugal, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      paisesLst.add(new Pais(30, "RUSIA", R.drawable.pais_rusia, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      paisesLst.add(new Pais(31, "SUIZA", R.drawable.pais_suiza, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      paisesLst.add(new Pais(32, "URUGUAY", R.drawable.pais_uruguay, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      Log.d(getClass().toString(), "onCreate-> se cargó lista de paises");

      //hago insert
      ContentValues values;
      for (Pais pais : paisesLst) {
         values = new ContentValues();
         values.put(KEY_NOMBRE, pais.getNombre());
         values.put(KEY_IMAGEN, pais.getImagen());
         values.put(KEY_DESCRIPCION, pais.getDescripcion());
         db.insert(TABLE_PAISES, null, values); // Contact Name
         Log.d(getClass().toString(), "onCreate-> insertando en tabla:" + pais.getNombre());
      }
      Log.d(getClass().toString(), "onCreate -> fin de inserts");
      //db.close(); // Closing database connection
   }

   @Override
   public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
      String strSQL = "DROP TABLE IF EXISTS " + TABLE_PAISES;
      db.execSQL(strSQL);
      Log.d(getClass().toString(), "onUpgrade -> drop de tabla " + TABLE_PAISES);

      //creamos nuevamente la DB
      onCreate(db);
   }
}
