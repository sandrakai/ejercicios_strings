public class Ejercicio3 {

    public static void main(String[] args) {

        //Invertir un texto

        String txt = "Turisas";
    //Cambiando FOR
        for (int i=txt.length()-1;i>=0;i--){
            System.out.print(txt.charAt(i));
        }
    //Guardando en variable
        String txtInvertido="";

        for (int i=0;i<txt.length();i++){
            txtInvertido=txt.charAt(i) + txtInvertido;
        }
        System.out.print(txtInvertido);

    //StringBuilder y reverse()
        StringBuilder sb = new StringBuilder(txt);
        sb.reverse();
        System.out.println(sb);
    }
}
