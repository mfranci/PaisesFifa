package com.example.matt.paisesfifa;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.example.matt.paisesfifa.models.Pais;
import com.example.matt.paisesfifa.models.PaisData;

import java.util.List;

public class InicioActivity extends ListActivity {
   private final static int REQUEST_CODE = 100;
   List<Pais> paises = null;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      paises = new PaisData().getPaises();

      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_inicio);

//      LinearLayout layout = (LinearLayout) findViewById(R.id.layout);

//      //cargo los botones
//      for (final Pais pais : paises) {
//         Button button = new Button(this);
//         button.setText(pais.getNombre());
//         layout.addView(button);
//
//         //hago que escuche el evento click
//         button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//               Intent intent = new Intent(InicioActivity.this, PaisDetalleActivity.class);
//               intent.putExtra("KeyExtraPaisId", pais.getId());
//               intent.putExtra("KeyExtraPaisNombre", pais.getNombre());
//               intent.putExtra("KeyExtraPaisImagen", pais.getImagen());
//               intent.putExtra("KeyExtraPaisDescripcion", pais.getDescripcion());
//               startActivityForResult(intent, REQUEST_CODE);
//            }
//         });
//      }

//      ArrayAdapter<Pais> adapter = new ArrayAdapter<Pais>(this, android.R.layout.simple_list_item_1, paises);

      PaisAdapter adapter = new PaisAdapter(this, R.layout.item_pais, paises);
      setListAdapter(adapter);
   }

   @Override
   public boolean onCreateOptionsMenu(Menu menu) {
      // Inflate the menu; this adds items to the action bar if it is present.
      getMenuInflater().inflate(R.menu.inicio, menu);
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

   @Override
   protected void onActivityResult(int requestCode, int resultCode, Intent data) {
      super.onActivityResult(requestCode, resultCode, data);
      if (requestCode == REQUEST_CODE && resultCode == RESULT_OK) {
         if (data.hasExtra("KeyExtraPaisIdAdded")) {
            String parametro = data.getStringExtra("KeyExtraPaisIdAdded");

            if (data.hasExtra("action") && data.getStringExtra("action").equals("add")) {
               Toast.makeText(this, "Agregando " + parametro, Toast.LENGTH_SHORT).show();
            }
         }
      }
   }

   @Override
   protected void onListItemClick(ListView l, View v, int position, long id) {
      super.onListItemClick(l, v, position, id);

      //pais seleccionado
      Pais pais = paises.get(position);
      Intent intent = new Intent(this, PaisDetalleActivity.class);
      intent.putExtra("KeyExtraPaisId", pais.getId());
      intent.putExtra("KeyExtraPaisNombre", pais.getNombre());
      intent.putExtra("KeyExtraPaisImagen", pais.getImagen());
      intent.putExtra("KeyExtraPaisDescripcion", pais.getDescripcion());
      startActivityForResult(intent, REQUEST_CODE);
   }

   public void abrirSettings(MenuItem item) {
      Intent intent = new Intent(this, SettingsActivity.class);
      startActivity(intent);
   }
}
