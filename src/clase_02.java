/*
Programa de la clase #2
 */
public class clase_02 {
    // Declaracion de variables
    int num;
    char letra;
    double real;
    String hola;
    String nombre;


    /*
    Metodo muestra algo
     */
    public void imprimir() {
        System.out.println(" Clase #2");
        System.out.println("Mi nombre -> "+nombre);
    }

    int resultado(int edad) {
        int reult = 0;

        reult =  edad + 5;

        return reult;
//        return edad+5;
    }

    public static void main( String[] arg) {
       // Estamos instanciando nuestro programa
        int temp = 0;

       clase_02 n1 = new clase_02();

       n1.nombre = "Maryon Tores ";

       n1.imprimir();

       temp = n1.resultado(10);
       System.out.println(" El resultado es -> "+temp);


    }


}
