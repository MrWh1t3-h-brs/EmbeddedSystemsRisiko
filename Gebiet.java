/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 17.11.2017
  * @author 
  */

public class Gebiet {
  
  // Anfang Attribute
  private String NameTest2;
  private String Nachbargebiete;
  private Soldat Soldat;
  // Ende Attribute
  
  public Gebiet(Soldat Soldat, String NameTest2, String Nachbargebiete) {
    this.NameTest2 = NameTest2;
    this.Nachbargebiete = Nachbargebiete;
    this.Soldat = Soldat;
  }

  // Anfang Methoden
  public Soldat getSoldat() {
    return Soldat;
  }

  public void setSoldat() {
    
  }

  public void getNachbargebiete() {
    
  }

  public void getName() {
    
  }

  public void getAnzahlSoldat() {
    
  }

  // Ende Methoden
} // end of Gebiet
