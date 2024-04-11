package opgave03;

import opgave03.models.CircularArrayDeque;

import java.util.Arrays;

public class Opgave03 {

    public static void main(String[] args) {

        CircularArrayDeque<Integer> list = new CircularArrayDeque<>(5);

        System.out.println(list.toString());
        list.addFirst(1);
        // list.addLast(1);
        System.out.println(list.toString());
        list.addFirst(4);
        System.out.println(list.toString());
        list.addFirst(2);
        System.out.println(list.toString());
        list.addLast(5);
        System.out.println(list.toString());
        list.addLast(27);
        System.out.println(list.toString());


        System.out.println(list.toString());
        list.addFirst(8);
        System.out.println(list.toString());

        list.removeFirst();
        System.out.println(list.toString());
        list.removeLast();
        System.out.println(list.toString());

        for (int i = 0; i < 10; i++) {
            list.addLast(10);
        }
        System.out.println(list);

        for (int i = 0; i < 10; i++) {
            list.addFirst(40);
        }

        System.out.println(list);
    }
}
