import java.util.Comparator;

public class surnameComparator implements Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) {
        String[] countSurname1 = o1.getSurname().split(" ");
        String[] countSurname2 = o2.getSurname().split(" ");
        if (countSurname1.length > o1.getMaxSurname() && countSurname2.length > o1.getMaxSurname()) {
            return Integer.compare(o2.getAge(), o1.getAge());
        } else {
            return Integer.compare(o2.getSurname().length(), o1.getSurname().length());
        }
    }
}
