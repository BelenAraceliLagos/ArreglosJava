import java.util.ArrayList;
import java.util.Scanner;

public class MultiplosDeTres {
    public static void main(String[] args) {
        //arraylist con numeros ingresados
        ArrayList<Integer> multiplos3 = new ArrayList<Integer>();

        //pedir al usuario el tamaño de la lista
        System.out.println("¿Cuantos números desea ingresar para saber si son multiplos de 3?:");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        //pedir al usuario los numeros de la lista
        int m;
        do {
            System.out.println("Ingrese los numeros: ");
            Scanner sc = new Scanner(System.in);
            int v = sc.nextInt();
            multiplos3.add(v);
            m = multiplos3.size();
        } while (m < n);

        //filtrar los multiplos de 3
        for (int i = 0; i < multiplos3.size(); i++) {
            if ((multiplos3.get(i)%3) !=0) {
                multiplos3.remove(i);
            }
        }

        //llamar el metodo suma con el arraylist
        suma(multiplos3);

        //llamar el metodo promedio con el arraylist
        promedio(multiplos3);
    }

    //metodo para sumar los multiplos de 3
    public static void suma(ArrayList<Integer>multiplos3){

        int suma = 0;
        for (int i = 0; i < multiplos3.size(); i++) {
            suma = suma + multiplos3.get(i);
        }
        System.out.println("La suma de los multiplos de 3 en esta lista es: " + suma);
    }

    public static void promedio(ArrayList<Integer>multiplos3){

        int suma = 0;
        int promedio = 0;
        for (int i = 0; i < multiplos3.size(); i++) {
            suma = suma + multiplos3.get(i);
        }
        promedio = suma/multiplos3.size();

        System.out.printf("El promedio de los multiplos de 3 en esta lista es: " + promedio);
    }
}
