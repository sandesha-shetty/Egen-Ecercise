package dayone.parttwo;

import java.util.Scanner;

public class Driver {
    private static Scanner reader;
    public static void main(String[] args) {
        double cost = 0.0;

        System.out.println("Select the type of carpet : woolen , nylon or silk");
        reader = new Scanner(System.in);
        String type = reader.next();
        CarpetType ctype = new CarpetType();
        cost = ctype.getCarpetTypeCost(type.toLowerCase());
        reader.close();

        RoomDimension roomDimension = new RoomDimension(10.0,20.0);
        RoomCarpet roomCarpet = new RoomCarpet(roomDimension,cost);
        System.out.println("**** Total Cost of Carpet  is" + roomCarpet.getTotalCost()) ;

    }

}
