

public class Comparator implements java.util.Comparator<Person> {

    private int maxSurname = 7;

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getSurname().length() > maxSurname && o2.getSurname().length() > maxSurname) {
            return Integer.compare(o2.getAge(), o1.getAge());
        } else {
            return Integer.compare(o2.getSurname().length(), o1.getSurname().length());
        }
    }
}
