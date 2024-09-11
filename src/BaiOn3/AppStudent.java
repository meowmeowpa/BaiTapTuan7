package BaiOn3;

public class AppStudent {
    public static void main(String[] args) {
        Student student1 = new Student("2300", "Nguyen Phuong Anh", "03/08/2005", 7);
        Person personStudent = new Student("002", "Linh ","02/02/2001", 7.0);

        // Hiển thị thông tin từ các đối tượng
        System.out.println(student1.toString());
        System.out.println(personStudent.toString());
    }
}

