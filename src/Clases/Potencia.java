package Clases;
import java.math.*;
public class Potencia {
    public String Potencia2(String a){
        double resultado=Math.pow(Double.parseDouble(a),2);
        return "El resultado es: "+resultado;
    }
    public String Potencia3(String a){
        double resultado=Math.pow(Double.parseDouble(a),3);
        return "El resultado es: "+resultado;
    }
    public String PotenciaN(String a, String b){
        double resultado=0;
        resultado=Math.pow(Double.parseDouble(a),Double.parseDouble(b));
        return "El resultado es "+resultado;
    }
}
