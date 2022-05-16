import javax.swing.*;

public class Ejercicio13 {

    public static void main(String[] args) {

        //Dado un texto el programa nos pedirá que introduzcamos un caracter y evaluará el número de veces
        // que aparece dicho carácter. Debemos de controlar que el carácter sea válido
        String frase = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme, " +
                "no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, " +
                "adarga antigua, rocín flaco y galgo corredor. Una olla de algo más vaca que carnero, " +
                "salpicón las más noches, duelos y quebrantos los sábados, lantejas los viernes, " +
                "algún palomino de añadidura los domingos, consumían las tres partes de su hacienda.";

        JFrame ventana = new JFrame();


        int contador=0;
        boolean error = false;
        char temporal;
        char letra;

        do {
            String caracter = JOptionPane.showInputDialog(ventana,"Introduce un caracter");
            letra = caracter.charAt(0);

            if (caracter.matches("[a-zA-Z]")){
                error=false;
                for (int i=0;i<frase.length();i++){
                    temporal=frase.charAt(i);
                    if (temporal==letra){
                        contador++;
                    }
                }
            }else{
                error=true;
                JOptionPane.showMessageDialog(ventana, "No has introducido un caracter");
            }

        }while (error);

        JOptionPane.showMessageDialog(ventana, "La letra " + letra + " está " + contador + " veces" );

    }
}
