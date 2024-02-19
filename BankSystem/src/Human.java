public abstract class Human
{
    public String FName;
    public String LName;

    public Human(String FName, String LName) {
        this.FName = FName;
        this.LName = LName;
    }

    public Human() {
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }
}
