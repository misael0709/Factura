package com.mycompany.factura;

public class Cliente {
    public double vImpFactura(){
        Descuento d;
        IVA i;
        double des, iva;
        
        d = new c30();
        des = d.Operacion(100);
        
        i = new c10IVA();
        iva = i.Operacion(100-des);
        
        return 100 - des + iva;
    }
}
