package com.mycompany.factura;

public class Cliente {
    public double vImpFactura(){
        Descuento d;
        IVA i;
        double des, iva;
        
        d = new c20();
        des = d.Operacion(100);
        
        i = new c16IVA();
        iva = i.Operacion(100-des);
        
        return 100 - des + iva;
    }
}
