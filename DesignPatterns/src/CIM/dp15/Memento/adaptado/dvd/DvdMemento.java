package CIM.dp15.Memento.adaptado.dvd;

import java.util.ArrayList;

public class DvdMemento {

    private ArrayList dvdMementos;
    
    public DvdMemento(){
    	dvdMementos = new ArrayList();
    }
	       
    
    //sets DvdMementoData to DvdDetails
    public void setState(DvdDetails dvd) {
    	dvdMementos.add((DvdDetails)dvd.clone());
    } 
    //resets DvdDetails to DvdMementoData
    public DvdDetails getLastState() {
         return (DvdDetails)dvdMementos.remove(dvdMementos.size()-1);
    }    
    
    //only useful for testing
    public String showMemento() {
         return ((DvdDetails)dvdMementos.get(dvdMementos.size()-1)).formatDvdDetails(); 
    }      
}