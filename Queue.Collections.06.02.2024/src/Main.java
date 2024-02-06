import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Part.1
        /* PriorityQueue <Integer> pq = new PriorityQueue<>();// PriorityQueue - сортировка
        pq.add(4);
        pq.add(3);
        pq.add(1);
        pq.add(9);
        System.out.println("Collections: " + pq);
        System.out.println("Collections size: " + pq.size());
        System.out.println("First element: " + pq.peek()); // вывод первого элемента
        System.out.println("Delete first element: " + pq.poll()); // удаляет первый элеимент

     System.out.println("\n Collection using inetator: ");
        Iterator <Integer> iter = pq.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());}*/

        //Part.2
        /*Comparator <Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return -1;
                }
                if (o1 < o2) {
                    return 1;
                }
                return 0;
            }
        };
        Queue <Integer> pq = new PriorityQueue<>(comparator);// comparator - выбор для сортировки
        pq.add(4);
        pq.add(3);
        pq.add(5);
        pq.add(9);
        pq.offer(1); // вызывается false
        Iterator <Integer> iter = pq.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println("Removing elements from the queue: ");
        while (!pq.isEmpty()){ //удаление до нуля
            System.out.println(pq.remove());
        }
        System.out.println(pq.remove());
        System.out.println(pq);*/

//Part.3
       /* HashMap <String, Integer> hm = new HashMap<String, Integer>();
        hm.put("Argentina", 1);
        hm.put("Norway", 12);
        hm.put("Canada", 10);
        hm.put("U.S.A.", 5);
        for (Map.Entry m : hm.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
        int value = hm.get("Argentina");
        hm.put("Argentina", value + 5);
        System.out.println("New value for Argentina: " + hm.get("Argentina"));*/

//Part.4
        class Fish{
            String name;
            double price;
            public Fish (String name, double price){
                this.name = name;
                this.price = price;
            }
            @Override
            public String toString(){
                return name + " " + price;
            }
        }
        Map<Integer,Fish> map = new HashMap<>();
        Fish f1 = new Fish("vobla", 3.55);
        Fish f2 = new Fish("salmon", 1.40);
        Fish f3 = new Fish("karas", 2.40);
        Fish f4 = new Fish("plotva", 5.40);
        map.put(1, f1);
        map.put(2, f2);
        map.put(3, f3);
        map.put(4, f4);
        for (Map.Entry <Integer, Fish> entry : map.entrySet()){
            int key = entry.getKey();
            Fish b = entry.getValue();
            System.out.println(key + "->" + b);
           // System.out.println(key + "->" + b.toString());
        }
        }
    }
