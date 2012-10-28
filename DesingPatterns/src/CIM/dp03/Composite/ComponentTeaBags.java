package CIM.dp03.Composite;

import java.util.LinkedList;
import java.util.ListIterator;


public abstract class ComponentTeaBags {  
   LinkedList teaBagList; 
   ComponentTeaBags parent;
   String name;
    
   public abstract int countTeaBags();
   
   public abstract boolean add(ComponentTeaBags teaBagsToAdd);
   public abstract boolean remove(ComponentTeaBags teaBagsToRemove);
   public abstract ListIterator createListIterator();
   
   public void setParent(ComponentTeaBags parentIn) {
       parent = parentIn;
   }
   public ComponentTeaBags getParent() {
      return parent;
   }
   
   public void setName(String nameIn) {
       name = nameIn;
   }
   public String getName() {
       return name;
   }
}
