package Exercises01;

public class isogram {
    public static boolean esIsogram(String str) {

        if (str == null || str.isEmpty()) {
            return true;
        }


        str = quitarAcentos(str.toLowerCase());

        if (str.contains(" ")) {
            return false;
        }


        str = str.replaceAll("[^a-z]", "");


        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (str.indexOf(currentChar) != str.lastIndexOf(currentChar)) {
                return false;
            }
        }

        return true;
    }

    private static String quitarAcentos(String str) {
        return str.replaceAll("[áàäâã]", "a")
                .replaceAll("[éèëê]", "e")
                .replaceAll("[íìïî]", "i")
                .replaceAll("[óòöôõ]", "o")
                .replaceAll("[úùüû]", "u")
                .replaceAll("[ý]", "y")
                .replaceAll("[ñ]", "n");
    }

    public static void main(String[] args) {
        System.out.println(esIsogram("")); 
        System.out.println(esIsogram("reto")); 
        System.out.println(esIsogram("murcielago")); 
        System.out.println(esIsogram("Perro")); 
        System.out.println(esIsogram("GaTo")); 
        System.out.println(esIsogram("dos palabras")); 
    }
}
