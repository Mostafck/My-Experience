public abstract class Human
{
    private String FName;
    private String LName;
    private String Id;
    private String PhoneNumber;

    public Human(String FName, String LName, String id, String phoneNumber) {
        this.FName = FName;
        this.LName = LName;
        Id = id;
        PhoneNumber = phoneNumber;
    }

    public Human(String FName, String LName, String id) {
        this.FName = FName;
        this.LName = LName;
        Id = id;
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

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "Human{" +
                "FName='" + FName + '\'' +
                ", LName='" + LName + '\'' +
                ", Id='" + Id + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                '}';
    }
}
