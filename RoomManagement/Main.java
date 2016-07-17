package RoomManagement;

import java.util.ArrayList;

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
        System.out.println(Management.students.get(0));
        Student exe = new Student("Emre", "Ertan", Gender.male, "Bilgi uni", 123);
        Management.students.add(exe);
        exe.setRoomNumber(3);
        System.out.println(exe.toString());
        System.out.println(exe.getRoomType());
        //System.out.println(RoomManagement.Management.students.get(0).getId());

        Room room = new Room();
    }
}
