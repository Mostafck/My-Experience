import java.util.Scanner;

public class Customer extends Human
{
 private String PhoneNumber;
 private String Address;
 private String AccountNumber;
 private int Inventory;
 private Scanner scanner;

    public Customer(String FName, String LName, String phoneNumber, String address, String accountNumber, int inventory) {
        super(FName, LName);
        PhoneNumber = phoneNumber;
        Address = address;
        AccountNumber = accountNumber;
        Inventory = inventory;
        scanner=new Scanner(System.in);
    }

    public Customer() {
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public int getInventory() {
        return Inventory;
    }

    public void setInventory(int inventory) {
        Inventory = inventory;
    }

    public int ReceivePayment()
        {
            System.out.println("enter your Payment:");
            int Payment=Integer.valueOf(scanner.nextLine());
            if (Payment>=Inventory)
                {
                    System.out.println("your Inventory:"+(Payment-Inventory));
                    setInventory(Inventory-Payment);
                    return Payment;
                }
            else
                System.out.println("your Inventory is not enough!"+Inventory);
            return -1;
        }


    public static Customer AddNewCustomer()
        {
            Scanner scanner=new Scanner(System.in);
            System.out.println("enter a first name:");
            String FName=scanner.nextLine();
            System.out.println("enter a last name:");
            String LName=scanner.nextLine();
            System.out.println("enter a phone number:");
            String phone=scanner.nextLine();
            System.out.println("enter a address:");
            String address=scanner.nextLine();
            System.out.println("enter a account number:");
            String accountN=scanner.nextLine();
            System.out.println("enter  inventory:");
            int inventory=Integer.valueOf(scanner.nextLine());
            Customer customer=new Customer(FName,LName,phone,address,accountN,inventory);
            return customer;
        }
}
