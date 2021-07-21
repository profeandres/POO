package co.edu.utp.misiontic2022.c2.Ejercicio11_6_f;
/*
Construir una clase con tres atributos de un computador, crear la Clase
Computador y crear su método Constructor que le asigne valores a los
atributos que se crearon. Adicional construya un programa Java que
utilice esta Clase y muestre sus resultados
*/
public class Main {
    public static void main(String[] args) {
        Computador Mipc=new Computador();

        System.out.println("El computador costó: "+Mipc.Precio);
        System.out.println("El computador es de "+Mipc.Generacion+" Generación");
        System.out.println("El computador es de marca: "+Mipc.Marca);
    }
}
