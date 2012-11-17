package SIM.dp15.Memento.adaptado;

import java.util.ArrayList;

import SIM.dp15.Memento.adaptado.dvd.DvdDetails;
import SIM.dp15.Memento.adaptado.dvd.DvdMemento;


public class TestDvdMemento {
	public static void main(String[] args) {
		DvdMemento dvdMementoCaretaker;
		// the Caretaker

		ArrayList stars = new ArrayList();
		stars.add(new String("Robert Downey Jr."));
		DvdDetails dvdDetails = new DvdDetails("The Avengers ", stars, '1');
		dvdMementoCaretaker = dvdDetails.createDvdMemento();
		System.out.println("1º estado");
		System.out.println(dvdDetails.formatDvdDetails());
		
		System.out.println("");
		System.out.println("2º estado");
		stars.add(new String("Mark Rufallo"));
		System.out.println(dvdDetails.formatDvdDetails());
		dvdMementoCaretaker.setState(dvdDetails);
		
		System.out.println("");
		System.out.println("3º estado");
		dvdDetails.addStar("Zezé Polessa");
		System.out.println(dvdDetails.formatDvdDetails());
		System.out.println("Oooops!!!! Essa atriz não é daqui. Como está o meu dvd?");

		System.out.println("");
		System.out.println("O último memento é");
		System.out.println(dvdMementoCaretaker.showMemento());

		System.out.println("Que equivale ao 2º estado");
		System.out.println("");
		// Obtenho o último estado 
		dvdDetails.setDvdMemento(dvdMementoCaretaker);
		// back off changes
		System.out.println("Depois de obtido o último estado");
		System.out.println(dvdDetails.formatDvdDetails());
		
		System.out.println("");
		System.out.println("Se quisesse voltar para o 1º estado...");
		// Obtenho o último estado 
		dvdDetails.setDvdMemento(dvdMementoCaretaker);
		// back off changes
		System.out.println(dvdDetails.formatDvdDetails());
		
	}
}