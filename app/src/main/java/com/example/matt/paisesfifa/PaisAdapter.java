package com.example.matt.paisesfifa;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.matt.paisesfifa.models.Pais;

import java.util.List;

/**
 * Created by matt on 29/07/2014.
 */
public class PaisAdapter extends ArrayAdapter<Pais> {
   private Context context;
   private List<Pais> objects;

   public PaisAdapter(Context context, int resource, List<Pais> objects) {
      super(context, resource, objects);
      this.context = context;
      this.objects = objects;
   }

   @Override
   public View getView(int position, View convertView, ViewGroup parent) {
      View view = convertView;

      Pais pais = objects.get(position);
//
//      LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
//      view = inflater.inflate(R.layout.item_pais,null);
//
//      ImageView imageView = (ImageView) view.findViewById(R.id.imgPais);
//      imageView.setImageResource(pais.getImagen());
//
//      TextView textView = (TextView) view.findViewById(R.id.txtPaisNombre);
//      textView.setText(pais.getNombre());

      if (convertView == null) {
         //traigo la definición de layout customizado (imagen+textview)
         LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
         //transformo el XML del layout a objetos.
         view = layoutInflater.inflate(R.layout.item_pais, parent, false);

         ViewHolder viewHolder = new ViewHolder();

         ImageView imgPais = (ImageView) view.findViewById(R.id.imgPais);
         TextView txtPaisNombre = (TextView) view.findViewById(R.id.txtPaisNombre);

         viewHolder.imgPais = imgPais;
         viewHolder.txtPaisNombre = txtPaisNombre;

         //toma el valor de la lista
         view.setTag(viewHolder);

         Log.d("AdapterCustom->getView", "Inflando: " + pais.getNombre());
      } else {
         Log.d("AdapterCustom->getView", "Optimizado: " + pais.getNombre());
      }

      ViewHolder viewHolder = (ViewHolder) view.getTag();
      viewHolder.imgPais.setImageResource(pais.getImagen());
      viewHolder.txtPaisNombre.setText(pais.getNombre());

      return view;
   }

   /**
    * Clase estática
    */
   static class ViewHolder {
      public ImageView imgPais;
      public TextView txtPaisNombre;
   }
}
