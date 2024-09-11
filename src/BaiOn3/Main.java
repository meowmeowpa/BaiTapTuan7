package BaiOn3;

public class Main {
    public static void main(String[] args) {
        CRUDStudent crudStudent = new CRUDStudent();

        // Tạo 3 sinh viên
        Student student1 = new Student("001", "pank", "01/01/2005", 7.0);
        Student student2 = new Student("002", "linh", "02/02/2005", 8.0);
        Student student3 = new Student("003", "Nhung", "03/03/2005", .80);

        // Thêm sinh viên vào danh sách
        crudStudent.addStudent(student1);
        crudStudent.addStudent(student2);
        crudStudent.addStudent(student3);

        // Lưu từng sinh viên vào file
        String filename = "students.txt";
        crudStudent.addStudentToFile(student1, filename);
        crudStudent.addStudentToFile(student2, filename);
        crudStudent.addStudentToFile(student3, filename);

        // Hiển thị sinh viên từ file
        Student studentFromFile = crudStudent.getStudentFromFile(filename);
        System.out.println("Sinh viên từ file: " + studentFromFile.toString());

        // Lưu danh sách sinh viên vào file
        crudStudent.addStudentListToFile(new Student[]{student1, student2, student3}, filename);

        // Hiển thị toàn bộ sinh viên từ file
        Student[] allStudents = crudStudent.getAllStudentFromFile(filename);
        for (Student student : allStudents) {
            if (student != null) {
                System.out.println(student.toString());
            }
        }
    }
}
