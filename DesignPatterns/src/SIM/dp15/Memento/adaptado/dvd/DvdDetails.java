package SIM.dp15.Memento.adaptado.dvd;

import java.util.ArrayList;
import java.util.ListIterator;

//the originator
public class DvdDetails implements Cloneable {  
   private String titleName;  
   private ArrayList stars;
   private char encodingRegion;
   
   private DvdDetails(){}
    
   public DvdDetails(String titleName, 
                     ArrayList stars, 
                     char encodingRegion) {
       this.setTitleName(titleName);
       this.setStars(stars);
       this.setEncodingRegion(encodingRegion);
   }    
  
   protected void setTitleName(String titleNameIn) {
       this.titleName = titleNameIn;
   }
   protected String getTitleName() {
       return this.titleName;
   }
   
   protected void setStars(ArrayList starsIn) {
       this.stars = starsIn;
   }
   public void addStar(String starIn) {
       stars.add(starIn);
   }
   protected ArrayList getStars() {
       return this.stars;
   }
   protected static String getStarsString(ArrayList starsIn) {
       int count = 0;
       StringBuffer sb = new StringBuffer();
       ListIterator starsIterator = starsIn.listIterator();
       while (starsIterator.hasNext()) {
           if (count++ > 0) {sb.append(", ");} 
           sb.append((String) starsIterator.next());
       }
       return sb.toString();
   } 
   
   protected void setEncodingRegion(char encodingRegionIn) {
      this.encodingRegion = encodingRegionIn;
   }
   protected char getEncodingRegion() {
       return this.encodingRegion;
   }  
   
   public String formatDvdDetails() {
       return ("DVD: " + this.getTitleName() + 
               ", estrelando: " + getStarsString(getStars()) + 
               ", região: " + this.getEncodingRegion()); 
   }   
   
   //sets current state to what DvdMemento has
   public void setDvdMemento(DvdMemento dvdMementoIn) {
	   DvdDetails memento = dvdMementoIn.getLastState();
       this.encodingRegion = memento.encodingRegion;
       this.titleName = memento.titleName;
       this.stars = memento.stars;
   }
   //save current state of DvdDetails in a DvdMemento
   public DvdMemento createDvdMemento() {
       DvdMemento mementoToReturn = new DvdMemento();
       mementoToReturn.setState(this);
       return mementoToReturn;
   }
   
   public Object clone() {
       DvdDetails clone = new DvdDetails();
       clone.setTitleName(getTitleName());
       clone.setEncodingRegion(getEncodingRegion());
       clone.setStars(new ArrayList(getStars())); 
       return clone;
   }
   
}
