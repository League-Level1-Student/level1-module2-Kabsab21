package _02_smurf;

public class SmurfRunnner {
	public static void main(String[] args) {
	Smurf thingy =	new Smurf("Handy");
	Smurf thingy1 =	new Smurf("Papa");
	Smurf thingy2 =	new Smurf("Smurfette");
	//handy smurf:
	thingy.eat();
	System.out.println(thingy.getName());
	//papa smurf:
	System.out.println(thingy1.getName());
	System.out.println(thingy1.getHatColor());
	System.out.println(thingy1.isGirlOrBoy());
	// smurfette smurf:
	System.out.println(thingy2.getName());
	System.out.println(thingy2.getHatColor());
	System.out.println(thingy2.isGirlOrBoy());
	
}
}
