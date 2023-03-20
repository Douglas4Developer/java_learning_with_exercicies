package factorymarketingRefrigerante;

import factorymarketingRefrigerante.models.Refrigerante;

import javax.swing.*;

public interface FabricadeRefrigerantes {


    public static Refrigerante produzirFolder(Refrigerante objeto){
        objeto.Propaganda();
//         JOptionPane.showMessageDialog(null, objeto.Propaganda());
        return objeto;
    }

    public static void main(String[] args) {

        boolean controle = true;
        Object[] opcoes = { "COCACOLA","PESPI", "GUARANA"};
        Object tipoDoRefrigerante = "";
        Refrigerante obj = null;
        do {
                tipoDoRefrigerante = JOptionPane.showInputDialog(null,
                       "Selecione um Refrigerante",
                        "Simple Factory Method - Refrigerantes",
                        JOptionPane.PLAIN_MESSAGE,
                        null, opcoes, "Coca-Cola");

        obj = FactoryMethodRefrigerante.getRefrigerante(tipoDoRefrigerante.toString());
        produzirFolder(obj);
        }while (controle);




    }



}
