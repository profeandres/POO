package co.edu.utp.misiontic2022.c2.Ejercicio11_6_b;
/*
Construir una clase con tres atributos de una fruta, crear la Clase Fruta
y crear su método Constructor que le asigne valores a los atributos que
se crearon. Adicional construya un programa Java que utilice esta
Clase y muestre sus resultados
*/
public class Main {
    public static void main(String[] args) {
        Fruta Manzana= new Fruta();

        System.out.println("La "+Manzana.Nombre+" es de color "+Manzana.Color);
        System.out.println("La "+Manzana.Nombre+" pesa "+Manzana.Peso+ "g");
        System.out.println("La "+Manzana.Nombre+" Expira en la fecha "+Manzana.FechaExp);
    }
}
