package co.edu.utp.misiontic2022.c2.Ejercicio11_6_h;
/*
Construir una clase con cuatro atributos de una ciudad, crear la Clase
Ciudad y crear su método Constructor que le asigne valores a los
atributos que se crearon. Adicional construya un programa Java que
utilice esta Clase y muestre sus resultados
*/
public class Main {
    public static void main(String[] args) {
        Ciudad Ciudad1=new Ciudad();

        System.out.println("La ciudad1 se llama: "+Ciudad1.Nombre);
        System.out.println("La ciudad1 tiene una población de "+Ciudad1.Poblacion+" habitantes");
        System.out.println("La ciudad1 tiene una altura de "+Ciudad1.AltNivelMar+" kilometros sobre el nivel del mar ");
        System.out.println("La ciudad1 tiene una edad de "+Ciudad1.Edad);
    }
}
