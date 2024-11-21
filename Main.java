package Puntos_aleatorios;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> x = new ArrayList<Double>();
        ArrayList<Double> y = new ArrayList<Double>();
        ArrayList<String> adentro = new ArrayList<String>();
        ArrayList<String> afuera = new ArrayList<String>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            double agregar_x = Math.round(random.nextDouble(10) * 10.0) / 10.0;
            double agregar_y = Math.round(random.nextDouble(10) * 10.0) / 10.0;
            x.add(agregar_x);
            y.add(agregar_y);
        } 
        for (int i = 0; i < 10; i++) {
          double coordenada_x = x.get(i);
          double coordenada_y = y.get(i);
          String coordenada = "(" + coordenada_x + "," + coordenada_y + ")";
          if (coordenada_x>2&&coordenada_x<6&&coordenada_y>4&&coordenada_y<8) {
              System.out.println("Coordenadas generado: " + coordenada + ", adentro del cuadro");
              adentro.add(coordenada);
            } else {
              System.out.println("Coordenadas generado: " + coordenada + ", afuera del cuadro");
              afuera.add(coordenada);
            }
        } 
        System.out.println("Coordenadas adentro del cuadro:");
        System.out.println(adentro);
        System.out.println("Coordenadas afuera del cuadro:");
        System.out.println(afuera);
    }
}

