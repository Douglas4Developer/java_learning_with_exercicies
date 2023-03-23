package exerciciosAssociacaoQuestao3;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            String nomeAluno = sc.nextLine();

            ArrayList<Materia> listaMaterias = new ArrayList<>();

            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o nome da matéria " + (j + 1) + ": ");
                String nomeMateria = sc.nextLine();

                Materia materia = new Materia(nomeMateria);
                listaMaterias.add(materia);
            }

            Aluno aluno = new Aluno(nomeAluno, listaMaterias);
            listaAlunos.add(aluno);
        }

        for (Aluno aluno : listaAlunos) {
            System.out.println("Aluno: " + aluno.getNome());
            System.out.print("Matérias: ");

            for (Materia materia : aluno.getMaterias()) {
                System.out.print(materia.getNome() + " ");
            }

            System.out.println("\n");
        }
    }
}
