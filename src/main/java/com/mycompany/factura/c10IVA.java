package com.mycompany.factura;

public class c10IVA extends IVA {

    @Override
    double Operacion(double v) {
        return v * 0.10;
    }
    
}
