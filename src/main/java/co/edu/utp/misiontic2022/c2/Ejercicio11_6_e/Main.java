package co.edu.utp.misiontic2022.c2.Ejercicio11_6_e;
/*
Construir una clase con cinco atributos de un carro, crear la Clase
Carro y crear su método Constructor que le asigne valores a los
atributos que se crearon. Adicional construya un programa Java que
utilice esta Clase y muestre sus resultados
*/
public class Main {
    public static void main(String[] args) {

        Carro Carro1=new Carro();

        System.out.println("El carro1 tiene la placa: "+Carro1.Placa);
        System.out.println("El carro1 es de color: "+Carro1.Color);
        System.out.println("El carro1 es modelo: "+Carro1.Modelo);
        System.out.println("El carro1 es: "+Carro1.Tipo);
        System.out.println("El carro1 tiene un kilometraje de: "+Carro1.Kilometraje);
        
    }
}
