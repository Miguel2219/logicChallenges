package Exercises01;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class elementosPares {
        public static <T> ArrayList<T> encontrarRepetidos(T[] lista) {
        Map<T, Integer> conteo = new HashMap<>();
        ArrayList<T> listaRepetida = new ArrayList<>();


        for (T elemento : lista) {
            conteo.put(elemento, conteo.getOrDefault(elemento, 0) + 1);
        }

        for (Map.Entry<T, Integer> entrada : conteo.entrySet()) {
            if (entrada.getValue() % 2 == 0) {
                listaRepetida.add(entrada.getKey());
            }
        }

        return listaRepetida;
    }

    public static void main(String[] args) {

        Integer[] listaEnteros = {1, 2, 2, 3, 3, 3, 4, 4, 5, 5};
        ArrayList<Integer> resultadoEnteros = encontrarRepetidos(listaEnteros);
        System.out.println("Números enteros que se repiten par veces: " + resultadoEnteros);


        Character[] listaCaracteres = {'a', 'b', 'b', 'c', 'c', 'c', 'd', 'd'};
        ArrayList<Character> resultadoCaracteres = encontrarRepetidos(listaCaracteres);
        System.out.println("Caracteres que se repiten par veces: " + resultadoCaracteres);


        String[] listaStrings = {"hola", "mundo", "hola", "java", "java", "python"};
        ArrayList<String> resultadoStrings = encontrarRepetidos(listaStrings);
        System.out.println("Palabras que se repiten par veces: " + resultadoStrings);

        int[] listaIntPrimitiva = {1, 2, 2, 3, 3, 3, 4, 4, 5, 5};
        Integer[] listaIntegerObjetos = new Integer[listaIntPrimitiva.length];
        for (int i = 0; i < listaIntPrimitiva.length; i++) {
            listaIntegerObjetos[i] = listaIntPrimitiva[i];
        }
        ArrayList<Integer> resultadoPrimitivos = encontrarRepetidos(listaIntegerObjetos);
        System.out.println("Números primitivos que se repiten par veces: " + resultadoPrimitivos);
    }
}