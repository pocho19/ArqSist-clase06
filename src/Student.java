



//decarators



public class Student {
    private long id;
    private String name;
    private String apellido;

    public Student(long id, String name, String apellido) {
        this.id = id;
        this.name = name;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
