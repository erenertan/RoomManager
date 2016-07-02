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

    /**
     * To obtain which type of a room. 4 or 6.
     * @return
     */
    public int getRoomType() {
        return roomType;
    }

    /**
     * To change of a room type.
     * @param roomType
     */
    public void setRoomType(int roomType) {
        this.roomType = roomType;
    }

    /**
     * To obtain a room for male or female.
     * @return
     */
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

    /**
     * To place just a student to a room.
     * @param stu
     */
    public void placeAStudent(Student stu) {
        whoIsStaying.add(stu);
    }

    /**
     * This method to obtain that the room is avaible to place a student or not.
     * @return
     */
    public boolean IsItAvaible() {
        if (roomPopulation < roomType) return true;
        return false;
    }

    /**
     * To take the list of students in room.
     * @return
     */
    public ArrayList<Student> getWhoIsStaying() {
        return whoIsStaying;
    }

    /**
     * To place a new set of students to room.
     * @param whoIsStaying
     */
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
