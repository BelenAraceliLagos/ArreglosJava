import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //arraylist con visitas diarias
        ArrayList<Integer> visitas = new ArrayList<Integer>();

        //pedir al usuario el tamaño de la lista
        System.out.println("¿Para cuantos dias quiere promediar el numero de visitas?:");
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();

        //bucle para pedir al usuario la cantidad de visitas diarias
        int n;
        do {
            System.out.println("Ingrese la cantidad de visitas diarias: ");
            Scanner sc = new Scanner(System.in);
            int v = sc.nextInt();
            visitas.add(v);
            n = visitas.size();
        } while (n < m);

        //llamar el metodo con el arraylist
        promedioVisitas(visitas);
    }

    //metodo promedia las visitas diarias
    public static void promedioVisitas(ArrayList<Integer>visitas){

        int suma = 0;
        for (int i = 0; i < visitas.size(); i++){
            suma = suma + visitas.get(i);
        }

        System.out.printf("EL promedio de visitas de la semana es: " + suma/ visitas.size());
    }


}

