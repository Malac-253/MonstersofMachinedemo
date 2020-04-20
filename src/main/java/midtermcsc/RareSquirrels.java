package midtermcsc;

import java.util.ArrayList;

	public class RareSquirrels extends monster{

		//location Spawn base
		protected String SpawnablelocationsType = "Forest";
		protected ArrayList<Integer> AllSpawnableDays = new ArrayList<Integer>() { {add(5);add(6);}};
		protected int SpawnTimeStart = 0000;
		protected int SpawnTimeFinish = 0600;
		protected int Spawnrate = 25; //%
		protected String name ="Generic";
		protected String mtype = " The RareSquirrels";
		protected String nameplate = name + mtype;
		
		//Fight Update
		protected attack normalattack = new attack("Rare bite",50);
		protected attack uniqueattack = new attack("Mege bite",80);
		
		public RareSquirrels()
		{
			super();
		}
		
		public RareSquirrels(String name,int SpawnTimeStart,int SpawnTimeFinish,int Spawnrate, ArrayList<Integer> AllSpawnableDays)
		{
			super(name, SpawnTimeStart, SpawnTimeFinish, Spawnrate, AllSpawnableDays);
		}
		
		public RareSquirrels(String name)
		{
			this.name = name;
			this. nameplate = name + mtype;
		}
		
		public RareSquirrels(String name,attack uniqueattack)
		{
			this.name = name;
			this.nameplate = name + mtype;
			this.uniqueattack = uniqueattack;
		}
		
		public RareSquirrels newwerOne(String newname){
			
			return new RareSquirrels(newname);
		}
		
//Getter and Setter
		public String getSpawnablelocationsType() {
			return SpawnablelocationsType;
		}

		public void setSpawnablelocationsType(String spawnablelocationsType) {
			SpawnablelocationsType = spawnablelocationsType;
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
