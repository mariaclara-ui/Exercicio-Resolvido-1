package Java_criacao_app.exercicio_slide.aplicativo;
import Java_criacao_app.exercicio_slide.entidades.Trabalhador;
import Java_criacao_app.exercicio_slide.entidades.HorasContrato;
import Java_criacao_app.exercicio_slide.entidades.Departamento;
import Java_criacao_app.exercicio_slide.entidades.enums.Status;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Trabalhador trabalhador = new Trabalhador();
        HorasContrato horasContrato = new HorasContrato();
        Departamento departamento = new Departamento();



        System.out.println("Digite o nome do departamento");
        departamento.setNomeDepartamento(sc.nextLine());

        System.out.println("Digite o nome do trabalhador");
        trabalhador.setName(sc.nextLine());

        System.out.println("Digite o nivel do trabalhador");
        trabalhador.setLevel(Status.valueOf(sc.nextLine().toUpperCase()));

        System.out.println("Digite o salário base");
        trabalhador.setSalario(sc.nextDouble());


        System.out.println("Quantos contratos o trabalhador possui?");
        horasContrato.setQuantiContra(sc.nextInt());
        sc.nextLine();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        ArrayList<HorasContrato> contratos = new ArrayList<>();

        for (int contagem = 0; contagem < horasContrato.getQuantiContra(); contagem++) {
            HorasContrato contrato = new HorasContrato();

            System.out.println("Digite a data de inicio " +( contagem + 1) + " do contrato (DD/MM/AAAA)");
            contrato.setTextoData(sc.nextLine());



            LocalDate data = LocalDate.parse(contrato.getTextoData(), formato);
            contrato.setData(data);


            System.out.println("Digite o valor por hora do " + ( contagem + 1) + " contrato");
            contrato.setValorPorhora(sc.nextDouble());

            System.out.println("Digite a duração em horas do "+ ( contagem + 1)+ " contrato");
            contrato.setHoras(sc.nextInt());

            sc.nextLine();

            trabalhador.adicionarContrato(contrato);
        }
        System.out.println("Insira o mês e ano para calcular a renda (MM/AAAA):");
        String data = sc.nextLine();

        String[] partes = data.split("/");

        int mes = Integer.parseInt(partes[0]);
        int ano = Integer.parseInt(partes[1]);

        System.out.println("Nome: " + trabalhador.getName());
        System.out.println("Departamento: " + departamento.getNomeDepartamento());
        System.out.println("Renda: " + trabalhador.renda(ano, mes));
    }
}


