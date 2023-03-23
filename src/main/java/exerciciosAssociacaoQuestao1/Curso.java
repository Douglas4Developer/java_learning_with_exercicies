package exerciciosAssociacaoQuestao1;

import java.util.ArrayList;

public class Curso {
    private String nome;
    private String cargaHoraria;
    private Instrutor instrutor;
    private ArrayList<Aluno> alunos;

    public Curso() {
    }

    public Curso(String nome, String cargaHoraria, Instrutor instrutor) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.instrutor = instrutor;
        this.alunos = new ArrayList<Aluno>(4);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }
}