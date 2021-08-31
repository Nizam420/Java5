import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        // list.add(44);
        // list.add(21);
        // list.add(21);
        // list.add(21);
        // list.add(489);
        // list.add(78);
        // list.add(78);
        // list.add(77);
        // list.add(56);
        // list.add(78);
        // list.add(49);
        // list.add(45);

        // list.set(4, 55);

        // System.out.println(list);

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }

        in.close();
    }
}
