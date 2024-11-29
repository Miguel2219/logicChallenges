package Exercises02;
public class validad_parentesis {

    public static boolean validacion(String cadena) {
        int balance=0;
        for (int i = 0; i < cadena.length(); i++) {
            char c=cadena.charAt(i);
            if (c=='(') {
                balance ++;
            }else if (c==')') {
                balance --;
            }
        }
        if (balance<0) {
            return false;
        }
        return balance==0;
    }
    public static void main(String[] args) {
        System.out.println(validacion("()"));
        System.out.println(validacion(")(()))"));
        System.out.println(validacion("("));
        System.out.println(validacion("(())((()())())"));

    }
}