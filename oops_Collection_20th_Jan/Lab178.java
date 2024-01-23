package oops_Collection_20th_Jan;

import java.util.List;

public class Lab178 {
    public static void main(String[] args) {

        List fruits = List.of("Apple", "Banana", "Watermelon", "Apple");
        List shopping_items = List.of("Atta", "Jam", "Bread", "Milk");
        List my_10th_marks = List.of(85,96,83,79,84);
        List different_datatype = List.of("Apple", true, 'a', 158);

        System.out.println(fruits.get(2));
        System.out.println(fruits.indexOf("Banana"));
        System.out.println(fruits.isEmpty());
    }
}
