
package workshop1;

import java.util.Scanner;

public class Part3 {
    public static void main(String[] args) {
        String name[] = new String[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            name[i] = scanner.nextLine();
        }
        for (int i = 0; i < 10; i++) {
            name[i] = name[i].toUpperCase();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(name[i]);
        }
    }
    
}
