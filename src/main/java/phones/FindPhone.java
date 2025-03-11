package phones;
import java.awt.Color;
import java.util.LinkedList;
import java.util.List;

abstract class Tag {
    public abstract boolean find(Phone ph);
}

abstract class ColorTag extends Tag {
    private Color col;

    public ColorTag(Color col){
        this.col = col;
    }

    @Override
    public boolean find(Phone ph){
        return ph.getColor().equals(col);
    }
}

abstract class ModelTag extends Tag {
    private String mod;

    public ModelTag(String mod){
        this.mod = mod;
    }

    @Override
    public boolean find(Phone ph){
        return ph.getModel().equalsIgnoreCase(mod);
    }
}

abstract class MemSizeTag extends Tag {
    private int memSize;

    public MemSizeTag(int memSize){
        this.memSize = memSize;
    }

    @Override
    public boolean find(Phone ph){
        return ph.getMemorySize() == memSize;
    }
}

abstract class ModPriLowTag extends Tag {
    private String mod;
    private double price;

    public ModPriLowTag(String mod, double price){
        this.mod = mod;
        this.price = price;
    }

    @Override
    public boolean find(Phone ph){
        return ph.getModel().equalsIgnoreCase(mod) && ph.getPrice() < price;
    }
}

public class FindPhone {
    private List<Phone> data=new PhoneDB().getPhoneData();
    
    public List<Phone> byColor(Color col) {
        List<Phone> find=new LinkedList<>();
        for(Phone ph : data)
            if (ph.getColor()==col)   find.add(ph);
        return find;
    }
    
    public List<Phone> byModel(String mod) {
        List<Phone> find=new LinkedList<>();
        for(Phone ph : data)
            if (ph.getModel().equalsIgnoreCase(mod))   find.add(ph);
        return find;
    }
    
    public List<Phone> byMSize(int memSize) {
        List<Phone> find=new LinkedList<>();
        for(Phone ph : data)
            if (ph.getMemorySize()==memSize)   find.add(ph);
        return find;
    }
    
    public List<Phone> byModelAndPriceLow(String mod, double price) {
        List<Phone> find=new LinkedList<>();
        for(Phone ph : data)
            if (ph.getModel().equalsIgnoreCase(mod) &&
                                ph.getPrice()<price)   find.add(ph);
        return find;
    }
    
    public List<Phone> byMSizeAndNotColor(int memSize, Color col) {
        List<Phone> find=new LinkedList<>();
        for(Phone ph : data)
            if (ph.getMemorySize()==memSize && !(ph.getColor()==col))   find.add(ph);
        return find;
    }    
}
