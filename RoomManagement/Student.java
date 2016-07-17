package RoomManagement;

/**
 * Project: RoomManager
 * <p>
 * Date: 27 Jun 2016
 * Author: eren
 */

public class Student {
    private String name;
    private String surname;
    private Gender Gender;
    private int id;
    private int roomNumber;
    private String school;
    private int StayingInRoom;
    private RoomType roomType;

    public Student() {
    }

    public Student(String name, String surname, Gender Gender, String school , int id) {
        this.school = school;
        this.name = name;
        this.surname = surname;
        this.Gender = Gender;
        this.id = id;
    }

    public Student(String name, String surname, Gender Gender, int id, int roomNumber, String school, int stayingInRoom, RoomType roomType) {
        this.name = name;
        this.surname = surname;
        this.Gender = Gender;
        this.id = id;
        this.roomNumber = roomNumber;
        this.school = school;
        StayingInRoom = stayingInRoom;
        this.roomType = roomType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFullName() {
        return getName() + getSurname();
    }

    public Gender getGender() {
        return Gender;
    }

    public void setGender(Gender gender) {
        this.Gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getStayingInRoom() {
        return StayingInRoom;
    }

    public void setStayingInRoom(int stayingInRoom) {
        StayingInRoom = stayingInRoom;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    @Override
    public String toString() {
        return "RoomManagement.Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", RoomManagement.Gender='" + Gender + '\'' +
                ", id=" + id +
                ", roomNumber=" + roomNumber +
                ", school='" + school + '\'' +
                ", StayingInRoom=" + StayingInRoom +
                ", roomType=" + roomType +
                '}';
    }
}
