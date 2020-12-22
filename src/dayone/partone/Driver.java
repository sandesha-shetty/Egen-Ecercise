package dayone.partone;

public class Driver {
    public static void main(String[] args) {
    UnitConvertor unitConvertor = new UnitConvertor();

    double output1 = unitConvertor.feetToCenti(5);
    System.out.println("output1 is" + output1);

    double output2 = unitConvertor.feetToCenti(6.0);
    System.out.println("output2 is " + output2);
    }
}
