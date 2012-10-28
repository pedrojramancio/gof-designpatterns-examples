package CIM.dp03.Composite;

import java.util.ListIterator;

public class LeafOneTeaBag extends ComponentTeaBags { 
    public LeafOneTeaBag(String nameIn) {
        this.setName(nameIn);
    }
    
    public int countTeaBags() {
        return 1;
    }
   
    public boolean add(ComponentTeaBags teaBagsToAdd) {
        return false;
    }
    public boolean remove(ComponentTeaBags teaBagsToRemove) {
        return false;
    }
    public ListIterator createListIterator() {
        return null;
    }
}
