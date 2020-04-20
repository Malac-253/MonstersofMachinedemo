/**
 * 
 */
package midtermcsc;

import java.util.ArrayList;

public class Forest extends location{
	//location Spawn Update
			protected String locationType = "Forest";
	
	//Fight Update
			protected int DangerChance = 20;
			
	//Constructor	
			
			public Forest()
			{
				super();
			}
			
			public Forest( int locationXStart, int locationXEnd, int locationYStart, int locationYEnd, 
					String locationBlock)
			{
				super(locationXStart,locationXEnd,locationYStart,locationYEnd,locationBlock);
			}
	
	//Malachi methods
			
			@Override
		    public void addlocationmonsters() {
				//monsters
				super.addlocationmonsters() ;
				allSpawnable.add( (monster) new Squirrels());
				allSpawnable.add( (monster) new RareSquirrels());
		
			}
		
	//Gettter and Setter
			@Override
			public String getLocationBlock() {
				return locationBlock + " - " + locationType;
			}
		
			public String getLocationType() {
				return locationType;
			}
		
			public void setLocationType(String locationType) {
				this.locationType = locationType;
			}
		
			public ArrayList<monster> getAllSpawnable() {
				return allSpawnable;
			}
		
			public void setAllSpawnable(ArrayList<monster> allSpawnable) {
				this.allSpawnable = allSpawnable;
			}
		
		
		
}
