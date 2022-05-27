package com.sofkau.utilities;

import com.sofkau.utilities.interfaces.PerroInterface;
import java.util.logging.Logger;

public class Perro extends Animal implements PerroInterface {

    private static final Logger logger = Logger.getLogger(Perro.class.getName());

    public Perro(double peso, double altura) {
        super(peso, altura);
    }

    @Override
    public void ladrar() {
        logger.info("Expreso el perro:\nGuau! Guau!");
        
    }

}
