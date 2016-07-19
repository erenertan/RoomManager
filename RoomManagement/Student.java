package RoomManagement;

/**
 * Project: RoomManager
 * <p>
 * Date: 27 Jun 2016
 * Author: eren
 */

/*
    stayingInRoom parametresinin kullanımını incele.
*/



class Student {
    private String name;
    private String surname;
    private Gender Gender;
    private int id;
    private String school;
    private int roomNumber;

    Student() {
    }

    Student(String name, String surname, Gender Gender, String school , int id) {
        this.school = school;
        this.name = name;
        this.surname = surname;
        this.Gender = Gender;
        this.id = id;
    }

    Student(String name, String surname, Gender Gender, int id, int roomNumber, String school, int stayingInRoom, RoomType roomType) {
        this.name = name;
        this.surname = surname;
        this.Gender = Gender;
        this.id = id;
        this.school = school;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getSurname() {
        return surname;
    }

    void setSurname(String surname) {
        this.surname = surname;
    }

    String getFullName() {
        return getName() + getSurname();
    }

    Gender getGender() {
        return Gender;
    }

    void setGender(Gender gender) {
        this.Gender = gender;
    }

    int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    String getSchool() {
        return school;
    }

    void setSchool(String school) {
        this.school = school;
    }

    void findRoomNumber() {
        for (Room room: Management.rooms) {
            if (room.getRoomMembers().equals(Management.getStudentsByFullNameRegex(getFullName()))) {
                roomNumber = room.getRoomNumber();
            }
        }
    }

    int getRoomNumber() {
        for (Room room: Management.rooms) {
            if (room.getRoomMembers().equals(Management.getStudentsByFullNameRegex(getFullName()))) {
                roomNumber = room.getRoomNumber();
            }
        }

        return roomNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", Gender=" + Gender +
                ", id=" + id +
                ", school='" + school + '\'' +
                ", roomNumber=" + roomNumber +
                '}';
    }
}
