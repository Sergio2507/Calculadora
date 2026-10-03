package Clases;

public class Multiplicacion {
    public String Mult2(String a, String b){
        double resultado=Double.parseDouble(a)*Double.parseDouble(b);
        return "El resultado es: "+resultado;
    }
    public String MultN(String num[]){
        double resultado=0.0;
        for(String numero:num){
            resultado*=Double.parseDouble(numero);
        }
        return "El resultado es: "+resultado;
    }
}
