
package CIM.dp03.Composite;

import java.util.LinkedList;
import java.util.ListIterator;


public class CompositeTinOfTeaBags extends ComponentTeaBags {  
   public CompositeTinOfTeaBags(String nameIn) {
       teaBagList = new LinkedList();
       this.setName(nameIn);
   }
   
   public int countTeaBags() {
       int totalTeaBags = 0;
       ListIterator listIterator = this.createListIterator();
       ComponentTeaBags tempTeaBags;
       while (listIterator.hasNext()) {
           tempTeaBags = (ComponentTeaBags)listIterator.next();
           totalTeaBags += tempTeaBags.countTeaBags();
       }
       return totalTeaBags;
   }
   
   public boolean add(ComponentTeaBags teaBagsToAdd) {
       teaBagsToAdd.setParent(this);
       return teaBagList.add(teaBagsToAdd);
   }
   
   public boolean remove(ComponentTeaBags teaBagsToRemove) {
       ListIterator listIterator = 
           this.createListIterator();
       ComponentTeaBags tempTeaBags;
       while (listIterator.hasNext()) {
           tempTeaBags = (ComponentTeaBags)listIterator.next();
           if (tempTeaBags == teaBagsToRemove) {
               listIterator.remove();
               return true;
           }
       }
       return false;
   }
   
   public ListIterator createListIterator() {
       ListIterator listIterator = teaBagList.listIterator();
       return listIterator;
   }
}