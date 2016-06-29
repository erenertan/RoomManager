import java.util.ArrayList;

/**
 * Project: RoomManager
 * <p>
 * Date: 28 Jun 2016
 * Author: eren
 */
public class Room {
    private int roomType;
    private String roomGender;
    private int roomPopulation;
    private ArrayList<Student> whoIsStaying;

    public Room() {
    }

    public Room(int roomType, String roomGender, int roomPopulation, ArrayList<Student> whoIsStaying) {
        this.roomType = roomType;
        this.roomGender = roomGender;
        this.roomPopulation = roomPopulation;
        this.whoIsStaying = whoIsStaying;
    }

    public int getRoomType() {
        return roomType;
    }

    public void setRoomType(int roomType) {
        this.roomType = roomType;
    }

    public String getRoomGender() {
        return roomGender;
    }

    public void setRoomGender(String roomGender) {
        this.roomGender = roomGender;
    }

    public int getRoomPopulation() {
        return roomPopulation;
    }

    public void setRoomPopulation(int roomPopulation) {
        this.roomPopulation = roomPopulation;
    }

    public ArrayList<Student> getWhoIsStaying() {
        return whoIsStaying;
    }

    public void setWhoIsStaying(ArrayList<Student> whoIsStaying) {
        this.whoIsStaying = whoIsStaying;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomType=" + roomType +
                ", roomGender='" + roomGender + '\'' +
                ", roomPopulation=" + roomPopulation +
                ", whoIsStaying=" + whoIsStaying +
                '}';
    }
}
