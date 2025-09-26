import java.util.Scanner;

public class CarInfo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Select the type of car \n 0 for WagonR, \n 1 for Honda City, \n 2 for Innova Crysta: ");
        int c=sc.nextInt();

        if(c==0){
            System.out.println("Enter the mileage of WagonR: ");
            int m=sc.nextInt();
            Car car = new WagonR(m);
            System.out.println(car.getIsSedan() + " " + car.getSeats() + car.getMileage());
        }
        else if(c==1){
            System.out.println("Enter the mileage of Honda City: ");
            int m = sc.nextInt();
            Car car = new HondaCity(m);
            System.out.println(car.getIsSedan() + " " + car.getSeats() + car.getMileage());
        }
        else if(c==2){
            System.out.println("Enter the mileage of Innova Crysta: ");
            int m = sc.nextInt();
            Car car = new InnovaCrysta(m);
            System.out.println(car.getIsSedan() +  car.getSeats() + car.getMileage());
        }
        else{
            System.out.println("Invalid input");
        }
        
    }
}

abstract class Car{
    
    public abstract String getIsSedan();
    public abstract String getSeats();
    public abstract String getMileage();
}

class WagonR extends Car{

    private int m;
    public WagonR(int m){
        this.m = m;
    }

    public String getIsSedan(){
        return " A WagonR is not a sedan,";
    }

    public String getSeats(){
        return " has 4 seats";
    }

    public String getMileage(){
        return " and gives mileage of " + m + " kmpl";
    }
}

class HondaCity extends Car{
    private int m;
    public HondaCity(int m){
        this.m = m;
    }

    public String getIsSedan(){
        return "A Honda City is a sedan, ";
    }

    public String getSeats(){
        return " has 4 seats";
    }

    public String getMileage(){
        return " and gives mileage of " + m + " kmpl";
    }
}

class InnovaCrysta extends Car{
    private int m;
    public InnovaCrysta(int m){
        this.m = m;
    }

    public String getIsSedan(){
        return " An Innova Crysta is not a sedan, ";
    }

    public String getSeats(){
        return "has 6 seats";
    }

    public String getMileage(){
        return " and gives mileage of " + m + " kmpl";
    }
}  