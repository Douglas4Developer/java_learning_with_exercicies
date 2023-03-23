package exerciciosAssociacaoQuestao1;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
       // Instanciação dos instrutores
        Instrutor felipe = new Instrutor("Felipe");
        Instrutor ivan = new Instrutor("Ivan");

        // Instanciação dos cursos
        Curso cursoJava = new Curso("Java", "30h", felipe);
        Curso cursoAndroid = new Curso("Android", "20h", ivan);

        // Instanciação dos alunos
        Aluno ana = new Aluno("Ana", "1001");
        Aluno jose = new Aluno("José", "1002");
        Aluno nelson = new Aluno("Nelson", "1003");
        Aluno jaqueline = new Aluno("Jaqueline", "1004");
        Aluno thais = new Aluno("Thais", "1005");
        Aluno john = new Aluno("John", "1006");

        // Adição dos alunos nos cursos de JAVA
        cursoJava.adicionarAluno(ana);
        cursoJava.adicionarAluno(jose);
        cursoJava.adicionarAluno(nelson);
        cursoJava.adicionarAluno(jaqueline);

        // Adição dos alunos nos cursos de Android
        cursoAndroid.adicionarAluno(ana);
        cursoAndroid.adicionarAluno(jose);
        cursoAndroid.adicionarAluno(thais);
        cursoAndroid.adicionarAluno(john);


        // Mostrar todos os alunos dos cursos
                System.out.println("Todos os alunos:");

        // Percorrer o ArrayList de Aluno do curso de Java
                for (Aluno alunoJava : cursoJava.getAlunos()) {
                    System.out.println("Nome: " + alunoJava.getNome() + " | Matrícula: " + alunoJava.getMatricula() + " | Curso: Java | Instrutor: " + cursoJava.getInstrutor().getNomeInstrutor());
                }

        // Percorrer o ArrayList de Aluno do curso de Android
                for (Aluno alunoAndroid : cursoAndroid.getAlunos()) {
                    System.out.println("Nome: " + alunoAndroid.getNome() + " | Matrícula: " + alunoAndroid.getMatricula() + " | Curso: Android | Instrutor: " + cursoAndroid.getInstrutor().getNomeInstrutor());
                }

    }
}
