package opgave01;

import opgave01.models.LinkedNodeQueue;

public class Opgave01 {
    public static void main(String[] args) {
        LinkedNodeQueue<Integer> list = new LinkedNodeQueue<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);
    }
}
