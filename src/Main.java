import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int max = -1;
        String sv = "";
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String[] b = a.split(" ");


        for (int i = 0; i < b.length;i++){
            if (max < b[i].length()){
                max = b[i].length();
                sv = b[i];
            }
        }
        System.out.print(sv + "\n" + max);
    }
}