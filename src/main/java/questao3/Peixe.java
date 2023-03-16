package questao3;

public class Peixe extends Animal {

    private String habitat;

    public Peixe(){

    }

    public Peixe(String nome, double peso, String habitat){

        super(nome, peso);

        this.habitat = habitat;
    }



    public String getHabitat(){
        return habitat;
    }

    public void setHabitat(String habitat){
        this.habitat = habitat;
    }


    
}
