public class Individuel {
    private String Nom;
    private String Prenom;
    private String Email;
    private String Datenaissance;
    private String CNI;

    public Individuel(){
        this("Nom","Prenom","Email","Datenaissance","CNI");
    }
    public Individuel(String Nom, String Prenom, String Email, String Datenaissance, String CNI){
        this.Nom=Nom;
        this.Prenom=Prenom;
        this.Email=Email;
        this.Datenaissance=Datenaissance;
        this.CNI=CNI;
    }
    public void SetNom(String Nom){
        this.Nom=Nom;
    }
    public String getNom(){
        return this.Nom;
    }
    public void SetPrenom(String Prenom){
        this.Prenom=Prenom;
    }
    public String getPrenom(){
        return this.Prenom;
    }
    public void SetDatenaissance(String Datenaissance){
        this.Datenaissance=Datenaissance;
    }
    public String getDatenaissance(){
        return this.Datenaissance;
    }
    public void SetCNI(String CNI){
        this.CNI=CNI;
    }
    public String getCNI(){
        return this.CNI;
    }
}
