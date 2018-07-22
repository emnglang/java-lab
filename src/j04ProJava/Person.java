package j04ProJava;

public class Person {

    private final String lastName = "ABC";
    private final String firstName = "XYZ";
    private final boolean female = true;

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if ((this.lastName == null) ? (other.lastName != null) : !this.lastName.equals(other.lastName)) {
            return false;
        }
        if ((this.firstName == null) ? (other.firstName != null) : !this.firstName.equals(other.firstName)) {
            return false;
        }
        if (this.female != other.female) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + (this.lastName != null ? this.lastName.hashCode() : 0);
        hash = 19 * hash + (this.firstName != null ? this.firstName.hashCode() : 0);
        hash = 19 * hash + (this.female ? 1 : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Person{" + "lastName=" + lastName + ", firstName=" + firstName
                + ", female=" + female + '}';
    }
}