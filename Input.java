import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int[] arr = new int[5];
        // arr[0] = 23;
        // arr[1] = 44;
        // arr[2] = 34;
        // arr[3] = 64;
        // arr[4] = 84;
        // System.out.println(arr[3]);
        
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = in.nextInt();
            
        // }
        // System.out.println(Arrays.toString(arr));
        
        // for (int i = 0; i < 5; i++) {
            //     System.out.print(arr[i] + " ");
            
            // }
            
            // for (int num : arr) {
                //     System.out.print(num + " ");
                
                // }
                
                String[] str = new String[4];
                for (int i = 0; i < str.length; i++) {
                    str[i] = in.next();
                }
                System.out.println(Arrays.toString(str));
                
                str[1] = "Nizam";
                System.out.println(Arrays.toString(str));

        in.close();
    }
}
