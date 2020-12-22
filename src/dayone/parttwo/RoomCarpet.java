package dayone.parttwo;

public class RoomCarpet {
    private RoomDimension roomDimension;
    private double costperSqureFoot;

    public RoomCarpet(RoomDimension roomDimension, double costperSqureFoot) {
        this.roomDimension = roomDimension;
        this.costperSqureFoot = costperSqureFoot;
    }

    public RoomDimension getRoomDimension() {
        return roomDimension;
    }

    public void setRoomDimension(RoomDimension roomDimension) {
        this.roomDimension = roomDimension;
    }

    public double getCostperSqureFoot() {
        return costperSqureFoot;
    }

    public void setCostperSqureFoot(double costperSqureFoot) {
        this.costperSqureFoot = costperSqureFoot;
    }

    public double getTotalCost(){
        return roomDimension.getArea() * costperSqureFoot;
    }
}
