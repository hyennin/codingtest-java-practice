import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Fruit {
    public String name;
    public int price;

    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

class DescendingComparator implements Comparator<Fruit> {
    @Override
    public int compare(Fruit o1, Fruit o2) {
        if (o1.price < o2.price) return 1;
        else if (o1.price == o2.price) return 0;
        else return -1;
    }
}

//class DescendingComparator implements Comparator<Fruit> {
//    @Override
//    public int compare(Object o1, Object o2) {
//        Fruit fruit1 = (Fruit) o1;
//        Fruit fruit2 = (Fruit) o2;
//        if (fruit1.price < fruit2.price) return 1;
//        else if (fruit1.price == fruit2.price) return 0;
//        else return -1;
//    }
//}

public class ComparatorExample {
    public static void main(String[] args) {
//        TreeSet<Fruit> treeSet = new TreeSet<Fruit>();
//
//        // Fruit이 Comparable을 구현하지 않았기 때문에 예외 발생
//        treeSet.add(new Fruit("포도", 3000));
//        treeSet.add(new Fruit("수박", 10000));
//        treeSet.add(new Fruit("딸기", 6000));


        TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescendingComparator());

        treeSet.add(new Fruit("포도", 3000));
        treeSet.add(new Fruit("수박", 10000));
        treeSet.add(new Fruit("딸기", 6000));

        Iterator<Fruit> iterator = treeSet.iterator();
        while(iterator.hasNext()) {
            Fruit fruit = iterator.next();
            System.out.println(fruit.name + " : " + fruit.price);
        }

    }
}
