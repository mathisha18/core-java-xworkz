class AmazonPrime{
    
	 
	
	public static void main(String market[]){
	String kannadaMovies[]= {"K.G.F chapter1","K.G.F chapter2","Dr56","Raaghu","Love Brids","Ravi Bopanna","Triple Riding",
	"Vaarasdara","Garuda","Dia","Lucky Man","Lucky","U Turn","Orange","Cold Case","Yaana","Bharaate","Masti","Love Moktail","Love Moktail 2",
	"Takkar","Ottu","Law","Roberrt","Ninna Sanihake"};

	String hindiMovies[]= {"Pathaan","Baskasuran","Ram Setu","Thank God","Dada","Shershaah","3 Idiots","Tumbbad","Runway 34",
	"JugJugg jeeyo","Padmaavat","Sulthan","Raazi","Ki & Ka","Jab we met","Dhoom2","War","Welcome","Kalank","Vivah",
	"Good newwz","Befiker","Raadta","Gully Boy","Kesari"};

	String teluguMovies[]= {"Fidaa","Hit","Neetho","Giri","Acharya","Puli","Oh My Darling","Sita Ramam","Custody ",
	"Maharshi","V","Nota","Black","Saaho","Paagal","Aame","F2","Mismatch","Majili","Evaru","Jai Bhim","Goodchari","Athadu","VIP2","Jannu"};
	
	String englishMovies[]= {"After","My Fault","AIR","The Boss Baby","Smile","Fall","X","KING","Creed2",
	"Creed","Fortress","Sista","Top Gun","The Lair","Room 203","Venom","Nikita","Deep Water","Die Hart","Overdose",
	"Rocky","Shrek","King Kong","Sayen","COMA"};
	
	String malayalumMovies[]= {"Ayisha","Kaduva","Kooman","Kotthu","Varayan","#Home","4 years","Jo&Jo","Malik","Meow","Pada",
	"C U Soon","Payali","Murder","Veyil","Ishq","NGK","Big B","The Priest","Mike","Nizhal","Artist","Jalam","Shibu","Silence"};
	
		System.out.println("Main started");
		System.out.println("------------------------");
		System.out.println("List Kannada Movies are");
		/*System.out.println(kannadaMovies[0] + " " + kannadaMovies[1] + " " + kannadaMovies[2] + " " + kannadaMovies[3] + " " + kannadaMovies[4] + " " + kannadaMovies[5] + " " + 
		kannadaMovies[6] + " " + kannadaMovies[7] + " " + kannadaMovies[8] + " " + kannadaMovies[9] + " " + kannadaMovies[10] + " " + kannadaMovies[11] + " " + kannadaMovies[12] 
		+ " " + kannadaMovies[13] + " " + kannadaMovies[14] + " " + kannadaMovies[15] + " " + kannadaMovies[16] + " " + kannadaMovies[17] + " " + kannadaMovies[18] + " " + 
		kannadaMovies[19] + " " + kannadaMovies[20] + " " + kannadaMovies[21] + " " + kannadaMovies[22] + " " + kannadaMovies[23] + " " + kannadaMovies[24] );
			System.out.println(kannadaMovies.length);*/
		getKannadaMovies(kannadaMovies);
			
		System.out.println("------------------------");
		System.out.println("List Hindi Movies are");
		/*System.out.println(hindiMovies[0] + " " + hindiMovies[1] + " " + hindiMovies[2] + " " + hindiMovies[3] + " " + hindiMovies[4] + " " + hindiMovies[5] + " " + 
		hindiMovies[6] + " " + hindiMovies[7] + " " + hindiMovies[8] + " " + hindiMovies[9] + " " + hindiMovies[10] + " " + hindiMovies[11] + " " + hindiMovies[12] 
		+ " " + hindiMovies[13] + " " + hindiMovies[14] + " " + hindiMovies[15] + " " + hindiMovies[16] + " " + hindiMovies[17] + " " + hindiMovies[18] + " " + 
		hindiMovies[19] + " " + hindiMovies[20] + " " + hindiMovies[21] + " " + hindiMovies[22] + " " + hindiMovies[23] + " " + hindiMovies[24] );
		System.out.println(hindiMovies.length);*/
		getHindiMovies(hindiMovies);
		
		System.out.println("------------------------");
		System.out.println("List Telugu Movies are");
		/*System.out.println(teluguMovies[0] + " " + teluguMovies[1] + " " + teluguMovies[2] + " " + teluguMovies[3] + " " + teluguMovies[4] + " " + teluguMovies[5] + " " + 
		teluguMovies[6] + " " + teluguMovies[7] + " " + teluguMovies[8] + " " + teluguMovies[9] + " " + teluguMovies[10] + " " + teluguMovies[11] + " " + teluguMovies[12] 
		+ " " + teluguMovies[13] + " " + teluguMovies[14] + " " + teluguMovies[15] + " " + teluguMovies[16] + " " + teluguMovies[17] + " " + teluguMovies[18] + " " + 
		teluguMovies[19] + " " + teluguMovies[20] + " " + teluguMovies[21] + " " + teluguMovies[22] + " " + teluguMovies[23] + " " + teluguMovies[24] );
		System.out.println(teluguMovies.length);*/
		getTeluguMovies(teluguMovies);
		
		
		System.out.println("------------------------");
		System.out.println("List English Movies are");
		/*System.out.println(englishMovies[0] + " " + englishMovies[1] + " " + englishMovies[2] + " " + englishMovies[3] + " " + englishMovies[4] + " " + englishMovies[5] + " " + 
		englishMovies[6] + " " + englishMovies[7] + " " + englishMovies[8] + " " + englishMovies[9] + " " + englishMovies[10] + " " + englishMovies[11] + " " + englishMovies[12] 
		+ " " + englishMovies[13] + " " + englishMovies[14] + " " + englishMovies[15] + " " + englishMovies[16] + " " + englishMovies[17] + " " + englishMovies[18] + " " + 
		englishMovies[19] + " " + englishMovies[20] + " " + englishMovies[21] + " " + englishMovies[22] + " " + englishMovies[23] + " " + englishMovies[24] );
		System.out.println(englishMovies.length);*/
		getEnglishMovies(englishMovies);
		
		
		System.out.println("------------------------");
		System.out.println("List Malayalam Movies are");
		/*System.out.println(malayalumMovies[0] + " " + malayalumMovies[1] + " " + malayalumMovies[2] + " " + malayalumMovies[3] + " " + malayalumMovies[4] + " " + malayalumMovies[5] + " " + 
		malayalumMovies[6] + " " + malayalumMovies[7] + " " + malayalumMovies[8] + " " + malayalumMovies[9] + " " + malayalumMovies[10] + " " + malayalumMovies[11] + " " + malayalumMovies[12] 
		+ " " + malayalumMovies[13] + " " + malayalumMovies[14] + " " + malayalumMovies[15] + " " + malayalumMovies[16] + " " + malayalumMovies[17] + " " + malayalumMovies[18] + " " + 
		malayalumMovies[19] + " " + malayalumMovies[20] + " " + malayalumMovies[21] + " " + malayalumMovies[22] + " " + malayalumMovies[23] + " " + malayalumMovies[24] );
		System.out.println(malayalumMovies.length);*/
		getMalayalamMovies(malayalumMovies);
		
		System.out.println("Main ended");
	

	}
	public static void getKannadaMovies(String kannadaMovies[]){
		System.out.println("Inside getKannadaMovies");
		 for(String kannadaMovie:kannadaMovies){
			 System.out.println(kannadaMovie);
		 }
	}
	public static void getHindiMovies(String hindiMovies[]){
		System.out.println("Inside getHindiMovies");
		 for(String hindiMovie:hindiMovies){
			 System.out.println(hindiMovie);
		 }	
	}
    public static void getTeluguMovies(String teluguMovies[]){
		System.out.println("Inside getTeluguMovies");
		 for(String teluguMovie: teluguMovies){
			 System.out.println(teluguMovie);
		 }	
	}
	public static void getEnglishMovies(String englishMovies[]){
		System.out.println("Inside getEnglishMovies");
		 for(String englishMovie: englishMovies){
			 System.out.println(englishMovie);
		 }	
	}
	public static void getMalayalamMovies(String malayalumMovies[]){
		System.out.println("Inside getMalayalamMovies");
		 for(String malayalumMovie: malayalumMovies){
			 System.out.println(malayalumMovie);
		 }		 
	}
}