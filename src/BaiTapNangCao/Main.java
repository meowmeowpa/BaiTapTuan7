package BaiTapNangCao;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee fullTime=new FullTime("phương anh",20.0);
        Employee partTime=new PartTime("linh",10,30);

        System.out.println(fullTime.toString());
        System.out.println(partTime.toString());

        System.out.println(partTime.bonus(partTime, 10));





    }

}
