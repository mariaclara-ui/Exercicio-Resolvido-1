package Java_criacao_app.exercicio_slide.entidades;
import java.time.LocalDate;
import java.util.ArrayList;


public class HorasContrato {
    private LocalDate data;
    private String textoData;
    private double valorPorhora;
    private int horas;
    private int quantiContra;
    private double valorTotal;

    public HorasContrato(){

    }

    public HorasContrato(LocalDate data,String textoData,double valorPorhora,int horas,int quantiContra,double valorTotal) {
        this.data = data;
        this.valorPorhora = valorPorhora;
        this.horas = horas;
        this.quantiContra = quantiContra;
        this.textoData = textoData;
    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValorPorhora() {
        return valorPorhora;
    }

    public void setValorPorhora(double valorPorhora) {
        this.valorPorhora = valorPorhora;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setTextoData(String textoData) {
        this.textoData = textoData;
    }

    public String getTextoData() {
        return textoData;
    }

    public int getQuantiContra() {
        return quantiContra;
    }


    //set/get

    public void setQuantiContra(int quantiContra) {
        this.quantiContra = quantiContra;
    }


}


