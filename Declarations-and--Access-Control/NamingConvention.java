package basic.java;

/* 
 	*Classes and interfaces The first letter should be capitalized, and if several
 	*words are linked together to form the name, the first letter of the inner words
	*should be uppercase

 	*For interfaces, the names should typically be adjectives like
	*Runnable
	*Serializable
	*public interface Runnable
*/

public class NamingConvention {

	String $currencyName; // Variables : correct way to declare identifier, the camelCase format should be used
	String _name; //Variables : correct way to declare identifier, the camelCase format should be used
	int age;		//Variables : correct way to declare identifier, the camelCase format should be used
	final String CAPITAL_OF_INDIA = "Delhi"; //Constants : They should be named using uppercase letters with underscore characters as separators
	
//  public String 1Sex =null; int :b; int -d; int e#; int .f;  //this wrong way to declare identifier
	
	public NamingConvention(String $currencyName, String _name, int age) {
		this.$currencyName = $currencyName;
		this._name = _name;
		this.age = age;
	}
	
	public void method(){
		System.out.println("inside method");
		System.out.println("inside method : "+$currencyName);
		System.out.println("inside method : "+_name);
		System.out.println("inside method : "+age);
	}

	public static void main(String[] args) {
		NamingConvention id = new NamingConvention("Rupee","India",100);
		System.out.println(id.$currencyName);
		System.out.println(id._name);
		System.out.println(id.age);
		
		id.method();
		
	}

}
