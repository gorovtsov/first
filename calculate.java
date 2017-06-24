public class calculate {
    public static void main(String[] arg){
        System.out.println("Calculating...");
        double first = Double.valueOf(arg[0]);
        double rez = Math.pow(Double.valueOf(arg[0]), 2);
        System.out.println("Square= " + rez);
    }
}