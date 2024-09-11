package BaiOn3;

public class Main {
    public static void main(String[] args) {
        CRUDStudent crud = new CRUDStudent();

        // Tạo 3 sinh viên
        Student student1 = new Student("001", "pank", "01/01/2005", 7.0);
        Student student2 = new Student("002", "linh", "02/02/2005", 8.0);
        Student student3 = new Student("003", "Nhung", "03/03/2005", .80);

        crud.addStudent(student1);
        crud.addStudent(student2);
        crud.addStudent(student3);

        crud.addStudentToFile(student1,"dtm1.dat");
        crud.addStudentToFile(student2,"dtm2.dat");
        crud.addStudentToFile(student3,"dtm3.dat");

        System.out.println("Thông tin SV : "+ crud.getStudentFromFile("dtm1.dat"));
        System.out.println("Thông tin SV : "+ crud.getStudentFromFile("dtm2.dat"));
        System.out.println("Thông tin SV : "+ crud.getStudentFromFile("dtm3.dat"));

        Student[] students = {student1,student2};
        crud.addStudentListToFile(students,"list.dat");

        Student[] showStudentList = crud.getStudentListFromFile("list.dat");
        for (Student student : showStudentList) {
            System.out.println("Thông tin List Student : " + student.toString());
        }

    }

}
