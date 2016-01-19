
public class Individual {
	
	private static int INITIATION_COUNTER = 0;
	
	private String name = "";
	private int age = 0;
	private int passport = 0;
	private String gender = "Male";
	private int weight = 0;
	private int height = 0;
	
	public Individual(){
		INITIATION_COUNTER++;
	}
	
	public Individual(String name, int age, String gender){
		INITIATION_COUNTER++;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public Individual(String name, int age, String gender, int weight, int height){
		INITIATION_COUNTER++;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPassport() {
		return passport;
	}

	public void setPassport(int passport) {
		this.passport = passport;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	

}
