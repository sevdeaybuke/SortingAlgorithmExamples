import Elements.Element;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InsertionSort {

    public static void insertionSortArrayList(List<Element> list) {
        for (int j = 1; j < list.size(); j++) {
            Element current = list.get(j);
            int i = j - 1;
            while ((i > -1) && ((list.get(i).compareTo(current)) == 1)) {
                list.set(i + 1, list.get(i));
                i--;
            }
            list.set(i + 1, current);
        }
    }

    public static void main(String[] args) {
     /*   List<Element> list = new ArrayList<>();

        // Create elements w/ IDs 0-24
        for (int i = 0; i < 25; i++) {
            list.add(new Element(i));
        }

        // Move the elements to a random order
        Collections.shuffle(list);
        // Print list before sorting
        list.forEach(e -> System.out.print(e.getId() + ", "));

        // Sort the list
        insertionSortArrayList(list);

        System.out.println();

        // Print sorted list
        list.forEach(e -> System.out.print(e.getId() + ", "));*/

        List<Element> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(new Element(i));
        }

        Collections.shuffle(list);

        // Print shuffled list
        list.forEach(e -> System.out.print(e.getId() + ", "));

        long startTime1 = System.nanoTime();
        insertionSortArrayList(list);
        long endTime1 = System.nanoTime();

        System.out.println();

        // Print sorted collection
        list.forEach(e -> System.out.print(e.getId() + ", "));
        System.out.println();

        // Print runtime in nanoseconds
        System.out.println("Insertion Sort runtime: " + (endTime1 - startTime1));
    }
}
