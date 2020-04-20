/**
 * 
 */
package midtermcsc;

import java.util.ArrayList;

/**
 * @author malachi.beerram
 *
 */
public class location {
	
	//location base
	protected int locationXStart;
	protected int locationXEnd;
	protected int locationYStart;
	protected int locationYEnd;
	protected String locationBlock;
	
	//location Spawn Update
	protected ArrayList<monster> allSpawnable = new ArrayList<monster>(); 
	protected String locationType = "World Space";
	protected int SpawnChance = 50;
	
	//Fight Update
	protected int DangerChance = 50;
	
	//Constructor
	
			public location()
			{
				this.locationXStart = 0;
				this.locationXEnd = 1;
				this.locationYStart = 0;
				this.locationYEnd = 1;
				this.locationBlock = locationType + " - Defined";
				addlocationmonsters();
			}
			
			public location( int locationXStart, int locationXEnd, int locationYStart, int locationYEnd, String locationBlock)
			{
				this.locationXStart = locationXStart;
				this.locationXEnd = locationXEnd;
				this.locationYStart = locationYStart;
				this.locationYEnd = locationYEnd;
				this.locationBlock = locationBlock;
				addlocationmonsters();
			}
			

			

	//Malachi methods
		public void addlocationmonsters() {
				//monsters
				allSpawnable.add(new monster());
		}
	
	
	
	
	//Gettter and Setter
			public int getSpawnChance() {
				return SpawnChance;
			}
	
			public int getDangerChance() {
				return DangerChance;
			}

			public void setDangerChance(int dangerChance) {
				DangerChance = dangerChance;
			}

			public void setSpawnChance(int spawnChance) {
				SpawnChance = spawnChance;
			}
			public int getLocationXStart() {
				return locationXStart;
			}
		
			public ArrayList<monster> getAllSpawnable() {
				return allSpawnable;
			}

			public void setAllSpawnable(ArrayList<monster> allSpawnable) {
				this.allSpawnable = allSpawnable;
			}

			public String getLocationType() {
				return locationType;
			}

			public void setLocationType(String locationType) {
				this.locationType = locationType;
			}

			public void setLocationXStart(int locationXStart) {
				this.locationXStart = locationXStart;
			}
		
			public int getLocationXEnd() {
				return locationXEnd;
			}
		
			public void setLocationXEnd(int locationXEnd) {
				this.locationXEnd = locationXEnd;
			}
		
			public int getLocationYStart() {
				return locationYStart;
			}
		
			public void setLocationYStart(int locationYStart) {
				this.locationYStart = locationYStart;
			}
		
			public int getLocationYEnd() {
				return locationYEnd;
			}
		
			public void setLocationYEnd(int locationYEnd) {
				this.locationYEnd = locationYEnd;
			}
		
			public String getLocationBlock() {
				return locationBlock;
			}
		
			public void setLocationBlock(String locationBlock) {
				this.locationBlock = locationBlock;
			}
	
	
	
	

}
