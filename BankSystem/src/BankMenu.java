import java.util.ArrayList;
import java.util.Scanner;

public class BankMenu
{
    private Scanner scanner;
    private SystemManager systemManager;
    ArrayList<Customer>customers;
    ArrayList<BankEmployee>bankEmployees;
    private ArrayList <Human>Bank;
    static int index=-1;
    static boolean trust;

    public BankMenu()
    {
       scanner=new Scanner(System.in);
       systemManager=new SystemManager();
       customers=new ArrayList<Customer>();
       bankEmployees=new ArrayList<BankEmployee>();
       Bank=new ArrayList<Human>();
    }

    public void menu()
    {
       String choose="";
        do
        {
            System.out.println("-------------Bank Manager--------------\nWelcome.....");
            System.out.println("choose a number for enter:" +
                    "\n1-system manager" +
                    "\n2-bank employee" +
                    "\n3-customer" +
                    "\n0-exist");
            choose=scanner.nextLine();
            switch (choose)
            {
                case "1":
                    SystemM();
                    break;
                case "2":
                    BankE();
                    break;
                case "3":
                    Customer();
                    break;
            }


        }while (!choose.equals("0"));

    }




    public void SystemM()
    {
        String choose="";
        ArrayList<String>Employees=new ArrayList<>();
        do
      {
          System.out.println("enter your user name:");
          String username=scanner.nextLine();
          System.out.println("enter your passcode:");
          String passcode=scanner.nextLine();
          if (username.equals(((SystemManager)systemManager).getUserName())&&passcode.equals(((SystemManager)systemManager).getPassCode()))
          {
                  do
                  {
                      System.out.println("welcome "+systemManager.getUserName()+
                              "\nchoose a number for operation" +
                              "\n1-add employee" +
                              "\n2-remove employee" +
                              "\n3-all employee" +
                              "\n0-exist");
                      choose=scanner.nextLine();
                      switch (choose)
                          {
                              case "1":
                               bankEmployees.addAll(systemManager.AddEmployee());
                                  break;
                              case "2":
                               bankEmployees.remove(systemManager.RemoveEmployee());
                                  break;
                              case "3":
                                  systemManager.AllEmployee();
                                  break;
                          }

                  }while (!choose.equals("0"));
          }
          else
          {
              System.out.println("your password or username is wrong!!!");
              System.out.println("1-try again!\n0-exist");
              choose=scanner.nextLine();
              if (choose.equals("1"))
                  continue;
          }


      }while (!choose.equals("0"));
    }


    public void BankE()
    {
      String choose="";
      do
      {
          System.out.println("enter your employee number:");
          String ENumber=scanner.nextLine();
          for (int i = 0; i <bankEmployees.size() ; i++)
          {
            if (bankEmployees.get(i).getEmployeeNumber().equals(ENumber))
                {
                    do
                    {
                        System.out.println("welcome mr "+bankEmployees.get(i).getFName()+" "+bankEmployees.get(i).getLName()+
                                "\nchoose a number for operation" +
                                "\n1-create account" +
                                "\n2-remove account" +
                                "\n3-all customer"+
                                "\n0-exist");
                        choose=scanner.nextLine();
                        switch (choose)
                        {
                            case "1":
                                bankEmployees.get(i).AddNewCustomer();
                                 break;
                            case "2":
                                 bankEmployees.get(i).RemoveAccount();

                                break;
                            case "3":
                                bankEmployees.get(i).AllCustomers();
                        }
                    }while (!choose.equals("0"));
                    break;
                }

          }

      }while (!choose.equals("0"));
    }

    public void Customer()
    {
        String choose="";
        do
        {
            System.out.println("enter your account number:");
            String CNumber=scanner.nextLine();
            for (int i = 0; i <bankEmployees.size() ; i++)
            {
                if (customers.get(i).getAccountNumber().equals(CNumber))
                {
                    do
                    {
                        System.out.println("welcome mr "+customers.get(i).getFName()+" "+customers.get(i).getLName()+
                                "\nchoose a number for operation" +
                                "\n1-get inventory" +
                                "\n2-receive payment" +
                                "\n3-money transfer"+
                                "\n0-exist");
                        choose=scanner.nextLine();
                        switch (choose)
                        {
                            case "1":
                                customers.get(i).getInventory();
                                break;
                            case "2":
                               customers.get(i).ReceivePayment();

                                break;
                            case "3":
                                MoneyTransfer();
                                if (MoneyTransfer()!=0)
                                    {
                                        customers.get(i).setInventory(customers.get(i).getInventory()-MoneyTransfer());
                                    }
                        }
                    }while (!choose.equals("0"));
                    break;
                }

            }

        }while (!choose.equals("0"));

  }



    public int MoneyTransfer()
        {
            System.out.println("enter your intended account number:");
            String ANumber=scanner.nextLine();
            System.out.println("enter your intended money:");
            int money=Integer.valueOf(scanner.nextLine());
            for (int i = 0; i <customers.size() ; i++)
            {
             if (customers.get(i).getAccountNumber().equals(ANumber)&&customers.get(i).getInventory()>=money)
                 {
                     customers.get(i).setInventory(customers.get(i).getInventory()+money);
                     System.out.println("your transfer is successful");
                     return money;
                 }
             else
                 {
                     System.out.println("your inventory less than intended money!!! ");
                     return 0;
                 }
            }
           return 0;
        }
}
