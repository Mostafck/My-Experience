import java.util.Scanner;

public class Food
{
 private String FoodName;
 private double FoodPrice;

    public Food(String foodName, double foodPrice) {
        FoodName = foodName;
        FoodPrice = foodPrice;
    }

    public Food() {
    }

    public String getFoodName() {
        return FoodName;
    }

    public void setFoodName(String foodName) {
        FoodName = foodName;
    }

    public double getFoodPrice() {
        return FoodPrice;
    }

    public void setFoodPrice(double foodPrice) {
        FoodPrice = foodPrice;
    }

    @Override
    public String toString() {
        return "ListFood{" +
                "FoodName='" + FoodName + '\'' +
                ", FoodPrice=" + FoodPrice +
                '}';
    }
    public static Food AddNewFood()
        {
            Scanner scanner=new Scanner(System.in);
            System.out.println("enter your name food:");
            String name=scanner.nextLine();
            System.out.println("enter your price food:");
            double price=Double.valueOf(scanner.nextLine());
            Food food=new Food(name,price);
            return food;
        }
}
