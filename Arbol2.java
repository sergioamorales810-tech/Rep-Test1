
package arbol2;

public class Arbol2 {

   
    public static void main(String[] args) {
        int altura = 10; //altura de arbol
        int ancho = 1;  //ancho inicial
        int espacios = altura - 1; // espacios iniciales

        //imprimir arbolito
        for (int i = 0; i < altura; i++) {
            //imprimir espacios
            for (int j = 0; j < espacios; j++) {
                System.out.println(" ");
            }

            //imprimir asteriscos
            for (int j = 0; j < ancho; j++) {
                System.out.println("* ");
            }

            //salto de linea
            System.out.println();

            //ajuste de ancho y espacios
            ancho += 2;
            espacios--;
           
        }
        //imprimir tronco
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < altura - 1; j++) {
                System.out.println(" ");
            }
            System.out.println("|");
        }

    }

}
