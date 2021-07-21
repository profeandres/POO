package co.edu.utp.misiontic2022.c2.Ejercicio11_6_d;
/*
Construir una clase con tres atributos de una silla, crear la Clase Silla
y crear su método Constructor que le asigne valores a los atributos que
se crearon. Adicional construya un programa Java que utilice esta
Clase y muestre sus resultados
*/
public class Main {
    public static void main(String[] args) {
        Silla Silla1= new Silla();

        System.out.println("La silla tiene una altura de: "+Silla1.Altura);
        System.out.println("La silla esta hecha de: "+Silla1.Material);
        System.out.println("La silla es de color: "+Silla1.Color);

    }
}
