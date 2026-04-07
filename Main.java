public class Main{

    public static void printHello(){
        System.out.println("Hello");
    }

    public static void main(String[] args){
        System.out.println("Hello World");
        double x = 10.5;
        double y = 5.2;
        System.out.println(Operations.add(x, y));
        System.out.println(Operations.subtract(x, y));
        System.out.println(Operations.multiply(x, y));
        System.out.println(Operations.divide(x, y));
    }
}