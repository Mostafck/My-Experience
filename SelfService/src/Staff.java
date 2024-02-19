import java.util.Scanner;

public class Staff extends Human implements Field
{
    private String StaffCod;
    private Food food;

    public Staff(String FName, String LName, String id, String phoneNumber, String staffCod) {
        super(FName, LName, id, phoneNumber);
        StaffCod = staffCod;
        food=new Food();
    }

    public Staff(String FName, String LName, String id, String staffCod) {
        super(FName, LName, id);
        StaffCod = staffCod;
    }

    public Staff() {
    }

    public String getStaffCod() {
        return StaffCod;
    }

    public void setStaffCod(String staffCod) {
        StaffCod = staffCod;
    }

    @Override
    public double Debt()
    {
        return food.getFoodPrice()*5;
    }



    @Override
    public String toString() {
        return super.toString()+"\nstaff cod:"+StaffCod;
    }
    public static Staff AddNewStaff()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter staff first name:");
        String fName=scanner.nextLine();
        System.out.println("enter staff last name:");
        String lName=scanner.nextLine();
        System.out.println("enter staff id: ");
        String id=scanner.nextLine();
        System.out.println("enter staff phone number:");
        String phone=scanner.nextLine();
        System.out.println("enter staff student cod:");
        String cod=scanner.nextLine();
        Staff staff=new Staff(fName,lName,id,phone,cod);
        return staff;
    }
}
