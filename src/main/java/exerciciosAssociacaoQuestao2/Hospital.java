package exerciciosAssociacaoQuestao2;

import java.util.ArrayList;

public class Hospital {
    private String nome;
    private ArrayList<Paciente> pacientes;

    public Hospital(String nome) {
        this.nome = nome;
        this.pacientes = new ArrayList<Paciente>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
}