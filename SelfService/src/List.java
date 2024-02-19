import java.util.Scanner;

public class List
{
    private SelfManager selfManager;
    private Scanner scanner;
     public List()
         {
             selfManager=new SelfManager();
             scanner=new Scanner(System.in);
         }
    public void Menu()
        {
            String choose="";
            do
            {
                System.out.println("-----------Menu---------");
                System.out.println("choose a number for operation:" +
                        "\n1-add food" +
                        "\n2-add student" +
                        "\n3-add professor" +
                        "\n4-add staff" +
                        "\n5-search food" +
                        "\n6-search student" +
                        "\n7-search professor" +
                        "\n8-search staff\n0-exist");
                choose=scanner.nextLine();
                switch (choose)
                    {
                        case "1":
                            for (int i = 0; i <5 ; i++)
                            {
                                selfManager.AddNewFood();
                            }
                            break;
                        case "2":
                            selfManager.AddStudent();
                            break;
                        case "3":
                            selfManager.AddProfessor();
                            break;
                        case "4":
                            selfManager.AddStaff();
                            break;
                        case "5":
                            selfManager.SearchFood();
                            break;
                        case "6":
                            selfManager.SearchStudent();
                            break;
                        case "7":
                            selfManager.SearchProfessor();
                            break;
                        case "8":
                            selfManager.SearchStaff();
                            break;
                    }

            }while (choose.equals("0"));
        }


}
