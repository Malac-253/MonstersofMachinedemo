package midtermcsc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random; 
/**
 * 
 * @author Malachi Beerram,
 * One run of the game.
 */

public class Onegame {
	
	//Start
	protected ArrayList<location> locations;
	protected player mainplayer;
	
	//location Spawn Update
	protected ArrayList<monster> MoreSpawnable;
	protected ArrayList<monster> CurrSpawnable;
	protected ArrayList<String> monsternames = new ArrayList<String>() {{add("Jack");}};
	public int Currday = 0;
	public String Currdayname = "day";
	protected monster nearMonster = null;
	

	//Constructor
		public Onegame()
	{
		this.mainplayer = new player();
	}
	
		public Onegame(ArrayList<location> locations, player mainplayer)
	{
		this.locations = locations;
		this.mainplayer = mainplayer;
		UpdatePlayerLoaction();
	}
	
	
	
	//Malachi methods
		//Fight Update
			public void fightMonster(boolean fight) {
			location currlocations = mainplayer.getCurrlocation();
			if(fight) {
				System.out.println("Onegame - (FightMonster()) |{ fight ");
				
				System.out.println("Onegame - (FightMonster()) |{ would pick mos use test for tese");
				
				mainplayer.getEnslavedMonster().get(0).getUniqueattack().doattack(nearMonster);
				
				System.out.println("Onegame - (FightMonster()) |{ would mageng heath ");
				
				System.out.println("Onegame - (FightMonster()) |{ if win choses to add to enslaved ");
				System.out.println("Onegame - (FightMonster()) |{ if lose used monsteris knoked out ");
				
				
			}else {
				System.out.println("Onegame - (FightMonster()) |{ DangerChance = " + currlocations.getDangerChance());
				System.out.println("Onegame - (FightMonster()) |{ might fight anyway");
			}
			
		}
	
		//location Spawn Update
			public void spawnMonster() {
				location currlocations = mainplayer.getCurrlocation();
				ArrayList<monster> listspawnMonster = currlocations.getAllSpawnable();
				int SpawnChance = currlocations.getSpawnChance();
				
				//System.out.println("SpawnChance = " + SpawnChance);
				
				
				//while (i.hasNext()) {monster curr = (monster) i.next();}
				//System.out.println("Onegame - (spawnMonster()) |{ SpawnChance = " + SpawnChance);
				//System.out.println("Onegame - (spawnMonster()) |{ will pick for testing purposed");
				//System.out.println("Onegame - (spawnMonster()) |{ equal chance to all monster for testing purposes");
				
				Random rand = new Random(); 
				nearMonster = listspawnMonster.get(rand.nextInt(listspawnMonster.size()));
				//System.out.println("Onegame - (spawnMonster()) |{ Nameplate = " + nearMonster.getNameplate());
				
				nearMonster = nearMonster.newwerOne(monsternames.get(rand.nextInt(monsternames.size())));
				
				// if nearMonster
			}
	
		//Start
			public void PlayerMove(int xmove, int ymove) {
				mainplayer.Move(xmove,ymove);
				UpdatePlayerLoaction();
				//spawnMonster();
			}
			
			protected void UpdatePlayerLoaction() {
					int workx = mainplayer.getLocationX();
					int worky = mainplayer.getLocationY();
					Iterator<location> i = locations.iterator();
					
					// each location, checks if player is there. 
					while (i.hasNext()){
						location curr = (location) i.next();
						if (curr.locationXStart <= workx ) {
							if (workx <= curr.locationXEnd) {
								if (curr.locationYStart <= worky ) {
									if (worky <= curr.locationYEnd) {
										//if (curr != mainplayer.getCurrlocation()) {UpdateCurrSpawnable();}
										mainplayer.setCurrlocation(curr);
									}
								}
							}                                                     	
						}
					}
			}
	
			
				
			
	
	
	//getter and Setter
			
			
			public ArrayList<location> getLocations() {
				return locations;
			}
		
			public ArrayList<monster> getMoreSpawnable() {
				return MoreSpawnable;
			}

			public void setMoreSpawnable(ArrayList<monster> moreSpawnable) {
				MoreSpawnable = moreSpawnable;
			}

			public ArrayList<monster> getCurrSpawnable() {
				return CurrSpawnable;
			}

			public void setCurrSpawnable(ArrayList<monster> currSpawnable) {
				CurrSpawnable = currSpawnable;
			}

			public ArrayList<String> getMonsternames() {
				return monsternames;
			}

			public void setMonsternames(ArrayList<String> monsternames) {
				this.monsternames = monsternames;
			}

			public int getCurrday() {
				return Currday;
			}

			public void setCurrday(int currday) {
				Currday = currday;
			}

			public String getCurrdayname() {
				return Currdayname;
			}

			public void setCurrdayname(String currdayname) {
				Currdayname = currdayname;
			}

			public monster getNearMonster() {
				return nearMonster;
			}

			public void setNearMonster(monster nearMonster) {
				this.nearMonster = nearMonster;
			}

			public void setLocations(ArrayList<location> locations) {
				this.locations = locations;
			}
		
			public player getMainplayer() {
				return mainplayer;
			}
		
			public void setMainplayer(player mainplayer) {
				this.mainplayer = mainplayer;
			}

}