package RoomManagement;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Pattern;
/*
öğrenci yerleştiricek
öğrenci çıkartıcak
verilen öğrencinin odasında ne zamandır kaldığını al

--------------
program arayüzleri olarak
    +öğrenciyi sisteme kaydet.
    +bütün şu (tip), şu (cinsiyet), şu (müsait) özellikteki odaları al
     +         4,6,-     man,women,-    müsait, değil, -
    +odaya yerleştir(oto)
    +odaya yerleştir (manuel)
    öğrencileri kendi özelliklerine göre sıralama methotları yazılabilir.
    öğrencilere foto eklenebilir hale getirilebilir.(install image, makebackup, loadbackup)
    methotları yazılacak.
 */
/**
 * Project: RoomManager
 * <p>
 * Date: 29 Jun 2016
 * Author: eren
 */
public class Management {

    public static  String FİLE_NAME_ROOMS = "rooms.d";
    public static final String FİLE_NAME_STUDENTS = "students.d";

    public static ArrayList<Student> students;
    public static ArrayList<Room> rooms;


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
        students = (ArrayList<Student>) o;
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

    /**
     * To save a student to system.
     * @param stu
     */
    public static void addStudent(Student stu) {
        students.add(stu);
    }

    /**
     * Adds a student to students arrayList and then place the student any of rooms.
     * @param stu student
     */
    public static void addAndPlaceStudent(Student stu) {
        students.add(stu);

        placeToRoomOto(stu);
    }

    /**
     * When a student deleted with this method, method deleted the student from students and the room the student stays.
     * @param stu student
     */
    public static void removeStudent(Student stu) {
        students.remove(stu);

        for (Room room: rooms) {
            if (stu.getRoomNumber() == room.getRoomNumber()) {
                room.getRoomMembers().remove(stu);
            }
        }

    }

    public static ArrayList<Student> getStudentsByFullNameRegex(String regex){
        Pattern pattern = Pattern.compile(((regex)));                     //?
        ArrayList<Student> arrayList = new ArrayList<>();

        for (Student student:students) {
            if (pattern.matcher(student.getFullName()).matches()) {
                students.add(student);
            }
        }

        return students;
    }

    /**
     * To return rooms in every type as user wants.
     * @param RoomType type of room
     * @param RoomGender gender of room
     * @param roomStage is available to stay?
     * @return arraylist<room>
     */
    public static ArrayList<Room> getRooms(filterRoomType RoomType, filterRoomGender RoomGender, boolean roomStage) {
        ArrayList<Room> retVal = new ArrayList<>();

        if (rooms == null) return null;

        for (Room room: rooms) {
            if (RoomType == filterRoomType.any || RoomType.equals(room.getRoomType()) &&
                    RoomGender == filterRoomGender.both || RoomGender.equals(room.getRoomGender()) && roomStage == room.isAvailable()) {
                retVal.add(room);
            }
        }

        return retVal;

    }

    /**
     * To place a student any available room
     * @param stu
     */
    public static void placeToRoomOto(Student stu) {

        for (Room room:rooms) {
            if (room.isAvailable() && stu.getGender().equals(room.getRoomGender())) room.getRoomMembers().add(stu);
        }
    }

    /**
     * To place a student to a room the student wants.
     * @param stu
     * @param room
     */
    public static void placeToRoomManuel(Student stu, Room room) {
        room.placeAStudent(stu);
    }

}
