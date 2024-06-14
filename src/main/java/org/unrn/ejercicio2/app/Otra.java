package org.unrn.ejercicio2.app;

import org.unrn.ejercicio2.tarjetas.Tarjeta;

public class Otra implements Tarjeta {
    public double aplicarDescuento(double mPl, double mBeb) {
        double t = mPl + mBeb;
        return t;
    }
}
