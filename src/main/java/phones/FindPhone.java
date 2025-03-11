package phones;
import java.awt.Color;
import java.util.LinkedList;
import java.util.List;

abstract class Tag {
    public abstract boolean find(Phone ph);
}

class ColorTag extends Tag {
    private Color col;

    public ColorTag(Color col){
        this.col = col;
    }

    @Override
    public boolean find(Phone ph){
        return ph.getColor().equals(col);
    }
}

class ModelTag extends Tag {
    private String mod;

    public ModelTag(String mod){
        this.mod = mod;
    }

    @Override
    public boolean find(Phone ph){
        return ph.getModel().equalsIgnoreCase(mod);
    }
}

class MemSizeTag extends Tag {
    private int memSize;

    public MemSizeTag(int memSize){
        this.memSize = memSize;
    }

    @Override
    public boolean find(Phone ph){
        return ph.getMemorySize() == memSize;
    }
}

class ModPriLowTag extends Tag {
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

class MemSizeNotColorTag extends Tag {
    private int memSize;
    private Color col;

    public MemSizeNotColorTag(int memSize, Color col){
        this.memSize = memSize;
        this.col = col;
    }

    @Override
    public boolean find(Phone ph){
        return ph.getMemorySize() ==memSize && !ph.getColor().equals(col);
    }
}

public class FindPhone {
    private List<Phone> data=new PhoneDB().getPhoneData();

    public List<Phone> findPhones(Tag tag){
        List<Phone> foundPhones = new LinkedList<>();
        for (Phone ph : data){
            if (tag.find(ph)){
                foundPhones.add(ph);
            }
        }
        return foundPhones;
    }

    public List<Phone> byColor(Color col){
        ColorTag colorTag = new ColorTag(col);

        return findPhones(colorTag);
    }

    public List<Phone> byModel(String mod){
        ModelTag modelTag = new ModelTag(mod);

        return findPhones(modelTag);
    }

    public List<Phone> byMSize(int memSize) {
        MemSizeTag memSizeTag = new MemSizeTag(memSize);

        return findPhones(memSizeTag);
    }

    public List<Phone> byModelAndPriceLow(String mod, double price) {
        ModPriLowTag modPriLowTag = new ModPriLowTag(mod, price);

        return findPhones(modPriLowTag);
    }

    public List<Phone> byMSizeAndNotColor(int memSize, Color col){
        MemSizeNotColorTag memSizeNotColorTag = new MemSizeNotColorTag(memSize, col);

        return findPhones(memSizeNotColorTag);
    }
}
