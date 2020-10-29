package com.company;

import java.util.ArrayList;

public class Main {

    public static final ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Camarero camarero = new Camarero();
        // Es importante que empiece el camarero ya que se queda esperando.


        camarero.start();
        cliente.start();

        try {
            camarero.join();
            cliente.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}