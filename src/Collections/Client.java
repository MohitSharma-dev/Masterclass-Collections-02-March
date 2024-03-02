package Collections;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        // dynamic size array
        List<Integer> x = new ArrayList<>();
//        Set
        x.add(5);
        x.add(3);
        x.add(1);

        for(Integer t : x){
            System.out.println(t);
        }

        Collections.sort(x);
        System.out.println("After Sorting : ");
        for(Integer t : x){
            System.out.print(t + " ");
        }
        System.out.println();
        // Actual implementaion of Linked List DS
        List<Integer> x1 = new LinkedList<>();
        // vector : Arraylist + syncronized
        List<Integer> x2 = new Vector<>();

        Stack<Integer> x3 = new Stack<>();

        Set<Integer> s = new HashSet<>();
        s.add(10);
        s.add(5);
        s.add(50);
        s.add(15);
        s.add(13);
        for(Integer x6 : s){
            System.out.print(x6 + " ");
        }
        System.out.println("Hey!");
        Set<Integer> s1 = new LinkedHashSet<>();
        s1.add(10);
        s1.add(5);
        s1.add(50);
        s1.add(15);
        s1.add(13);
        for(Integer x7 : s1){
            System.out.print(x7 + " ");
        }

        System.out.println("Helo!");

        Set<Integer> s2 = new TreeSet<>();
        s2.add(10);
        s2.add(5);
        s2.add(50);
        s2.add(15);
        s2.add(13);
        for(Integer x8 : s2){
            System.out.print(x8 + " ");
        }
        System.out.println();
        Queue<Integer> q1 = new PriorityQueue<>();
        Deque<Integer> q3 = new ArrayDeque<>();
        Deque<Integer> q2 = new LinkedList<>();
        q1.add(5);
        q1.add(1);
        q1.add(7);
        q1.add(9);
        q1.add(2);

        while(!q1.isEmpty()){
            System.out.println(q1.peek());
            q1.poll();
        }

        // Map : Interface
        // Key : value

        // Store : Country , population

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("India" , 100);
        map1.put("America", 120);
        map1.put("China" , 500);

        System.out.println(map1.get("China"));

        // Comparable vs Comparator


        List<Student> l1 = new ArrayList<>();
        l1.add(new Student(5 , 65.0 , "Mohit" , 25));
        l1.add(new Student(1 , 95.0 , "Zaid" , 21));
        l1.add(new Student(8 , 10.0 , "Rahul" , 32));
        Collections.sort(l1);

        for(Student sq : l1){
            System.out.println(sq.name + " " + sq.rollNo);
        }

        Collections.sort(l1, new StudentAgeComparator());

        for(Student sq : l1){
            System.out.println(sq.name + " " + sq.rollNo + " " + sq.age);
        }

    }
}

// 45.6 , 17.2 , 90.3
// Mohit , Ayush , Naman