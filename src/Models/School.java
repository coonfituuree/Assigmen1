package Models;
import java.util.Collections;
import java.util.ArrayList;
public class School {
    private ArrayList<Person> members;

    public School() {
        members = new ArrayList<>();
    }

    public void sort() {
        members.sort((p1, p2) -> p1.getSurname().compareTo(p2.getSurname()));
    }

    public void addMember(Person person) {
        members.add(person);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < members.size(); i++) {
            sb.append(i + 1).append(". ").append(members.get(i)).append("\n");
        }

        return sb.toString();
    }
}
