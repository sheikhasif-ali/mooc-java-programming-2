public class Book implements Comparable<Book>{
    private String name;
    private int age;

    public Book(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }

    public String toString() {
        return this.name + "(recommended for " + this.age + " year-olds or older)";
    }

    public int compareTo(Book book) {
        if(this.age == book.age && this.name.equals(book.name)) {
            return 0;
        }else if(this.age>book.age && (this.name.compareTo(book.name)) == 1) {
            return 1;
        } else return -1;
    }
}
