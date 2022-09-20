import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Person> people = new ArrayList<>();
        people.add(new Person("Victor", "Petrovskiy", 13));
        people.add(new Person("Dasha", "Smirnova", 20));
        people.add(new Person("Katerina", "Ivanov", 31));
        people.add(new Person("Ilya", "Utkin", 17));

        Collections.sort(people, new Comparator());
        System.out.println(people);


    }
}