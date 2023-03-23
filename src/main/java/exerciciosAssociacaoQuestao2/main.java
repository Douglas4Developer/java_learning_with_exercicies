package exerciciosAssociacaoQuestao2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("Albert Einsten");

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome do paciente " + (i+1) + ":");
            String nome = scanner.nextLine();
            System.out.println("Digite a doença do paciente " + (i+1) + ":");
            String doenca = scanner.nextLine();
            Paciente paciente = new Paciente(nome, doenca);
            hospital.getPacientes().add(paciente);
        }

        System.out.println("Pacientes do hospital " + hospital.getNome() + ":");
        for (Paciente paciente : hospital.getPacientes()) {
            System.out.println("Nome: " + paciente.getNome() + " - Doença: " + paciente.getDoenca());
        }
    }
}
