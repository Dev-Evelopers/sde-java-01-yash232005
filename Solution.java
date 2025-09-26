import java.util.Scanner;

abstract class Calculator{
    public  int add(int a, int b){
        return 0;
    }
}

class Adder extends Calculator{
    public int add(int a, int b){
        System.out.println("Adding " + a + " , " + b);
        return a + b;
    }
}

class Multiplier{
    public int multiply(int a, int b, Calculator calculator){

        int product=0;
        for(int i = 0; i < b; i++){
                product = calculator.add(product, a);
        }
        return product;
    }
}



public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();

        Adder ad = new Adder();
        System.out.println("Testing Addition");
        int sum = ad.add(a,b);
        System.out.println("The sum is:" +sum );

        Multiplier m = new Multiplier();
        System.out.println("Testing Multiplicaton");
        int product = m.multiply(a , b , ad);
        System.out.println("The product is: " + product);
    }    
}

