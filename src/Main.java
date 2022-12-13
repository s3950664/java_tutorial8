import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.PrintWriter;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String name, address;
        int age;

        Scanner scanner = new Scanner(System.in);

        PrintWriter pw = new PrintWriter(new FileWriter("src/users.txt", true));

        System.out.println("name: ");
        name = scanner.nextLine();

        System.out.println("address: ");
        address = scanner.nextLine();

        System.out.println("age: ");
        age = scanner.nextInt();

        pw.println(name+" "+address+" "+age);
        pw.flush();
        pw.close();
    }
}