package BaiTapOn;

public class ShapeMain {
    public static void main(String[] args) {
       Rectangle rectangle = new Rectangle("Rectangle","Blue",3.0,4.0);
       Shape shape = new Rectangle("Rectangle","Black", 5.0,6.0);
        System.out.println(rectangle.toString());
        System.out.println(shape.toString());
    }

}
