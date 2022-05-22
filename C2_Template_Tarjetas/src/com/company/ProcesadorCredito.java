package com.company;

import java.util.Date;

public class ProcesadorCredito extends Pago{

    public ProcesadorCredito(Double monto, Tarjeta tarjetaCobro) {
        super(monto, (Credito) tarjetaCobro);
    }

    public Boolean darAutorizacion() {

        Boolean fechaVigente = this.comprobarFecha();
        Double montoCompra = this.getMonto();
        Double saldoDisponible = getTarjetaCobro().getSaldoDisponible();

        if(fechaVigente == true && montoCompra < saldoDisponible){
            System.out.println("Se autorizó la compra con crédito");
            return true;
        }

        System.out.println("La compra con débito no pudo ser autorizada");
        return false;
    }
}
