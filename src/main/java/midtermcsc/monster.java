package midtermcsc;

import java.util.ArrayList;
import java.util.function.Supplier;

public class monster {

	////location Spawn base
	protected String SpawnablelocationsType = "World Space";
	protected ArrayList<Integer> AllSpawnableDays = new ArrayList<Integer>() { {add(0);add(1);add(2);add(3);add(4);add(5);add(6);}};
	protected int SpawnTimeStart = 0000;
	protected int SpawnTimeFinish = 2400;
	protected int Spawnrate = 10; //%
	protected String name ="Generic";
	protected String mtype = " The monster";
	protected String nameplate = name + mtype;
	
	//Fight Update
	protected attack normalattack = new attack("hug",34);
	protected attack uniqueattack = new attack("Loving hug",340);
	
	public monster()
	{	
		
		
	}
	
	public monster(String name,int SpawnTimeStart,int SpawnTimeFinish,int Spawnrate, ArrayList<Integer> AllSpawnableDays)
	{
		this.AllSpawnableDays = AllSpawnableDays;
		this.SpawnTimeStart = SpawnTimeStart;
		this.SpawnTimeFinish = SpawnTimeFinish;
		this.Spawnrate = Spawnrate; //%
		this.name = name;
		this.nameplate = name + mtype;
	}
	
	public monster(String name)
	{
		this.name = name;
		this. nameplate = name + mtype;
		
	}
	
	public monster(String name,attack uniqueattack)
	{
		this.name = name;
		this.nameplate = name + mtype;
		this.uniqueattack = uniqueattack;
	}
	
	public monster newwerOne(String newname){
		
		return new monster(newname);
	}

	
	
	
	
	
	
	
	
	
	//Getter and Setter
	
	public String getSpawnablelocationsType() {
		return SpawnablelocationsType;
	}

	public attack getNormalattack() {
		return normalattack;
	}

	public void setNormalattack(attack normalattack) {
		this.normalattack = normalattack;
	}

	public attack getUniqueattack() {
		return uniqueattack;
	}

	public void setUniqueattack(attack uniqueattack) {
		this.uniqueattack = uniqueattack;
	}

	public void setSpawnablelocationsType(String spawnablelocationsType) {
		SpawnablelocationsType = spawnablelocationsType;
	}

	public ArrayList<Integer> getAllSpawnableDays() {
		return AllSpawnableDays;
	}

	public void setAllSpawnableDays(ArrayList<Integer> allSpawnableDays) {
		AllSpawnableDays = allSpawnableDays;
	}

	public int getSpawnTimeStart() {
		return SpawnTimeStart;
	}

	public void setSpawnTimeStart(int spawnTimeStart) {
		SpawnTimeStart = spawnTimeStart;
	}

	public int getSpawnTimeFinish() {
		return SpawnTimeFinish;
	}

	public void setSpawnTimeFinish(int spawnTimeFinish) {
		SpawnTimeFinish = spawnTimeFinish;
	}

	public int getSpawnrate() {
		return Spawnrate;
	}

	public void setSpawnrate(int spawnrate) {
		Spawnrate = spawnrate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMtype() {
		return mtype;
	}

	public void setMtype(String mtype) {
		this.mtype = mtype;
	}

	public String getNameplate() {
		return nameplate;
	}

	public void setNameplate(String nameplate) {
		this.nameplate = nameplate;
	}
	
	
		
	
}
