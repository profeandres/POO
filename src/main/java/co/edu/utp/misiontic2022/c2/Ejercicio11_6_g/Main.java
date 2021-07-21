package co.edu.utp.misiontic2022.c2.Ejercicio11_6_g;
/*
Construir una clase con tres atributos de un ser humano, crear la Clase
SerHumano y crear su método Constructor que le asigne valores a los
atributos que se crearon. Adicional construya un programa Java que
utilice esta Clase y muestre sus resultados
*/
public class Main {
    public static void main(String[] args) {
        SerHumano Daniela=new SerHumano();

        System.out.println("La edad de "+Daniela.Nombre+" es: "+Daniela.Edad);
        System.out.println("La altura de "+Daniela.Nombre+" es: "+Daniela.Altura);
        if (Daniela.Vivo){
            System.out.println("En estos momentos "+Daniela.Nombre+" esta viva");
            //I know.... this is a little creepy... it's just an example... calm down xD
        }
        System.out.println(Daniela.Nombre+" es "+Daniela.Sexo);
    }
}
