package com.sofkau.utilities;

import java.util.logging.Logger;

import com.sofkau.utilities.interfaces.GatoInterface;

public class Gato extends Animal implements GatoInterface {

    private static final Logger logger = Logger.getLogger(Gato.class.getName());

    public Gato(double peso, double altura) {
        super(peso, altura);
    }

    @Override
    public void maullar() {
        logger.info("Exclama el gato:\nMiau!");
    }

    
}
