    // Main class to run the program
    public class SchoolTest {
        public static void main(String[] args) {
            Student student = new Student("Villapando Denille Lois", 11711897, "1st year");
            Teacher teacher = new Teacher("Mr. Carlo torres", 20436831, "Discrete");
            Staff staff = new Staff("Mang Arnel", 73567218, "Maintenance");
 
            System.out.println("Student Info");
            student.displayInfo();
            System.out.println();
 
            System.out.println("Teacher Info");
            teacher.displayInfo();
            System.out.println();
 
            System.out.println("Staff Info");
            staff.displayInfo();
        }
    }