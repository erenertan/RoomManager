package RoomManagement;

import java.util.ArrayList;

/**
 * Project: RoomManager
 * <p>
 * Date: 28 Jun 2016
 * Author: eren
 */
public class Room {
    private RoomType roomType;
    private Gender roomGender;
    private int roomPopulation;
    private ArrayList<Student> roomMembers;

    public Room() {
    }

    public Room(RoomType roomType, Gender roomGender, int roomPopulation, ArrayList<Student> roomMembers) {
        this.roomType = roomType;
        this.roomGender = roomGender;
        this.roomPopulation = roomPopulation;
        this.roomMembers = roomMembers;
    }

    /**
     * To obtain which type of a room. 4 or 6.
     * @return roomType
     */
    public RoomType getRoomType() {
        return roomType;
    }

    /**
     * To change of a room type.
     * @param roomType type of a room(small or big)
     */
    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    /**
     * To obtain a room for male or female.
     * @return roomGender
     */
    public Gender getRoomGender() {
        return roomGender;
    }

    public void setRoomGender(Gender roomGender) {
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
     * @return a room is avaible or not is it is avaible returns true.
     */
    public boolean isAvailable() {
        return roomType.equals(RoomType.small) && roomPopulation < 4 || roomType.equals(RoomType.big) && roomPopulation < 6;

    }

    /**
     * To take the list of students in room.
     * @return members of a room in ArrayList
     */
    public ArrayList<Student> getRoomMembers() {
        return roomMembers;
    }

    /**
     * To place a new set of students to room.
     * @param roomMembers is a ArrayList which contains students to place a room all together.
     */
    public void setRoomMembers(ArrayList<Student> roomMembers) {
        this.roomMembers = roomMembers;
    }

    @Override
    public String toString() {
        return "RoomManagement.Room{" +
                "roomType=" + roomType +
                ", roomGender='" + roomGender + '\'' +
                ", roomPopulation=" + roomPopulation +
                ", roomMembers=" + roomMembers.toString() +
                '}';
    }
}
