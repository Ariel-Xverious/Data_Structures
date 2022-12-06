
package humber;

import java.util.Comparator;

public class Student implements Comparable<Student> { 
    private Integer id;
    private String lastName;

    public Student(Integer id, String lastName) {
        this.id = id;
        this.lastName = lastName;
    }
        @Override
    public int compareTo(Student s) {
        return lastName.compareTo(s.lastName); 
    };       
    
    public static Comparator<Student> ID = new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.getId().compareTo(s2.getId());
        }
    };
    

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Override
    public String toString() {
        return "id = " + id + ", lastName = " + lastName + "\n";
    }
    
    
}
