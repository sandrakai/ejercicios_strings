import java.util.ArrayList;

public class Ejercicio11 {
    public static void main(String[] args) {

        //Convertir una frase en un array formado por las palabras de esa frase

        //¿Cuántas veces aparece la palabra "de"?
        // ¿Cuál es la palabra de mayor longitud?

        String frase = "quebrantas En un lugar de la Mancha, de cuyo nombre no quiero acordarme, " +
                "no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, " +
                "adarga antigua, rocín flaco y galgo corredor. Una olla de algo más vaca que carnero, " +
                "salpicón las más noches, duelos y quebrantos los sábados, lantejas los viernes, " +
                "algún palomino de añadidura los domingos, consumían las tres partes de su hacienda.";

        String fraseLimpia = frase.replaceAll("[,;.]","");
        //String fraseLimpia = frase.replace(",","").replace(".","").replace(";","");
        String[] palabras = fraseLimpia.split("\\s+");

        //Expresiones regulares
        // \\s => significa espacio, \\s+ => múltiples espacios
        // [^\\w] => replace all

        int contador=0;
        int masLarga=0;

        ArrayList largas = new ArrayList();

        for (String palabra:palabras){
            if (palabra.equals("de")){
                contador++;
            }
        }

        System.out.println("La palabra \"de\" aparece " + contador + " veces");

        for (int i=1;i< palabras.length;i++){
            if (palabras[i].length()>palabras[masLarga].length()){
                masLarga = i;
            }
        }

        for (String palabra : palabras) {
            if (palabra.length() == palabras[masLarga].length()) {

                largas.add(palabra);

            }
        }

        System.out.println("La palabra más larga es \"" + palabras[masLarga]+"\"");
        System.out.println("Las palabras más largas son " + largas);


    }
}
