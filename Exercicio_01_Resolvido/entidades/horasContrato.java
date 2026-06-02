package Exercicio_01_Resolvido.entidades;

import java.util.Date;

public class horasContrato {
    private Date data;
    private double valorPorhora;
    private int horas;

    public horasContrato(Date data, double valorPorhora, int horas) {
        this.data = data;
        this.valorPorhora=valorPorhora;
        this.horas=horas;
    }
    public Date getData() {
        return data;
    }
    public double getValorPorhora() {
        return valorPorhora;
    }
    public int getHoras() {
        return horas;
    }



    //aqui vai ter um metodo total valor
}
