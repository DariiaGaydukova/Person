import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Person> people = new ArrayList<>();
        people.add(new Person("Victor", "Pan Pre Petrovskiy ", 13));
        people.add(new Person("Dasha", "Mis La Smirnova", 20));
        people.add(new Person("Katerina", "Ivanov", 31));
        people.add(new Person("Ilya", "Van Utkin", 17));



        Collections.sort(people, new surnameComparator());
        System.out.println(people);


    }
}