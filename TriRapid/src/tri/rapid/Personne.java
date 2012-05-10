package tri.rapid;

public class Personne {
	public String name;
	public String lastName;
	public Integer age;
	
public Personne(String lastName,String name,int age){
	
	this.name=name;
	this.lastName=lastName;
	this.age=age;
	
}
	
	@Override
	public String toString() {
		return (name+" "+lastName+" "+age.toString());
	}
}

