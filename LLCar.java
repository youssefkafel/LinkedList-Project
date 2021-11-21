
/**
 * Class LLCar has private Node. Constructor for empty linked list. With various methods
 *
 * Youssef Kafel
 * 4/17/2021
 */
import java.util.*;
public class LLCar {
    private Node list;

    private class Node{
        public Car data;
        public Node next;

        public Node(Car car){
            data = car;
            next = null;
        }

    }



    public LLCar(){
        list = null;
    }

    // Inserts a new node with car in it at the rear of the linked list.
    public void addRear(Car car){
        Node node = new Node(car);
        if(list == null){
            list = node;
        }
        else{
            Node curr = list;
            while(curr.next!=null){
                curr = curr.next;
            }
            curr.next = node;
        }

    }

    // Method traverses linked list and prints all data for each car as separate line and also prints is antique
    // for cars that are antique cars, and prints is not antique for cars that are not.
    public void displayLLCars(){
        Node curr = list;
        while(curr !=null){
            if(curr.data.isAntique()){
                System.out.println(curr.data.toString() + " is antique");
            }
            else{
                System.out.println(curr.data.toString() + " is not antique");
            }
            curr = curr.next;
        }

    }

    // Returns reference to the beginning of the linked list
    public Node getList() {
        return list;
    }

    // Returns sum of costs for all cars in the linked list
    public int totalCarCost(){
        int sum = 0;
        Node curr = list;
        while(curr!=null){
            sum=sum+curr.data.getCost();
            curr = curr.next;
        }
        return sum;
    }

    // Recursive method that returns true if cars are sorted by their years.
    // Reference first refers to the first node in the linked list.
    public boolean sortedByYearsRec(Node first){

        if(first==null||first.next==null){
            return true;
        }
        return(first.data.getYear()>first.next.data.getYear() && sortedByYearsRec(first.next));

   }

    // Returns the newest Car object  in the  linked list. In case when more than one car has the same most recent
    // year, return last such car in the linked list. Reference first refers to the first node in the linked list
    public Car newestCarRec(Node first) {
        if (first.next == null) {
            return first.data;
        }
        else {
            Car car = newestCarRec(first.next);
            if (first.data.getYear() > car.getYear()) {
                return first.data;
            }
            else {
                    return car;
                }

        }
    }



}

