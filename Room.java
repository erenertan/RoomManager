import java.util.ArrayList;

/**
 * Project: RoomManager
 * <p>
 * Date: 28 Jun 2016
 * Author: eren
 */
public class Room {
    private String roomType;
    private String roomGender;
    private int roomPopulation;
    private ArrayList<Student> roomMembers;

    public Room() {
    }

    public Room(String roomType, String roomGender, int roomPopulation, ArrayList<Student> roomMembers) {
        this.roomType = roomType;
        this.roomGender = roomGender;
        this.roomPopulation = roomPopulation;
        this.roomMembers = roomMembers;
    }

    /**
     * To obtain which type of a room. 4 or 6.
     * @return
     */
    public String getRoomType() {
        return roomType;
    }

    /**
     * To change of a room type.
     * @param roomType
     */
    public void setRoomType(String roomType) {
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
     * To place a student to this room.
     * @param stu is student.
     */
    public void placeAStudent(Student stu) {
        roomMembers.add(stu);
    }

    /**
     * This method to obtain that the room is avaible to place a student or not.
     * @return
     */
    public boolean isItAvailable() {
        return roomType.equals("small") && roomPopulation < 4 || roomType.equals("big") && roomPopulation < 6;

    }

    /**
     * To take the list of students in room.
     * @return
     */
    public ArrayList<Student> getRoomMembers() {
        return roomMembers;
    }

    /**
     * To place a new set of students to room.
     * @param roomMembers
     */
    public void setRoomMembers(ArrayList<Student> roomMembers) {
        this.roomMembers = roomMembers;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomType=" + roomType +
                ", roomGender='" + roomGender + '\'' +
                ", roomPopulation=" + roomPopulation +
                ", roomMembers=" + roomMembers.toString() +
                '}';
    }
}
