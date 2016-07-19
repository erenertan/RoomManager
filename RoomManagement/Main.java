package RoomManagement;

import java.util.ArrayList;

import static RoomManagement.filterRoomGender.female;

/**
 * Project: RoomManager
 * <p>
 * Date: 05 Jul 2016
 * Author: eren
 */
public class Main {
    public static void main(String [] args) {

        Management.saveToFile(new ArrayList<String>() {
            {
                add("Halil");
                add("Eren");
                add("Ertan");
            }}, Management.FİLE_NAME_STUDENTS);
        Management.initialize();

        Student exe = new Student("Emre", "Ertan", Gender.male, "Bilgi uni", 123);
        Management.addStudent(exe);

        Student exe2 = new Student("Nazmiye", "Ertan", Gender.female, "Balıkesir Üniversitesi", 120);
        Management.addStudent(exe2);

        ArrayList<Student> list = new ArrayList<>();
        list.add(exe);

        Room room = new Room(001,RoomType.big, Gender.male, list);
        Management.addRoom(room);

        Room room1 = new Room(002,RoomType.small, Gender.female);
        Management.addRoom(room1);

        Management.placeToRoomOto(exe2);
        System.out.println(room1.toString());
        System.out.println();
        System.out.println(room1.getRoomMembers().toString());
        System.out.println();

        System.out.println(Management.getRooms(filterRoomType.big, filterRoomGender.female,true));
        System.out.println();
        System.out.println(Management.students.toString());
        System.out.println();

        Student exe3 = new Student("Tarık", "İnce", Gender.male, "Bilgi University", 234);
        Management.addAndPlaceStudent(exe3);
        System.out.println(exe3.toString());
        System.out.println();

        System.out.println(Management.rooms.get(0));



    }
}
