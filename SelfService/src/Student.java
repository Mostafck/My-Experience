import java.util.Scanner;

public class Student extends Human implements Field
{
    private String StudentCode;
    private Food food;
    public Student(String FName, String LName, String id, String phoneNumber, String studentCode) {
        super(FName, LName, id, phoneNumber);
        StudentCode = studentCode;
        food=new Food();
    }

    public Student(String FName, String LName, String id, String studentCode) {
        super(FName, LName, id);
        StudentCode = studentCode;
    }

    public Student() {
    }

    public String getStudentCode() {
        return StudentCode;
    }

    public void setStudentCode(String studentCode) {
        StudentCode = studentCode;
    }


    @Override
    public double Debt() {
        return food.getFoodPrice() ;
    }


    @Override
    public String toString() {
        return super.toString()+"\nstudent code:"+StudentCode;
    }

    public static Student AddNewStudent()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter student first name:");
        String fName=scanner.nextLine();
        System.out.println("enter student last name:");
        String lName=scanner.nextLine();
        System.out.println("enter student id: ");
        String id=scanner.nextLine();
        System.out.println("enter student phone number:");
        String phone=scanner.nextLine();
        System.out.println("enter student student cod:");
        String cod=scanner.nextLine();
        Student student=new Student(fName,lName,id,phone,cod);
        return student;
    }
}
