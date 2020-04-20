package midtermcsc;

public class attack {
	protected String name = "Generic Attack";
	protected int hitpoint = 10;
	
	
	public attack() {
		
	}
	public attack(String name, int hitpoint) {
		this.name = name;
		this.hitpoint = hitpoint;
	}
	
	public void doattack(monster enemy) {
		System.out.println("attack - (doattack()) |{ your monster uses "+ name +" and " +hitpoint+ "damage");
	}

}
