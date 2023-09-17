class Person{
		private String name;
		public String getName() {
			return name;
		}
		
		public void setName(String newname) {
			this.name=newname;
		}
	}
public class OopsConcept1 {
	public static void main(String[] args) {
		Person obj = new Person();
		obj.setName("Sivaka");
		System.out.println(obj.getName());
	}

}
