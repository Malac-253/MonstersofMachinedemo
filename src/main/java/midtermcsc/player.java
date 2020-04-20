/**
 * 
 */
package midtermcsc;

import java.util.ArrayList;

/**
 * @author malachi.beerram
 *
 */
public class player {
	
	protected String name;
	protected int locationX;
	protected int locationY;
	protected location currlocation;
	
	//Fight Update
	protected ArrayList<monster> enslavedMonster = new ArrayList<monster>() { {add(new RareSquirrels("Malachi your guide",new attack("Guide save bite",170)));}};
	
	
	
	public player()
	{
		this.locationX = 0;
		this.locationY = 0;
		this.currlocation = null;
	}
	
	public player(location currlocation)
	{
		this.currlocation = currlocation;
	}
	
	public player(int locationX, int locationY, location currlocation, String name)
	{
		this.locationX = locationX;
		this.locationY = locationY;
		this.currlocation = currlocation;
		this.name = name;
	}
	
	
	
	//The methods
			public void Move(int xmove, int ymove) {		
				locationX = locationX + xmove;
				locationY = locationY + ymove;		
			}
	
	
	//Getters and Setters
			
			public int getLocationX() {
				return locationX;
			}
		
			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public void setLocationX(int locationX) {
				this.locationX = locationX;
			}
		
			public ArrayList<monster> getEnslavedMonster() {
				return enslavedMonster;
			}

			public void setEnslavedMonster(ArrayList<monster> enslavedMonster) {
				this.enslavedMonster = enslavedMonster;
			}

			public int getLocationY() {
				return locationY;
			}
		
			public void setLocationY(int locationY) {
				this.locationY = locationY;
			}
		
			public location getCurrlocation() {
				return currlocation;
			}
		
			public void setCurrlocation(location currlocation) {
				this.currlocation = currlocation;
			}
	

}
