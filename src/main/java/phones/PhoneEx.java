package phones;

public class PhoneEx {
    //data members
    private String model;
    private double screenSize;
    private double price;
    private double weght;
    private int    numberOfSIMs; 
    private int    screenResolution;
    private int    batteryLife;
    private int    memorySize;
    private int    talkTime;
    
    //object creation
    public PhoneEx() {
        model="NX-560";
        screenSize=6.3;
        price=15300;
    }    
    //method members
    public void draw(){
        //draw Phone picture
    }
    public void order(){
        //order creation
    }
    public void delivery(){
        //issue delivery
    } 
    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder(model);
        sb.append(" size=");
        sb.append(screenSize);
        sb.append("inch price=");
        sb.append(price); 
        //Сервис-Параметры-Разное-поле Шрифт-выбрать Segoe UI
        sb.append('\u20bd');
        
        sb.append(" "+weght+" "+numberOfSIMs+" "+screenResolution);
        sb.append(" "+batteryLife+" "+memorySize);
        sb.append(" talkTime="+talkTime+"h");
        return sb.toString();
    }    
}
