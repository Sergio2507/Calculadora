package Clases;

public class Suma {

    public String Sumar2(String a, String b){
        double resultado=Double.parseDouble(a)+Double.parseDouble(b);
        return "El resultado es: "+resultado;
    }
    public String SumarN(String num[]){
        double resultado=0.0;
        for(String numero:num){
            resultado+=Double.parseDouble(numero);
        }
        return "El resultado es: "+resultado;
    }
}
