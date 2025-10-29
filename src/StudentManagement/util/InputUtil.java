package StudentManagement.util;
import java.util.Scanner;
public class InputUtil {
    private static final Scanner sc = new Scanner(System.in);

    public static int readInt(String msg){
        System.out.print(msg);
        return sc.nextInt();
    }

    public static String readString(String msg){
        System.out.print(msg);
        String input = sc.nextLine();
        if (input.isEmpty()) {
            input = sc.nextLine();
        }
        return input;
    }

}
