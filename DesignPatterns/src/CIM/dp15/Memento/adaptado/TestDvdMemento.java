package CIM.dp15.Memento.adaptado;

import java.util.ArrayList;

import CIM.dp15.Memento.adaptado.dvd.DvdDetails;
import CIM.dp15.Memento.adaptado.dvd.DvdMemento;

public class TestDvdMemento {
	public static void main(String[] args) {
		DvdMemento dvdMementoCaretaker;
		// the Caretaker

		ArrayList stars = new ArrayList();
		stars.add(new String("Robert Downey Jr."));
		DvdDetails dvdDetails = new DvdDetails("The Avengers ", stars, '1');
		dvdMementoCaretaker = dvdDetails.createDvdMemento();
		System.out.println("1� estado");
		System.out.println(dvdDetails.formatDvdDetails());
		
		System.out.println("");
		System.out.println("2� estado");
		stars.add(new String("Mark Rufallo"));
		System.out.println(dvdDetails.formatDvdDetails());
		dvdMementoCaretaker.setState(dvdDetails);
		
		System.out.println("");
		System.out.println("3� estado");
		dvdDetails.addStar("Zez� Polessa");
		System.out.println(dvdDetails.formatDvdDetails());
		System.out.println("Oooops!!!! Essa atriz n�o � daqui. Como est� o meu dvd?");

		System.out.println("");
		System.out.println("O �ltimo memento �");
		System.out.println(dvdMementoCaretaker.showMemento());

		System.out.println("Que equivale ao 2� estado");
		System.out.println("");
		// Obtenho o �ltimo estado 
		dvdDetails.setDvdMemento(dvdMementoCaretaker);
		// back off changes
		System.out.println("Depois de obtido o �ltimo estado");
		System.out.println(dvdDetails.formatDvdDetails());
		
		System.out.println("");
		System.out.println("Se quisesse voltar para o 1� estado...");
		// Obtenho o �ltimo estado 
		dvdDetails.setDvdMemento(dvdMementoCaretaker);
		// back off changes
		System.out.println(dvdDetails.formatDvdDetails());
		
	}
}