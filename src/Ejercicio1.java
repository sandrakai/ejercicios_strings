public class Ejercicio1 {

    public static void main(String[] args) {

        //Longitud del texto
        String txt = "En un lugar de La Mancha de cuyo nombre no quiero acordarme";
        System.out.println(txt.length());
        //Longitud del texto utilizando FOR
        int contador = 0;
        for (int i=0;i<txt.length();i++){
            contador++;
        }

        System.out.println("contador = " + contador);
        
        
    }
}
