package com.mycompany.factura;

public class c16IVA extends IVA{

    @Override
    double Operacion(double v) {
        return v * 0.16;
    }
    
}
