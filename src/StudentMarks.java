
import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        // STEP 1
        // getting the number of students from the user and making the studentObjArray
        // ** NOTE: numberOfStudents must at least be 2 and less than 20
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number of students:");
        int numberOfStudents = in.nextInt();
        
        // checking the numOfStudents 
        while (numberOfStudents < 2 || numberOfStudents > 20) {
            System.out.println("*** ==================================");
            System.out.println("The number of students must be min 2 and max 20");
            System.out.println("Please enter the number of students:");
            numberOfStudents = in.nextInt();
        }
        System.out.println("*** ----------------------------------");
        System.out.println("SWEET AS... Enter the data:");        
        Student studentObjArray[] = new Student[numberOfStudents];
        
        // STEP 2
        // getting the data for each student and saving in the studentObjArray
        // 1) defining each object in the array object
        String name;
        int m1, m2, m3;
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Data for sutdent number " + (i+1) + ": ");
            name = in.next();
            m1 = in.nextInt();
            m2 = in.nextInt();
            m3 = in.nextInt();
            
            // when we make the objects of any class we call the class
            // by it's constructor's name to build the object and set 
            // the data 
            studentObjArray[i] = new Student(name, m1, m2, m3);
        }
        
        /**
        * Showing the Menu to the user
        * taking his choice and giving him the results based on his choice
        * repeating to show the menu until he decides to quit by choosing 0
        */
        boolean exit = false;
        int menuChoice;
        // only by choosing 0 the exit boolean variable becomes true and it can get out of the while loop
        while(exit == false) {
            System.out.println("========================================");
            System.out.println("1) Print the entire list");
            System.out.println("2) Sort and print alphabetically");
            System.out.println("3) Sort and print by average decending");
            System.out.println("4) Search by average number ");
            System.out.println("5) Find the student who has the minimum average");
            System.out.println("6) Print the grade distribution");
            System.out.println("7) Exit");
            System.out.println("========================================");
            System.out.println("Enter Your Choice");
            menuChoice = in.nextInt();

            // Choosing an option from the menu by switch case format
            switch(menuChoice) {
                case 1: 
                    printAll(studentObjArray);
                    break;
                case 2:
                    Student studentObj = new Student("", 0, 0, 0);
                    for(int i = 0; i < studentObjArray.length - 1; i++) {
                        int index = i;
                        // this loop finds the index of the smallest number in the array
                        for( int j = i+1; j < studentObjArray.length; j++) {
                            String s1 = studentObjArray[j].studentName;
                            String s2 = studentObjArray[index].studentName;
                            int compare = s1.compareTo(s2);
                            if (compare < 0)  {
                                index = j; 
                            }
                        }
                        // swapping the smallest number with the position of i in the array
                        studentObj = studentObjArray[index];
                        studentObjArray[index] = studentObjArray[i]; 
                        studentObjArray[i] = studentObj;
                    }
                    printAll(studentObjArray);
                    break;
                case 3:
                    
                    break;
                case 4: 
                    break;
                case 5: 
                    break;
                case 6:  
                    break;
                case 7: 
                    System.out.println("Thanks for using the app");
                    exit = true;
                    break;
            }
        }
    }
    
    // printAll method made for easy recall for printing the arrayStudent
    // which is sorted in someway from the menu
    static void printAll(Student[] arrayStudents) {
        System.out.println("========================================");
        System.out.println("---> Print the entire List <----");
        for (int i = 0; i < arrayStudents.length; i++) {
            arrayStudents[i].printData();
        }
    }
}