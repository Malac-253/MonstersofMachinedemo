package midtermcsc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class MidtermTest{
		
		//Simple test to ensure I don't give up
		@Test
		public void starttest()
		{
			//System.out.println("Tester - (starttest()) |{    hey,You Got this, keep working");
			//System.out.println("You Got this, keep working");
		}
		//First test of baisc system
		@Test
		public void playertest1()
		{
			System.out.println("Tester - (playertest1()) |{ starting");
			
			//player(int locationX, int locationY, location currlocation)
			player playertest1Player = new player(0, 0, null,"Test1player");
			
			//location( int locationXStart, int locationXEnd, int locationYStart, int locationYEnd, String locationBlock)
			ArrayList<location> locations = new ArrayList<location>();
		      
				location TestlocationA = new location(-5, 0, 6, 10,"TestlocationA");
				location TestlocationB = new location(0, 5, 6, 10,"TestlocationB");	
				location TestlocationC = new location(5, 10, 6, 10,"TestlocationC");
				locations.add(TestlocationA);
				locations.add(TestlocationB);
				locations.add(TestlocationC);
				
				location TestlocationD = new location(-5, 0, 0, 5,"TestlocationD");
				location TestlocationE = new location(0, 5, 0, 5,"TestlocationE");	
				location TestlocationF = new location(5, 10, 0, 5,"TestlocationF");
				locations.add(TestlocationD);
				locations.add(TestlocationE);
				locations.add(TestlocationF);
				
				location TestlocationG = new location(-5, 0, -5, 0,"TestlocationG");
				location TestlocationH = new location(0, 5, -5, 0,"TestlocationH");	
				location TestlocationI = new location(5, 10, -5, 0,"TestlocationI");
				locations.add(TestlocationG);
				locations.add(TestlocationH);
				locations.add(TestlocationI);
			
			//Onegame(ArrayList<location> locations, player mainplayer)
			Onegame testGame1 = new Onegame(locations,playertest1Player);
			
			//locations check
			assertEquals((String)testGame1.getLocations().get(1).getLocationBlock(),"TestlocationB");
			//player Check
			assertEquals((String)testGame1.getMainplayer().getName(),"Test1player");
			//player move to TestlocationE
			testGame1.PlayerMove(2,2);
			assertEquals((String)testGame1.getMainplayer().getCurrlocation().getLocationBlock(),"TestlocationE");	
			testGame1.PlayerMove(5,5);	
			assertEquals((String)testGame1.getMainplayer().getCurrlocation().getLocationBlock(),"TestlocationC");
		}
		
		//First test of location system
		@Test
		public void locationstest1()
		{
			//System.out.println("Tester - (locationstest1()) |{ starting");
			
			//player(int locationX, int locationY, location currlocation)
			player playertest1Player = new player(0, 0, null,"Test1player");
			
			//location( int locationXStart, int locationXEnd, int locationYStart, int locationYEnd, String locationBlock)
			ArrayList<location> locations = new ArrayList<location>();
		      
				location TestlocationA = new location(-5, 0, 6, 10,"TestlocationA");
				location TestlocationB = new location(0, 5, 6, 10,"TestlocationB");	
				Forest TestlocationC = new Forest(5, 10, 6, 10,"TestlocationC");
				locations.add(TestlocationA);
				locations.add(TestlocationB);
				locations.add(TestlocationC);
				
				location TestlocationD = new location(-5, 0, 0, 5,"TestlocationD");
				location TestlocationE = new location(0, 5, 0, 5,"TestlocationE");	
				Forest TestlocationF = new Forest(5, 10, 0, 5,"TestlocationF");
				locations.add(TestlocationD);
				locations.add(TestlocationE);
				locations.add(TestlocationF);
				
				location TestlocationG = new location(-5, 0, -5, 0,"TestlocationG");
				location TestlocationH = new location(0, 5, -5, 0,"TestlocationH");	
				Forest TestlocationI = new Forest(5, 10, -5, 0,"TestlocationI");
				locations.add(TestlocationG);
				locations.add(TestlocationH);
				locations.add(TestlocationI);
			
				//Onegame(ArrayList<location> locations, player mainplayer)
				Onegame testGame1 = new Onegame(locations,playertest1Player);
		
			//player move to TestlocationE
			testGame1.PlayerMove(2,2); // 2,2
			assertEquals((String)testGame1.getMainplayer().getCurrlocation().getLocationBlock(),"TestlocationE");	
			testGame1.PlayerMove(5,5); // 7,7
			assertEquals((String)testGame1.getMainplayer().getCurrlocation().getLocationBlock(),"TestlocationC - Forest");
			testGame1.PlayerMove(0,-5); //7,2
			assertEquals((String)testGame1.getMainplayer().getCurrlocation().getLocationBlock(),"TestlocationF - Forest");
			testGame1.PlayerMove(0,-5);	//7,-3
			assertEquals((String)testGame1.getMainplayer().getCurrlocation().getLocationBlock(),"TestlocationI - Forest");
			
		}
		
		//First test of locationspawn system
			@Test
			public void locationsandspawntest1()
			{
				//System.out.println("Tester - (locationsandspawntest1()) |{ starting");
				
				//player(int locationX, int locationY, location currlocation)
				player playertest1Player = new player(0, 0, null,"Test1player");
				
				//location( int locationXStart, int locationXEnd, int locationYStart, int locationYEnd, String locationBlock)
				ArrayList<location> locations = new ArrayList<location>();
			      
					location TestlocationA = new location(-5, 0, 6, 10,"TestlocationA");
					location TestlocationB = new location(0, 5, 6, 10,"TestlocationB");	
					Forest TestlocationC = new Forest(5, 10, 6, 10,"TestlocationC");
					locations.add(TestlocationA);
					locations.add(TestlocationB);
					locations.add(TestlocationC);
					
					location TestlocationD = new location(-5, 0, 0, 5,"TestlocationD");
					location TestlocationE = new location(0, 5, 0, 5,"TestlocationE");	
					Forest TestlocationF = new Forest(5, 10, 0, 5,"TestlocationF");
					locations.add(TestlocationD);
					locations.add(TestlocationE);
					locations.add(TestlocationF);
					
					location TestlocationG = new location(-5, 0, -5, 0,"TestlocationG");
					location TestlocationH = new location(0, 5, -5, 0,"TestlocationH");	
					Forest TestlocationI = new Forest(5, 10, -5, 0,"TestlocationI");
					locations.add(TestlocationG);
					locations.add(TestlocationH);
					locations.add(TestlocationI);
				
					//Onegame(ArrayList<location> locations, player mainplayer)
					Onegame testGame1 = new Onegame(locations,playertest1Player);
			
				//player move to TestlocationE
				testGame1.PlayerMove(2,2); // 2,2
				assertEquals((String)testGame1.getMainplayer().getCurrlocation().getLocationBlock(),"TestlocationE");
				
				testGame1.spawnMonster();
				assertEquals((String)testGame1.getNearMonster().getName(),"Jack");
				//System.out.println("Tester - (locationsandspawntest1()) |{ " + testGame1.getNearMonster().getNameplate());
				
				testGame1.PlayerMove(5,5); // 7,7
				assertEquals((String)testGame1.getMainplayer().getCurrlocation().getLocationBlock(),"TestlocationC - Forest");
				
				testGame1.spawnMonster();
				assertEquals((String)testGame1.getNearMonster().getName(),"Jack");
				//System.out.println("Tester - (locationsandspawntest1()) |{ " + testGame1.getNearMonster().getNameplate());
				
				
				
			}
			
			//First test of locationspawn system
			@Test
			public void spawnandfighttest1()
			{
				System.out.println("Tester - (SpawnAndfighttest1()) |{ starting");
				
				//player(int locationX, int locationY, location currlocation)
				player playertest1Player = new player(0, 0, null,"Test1player");
				
				//location( int locationXStart, int locationXEnd, int locationYStart, int locationYEnd, String locationBlock)
				ArrayList<location> locations = new ArrayList<location>();
			      
					location TestlocationA = new location(-5, 0, 6, 10,"TestlocationA");
					location TestlocationB = new location(0, 5, 6, 10,"TestlocationB");	
					Forest TestlocationC = new Forest(5, 10, 6, 10,"TestlocationC");
					locations.add(TestlocationA);
					locations.add(TestlocationB);
					locations.add(TestlocationC);
					
					location TestlocationD = new location(-5, 0, 0, 5,"TestlocationD");
					location TestlocationE = new location(0, 5, 0, 5,"TestlocationE");	
					Forest TestlocationF = new Forest(5, 10, 0, 5,"TestlocationF");
					locations.add(TestlocationD);
					locations.add(TestlocationE);
					locations.add(TestlocationF);
					
					location TestlocationG = new location(-5, 0, -5, 0,"TestlocationG");
					location TestlocationH = new location(0, 5, -5, 0,"TestlocationH");	
					Forest TestlocationI = new Forest(5, 10, -5, 0,"TestlocationI");
					locations.add(TestlocationG);
					locations.add(TestlocationH);
					locations.add(TestlocationI);
				
					//Onegame(ArrayList<location> locations, player mainplayer)
					Onegame testGame1 = new Onegame(locations,playertest1Player);
			
				//player move to TestlocationE
				
				testGame1.PlayerMove(2,2); // 2,2
				assertEquals((String)testGame1.getMainplayer().getCurrlocation().getLocationBlock(),"TestlocationE");
				
				System.out.println("Tester - (SpawnAndfighttest1()) |{ " + testGame1.getMainplayer().getEnslavedMonster().get(0).getNameplate());
				
				testGame1.spawnMonster();
				assertEquals((String)testGame1.getNearMonster().getName(),"Jack");
				System.out.println("Tester - (SpawnAndfighttest1()) |{ " + testGame1.getNearMonster().getNameplate());
				
				testGame1.PlayerMove(5,5); // 7,7
				assertEquals((String)testGame1.getMainplayer().getCurrlocation().getLocationBlock(),"TestlocationC - Forest");
				
				testGame1.spawnMonster();
				assertEquals((String)testGame1.getNearMonster().getName(),"Jack");
				System.out.println("Tester - (SpawnAndfighttest1()) |{ " + testGame1.getNearMonster().getNameplate());
				
				
				
			}

	
}
