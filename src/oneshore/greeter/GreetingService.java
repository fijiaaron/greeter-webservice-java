package oneshore.greeter;


public class GreetingService {
	
	
	
	
	public GreetingService() {}
	
	
	public Greeting greet() {
		return greet(null);
	}
	
	public Greeting greet(String name) {
		return greet(name, null);
	}
	
	public Greeting greet(String name, String locale) {
		Person person = null;
		Greeter greeter = new Greeter();
		
		if (name != null) {
			person = new Person(name);
		}
		
		if (locale != null) {
			greeter.setLocale(locale);
		}
		
		Greeting greeting = greeter.greet(person, locale);
		return greeting;
	}
	
	
}
