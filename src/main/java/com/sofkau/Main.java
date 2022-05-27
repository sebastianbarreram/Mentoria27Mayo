package com.sofkau;

import com.sofkau.utilities.Gato;
import com.sofkau.utilities.Perro;

public class Main {

    static Perro perro = new Perro(20,30);
    static Gato gato=new Gato(10,10);

    public static void main(String[] args) {
        init();
    }

    private static void init() {
        perro.ladrar();
        gato.maullar();
        
    }

}