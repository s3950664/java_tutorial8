import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.StringTokenizer;

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
        age = Integer.parseInt(scanner.nextLine());

        pw.println(name+","+address+","+age);
        pw.flush();
        pw.close();

        //Ex 2

        Scanner fileScanner = new Scanner(new File("src/users.txt"));
        String line;
        double sum = 0;
        int count = 0;

        while(fileScanner.hasNext()) {
            count++;
            line = fileScanner.nextLine();

            StringTokenizer reader = new StringTokenizer(line, ",");
            if (reader.countTokens() != 3) {
                throw new IOException("Invalid input format!");
            } else {
                name = reader.nextToken();
                address = reader.nextToken();
                age = Integer.parseInt(reader.nextToken());
                sum += age;
            }
            System.out.println(name+" lives in "+address+" and is "+age+" years old");
        }
        System.out.println((float)sum/count);
    }
}