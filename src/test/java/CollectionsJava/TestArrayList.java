package CollectionsJava;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
ArrayList<String> names = new ArrayList<>();
names.add("Hassan");
names.add("Ali");
names.add("Jamal");
names.add("Fatima");
for (String nam: names){
    System.out.print(nam + " " );
}
names.remove(1);
        System.out.println(names);
// ArrayLis is different array. This latter has a fixed size and can hond
        // only one items
// arrayList can resize and shrink as we add and remove the data
// array is faster and arrayList is slower
// array has no much build in method liberary


    }
}
