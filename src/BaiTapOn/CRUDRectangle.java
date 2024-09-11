//package BaiTapOn;
//
//import javax.imageio.IIOException;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//
//class CRUDRectangle {
//    private Rectangle[] rectanglelist;
//    private static int numberOfRectangle;
//    public  CRUDRectangle(){
//        rectanglelist = new Rectangle[100];
//        numberOfRectangle=0;
//    }
//    public boolean addRectangle(Rectangle objRectangle){
//        if (numberOfRectangle>= 100){
//            System.out.println("danh sách đã đạt tối đa");
//            return false;
//        }
//        rectanglelist[numberOfRectangle]=objRectangle;
//        numberOfRectangle++;
//        return true;
//    }
//    public boolean addRectangleToFile(Rectangle objRectangle, String filename){
//        try {
//            FileOutputStream fos = new FileOutputStream(filename);
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(objRectangle);
//            oos.close();
//            return true;
//        } catch (IIOException e){
//            e.printStackTrace();
//            return false;
//        }
//    }
//    public static Rectangle getRectangleFromFile(String filename)throws IIOException, ClassNotFoundException{
//        FileInputStream file = new FileInputStream(filename);
//        ObjectInputStream ois = new ObjectInputStream(file);
//        Rectangle rectangle = (Rectangle) ois.readObject();
//        ois.close();
//        fis.close();
//        return rectangle;
//    }
//    public static boolean addRectangleListToFile(Rectangle[] rectanglelist, String filename) throws IIOException{
//        FileInputStream fos = new FileOutputStream(filename);
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeObject(rectanglelist);
//        return true;
//    }
//    private static Rectangle[] getAllRectangleFromFile(String file) throws IIOException, ClassNotFoundException{
//        FileInputStream fis = new FileInputStream(file);
//        ObjectInputStream ois = new ObjectInputStream(fis);
//        Rectangle[] rectangles;
//        rectangles = (Rectangle[] ois.readObject()) ;
//        return rectangles;
//    }
//
//}
