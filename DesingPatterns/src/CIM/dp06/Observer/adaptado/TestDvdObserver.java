package CIM.dp06.Observer.adaptado;

class TestDvdObserver {
    
   public static void main(String[] args) {
       DvdReleaseByCategory heroes = 
           new DvdReleaseByCategory("Heroes");
       DvdReleaseByCategory simpsons = 
           new DvdReleaseByCategory("The Simpsons");  
       DvdReleaseByCategory trapalhoes = 
           new DvdReleaseByCategory("Os Trapalh�es");
       DvdReleaseByCategory arquivoX = 
           new DvdReleaseByCategory("Arquivo X");
       
       DvdSubscriber didi = new DvdSubscriber("Renato Arag�o");
       DvdSubscriber maggie = new DvdSubscriber("Maggie Simpson");
       DvdSubscriber zeze = new DvdSubscriber("Zez� Dicamargo");
       DvdSubscriber fox = new DvdSubscriber("Fox Mulder");
       DvdSubscriber spilberg = new DvdSubscriber("Steven Spilberg");

       heroes.addObserver(zeze);
       heroes.addObserver(spilberg);  
       simpsons.addObserver(maggie);
       trapalhoes.addObserver(didi);
       arquivoX.addObserver(fox);
       arquivoX.addObserver(spilberg);
       
       DvdRelease hrS1 = 
         new DvdRelease("DVDFOXBTVSS20", 
                        "Heroes 1� temporada",
                         2002, 06, 11);
       DvdRelease simpS2 = 
         new DvdRelease("DVDFOXSIMPSO2", 
                        "Os Simpsons 2� temporada",
                         2002, 07,  9);
       DvdRelease trapaRC = 
         new DvdRelease("DVDHBOSOPRAS2", 
                        "Os trapalh�es no rabo do cometa",
                         2001, 11,  6);
       DvdRelease arqX5 = 
         new DvdRelease("DVDFOXXFILES5", 
                        "Arquivo X 5� temporada",
                         2002, 04,  1);
       
       heroes.updateDvd(hrS1);
       simpsons.updateDvd(simpS2);
       trapalhoes.updateDvd(trapaRC);
       arquivoX.updateDvd(arqX5);
       
       arquivoX.removeObserver(spilberg);
       
       arqX5.updateDvdReleaseDate(2002, 5, 14);
       arquivoX.updateDvd(arqX5);
   }
}      