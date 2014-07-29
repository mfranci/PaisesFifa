package com.example.matt.paisesfifa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.matt.paisesfifa.models.Pais;

public class PaisDetalleActivity extends Activity {
   String pais_id = null;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_pais_detalle);

      //Hago referencia a los elementos del layout
      TextView txtPaisNombre = (TextView) findViewById(R.id.txtPaisNombre);
      TextView txtPaisId = (TextView) findViewById(R.id.txtPaisId);
      TextView txtPaisDescripcion = (TextView) findViewById(R.id.txtPaisDescripcion);
      ImageView imgPais = (ImageView) findViewById(R.id.imgPais);

      //cargo el objeto según el parametro
      Intent intent = getIntent();

      if (intent != null) {
         Pais pais = new Pais(
               intent.getStringExtra("KeyExtraPaisId"),
               intent.getStringExtra("KeyExtraPaisNombre"),
               intent.getIntExtra("KeyExtraPaisImagen", 0),
               intent.getStringExtra("KeyExtraPaisDescripcion")
         );
         txtPaisNombre.setText(pais.getNombre());
         txtPaisId.setText(pais.getId());
         txtPaisDescripcion.setText(pais.getDescripcion());
         imgPais.setImageResource(pais.getImagen());

         //cargo el pais_id
         pais_id = pais.getId();
      }
   }

   @Override
   public boolean onCreateOptionsMenu(Menu menu) {
      // Inflate the menu; this adds items to the action bar if it is present.
      getMenuInflater().inflate(R.menu.pais_detalle, menu);
      return true;
   }

   @Override
   public boolean onOptionsItemSelected(MenuItem item) {
      // Handle action bar item clicks here. The action bar will
      // automatically handle clicks on the Home/Up button, so long
      // as you specify a parent activity in AndroidManifest.xml.
      int id = item.getItemId();
      if (id == R.id.action_settings) {
         return true;
      }
      return super.onOptionsItemSelected(item);
   }

   public void addToCart(MenuItem item) {
      Intent intent = new Intent();
      intent.putExtra("KeyExtraPaisIdAdded", pais_id);
      intent.putExtra("action", "add");
      setResult(RESULT_OK, intent);
      finish();
   }
}
