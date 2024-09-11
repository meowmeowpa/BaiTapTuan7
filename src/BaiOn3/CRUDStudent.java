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

    // Phương thức lưu một sinh viên vào file
    public boolean addStudentToFile(Student objStudent, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(objStudent.toString());
            writer.newLine();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Phương thức lấy sinh viên từ file
    public Student getStudentFromFile(String line) {
        // Chia dòng thành các phần dựa trên dấu phẩy
        String[] parts = line.split(",");

        String id = parts[0].trim();       // ID
        String name = parts[1].trim();     // Tên
        String dob = parts[2].trim();      // Ngày sinh
        double markAvg = Double.parseDouble(parts[3].trim()); // Đảm bảo chỉ có số

        return new Student(id, name, dob, markAvg);
    }

    // Phương thức lưu danh sách sinh viên vào file
    public boolean addStudentListToFile(Student[] listStudent, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Student student : listStudent) {
                if (student != null) {
                    writer.write(student.toString());
                    writer.newLine();
                }
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Phương thức lấy danh sách sinh viên từ file
    public Student[] getAllStudentFromFile(String filename) {
        Student[] studentList = new Student[100];
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Parse thông tin sinh viên
                String[] data = line.split(", ");
                studentList[count++] = new Student(data[0], data[1], data[2], Double.parseDouble(data[3]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return studentList;
    }

    public void saveToFile(String file) {
    }

    public void displayAllStudents() {
    }
}




