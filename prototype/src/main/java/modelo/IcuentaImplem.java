package modelo;

import interfaz.Icuenta;

public class IcuentaImplem implements Icuenta {

    private String tipo;
    private double monto;

    public IcuentaImplem() {
        this.tipo = "Ahorros";
    }

    @Override
    public Icuenta clonar() {

        IcuentaImplem cuenta = null;

        try {
            //  con esto creamos un clon del objeto cuenta
            cuenta = (IcuentaImplem) clone(); // clone es un metodo propio de java

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return cuenta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    
    // usamos el metodo toString para obtener los datos de los atributos
    @Override
    public String toString() {

        return "cuenta " + "\ntipo: " + tipo + "\nmonto: " + monto;
    }

}
