package Java_criacao_app.exercicio_slide.entidades;
import Java_criacao_app.exercicio_slide.entidades.enums.Status;

import java.util.ArrayList;


public class Trabalhador {
    private String name;
    private Status level;
    private double salario;

    ArrayList<HorasContrato> contratos = new ArrayList<>();
    public Trabalhador() {
    }

    public Trabalhador(String name, String level, double salario, Departamento departamento) {
        this.name = name;

        this.salario = salario;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(Status level) {
        this.level = level;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public ArrayList<HorasContrato> getContratos() {
        return contratos;
    }
    public void adicionarContrato(HorasContrato contrato) {
        contratos.add(contrato);
    }
    public double renda() {
        double total = salario;
        for (HorasContrato contrato : contratos) {
            total += contrato.getValorPorhora() * contrato.getHoras();
        }
        return total;
    }
    public void removerContrato(HorasContrato contrato) {
        contratos.remove(contrato);
    }
   public  double renda(int ano , int mes){
       double total = salario;

       for (HorasContrato contrato : contratos) {

           if (contrato.getData().getYear() == ano && contrato.getData().getMonthValue() == mes) {
               total += contrato.getValorPorhora() * contrato.getHoras();
           }
       }

       return total;

   }

}

