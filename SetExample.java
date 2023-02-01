import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {
        TreeSet<Double> myTreeSet = new TreeSet<>();
        myTreeSet.add(7.09);
        myTreeSet.add(7.09);
        myTreeSet.add(7.091);
        myTreeSet.add(6.09);

        for (Double el : myTreeSet) {
            System.out.println(el);
        }

        System.out.println(myTreeSet.contains(0.09));
        System.out.println();
        SortedSet<Double> setWithElSmallerThan2 = myTreeSet.headSet(7.0);

        for (Double el : setWithElSmallerThan2) {
            System.out.println(el);
        }

        System.out.println();

        TreeSet<String> myStringTreeSet = new TreeSet<>();
        myStringTreeSet.add("phone");
        myStringTreeSet.add("email");
        myStringTreeSet.add("password");
        SortedSet<String> subSet = myStringTreeSet.subSet("email", "phone");

        for (String el : subSet) {
            System.out.println(el);
        }

        System.out.println();
        HashSet<Long> myHashSet = new HashSet<>();
        myHashSet.add(12000L);
        myHashSet.add(13000L);
        myHashSet.add(10000L);
        myHashSet.add(10000L);

        for (Long el : myHashSet) {
            System.out.println(el);
        }
    }
}
