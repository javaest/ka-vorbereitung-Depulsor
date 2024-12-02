package vorlage;

public class Kellner extends Person {
    public int mitarbeiterID;
    private String name;
    
    public String getName() {
    	return name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public void setMitarbeiterID(int id) {
    	this.mitarbeiterID = id;
    }
    
    public int getMitarbeiterID() {
    	return mitarbeiterID;
    }
    
	public Kellner(String name, int mitarbeiterID) throws Exception {
		super(name);
		this.name = name;
		this.mitarbeiterID = mitarbeiterID;
	}

    // Konstruktor, Getter und Setter
}