
import java.io.*;
import java.util.ArrayList;
/*
öğrenci yerleştiricek
öğrenci çıkartıcak
verilen öğrencinin odasında ne zamandır kaldığını al

--------------
program arayüzleri olarak
    öğrenciyi sisteme kaydet.
    bütün şu (tip), şu (cinsiyet), şu (müsait) özellikteki odaları al
              4,6,-     man,women,-    müsait, değil, -
    odaya yerleştir(oto)
    methotları yazılacak.
 */
/**
 * Project: RoomManager
 * <p>
 * Date: 29 Jun 2016
 * Author: eren
 */
public class Management {

    public static final String FİLE_NAME_ROOMS = "rooms.d";
    public static final String FİLE_NAME_STUDENTS = "students.d";

    private static ArrayList<Student> students;
    private static ArrayList<Room> rooms;

    public static void initialize() {
        students = new ArrayList<>();
        rooms = new ArrayList<>();
        loadData();
    }

    public static void loadData() {
        loadStudents();
        loadRooms();
    }

    public static void loadStudents() {
        Object o = loadFromFile(FİLE_NAME_STUDENTS);

        if (o == null) {
            return;         // Why this if is neccessary? If the method loadFromFile could not find the file does not return null?
        }
    }

    public static void loadRooms() {
        Object o = loadFromFile(FİLE_NAME_ROOMS);

        if (o == null) return;
    }

    public static Object loadFromFile(String path) {
        File file = new File(path);
        Object retOb = null;

        if (!file.exists()) return null;

        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            retOb = ois.readObject();
            ois.close();
            fis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return retOb;
    }

    public static void  saveToFile(Object o, String path) {
        if (o == null) return;

        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(o);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void saveToFile() {
        saveToFile(rooms, FİLE_NAME_ROOMS);
        saveToFile(students,FİLE_NAME_STUDENTS);
    }

    public static void addRoom(Room r) {
        rooms.add(r);
    }

    public static void removeRoom(Room r) {
        rooms.remove(r);
    }
/*
    public static ArrayList<Room> emptyAllRooms() {
        ArrayList<Room> temp = null;

        for (Room room:rooms) {
            if (room.getRoomPopulation() < room.getRoomType()) {
                temp.add(room);
            }
        }

        return temp;
    }

    public static ArrayList<Room> emptyRooms(int roomType) {
        ArrayList<Room> temp = null;

        for (Room room:rooms) {
            if (room.getRoomPopulation() < room.getRoomType() && room.getRoomType() == roomType) {
                temp.add(room);
            }
        }

        return temp;
    }
*/

    /**
     * To save a student to system.
     * @param stu
     */
    public static void addStudent(Student stu) {
        students.add(stu);
    }

    public static ArrayList<Room> getRooms(int roomType, String roomGender, boolean roomStage) {
        ArrayList<Room> rooms = null;

        for (Room room:rooms) {
            if (roomType == room.getRoomType() && roomGender.equals(room.getRoomGender()) && roomStage) {

                rooms.add(room);
            }
        }

        return  rooms;
    }

}
