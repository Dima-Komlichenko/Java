package Collections;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//import static com.sun.tools.javac.util.List.from;

public class Program {
    public static void main(String[] args) throws IOException {
        /*ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<Fish> list2 = new ArrayList<Fish>();
        ArrayList<Object> list3 = new ArrayList<Object>();

        list1.add("Ukraine");
        list1.add("Ukraine");
        list1.add("Ukraine");



        System.out.println("Collection: " + list1);
        System.out.println("Collection's size: " + list1);

        LinkedList<String> ll = new LinkedList<String>(); // двусвязный список
        ll.add("one");
        ll.add("two");
        ll.add("three");
        ll.add("four");
        ll.add("five");
        System.out.println(ll);
        ll.addLast("six");
        ll.addLast("zero");
        ll.add(3, "3");

        System.out.println(ll);
        ll.remove("three");
        System.out.println(ll);


        HashSet<Fish> fishes = new HashSet<>();
        fishes.add(new Fish("ell", 1.5, 120));
        fishes.add(new Fish("salmon", 1.5, 120));
        fishes.add(new Fish("carp", 1.5, 120));
        fishes.add(new Fish("sharp", 1.5, 120));

        System.out.println("Collenction: " + fishes);*/

        /*BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        System.out.println();
        String title = reader.readLine();

        Map<Integer, String> unsafeHm = new HashMap<>();
        Map<Integer, String> safeHm = Collections.synchronizedMap(unsafeHm);



        ArrayList<String> sal = (ArrayList<String>)Collections.synchronizedList(new ArrayList<String>());
        sal.add("Ukraine");
        sal.add("Ukraine");
        sal.add("Ukraine");
        sal.add("Ukraine");

        System.out.println(sal);

        from(sal).where()


        synchronized (sal) {
            Iterator<String> iter = sal.iterator();
            while (iter.hasNext()) {
                System.out.println(iter.next());
            }
        }


        JButton btn = new JButton("Test Button");

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Button is clicked!");
            }
        });

        btn.addActionListener(e -> {
            System.out.println("button is clicked! We used Lambda");
        });*/


        ArrayList<Fish> fishes = new ArrayList<Fish>();
        fishes.add(new Fish("fish1", 12.0, 24));
        fishes.add(new Fish("fish3", 15.0, 20));
        fishes.add(new Fish("fish2", 114.0, 28));

        /*fishes.sort(new Comparator<Fish>() {
            @Override
            public int compare(Fish o1, Fish o2) {
                return 0;
            }
        });

        fishes.sort((o1, o2) -> {
            return 0;
        });*/

        /*fishes.stream()
                .filter(fish -> fish.getPrice() < 150)
                .sort
                .forEach(fish -> fish.setPrice(fish.getPrice() * .8));
        fishes.stream().forEach(System.out::println);*/


        int a = 5;
        int b = 5;
        int c = 5;

        Calculate calculate;
        calculate = (num1, num2, num3) -> num1 + num2 + num3;

        int res = calculate.sum(a, b, c);
        System.out.println(res);
    }

    interface Calculate {
        int sum(int a, int b, int c);
    }
}
