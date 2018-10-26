public class Student {
    public String studentName;
    public int mark1, mark2, mark3;
    public int avg;
    
    // constructor for Student class, it needs public and the name must 
    // be like the class name 
    Student(String name, int m1, int m2, int m3) {
        studentName = name;
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }
    
    public void printData(){
        avg = (mark1+mark2+mark3)/3;
        System.out.format("%10s%5d%5d%5d%5d", studentName, mark1, mark2, mark3, avg);
        System.out.println(" ");
    }
    
    public void calculateAverage() {
        avg = mark1+mark2+mark3;
        
    }
}