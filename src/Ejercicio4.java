public class Ejercicio4 {
    public static void main(String[] args) {

        //Elimina los espacios del texto: "James Gosling ideó y creó Java"

        //Con replace()
        String textoOriginal = "James Gosling ideó y creó Java";
        System.out.println(textoOriginal.replace(" ",""));

        //Con un FOR
        String nuevoTexto="";
        for(int i=0;i<textoOriginal.length();i++){
            if (textoOriginal.charAt(i)!=' '){
                nuevoTexto += textoOriginal.charAt(i);
            }
        }
        System.out.println(nuevoTexto);
    }


}
