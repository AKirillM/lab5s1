package phones;
import java.awt.Color;
import java.util.LinkedList;
import java.util.List;

public class PhoneDB {
    private List<Phone> data;

    public List<Phone> getPhoneData() {
        return data;
    }
    public PhoneDB() {
        data=new LinkedList<>();
        
        data.add(new Phone("nokii",4  ,12000,Color.PINK,16));
        data.add(new Phone("nokii",4.5,12550,Color.RED,8));
        data.add(new Phone("okii" ,4.5,12000,Color.BLACK,8));
        data.add(new Phone("okii" ,4  ,15500,Color.RED,8));
        data.add(new Phone("nokii",4  ,11100,Color.WHITE,32));
        data.add(new Phone("xokii",3  ,12070,Color.WHITE,64));
        data.add(new Phone("xokii",3  ,13300,Color.RED,32));
        data.add(new Phone("xokii",3.5,17700,Color.PINK,32));
        data.add(new Phone("vokii",4.5,12200,Color.PINK,8));
        data.add(new Phone("vokii",3.5,14400,Color.WHITE,8));
        data.add(new Phone("vokii",3.5,19900,Color.BLACK,16));
        data.add(new Phone("vokii",3.5,12440,Color.BLACK,64));
    }
}
