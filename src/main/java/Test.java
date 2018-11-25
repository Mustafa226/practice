import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(10, "apple");
        map.put(20, "orange");
        map.put(30, "banana");
        map.put(40, "watermelon");
        map.put(50, "dragonfruit");
        List<Integer> collect = map.keySet().stream().collect(Collectors.toList());
        List<String> collect1 = map.keySet().stream().map(Object::toString).collect(Collectors.toList());
        List<Integer> collect2 = map.entrySet().stream().map(integerStringEntry -> integerStringEntry.getKey()).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(collect1);

        //**//

        final List p = new ArrayList();
        p.add(7);
        p.add(1);
        p.add(5);
        p.add(1);
        p.remove(1);
        System.out.println(p);
        p.remove(1);
        System.out.println(p);

        //**//

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
