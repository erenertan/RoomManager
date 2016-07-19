package RoomManagement;

import java.util.ArrayList;

/**
 * Project: RoomManager
 * <p>
 * Date: 28 Jun 2016
 * Author: eren
 */
class Room {
    private int roomNumber;
    private RoomType roomType;
    private Gender roomGender;
    private int roomPopulation;
    private ArrayList<Student> roomMembers = new ArrayList<>();

    public Room() {
    }

    Room(int roomNumber, RoomType roomType, Gender roomGender) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomGender = roomGender;
    }

    Room(int roomNumber, RoomType roomType, Gender roomGender, ArrayList<Student> roomMembers) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomGender = roomGender;
        this.roomMembers = roomMembers;
        this.roomPopulation = roomMembers.size();
    }

    int getRoomNumber() {
        return roomNumber;
    }

    void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    /**
     * To obtain which type of a room. 4 or 6.
     * @return roomType
     */
    RoomType getRoomType() {
        return roomType;
    }

    /**
     * To change of a room type.
     * @param roomType type of a room(small or big)
     */
    void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    /**
     * To obtain a room for male or female.
     * @return roomGender
     */
    Gender getRoomGender() {
        return roomGender;
    }

    void setRoomGender(Gender roomGender) {
        this.roomGender = roomGender;
    }

    int getRoomPopulation() {
        return roomPopulation;
    }

    /**
     * To place a student to this room.
     * @param stu is student.
     */
    void placeAStudent(Student stu) {
         roomMembers.add(stu);
    }

    /**
     * This method to obtain that the room is avaible to place a student or not.
     * @return a room is avaible or not is it is avaible returns true.
     */
    boolean isAvailable() {
        return roomType.equals(RoomType.small) && roomPopulation < 4 || roomType.equals(RoomType.big) && roomPopulation < 6;

    }

    /**
     * To take the list of students in room.
     * @return members of a room in ArrayList
     */
    ArrayList<Student> getRoomMembers() {
        return roomMembers;
    }

    /**
     * To place a new set of students to room.
     * @param roomMembers is a ArrayList which contains students to place a room all together.
     */
    void setRoomMembers(ArrayList<Student> roomMembers) {
        this.roomMembers = roomMembers;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", roomType=" + roomType +
                ", roomGender=" + roomGender +
                ", roomPopulation=" + roomPopulation +
                ", roomMembers=" + roomMembers +
                '}';
    }
}
