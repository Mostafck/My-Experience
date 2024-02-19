import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SystemManager extends Human
{
    private final String UserName="master";
    private final String PassCode="2023";
    private ArrayList <BankEmployee> bankEmployee;
    Scanner scanner;

    public SystemManager(ArrayList<BankEmployee> bankEmployee) {

        this.bankEmployee = bankEmployee;
    }

    public SystemManager()
    {
        bankEmployee=new ArrayList<BankEmployee>();
        scanner=new Scanner(System.in);
    }

    public String getUserName() {
        return UserName;
    }



    public String getPassCode() {
        return PassCode;
    }


    public ArrayList AddEmployee()
        {
            System.out.println("enter information for add employee:");
            bankEmployee.add(BankEmployee.AddNewEmployee());
            System.out.println("your information saved with success");
            return bankEmployee;
        }
    public void AllEmployee()
    {
     System.out.println(bankEmployee.toString());
    }
     public int RemoveEmployee()
     {
         System.out.println("enter index of Employee for remove:");
         int index=Integer.valueOf(scanner.nextLine());
         for (int i = 0; i <bankEmployee.size() ; i++)
         {
             if (index<bankEmployee.size())
                 {
                     bankEmployee.remove(index);
                     System.out.println("employee removed ");
                     return index;
                 }
         }
         System.out.println("your index is wrong!!!");
         return -1;

     }


}
