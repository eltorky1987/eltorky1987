import java.util.Scanner;
import java.io.*;

public class MainActivity {
    public static void main(String[] args) {
        // تعريف الألوان
        String GREEN = "\u001B[32m";
        String RED = "\u001B[31m";
        String YELLOW = "\u001B[33m";
        String RESET = "\u001B[0m";

        Scanner scanner = new Scanner(System.in);
        System.out.println(GREEN + "--- AGINA ACCOUNTANT v2.3 ---" + RESET);
        System.out.print("Enter Access Key: ");
        String key = scanner.nextLine();

        if (key.equals("agina@2026")) {
            while (true) {
                System.out.println("\n" + YELLOW + "1. Record Sale | 2. Total Earnings | 4. Exit" + RESET);
                System.out.print("Action: ");
                String action = scanner.nextLine();

                if (action.equals("1")) {
                    try {
                        System.out.print("Product Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Price: ");
                        double price = Double.parseDouble(scanner.nextLine());
                        
                        FileWriter fw = new FileWriter("database.csv", true);
                        fw.write(name + "," + price + "\n");
                        fw.close();
                        System.out.println(GREEN + "✅ Transaction Recorded!" + RESET);
                    } catch (Exception e) {
                        System.out.println(RED + "⚠️ Error: Numbers only!" + RESET);
                    }
                } else if (action.equals("2")) {
                    double total = 0;
                    try {
                        BufferedReader br = new BufferedReader(new FileReader("database.csv"));
                        String line;
                        while ((line = br.readLine()) != null) {
                            total += Double.parseDouble(line.split(",")[1]);
                        }
                        br.close();
                        System.out.println(GREEN + "💰 TOTAL REVENUE: " + total + " EGP" + RESET);
                    } catch (Exception e) {
                        System.out.println(RED + "⚠️ Database Empty!" + RESET);
                    }
                } else if (action.equals("4")) {
                    System.out.println(YELLOW + "Goodbye Agina! 🦾" + RESET);
                    break;
                }
            }
        } else {
            System.out.println(RED + "❌ Wrong Key!" + RESET);
        }
    }
}
