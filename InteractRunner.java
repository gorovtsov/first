import java.util.Scanner;
public class InteractRunner {
    public static void main(String[] arg) {
        Scanner reader = new Scanner(System.in);

        try{
            Calculator calc = new Calculator();
            String exit = "no";
            while (!exit.equals("yes")){
                System.out.println("Enter first arg:");
                String first = reader.next();
                System.out.println("Enter second arg:");
                String second = reader.next();
                calc.add(Integer.valueOf(first),Integer.valueOf(first));
                System.out.println("Result is " + calc.getResult());
                calc.cleanResult();
                System.out.println("Exit: yes/no?: ");
                exit = reader.next();
            }
        } finally {
            reader.close();
        }
    }
}