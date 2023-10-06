public abstract class ElementoMultimediale { //check corretto<??
public String titolo;
public ElementoMultimediale(String Titolo){
     this.titolo = Titolo;
    }
public String getTitolo(){
    return titolo;
}
public void setTitolo(String Titolo){
this.titolo = Titolo;
}
public abstract void esegui();
}