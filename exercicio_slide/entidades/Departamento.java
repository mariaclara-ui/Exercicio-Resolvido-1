package Java_criacao_app.exercicio_slide.entidades;

public class Departamento {
    public String nomeDepartamento;


    public String getNomeDepartamento() {
        return nomeDepartamento;
    }

    public void setNomeDepartamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nomeDepartamento='" + nomeDepartamento ;
    }
}

