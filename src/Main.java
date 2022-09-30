import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {


        List<Person> people = new ArrayList<>();
        people.add(new Person("Victor", "Pan Pre Petrovskiy ", 13));
        people.add(new Person("Dasha", "Mis La Smirnova", 20));
        people.add(new Person("Katerina", "Ivanov", 31));
        people.add(new Person("Ilya", "Van Utkin", 17));

        Predicate<Person> chekerAge = Person -> Person.getAge() < 18;
        people.removeIf(chekerAge);


        Collections.sort(people, new SurnameComparator());
        System.out.println(people);


    }
}