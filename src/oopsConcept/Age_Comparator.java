package oopsConcept;
import java.util.* ;
public class Age_Comparator implements Comparator <Employee04> {
    public int compare(Employee04 E1, Employee04 E2) {
        if (E1.age == E2.age) {
            return 0;
        } else if (E1.age > E2.age) {
            return 1;
        } else
            return -1;
    }

    public static void main(String[] args) {

    }
}
