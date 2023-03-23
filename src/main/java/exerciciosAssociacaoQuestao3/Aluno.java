package exerciciosAssociacaoQuestao3;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private ArrayList<Materia> materias;

    public Aluno() {
    }

    public Aluno(String nome, ArrayList<Materia> materias) {
        this.nome = nome;
        this.materias = materias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }
}
