import java.util.ArrayList;
import java.util.List;


public class ceros_al_final {

    public static String moverCeros(Object[] array) {
        List<Object> noCeros=new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(0)) {
                noCeros.add(array[i]);
            }
        }

        int cerosRestantes=array.length-noCeros.size();

        for (int i = 0; i < cerosRestantes; i++) {
            noCeros.add(0);
        }
        return noCeros.toString();
    }
    public static void main(String[] args) {
        System.out.println((moverCeros(new Object[]{3,0,0,6})));
        System.out.println(moverCeros(new Object[]{false,1,0,1,2,0,1,3,"a"}));
    }
}
