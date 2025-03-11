import phones.Phone;
import phones.PhoneEx;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Phone ph1=new Phone("okii" ,4  ,1550, Color.RED,16);
        System.out.println(ph1);

        PhoneEx ph2=new PhoneEx();
        System.out.println(ph2);
    }
}