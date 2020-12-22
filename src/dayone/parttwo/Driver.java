package dayone.parttwo;

public class Driver {
    public static void main(String[] args) {
        RoomDimension roomDimension = new RoomDimension(10.0,20.0);
        RoomCarpet roomCarpet = new RoomCarpet(roomDimension,5.0);

        System.out.println("**** Total Cost of Carpet  is" + roomCarpet.getTotalCost()) ;
    }

}
