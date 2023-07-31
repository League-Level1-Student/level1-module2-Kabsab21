package _01_sea_creature;

public class seaCreatureRunner {
	public static void main(String[] args) {
	SeaCreature thingy =	new SeaCreature("Spongebob");
	SeaCreature thingy2 =	new SeaCreature("Patrick");
	SeaCreature thingy3 =	new SeaCreature("Squidward");
     thingy.eat();
     thingy.laugh();
		
		thingy2.eat();
		thingy3.eat();
		thingy2.laugh();
		thingy3.laugh();
    	System.out.println(thingy2.getName());
    	System.out.println(thingy3.getName());
	}
}