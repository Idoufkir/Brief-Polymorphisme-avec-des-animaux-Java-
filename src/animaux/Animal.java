package animaux;


public abstract class Animal {

	private int id;
    private String name;
    private String categorie;


    public Animal(int id, String name, String categorie) {
        this.id = id;
        this.name = name;
        this.categorie = categorie;

    }
    
    public int getId() {
    	return id;
    }
    
    public void setId(int id) {
    	this.id = id;
    }
    
    public String getName() {
    	return name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public String getCategorie() {
    	return categorie;
    }
    
    public void setCategorie(String categorie) {
    	this.categorie = categorie;
    }
    

    
    @Override
    public String toString() {
        return "Id:" + id + "\n name :" + name + "\n categorie :" + categorie;
    }
    

}
