import java.util.Scanner;

public class Professor extends Human implements Field
{
 private String ProfessorCod;
 private String Grade;
 private Food food;

 public Professor(String FName, String LName, String id, String phoneNumber, String professorCod, String grade) {
  super(FName, LName, id, phoneNumber);
  ProfessorCod = professorCod;
  Grade = grade;
  food=new Food();
 }

 public Professor(String FName, String LName, String id, String phoneNumber, String professorCod) {
  super(FName, LName, id, phoneNumber);
  ProfessorCod = professorCod;
 }

 public Professor(String FName, String LName, String id, String professorCod) {
  super(FName, LName, id);
  ProfessorCod = professorCod;
 }

 public Professor(String professorCod, String grade) {
  ProfessorCod = professorCod;
  Grade = grade;
 }

 public Professor() {
 }

 public String getProfessorCod() {
  return ProfessorCod;
 }

 public void setProfessorCod(String professorCod) {
  ProfessorCod = professorCod;
 }

 @Override
 public double Debt() {
  return food.getFoodPrice()*10;
 }



 @Override
 public String toString() {
  return super.toString()+"\nprofessor cod:"+ProfessorCod+"\ngrade:"+Grade;
 }
 public static Professor AddNewProfessor()
 {
  Scanner scanner=new Scanner(System.in);
  System.out.println("enter professor first name:");
  String fName=scanner.nextLine();
  System.out.println("enter professor last name:");
  String lName=scanner.nextLine();
  System.out.println("enter professor id: ");
  String id=scanner.nextLine();
  System.out.println("enter professor phone number:");
  String phone=scanner.nextLine();
  System.out.println("enter professor student cod:");
  String cod=scanner.nextLine();
  Professor professor=new Professor(fName,lName,id,phone,cod);
  return professor;
 }
}
