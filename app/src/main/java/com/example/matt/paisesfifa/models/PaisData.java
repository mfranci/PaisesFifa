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
      addItem(new Pais("ALE", "ALEMANIA", R.drawable.pais_alemania, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais("ALI", "ARGELIA", R.drawable.pais_argelia, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais("ARG", "ARGENTINA", R.drawable.pais_argentina, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais("AUS", "AUSTRALIA", R.drawable.pais_australia, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais("BEL", "BELGICA", R.drawable.pais_belgica, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais("BOS", "BOSNIA", R.drawable.pais_bosnia, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais("BRA", "BRASIL", R.drawable.pais_brasil, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais("CAM", "CAMERUN", R.drawable.pais_camerun, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais("CHI", "CHILE", R.drawable.pais_chile, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais("COL", "COLOMBIA", R.drawable.pais_colombia, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais("COR", "COREA", R.drawable.pais_corea, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais("CMA", "COSTA MARFIL", R.drawable.pais_costa_marfil, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais("CRI", "COSTA RICA", R.drawable.pais_costa_rica, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais("CRO", "CROACIA", R.drawable.pais_croacia, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais("ECU", "ECUADOR", R.drawable.pais_ecuador, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais("ESP", "ESPAÑA", R.drawable.pais_espania, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais("USA", "ESTADOS UNIDOS", R.drawable.pais_estados_unidos, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais("FRA", "FRANCIA", R.drawable.pais_francia, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais("GHA", "GHANA", R.drawable.pais_ghana, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais("GRE", "GRECIA", R.drawable.pais_grecia, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais("HOL", "HOLANDA", R.drawable.pais_holanda, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais("HON", "HONDURAS", R.drawable.pais_honduras, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais("ENG", "INGLATERRA", R.drawable.pais_inglaterra, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais("IRA", "IRAN", R.drawable.pais_iran, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais("ITA", "ITALIA", R.drawable.pais_italia, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais("JAP", "JAPON", R.drawable.pais_japon, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais("MEX", "MEXICO", R.drawable.pais_mexico, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais("NIG", "NIGERIA", R.drawable.pais_nigeria, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais("POR", "PORTUGAL", R.drawable.pais_portugal, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais("RUS", "RUSIA", R.drawable.pais_rusia, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais("SUI", "SUIZA", R.drawable.pais_suiza, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
      addItem(new Pais("URU", "URUGUAY", R.drawable.pais_uruguay, "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor"));
   }

   //agrego a la List un item tipo Pais
   private void addItem(Pais item) {
      Paises.add(item);
   }
}
