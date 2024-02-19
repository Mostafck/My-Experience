import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SelfManager implements WeekFood
{
    private ArrayList <Student> student;
    private ArrayList <Professor> professor;
    private ArrayList <Staff> staff;
    private ArrayList <Food> food;
    private Scanner scanner;

    public SelfManager() {
        student=new ArrayList<Student>();
       professor=new ArrayList<Professor>();
       staff=new ArrayList<Staff>();
       food=new ArrayList<Food>();
       scanner=new Scanner(System.in);
    }
    public void AddNewFood()
        {
           food.add(Food.AddNewFood());
            System.out.println("your food is added");
        }
        public void SearchFood()
            {
                System.out.println("enter your name food for search:");
                String f=scanner.nextLine();
                for (int i = 0; i <food.size() ; i++)
                {
                    if (food.get(i).getFoodName().equals(f))
                        {
                            System.out.println(food.get(i).toString());
                        }
                    else
                        System.out.println("your food does not exist");
                }
            }
            public void AddStudent()
                {
                    Student.AddNewStudent();
                    System.out.println("your student added");
                }
            public void AddProfessor()
            {
                Professor.AddNewProfessor();
                System.out.println("your professor added");
            }
            public void AddStaff()
            {
                Staff.AddNewStaff();
                System.out.println("your staff added");
            }

             public void SearchStudent()
                 {
                     System.out.println("enter your student cod for search:");
                     String s=scanner.nextLine();
                     for (int i = 0; i <student.size() ; i++)
                     {
                         if (student.get(i).getStudentCode().equals(s))
                         {
                             System.out.println(student.get(i).toString());
                         }
                         else
                             System.out.println("your student does not exist");
                     }
                 }
    public void SearchProfessor()
    {
        System.out.println("enter your professor cod for search:");
        String p=scanner.nextLine();
        for (int i = 0; i <professor.size() ; i++)
        {
            if (professor.get(i).getProfessorCod().equals(p))
            {
                System.out.println(professor.get(i).toString());
            }
            else
                System.out.println("your professor does not exist");
        }
    }
    public void SearchStaff()
    {
        System.out.println("enter your professor cod for search:");
        String s=scanner.nextLine();
        for (int i = 0; i <staff.size() ; i++)
        {
            if (staff.get(i).getStaffCod().equals(s))
            {
                System.out.println(staff.get(i).toString());
            }
            else
                System.out.println("your staff does not exist");
        }
    }
    @Override
    public boolean saturday() {
        System.out.println("saturday:");
        Food.AddNewFood();
        return true;
    }

    @Override
    public boolean sunday()
    {
        System.out.println("sunday"+food);
        return true;
    }

    @Override
    public boolean monday()
    {
        System.out.println("monday"+food);
        return true;
    }

    @Override
    public boolean teusday()
    {
        System.out.println("teusday"+food);
        return true;
    }

    @Override
    public boolean wendsday()
    {
        System.out.println("wendsday"+food);
        return true;
    }


}
