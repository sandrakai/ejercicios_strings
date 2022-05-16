import java.util.Locale;

public class Ejercicio5 {
    public static void main(String[] args) {
        //Contar las vocales y consonantes del string "Un elefante se balanceaba sobre la tela de una araña"

        String txt = "Un elefante se balanceaba sobre la tela de una araña";
        int vocales=0, consonantes=0;


        String textoLimpio = txt.replace(" ","").toLowerCase();

        for (int i=0;i<textoLimpio.length();i++){

            char letra = textoLimpio.charAt(i);

            if (letra == 'a'||letra == 'e'||letra == 'i'||letra == 'o'||letra == 'u'){
                vocales++;
            }else{
                consonantes++;
            }
        }

        System.out.println("Vocales: " + vocales + " y consonantes: " + consonantes);

        //Con FOREACH

        vocales=0; consonantes=0;

        for(char caracter:textoLimpio.toCharArray()){
            if (caracter == 'a'||caracter == 'e'||caracter == 'i'||caracter == 'o'||caracter == 'u'){
                vocales++;
            }else {
                consonantes++;
            }
        }

        System.out.println("Vocales: " + vocales + " y consonantes: " + consonantes);
    }
}
