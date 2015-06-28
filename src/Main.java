import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        int counter = 0;
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> result = new LinkedList<>();

        for (int i = 0; i < 40; i++) {
            list.add(r.nextInt(10));
        }

        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    counter = counter+1;
                } else {
                    break;
                }
            }
            if (counter >= 2) {
                i = i+counter;
            } else {
                result.add(list.get(i));
            }
            counter = 0;
        }
        System.out.println(result);
    }
}
