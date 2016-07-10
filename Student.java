import com.sun.xml.internal.bind.v2.runtime.Name;

/**
 * Project: RoomManager
 * <p>
 * Date: 27 Jun 2016
 * Author: eren
 */

public class Student {
    private String name;
    private String surname;
    private String gender;
    private int id;
    private int roomNumber;
    private String school;
    private int StayingInRoom;
    private int roomType;

    public Student() {
    }

    public Student(String school, String name, String surname, String gender, int id) {
        this.school = school;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.id = id;
    }

    public Student(String name, String surname, String gender, int id, int roomNumber, String school, int stayingInRoom, int roomType) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public int getRoomType() {
        return roomType;
    }

    public void setRoomType(int roomType) {
        this.roomType = roomType;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", id=" + id +
                ", roomNumber=" + roomNumber +
                ", school='" + school + '\'' +
                ", StayingInRoom=" + StayingInRoom +
                ", roomType=" + roomType +
                '}';
    }
}
