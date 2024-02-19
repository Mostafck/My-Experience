import java.util.ArrayList;
import java.util.Scanner;

public class BankEmployee extends Human implements SavingAccount
{
  private String EmployeeNumber;
  private String PassCod;
  private ArrayList <Customer> customer;
  private Scanner scanner;

    public BankEmployee(String FName, String LName, String employeeNumber, String passCod, ArrayList<Customer> customer) {
        super(FName, LName);
        EmployeeNumber = employeeNumber;
        PassCod = passCod;
        this.customer = customer;
    }

    public BankEmployee(String FName, String LName, String employeeNumber, String passCod) {
        super(FName, LName);
        EmployeeNumber = employeeNumber;
        PassCod = passCod;
        customer=new ArrayList<Customer>();
        scanner=new Scanner(System.in);
    }
    public BankEmployee(String FName, String LName) {
        super(FName, LName);
    }

    public BankEmployee(String passCod) {
        PassCod = passCod;
    }

    public BankEmployee(String FName, String LName, String passCod) {
        super(FName, LName);
        PassCod = passCod;
    }

    public BankEmployee()
    {

    }

    public String getEmployeeNumber() {
        return EmployeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        EmployeeNumber = employeeNumber;
    }

    public String getPassCod() {
        return PassCod;
    }

    public void setPassCod(String passCod) {
        PassCod = passCod;
    }

    public void AddNewCustomer()
    {
            System.out.println("enter information for add customer:");
            customer.add( Customer.AddNewCustomer())  ;
            System.out.println("which account would you like to radar?" +
                    "\n1:saving account short term" +
                    "\n2:saving account long term" +
                    "\n3:saving account saving loan" +
                    "\n4:saving account current loan");
            int choose=Integer.valueOf(scanner.nextLine());
            switch (choose)
                {
                    case 1:
                        SAShortTerm();
                        break;
                    case 2:
                        SALongTerm();
                        break;
                    case 3:
                        SASavingLoan();
                        break;
                    case 4:
                        SACurrentLoan();
                        break;
                }

    }

    public void CreateAccount()
    {
        System.out.println("enter customer information:");
        AddNewEmployee();
        System.out.println("choose a account:\n1-saving account short term\n2-saving account long term\nsaving account saving loan\nsaving account current loan");
        int choose=Integer.valueOf(scanner.nextLine());
        switch (choose)
            {
                case 1:
                    SAShortTerm();
                    break;
                case 2:
                    SALongTerm();
                    break;
                case 3:
                    SASavingLoan();
                    break;
                case 4:
                    SACurrentLoan();
                    break;
            }
    }
    public void RemoveAccount()
        {
            System.out.println("enter your account number customer:");
           String number=scanner.nextLine();
            for (int i = 0; i <customer.size() ; i++)
            {
                if (customer.get(i).getAccountNumber().equals(number))
                    {
                        System.out.println("your account is removed");
                        customer.remove(number);
                    }
            }
        }
  public void AllCustomers()
  {
   System.out.println(customer.toString());
  }





    @Override
    public boolean SAShortTerm()
    {
                System.out.println("your saving account short term is created");
                return true;
    }

    @Override
    public boolean SALongTerm()
    {
            System.out.println("your saving account long term is created");
            return true;
    }

    @Override
    public boolean SASavingLoan()
    {
        System.out.println("your saving account saving loan is created");
        return true;
    }

    @Override
    public boolean SACurrentLoan()
    {
            System.out.println("your saving account current loan is created");
        return true;
    }

    @Override
    public String toString() {
        return "BankEmployee{" +
                "EmployeeNumber='" + EmployeeNumber + '\'' +
                ", PassCod='" + PassCod + '\'' +
                ", FirstName='" + FName + '\'' +
                ", LastName='" + LName + '\'' +
                '}';
    }

    public static BankEmployee AddNewEmployee()
        {
            Scanner scanner=new Scanner(System.in);
            System.out.println("enter a first name:");
            String FName=scanner.nextLine();
            System.out.println("enter a last name:");
            String LName=scanner.nextLine();
            System.out.println("enter a employee number:");
            String employeeN=scanner.nextLine();
            System.out.println("enter a pass code:");
            String passcode=scanner.nextLine();
            BankEmployee bankEmployee=new BankEmployee(FName,LName,employeeN,passcode);
            return bankEmployee;
        }
}
