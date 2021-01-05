package dayone.partone;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Driver {
    private static final Logger logger = LogManager.getLogger("Hello World");
    public static void main(String[] args) {
    UnitConvertor unitConvertor = new UnitConvertor();
    logger.info("Hello World");

    double output1 = unitConvertor.feetToCenti(5);
    System.out.println("output1 is" + output1);

    double output2 = unitConvertor.feetToCenti(6.0);
    System.out.println("output2 is " + output2);
    }
}
