package _03_smurf;

public class SmurfRunner {
	public static void main(String[] args) {
		Smurf hs = new Smurf("Handy");
		hs.eat();
		System.out.println(hs.getName());
		Smurf ps = new Smurf("Papa");
		System.out.println(ps.getName());
		System.out.println(ps.getHatColor());
		System.out.println(ps.isGirlOrBoy());
		Smurf s = new Smurf("Smurfette");
		System.out.println(s.getName());
		System.out.println(s.getHatColor());
		System.out.println(s.isGirlOrBoy());
	}
}
