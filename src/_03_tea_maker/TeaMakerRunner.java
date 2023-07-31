package _03_tea_maker;

public class TeaMakerRunner {
	public static void main(String[] args) {
	TeaBag teabagg =	new TeaBag("flavorless");
	Kettle kettles = new Kettle();
	Cup cupp = new Cup();
	
kettles.getWater();
kettles.boil();
cupp.makeTea(teabagg, kettles.getWater());
	
}
}
