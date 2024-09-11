package BaiOn3;

import java.io.*;


public class CRUDStudent {
    private Student[] students;
    public static int numberOfStudent;

    public CRUDStudent() {
        students = new Student[100];
        numberOfStudent = 0;
    }

    //thêm sv
    public boolean addStudent(Student objStudent) {
        if (numberOfStudent < students.length) {
            students[numberOfStudent++] = objStudent;
            return true;
        }
        return false;
    }

    public boolean addStudentToFile(Student student, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(student);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

    public Student getStudentFromFile(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Student) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean addStudentListToFile(Student[] studentList, String fileName) {
        try (ObjectOutputStream oosList = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oosList.writeObject(studentList);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Student[] getStudentListFromFile(String fileName) {
        try (ObjectInputStream oisList = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Student[]) oisList.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}




