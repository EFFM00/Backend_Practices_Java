package com.company;

public class ProcesadorDebito extends Pago{

    public ProcesadorDebito(Double monto, Tarjeta tarjetaCobro) {
        super(monto, (Debito) tarjetaCobro);
        //if(getTarjetaCobro().getClass()
    }

    public Boolean darAutorizacion() {

        Boolean fechaVigente = this.comprobarFecha();
        Double montoCompra = this.getMonto();
        Double limiteTarjeta = getTarjetaCobro().getSaldoDisponible();

        if(fechaVigente == true && montoCompra < limiteTarjeta){
            System.out.println("Se autorizó la compra con débito");
            return true;
        }

        System.out.println("La compra con débito no pudo ser autorizada");
        return false;
    }
}
