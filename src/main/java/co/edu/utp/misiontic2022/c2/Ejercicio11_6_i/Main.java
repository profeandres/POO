package co.edu.utp.misiontic2022.c2.Ejercicio11_6_i;
/*
Construir una clase con tres atributos de una trompeta, crear la Clase
Trompeta y crear su método Constructor que le asigne valores a los
atributos que se crearon. Adicional construya un programa Java que
utilice esta Clase y muestre sus resultados
*/
public class Main {
    public static void main(String[] args) {
        Trompeta Trompetas=new Trompeta();
        System.out.println("La cantidad de trompetas es: "+Trompetas.Cantidad);
        System.out.println("Cada trompeta cuesta: "+Trompetas.Precio);
        System.out.println("Las trompetas se fabricaron en el año"+Trompetas.AñoFabricacion);
    }
}
