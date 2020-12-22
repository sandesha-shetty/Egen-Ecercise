package dayone.parttwo;

public class RoomDimension {
    private double roomLength;
    private double roomWidth;

    public RoomDimension(double roomLength, double roomWidth) {
        this.roomLength = roomLength;
        this.roomWidth = roomWidth;
    }

    public double getRoomLength() {
        return roomLength;
    }

    public void setRoomLength(double roomLength) {
        this.roomLength = roomLength;
    }

    public double getRoomWidth() {
        return roomWidth;
    }

    public void setRoomWidth(double roomWidth) {
        this.roomWidth = roomWidth;
    }

    public double getArea(){
        return (this.getRoomLength() * this.getRoomWidth());
    }
}
