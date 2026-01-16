package package_1;
 
public class Person1 {
    String firstName;
    String lastName;
 
    public Person1(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName  = lastName;
    }
 
    public String getFullName() {
        if (firstName.isEmpty()) return lastName;
        if (lastName.isEmpty())  return firstName;
        return firstName + " " + lastName;
    }
 
    @Override
    public String toString() {
        return getFullName();
    }
}