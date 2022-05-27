package com.sofkau.utilities;
import java.util.logging.Logger;

public class Animal {
    double peso;
    double altura;
    private static final Logger logger = Logger.getLogger(Perro.class.getName());

    public Animal(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void walkRight() {
        logger.info("Se movio a la derecha");

    }

    public void walkLeft() {
        logger.info("Se movio a la izquierda");
    }
}
