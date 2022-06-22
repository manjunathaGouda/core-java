class BookMovieTester {
	
	String movies[] = {"om","A","Upendra","H2O","Rakta kanniru","ramachari"};
	
public static void main(String []a) {

 BookMyMovie bookMyShow = new BookMyMovie("Rajendra",10,"A","mirchi",5,55);
 System.out.println("Theatre name is "+bookMyShow.theatreName);
 System.out.println("Snack name is "+bookMyShow.snackName);
 
 bookMyShow.showTime(20,"Devi","om");
 bookMyShow.buySnacks("mirchi",5,55);
 bookMyShow.showTime(20,"raju","Upendra");
 bookMyShow.buySnacks("kurkure",10,105);
}

 }