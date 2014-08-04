package com.example.matt.paisesfifa.models;

import com.example.matt.paisesfifa.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by matt on 28/07/2014.
 */
public class PaisData {

   private List<Pais> Paises = new ArrayList<Pais>();

   public List<Pais> getPaises() {
      return Paises;
   }

   public PaisData() {
      addItem(new Pais(1, "ALEMANIA", R.drawable.pais_alemania, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais(2, "ARGELIA", R.drawable.pais_argelia, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais(3, "ARGENTINA", R.drawable.pais_argentina, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais(4, "AUSTRALIA", R.drawable.pais_australia, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais(5, "BELGICA", R.drawable.pais_belgica, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais(6, "BOSNIA", R.drawable.pais_bosnia, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais(7, "BRASIL", R.drawable.pais_brasil, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais(8, "CAMERUN", R.drawable.pais_camerun, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais(9, "CHILE", R.drawable.pais_chile, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais(10, "COLOMBIA", R.drawable.pais_colombia, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais(11, "COREA", R.drawable.pais_corea, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais(12, "COSTA MARFIL", R.drawable.pais_costa_marfil, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais(13, "COSTA RICA", R.drawable.pais_costa_rica, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais(14, "CROACIA", R.drawable.pais_croacia, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais(15, "ECUADOR", R.drawable.pais_ecuador, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais(16, "ESPAÑA", R.drawable.pais_espania, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais(17, "ESTADOS UNIDOS", R.drawable.pais_estados_unidos, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais(18, "FRANCIA", R.drawable.pais_francia, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais(19, "GHANA", R.drawable.pais_ghana, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais(20, "GRECIA", R.drawable.pais_grecia, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais(21, "HOLANDA", R.drawable.pais_holanda, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais(22, "HONDURAS", R.drawable.pais_honduras, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais(23, "INGLATERRA", R.drawable.pais_inglaterra, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais(24, "IRAN", R.drawable.pais_iran, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais(25, "ITALIA", R.drawable.pais_italia, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais(26, "JAPON", R.drawable.pais_japon, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais(27, "MEXICO", R.drawable.pais_mexico, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais(28, "NIGERIA", R.drawable.pais_nigeria, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais(29, "PORTUGAL", R.drawable.pais_portugal, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais(30, "RUSIA", R.drawable.pais_rusia, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais(31, "SUIZA", R.drawable.pais_suiza, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais(32, "URUGUAY", R.drawable.pais_uruguay, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
   }

   //agrego a la List un item tipo Pais
   private void addItem(Pais item) {
      Paises.add(item);
   }
}
