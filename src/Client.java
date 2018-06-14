
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


public class Client {
    public static void main(String[] args) {

        int MAX = 1000;
        long StartTime = System.currentTimeMillis();
        HashMap<Integer, String> arr = new HashMap<Integer, String>();
        for (int i = 0; i < MAX ; i++) {
            arr.add(i, "cat"+i);
        }
        for (int i = 0; i < MAX ; i++) {
            System.out.println(arr.get(i));
        }
        long EndTime = System.currentTimeMillis();

        long StartTime1 = System.currentTimeMillis();
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (int i = 0; i < MAX ; i++) {
            Object<Integer, String> ob = new Object<Integer, String>(i,"cat"+i);
            arrayList.add(ob);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        long EndTime1 = System.currentTimeMillis();
        System.out.println("" + (EndTime - StartTime));
        System.out.println("" + (EndTime1 - StartTime1));
    }
    public String readFile() throws Exception{
        return new String(Files.readAllBytes(Paths.get("D://Projects//JAVA//untitled1//Book.txt")));
    }

}
