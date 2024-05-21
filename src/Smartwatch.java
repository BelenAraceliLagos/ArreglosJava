import java.util.ArrayList;
import java.util.Scanner;

public class Smartwatch {

    public static void main(String[] args) {
        //arraylist con visitas diarias
        ArrayList<Integer> pasos = new ArrayList<Integer>();

        //buble para pedir al usuario las visitas de 1 semana
        int n;
        do {
            System.out.println("Ingrese la cantidad de pasos diarios: ");
            Scanner sc = new Scanner(System.in);
            int v = sc.nextInt();
            pasos.add(v);
            n = pasos.size();
        } while (n < 7);

        //llamar el metodo con el arraylist
        promedioPasos(pasos);
    }

    //metodo promedia las visitas diarias
    public static void promedioPasos(ArrayList<Integer>pasos){

        int suma = 0;
        for (int i = 0; i < pasos.size(); i++){

            if (pasos.get(i) < 100000 && pasos.get(i) > 200) {
                suma = suma + pasos.get(i);
            }

        }

        System.out.printf("EL promedio de pasos de la semana es: " + String.valueOf(suma/7));
    }
}
