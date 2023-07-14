class CricketMania {
//top10BatsMan
//top10IccTeamRankings 
//10iplTeamNames

      
     public static void main(String Cricketmania[]) {
	  String batsMan[] = { "Sachin Tendulkar", "Virat Kohli", "Sourav Ganguli", "Rahul Dravid", "David Warner", "Rohith Sharma" , "Chris Gayle" , "Mohammed Shami" , "Rashid khan" , "Mohit Sharma"};
      String iccTeamRankings[] = {"Australia", "Pakistan", "India", "Newzealand", "England", "South Africa", "Bangladesh", "Afghanistan", "Sri Lanka", "West Indies"};
      String iplTeamNames[] = {"Royal Challengers Bengaluru", "Chennai Super Kings","Kolkata Kinght Riders", "Mumbai Indians", "Gujarat Titans", "Rajastan Royals", "Sunrisers Hyderabad", "Delhi Capitals", "Lucknow Super Giants", "Punjab kings" };
 
	  System.out.println("Main started");
	  System.out.println("--------------------------------");
	  //System.out.println(batsMan.length);
	  System.out.println("List of top 10 batsMan are");
	  //System.out.println(batsMan[0] + " " + batsMan[1] + " " + batsMan[2] + " " + batsMan[3] + " " + batsMan[4] + " " + batsMan[5] + " " + batsMan[6] + " " + batsMan[7] + " " + batsMan[8] + " " + batsMan[9] );
	  getBatsMan(batsMan);
	  System.out.println("--------------------------------");
	  //System.out.println(iccTeamRankings.length);
	  System.out.println("List of top 10 iccTeamRankings are");
	  //System.out.println(iccTeamRankings[0] + " " + iccTeamRankings[1] + " " + iccTeamRankings[2] + " " + iccTeamRankings[3] + " " + iccTeamRankings[4] + " " + iccTeamRankings[5] + " " + iccTeamRankings[6] + " " + iccTeamRankings[7] + " " + iccTeamRankings[8] + " " + iccTeamRankings[9] );
	  getIccTeamRankings(iccTeamRankings);
	  System.out.println("---------------------------------");
	  //System.out.println(iplTeamNames.length);
	  System.out.println("List of top 10 iplTeamNames are");
	  //System.out.println(iplTeamNames[0] + " " + iplTeamNames[1] + " " + iplTeamNames[2] + " " + iplTeamNames[3] + " " + iplTeamNames[4] + " " + iplTeamNames[5] + " " + iplTeamNames[6] + " " + iplTeamNames[7] + " " +iplTeamNames[8] + " " + iplTeamNames[9] );
	  getIplTeamNames(iplTeamNames);
	  System.out.println("Main ended");

 }
     public static void getBatsMan(String batsMan[]){
		System.out.println("Inside getBatsMan");
		 for(String batMan:batsMan){
			 System.out.println(batMan);
		 }
	 }
	 public static void getIccTeamRankings(String iccTeamRankings[]){
		System.out.println("Inside getIccTeamRankings");
		 for(String iccTeamRanking:iccTeamRankings){
			 System.out.println(iccTeamRanking);
		 }
	 }
	 public static void getIplTeamNames(String iplTeamNames[]){
		System.out.println("Inside getIplTeamNames");
		 for(String iplTeamName:iplTeamNames){
			 System.out.println(iplTeamName);
		 }
	 }
}
	  