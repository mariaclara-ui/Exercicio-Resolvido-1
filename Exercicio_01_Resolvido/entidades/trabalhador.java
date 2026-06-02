package Exercicio_01_Resolvido.entidades;
// o horas contrato tem que ser importado para ca //

public class trabalhador {
    private String name;
    private String level;
    private double salario;

    public trabalhador(String name,String level, double salario) {
        this.name = name;
        this.level = level;
        this.salario=salario;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }
    public double getSalario() {
        return salario;
    }
    //dois dos metodos dessa classe vao alimentar a classe horasContrato
    //aqui vai ter 3 metodos adicionar contrato, remover contrato e renda //

}
