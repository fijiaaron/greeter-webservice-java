package oneshore.greeter;


public class GreetingService {

	public GreetingService() {}
	
	public Greeting greet(Person person, Locales locale) {
		Greeter greeter = new Greeter(locale);
		Greeting greeting = greeter.greet(person, locale);
		return greeting;
	}
}
