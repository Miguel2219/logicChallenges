package Exercises01;

public class palindromo {
    public static boolean isPalindromo(String palabra) {
        if (palabra==null || palabra.isEmpty()) {
            return true;
        }
        palabra=quitarAcentos(palabra.toLowerCase());
        palabra=palabra.replaceAll("[^a-z]", "");
        
        int ultimaLetra=palabra.length()-1;
        String PalabraAlreves="";
        while (ultimaLetra>=0) {
            PalabraAlreves+=palabra.charAt(ultimaLetra);
            ultimaLetra--;
        }

        if (palabra.equals(PalabraAlreves)) {
            return true;
        }else{
            return false;
        }
                        

    }
    private static String quitarAcentos(String str) {
        return str.replaceAll("[áàäâã]", "a")
                .replaceAll("[éèëê]", "e")
                .replaceAll("[íìïî]", "i")
                .replaceAll("[óòöôõ]", "o")
                .replaceAll("[úùüû]", "u")
                .replaceAll("[ý]", "y")
                .replaceAll(" ","")
                .replaceAll("[ñ]", "n");
    }
    public static void main(String[] args) {
        System.out.println(isPalindromo("ana"));
        System.out.println(isPalindromo("Anita lava la tina"));
    }
}
