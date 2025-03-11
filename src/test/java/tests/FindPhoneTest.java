package tests;
import java.awt.Color;
import java.util.List;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import phones.FindPhone;
import phones.Phone;

public class FindPhoneTest {
    
    public FindPhoneTest() {}

    @Test
    public void byColorTest() {
        FindPhone fph=new FindPhone();
        List<Phone> find=fph.byColor(Color.RED);
        
        assertEquals(3, find.size());
    }
    
    @Test
    public void byModelTest() {
        FindPhone fph=new FindPhone();
        List<Phone> find=fph.byModel("vokii");
        
        assertEquals(4, find.size());
    }
    
    @Test
    public void byMSizeTest() {
        FindPhone fph=new FindPhone();
        List<Phone> find=fph.byMSize(64);
        
        assertEquals(2, find.size());
    }
    
    @Test
    public void byModelAndPriceLowTest() {
        FindPhone fph=new FindPhone();
        List<Phone> find=fph.byModelAndPriceLow("vokii",13000);
        
        assertEquals(2, find.size());
    }
    
    @Test
    public void byMSizeAndNotColorTest() {
        FindPhone fph=new FindPhone();
        List<Phone> find=fph.byMSizeAndNotColor(8,Color.RED);
        
        assertEquals(3, find.size());
    }
}
