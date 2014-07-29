package com.example.matt.paisesfifa;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SettingsActivity extends Activity {
   private static String SETTINGS_TEXTO = "setting_texto";
   private SharedPreferences settings;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_settings);

      settings = getPreferences(MODE_PRIVATE);
   }


   @Override
   public boolean onCreateOptionsMenu(Menu menu) {
      // Inflate the menu; this adds items to the action bar if it is present.
      getMenuInflater().inflate(R.menu.settings, menu);
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


   public void actionGuardar(View view) {
      SharedPreferences.Editor editor = settings.edit();
      TextView textView = (TextView) findViewById(R.id.txtSettingTexto);
      String prefValue = textView.getText().toString();
      editor.putString(SETTINGS_TEXTO, prefValue);
      editor.commit();
      Toast.makeText(this, "Guardado:"+prefValue, Toast.LENGTH_SHORT).show();
   }

   public void actionLeer(View view) {
      String prefValue = settings.getString(SETTINGS_TEXTO, "Not found");
      TextView textView = (TextView) findViewById(R.id.txtSettingTexto);
      textView.setText(prefValue);
   }
}
