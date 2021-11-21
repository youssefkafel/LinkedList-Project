
/**
 * TestList contains main method, creates carList, and adds cars with addRear()
 * It also invokes the methods from LLCar.
 *
 * Youssef Kafel
 * 4/17/2021
 */
import java.util.*;

public class TestList {
    public static void main(String[]args){
        Car c1 = new Car("Subaru","Outback",2003,12000 );
        Car c2 = new Car("Toyota","Camry",2011,27600 );
        Car c3 = new Car("Ford","Escort",2011,10000 );
        Car c4 = new Car("Mazda","Miata",1997,20000 );
        Car c5 = new Car("Subaru","Outback",1959,29000 );

        LLCar carList = new LLCar();
        carList.addRear(c1);
        carList.addRear(c2);
        carList.addRear(c3);
        carList.addRear(c4);
        carList.addRear(c5);

        carList.displayLLCars();
        System.out.println();

        System.out.println("The total cost of all of the cars in the list is: " + carList.totalCarCost());

        System.out.println();
        if(carList.sortedByYearsRec(carList.getList())){
            System.out.println("The car list is sorted by years");
        }
        else {
            System.out.println("The car list is not sorted by years");
        }

        System.out.println();

        System.out.println("The newest car in the list is: " + carList.newestCarRec(carList.getList()));
    }
}
