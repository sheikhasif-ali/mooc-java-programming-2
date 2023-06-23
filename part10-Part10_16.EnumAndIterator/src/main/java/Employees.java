import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class Employees {
    private List<Person> list;

    public Employees() {
        this.list = new ArrayList<>();
    }

    public void add(Person person) {
        list.add(person);
    }

    public void add(List<Person> peopleToAdd) {
        peopleToAdd.stream()
        .forEach(person -> list.add(person));
    }

    public void print() {
        Iterator<Person> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    public void print(Education education) {
        Iterator<Person> iterator = list.iterator();
        while(iterator.hasNext()) {
            Person next = iterator.next();
            if(next.getEducation().equals(education)) {
                System.out.println(next);
    
            }
        }
        
    }
    
    public void fire(Education education) {
        java.util.Iterator<Person> iterator = list.iterator();
        while(iterator.hasNext()) {
            if(iterator.next().getEducation().equals(education)) {
                iterator.remove();
            }
        }

    }
}
