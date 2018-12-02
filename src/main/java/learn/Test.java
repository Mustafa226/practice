package learn;

import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        testMap();

    }

    private static void testSet() {
        final Set<String> strings = new HashSet<>(Arrays.asList("first", "second"));
        strings.add("a");
        System.out.println(strings);
    }

    private static void testThread() {
        String x = "a";
        String finalX = x;
        Runnable r = () -> System.out.println(finalX);
        x = "b";
        r.run();
        A a = new A();
        a.fun();
        x = "x";
        "new".equals(x);
        x.equals("new");

        int y = 1;
    }

    private static void testList() {
        final List p = new ArrayList();
        p.add(7);
        p.add(1);
        p.add(5);
        p.add(1);
        p.remove(1);
        System.out.println(p);
        p.remove(1);
        System.out.println(p);
    }

    private static void testMap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(10, "apple");
        map.put(20, "orange");
        map.put(30, "banana");
        map.put(40, "watermelon");
        map.put(50, "dragonfruit");
        map.put(20, "override");
        List<Integer> collect = map.keySet().stream().collect(Collectors.toList());
        List<String> collect1 = map.keySet().stream().map(Object::toString).collect(Collectors.toList());
        List<Integer> collect2 = map.entrySet().stream().map(entry -> entry.getKey()).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(collect1);
        System.out.println(collect2);
        System.out.println(map);
    }

    static class A {
        A other;
        void fun() {
            A a = new A();
            A b = new A();
            a.other = b;
            b.other = a;
        }
    }

    private class Employee {
        String technology;
        Double salary;

        public String getTechnology() {
            return technology;
        }

        public void setTechnology(String technology) {
            this.technology = technology;
        }

        public Double getSalary() {
            return salary;
        }

        public void setSalary(Double salary) {
            this.salary = salary;
        }
    }
}
