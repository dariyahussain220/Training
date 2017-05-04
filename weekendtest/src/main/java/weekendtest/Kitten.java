package weekendtest;

public class Kitten implements MyKitten{

	private String name;
	private Person owner;
	private int age = 0;

	public Kitten(String name, Person owner) {
		this.name = name;
		this.owner = owner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name + "the" + " " + "Feline";
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner =owner;
	}

	public int getAge() {
		return age;
	}

	public void haveBirthday() {

		age++;
	}
	public String toString(){
		return name+" "+"is"+" "+age+" "+"and belongs to"+" "+owner.getName();
	}

}
