package primeiroo.pacote;

import java.util.Arrays;

// Driver class
class arrayObject {
	
	
    public static void main(String[] args)
    {
        Student[] arr = { new Student(111, "bbbb", "london"),
                        new Student(131, "aaaa", "nyc"),
                        new Student(121, "cccc", "jaipur") };
 
        System.out.println(Arrays.toString(arr));
    }
}
 
// A class to represent a student.
class Student {
    int rollno;
    String name, address;
 
    // Constructor
    public Student(int rollno, String name,
                String address)
    {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
 
    // Used to print student details in main()
    @Override
    public String toString()
    {
        return this.rollno + " " + this.name + " " + this.address;
    }
}