package co.edu.utp.misiontic2022.c2.Ejercicio11_6_j;
/*
Construir una clase con tres atributos de un libro, crear la Clase Libro
y crear su método Constructor que le asigne valores a los atributos que
se crearon. Adicional construya un programa Java que utilice esta
Clase y muestre sus resultados
*/
public class Main {
    public static void main(String[] args) {
        Libro Libro1=new Libro();
        System.out.println("El libro tiene "+Libro1.Paginas+" páginas");
        System.out.println("El autor del libro es "+Libro1.Autor);
        System.out.println("El libro se publicó en el año "+Libro1.AñoPublicacion);
    }
}
