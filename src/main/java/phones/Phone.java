package phones;
import java.awt.Color;

public class Phone {
    //data members
    private String model;
    private double screenSize;
    private double price;
    private Color  color;
    private int    memorySize;

    public Phone(String model, double screenSize, double price, Color color, int memorySize) {
        this.model = model;
        this.screenSize = screenSize;
        this.price = price;
        this.color = color;
        this.memorySize = memorySize;
    }
    // getters
    public Color getColor() { return color; }
    public double getScreenSize() { return screenSize; }
    public int getMemorySize() { return memorySize; }
    public String getModel() { return model; }
    public double getPrice() { return price; }
    
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
        sb.append(color.toString()).append(" ").append(memorySize).append("Гб");
        return sb.toString();
    }
}
