package Exercises01;

public class StringTerminaCon {
    public static boolean name(String input1,String input2) {
        if (input2.isEmpty()) {
            return false;
        }
        if (input2.length()>input1.length()) {
            return false;
        }
        return input1.substring(input1.length()-input2.length()).equals(input2);
    }
    public static void main(String[] args) {
        System.out.println(name("jesus","sus"));
    
    }
}
