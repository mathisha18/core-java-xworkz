class SuperMarketA{


	
	public static void main(String market[]){
	// vegatables
     String vegatables[]= {"Potato","Carrot","Beans","Brinjal","Onion"};
	
	// biscuits
	 String biscuits[]= {"goodday","marigold","tiger","oreo","parle-g","sunfeast","monaco","hide&seek","krackjack","happy-happy"};
	
    // perfume
	 String perfumes[]= {"chanel","prada","lancome","hugo","eros","aramis","calvin klein","le labo","hermes","dolce&gabbana"};
	
	//groceries
	 String groceries[]= {"Milk","Eggs","Bread","Jam","Rice","Oil","Ghee","Dal","Noodels","Ragi"};
	
	//cosmetics
	 String cosmetics[]= {"Moisturizer","Primer","Concealer","Foundation","Powder","Blush","Cheek Coloring","Lipstick","Lip Blam",
	"Lip gloss","Mascara","Cc Cream","SunCream","Nail Polish","Mac Brush","Eye Liner","Mirror","Scrub","Highlighter","Facewash",
	"Tanning lotion","Toner","Puff","Kajal","Eye shadow"};
	
		System.out.println("Main started");
		System.out.println("------------------------");
		System.out.println("List of vegatables are");
	    //System.out.println(vegatable[0] + " " + vegatable[1] + " " + vegatable[2] + " " + vegatable[3] + " " + vegatable[4] );
	    //System.out.println(vegatable.length);
		getVegatables(vegatables);
		
		System.out.println("------------------------");
		System.out.println("List of biscuits are");
	    //System.out.println(biscuit[0] + " " + biscuit[1] + " " + biscuit[2] + " " + biscuit[3] + " " + biscuit[4] + " " + biscuit[5] + " " +
		//biscuit[6] + " " + biscuit[7] + " " + biscuit[8] + " " + biscuit[9] );
	    //System.out.println(biscuit.length);
		getBiscuits(biscuits);
		
		System.out.println("------------------------");
		System.out.println("List of perfumes are");
		//System.out.println(perfume[0] + " " + perfume[1] + " " + perfume[2] + " " + perfume[3] + " " + perfume[4] + " " + perfume[5] + " " +
		//perfume[6] + " " + perfume[7] + " " + perfume[8] + " " + perfume[9]);
		//System.out.println(perfume.length);
		getPerfumes(perfumes);

		System.out.println("------------------------");
		System.out.println("List of groceries are");
		//System.out.println(grocery[0] + " " + grocery[1] + " " + grocery[2] + " " + grocery[3] + " " + grocery[4] + " " + grocery[5] + " " + 
		//grocery[6] + " " + grocery[7] + " " + grocery[8] + " " + grocery[9]);
		//System.out.println(grocery.length);
		getGroceries(groceries);
		
		System.out.println("------------------------");
		System.out.println("List of Cosmetics are");
		//System.out.println(cosmetic[0] + " " + cosmetic[1] + " " + cosmetic[2] + " " + cosmetic[3] + " " + cosmetic[4] + " " + cosmetic[5] + " " + 
		//cosmetic[6] + " " + cosmetic[7] + " " + cosmetic[8] + " " + cosmetic[9] + " " + cosmetic[10] + " " + cosmetic[11] + " " + cosmetic[12] 
		//+ " " + cosmetic[13] + " " + cosmetic[14] + " " + cosmetic[15] + " " + cosmetic[16] + " " + cosmetic[17] + " " + cosmetic[18] + " " + 
		//cosmetic[19] + " " + cosmetic[20] + " " + cosmetic[21] + " " + cosmetic[22] + " " + cosmetic[23] + " " + cosmetic[24] );
		//System.out.println(cosmetic.length);
		getCosmetics(cosmetics);
		System.out.println("Main ended");

		
		
	}
    public static void getVegatables(String vegatables[]){
		System.out.println("Inside getVegatables");
		 for(String vegatable:vegatables){
			 System.out.println(vegatable);
		 }
	}
	public static void getBiscuits(String biscuits[]){
		System.out.println("Inside getBiscuits");
		 for(String biscuit:biscuits){
			 System.out.println(biscuit);
		 }	
	}
    public static void getPerfumes(String perfumes[]){
		System.out.println("Inside getPerfumes");
		 for(String perfume: perfumes){
			 System.out.println(perfume);
		 }	
	}
	public static void getGroceries(String groceries[]){
		System.out.println("Inside getGroceries");
		 for(String grocery: groceries){
			 System.out.println(grocery);
		 }	
	}
	public static void getCosmetics(String cosmetics[]){
		System.out.println("Inside getCosmetics");
		 for(String cosmetic: cosmetics){
			 System.out.println(cosmetic);
		 }		 
	}

}