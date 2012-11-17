package SIM.dp07.Mediator;

public class DvdUpcaseTitle extends DvdTitle {  
   private String upcaseTitle;
   private DvdMediator dvdMediator;
    
   public DvdUpcaseTitle(String title, 
                         DvdMediator dvdMediator) {
       this.setTitle(title);
       resetTitle();
       this.dvdMediator = dvdMediator;
       this.dvdMediator.setUpcase(this);
   }           
   
   public void resetTitle() {
       this.setUpcaseTitle(this.getTitle().toUpperCase());
   }
   public void resetTitle(String title) {
       this.setTitle(title);
       this.resetTitle();
   }    
   
   public void setSuperTitleUpcase() {
       this.setTitle(this.getUpcaseTitle());
       dvdMediator.changeTitle(this);       
   }
   
   public String getUpcaseTitle() {
      return upcaseTitle;
   }
   private void setUpcaseTitle(String upcaseTitle) {
       this.upcaseTitle = upcaseTitle;
   }
}
