package factorymarketingRefrigerante;

import factorymarketingRefrigerante.models.CocaCola;
import factorymarketingRefrigerante.models.Guarana;
import factorymarketingRefrigerante.models.Pepsi;

public class FactoryMethodRefrigerante {
    public enum Refrigerante{
        COCACOLA, PESPI, GUARANA;
    }

    public static factorymarketingRefrigerante.models.Refrigerante getRefrigerante(String tipoRefrigerante){
        Refrigerante tipo = Refrigerante.valueOf(tipoRefrigerante);
        switch (tipo)
        {
            case COCACOLA:
                return new CocaCola("Coca-Cola.","coca",350,5.50);
            case PESPI:
                return new Pepsi("Pepsi","pepsi", 1000, 35.5, "2 reais");
            case GUARANA:
                return new Guarana("Guarana","guarana",600 , 6.50, "1.0");
        }

        return null;
    }
}