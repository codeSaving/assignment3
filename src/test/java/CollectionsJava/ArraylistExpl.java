package CollectionsJava;

import java.util.ArrayList;

public class ArraylistExpl {
    public static void main(String[] args) {
  // List interface : ordered collection --> it contains duplicate elemenets
  // set interface : not accept duplicate element
  // queue interface : multiple elements  --> order not important
  // map interface :  contains key and value -->

        // Arraylist can grow and shrink in size dynamically; it maintains the insertion order
        // --> it allows duplicate
        ArrayList<String> ListOfNames = new ArrayList<>();
        // we use the add method to add the elements
        ListOfNames.add("Lho");
        ListOfNames.add("Ali");
        ListOfNames.add("Jamal");
        ListOfNames.add("Hassan");
        System.out.println(ListOfNames);
        ListOfNames.add(3, "Moha");
        System.out.println(ListOfNames);
        ListOfNames.add(1, "Fatiha");

        System.out.println(ListOfNames);

        // we can use loop to print them individually
        for(String name : ListOfNames){
            System.out.println(name + " ");
        }
        ListOfNames.removeAll(ListOfNames);
        System.out.println(" All removed" + ListOfNames);
        System.out.println("-----------------------------");

        ArrayList<Integer> num = new ArrayList<>();
        for(int i = 1; i<= 15; i++){
            num.add(i);
        }
        System.out.println(num);
        num.remove(3);
        System.out.println(num);

        System.out.println("--------------------------------------------------");

        // linkedList












    }
}
