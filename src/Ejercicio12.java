public class Ejercicio12 {
    public static void main(String[] args) {
        //De una consulta a una base de datos nos llega un teléfono con el siguiente formato:
        //String = 5256284000
        //Lo que queremos es presentarlo con este formato:
        //(52)-5-6284000

        String telefono = "5256284000";
        String tel1="", tel2="", tel3="", telefonoFinal="";

        System.out.println(telefono);

        tel1 = telefono.substring(0,2);
        tel2 = telefono.substring(2,3);
        tel3 = telefono.substring(3);

        System.out.println(tel1);
        System.out.println(tel2);
        System.out.println(tel3);

        telefonoFinal = "("+tel1+")-"+tel2 + "-"+tel3;
        System.out.println(telefonoFinal);
    }
}
