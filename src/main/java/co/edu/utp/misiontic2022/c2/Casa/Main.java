package co.edu.utp.misiontic2022.c2.Casa;

public class Main {
    public static void main(String[] args) {
        //Invoco el constructor
        Casa Casa1= new Casa();
        //Puedo alterar el color de la casa con solo mencionar el atributo
        Casa1.Color="Verde";
        //Imprimo los atributos asignados a "Casa1" por el constructor Casa()
        System.out.println("La casa 1 queda en la ciudad de: "+Casa1.Ciudad);
        System.out.println("La casa 1 es de color "+Casa1.Color);
        System.out.println("La casa 1 vale "+Casa1.Valor);
    }
}
