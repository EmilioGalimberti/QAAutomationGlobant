import java.util.ArrayList;
import java.util.Arrays;

public class MascotaApp {

    public static void main(String[] args){
        //Arrays
        String[] nombreArray = new String[5];

        for (int i=0 ; i < nombreArray.length; i++){
            nombreArray[i]= "Chiquito "+(i+1);
        }

        for (String var : nombreArray){
            System.out.println(var);
        }

        //Collections
        ArrayList<String> nombreArrayList = new ArrayList<>();
        System.out.println(nombreArrayList.size());
        nombreArrayList.add("Chiquito");
        System.out.println(nombreArrayList.size());
        nombreArrayList.remove("Chiquito");
        System.out.println(nombreArrayList.size());
    }
}
