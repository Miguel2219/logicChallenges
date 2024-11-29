package Exercises01;

public class letrasPorNumeros {
    public static String convert(String palabra) {
        if (palabra==null || palabra.isEmpty()) {
            return "";
        }
        palabra=cleanString(palabra.toLowerCase());
        StringBuilder result = new StringBuilder();
        boolean firsNumber=true;
        for (char c : palabra.toCharArray()) {
            if (Character.isLetter(c)) {
                if (!firsNumber) {
                    result.append(" ");
                }
                result.append(
                    c-'a'+1
                );
                firsNumber=false; 
            }
        }
        return result.toString();
    }
    private static String cleanString(String str) {
        str.replaceAll("[áàäâã]", "a")
                .replaceAll("[éèëê]", "e")
                .replaceAll("[íìïî]", "i")
                .replaceAll("[óòöôõ]", "o")
                .replaceAll("[úùüû]", "u")
                .replaceAll("[ý]", "y")
                .replaceAll(" ","")
                .replaceAll("[ñ]", "n");
        str.replaceAll(" ", "");
        return str.trim().replaceAll("\\s+", " ");
          

    }
    public static void main(String[] args) {
        System.out.println(convert("abb def"));
    }
}
