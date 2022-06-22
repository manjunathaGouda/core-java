class BookMyMovie {

String movies[] = {"om","Galipata","A","Upendra","H2O","Rakta kanniru","Suryavamshi","yajamana"};

int noOfTickets;
static int ticketPrice = 600;
String theatreName;
String movieName;
int totalNoOfTickets;
int totalTicketPrice;

String snacks[] = {"mirchi baji","chips","kurkure","popcorn"};
static int snackPrice =150;
String snackName;
int quantity;
int seatNo;
int totalnoOfSnacks;
int totalSnacks;

public BookMyMovie(String theatreName,int noOfTickets,String movieName,String snackName,int Quantity,int seatNo) {
System.out.println("BookMyMovie object is created");

this.theatreName = theatreName;
this.noOfTickets = noOfTickets;
this.movieName = movieName;

this.snackName = snackName;
this.quantity = quantity;
this.seatNo = seatNo;
}

public int showTime(int noOfTickets,String bookedBy,String movieName) {
	int totalTicketPrice = 0;
System.out.println("inside showTime()......");
System.out.println("Arg 1 : No of Tickets "+noOfTickets);
System.out.println("Arg 2 : booked by "+bookedBy);
System.out.println("Arg 3 : movie name "+movieName);

for(int m = 0;m<movies.length; m++) {

if(movieName == movies[m]) {
System.out.println("Movie name matched");

if(noOfTickets < totalNoOfTickets) {
totalTicketPrice = noOfTickets*ticketPrice;
noOfTickets = totalNoOfTickets-noOfTickets;
System.out.println("For Movie : " +movieName+ " No of tickets are that are remaining :"+noOfTickets + " Total Price is "+totalTicketPrice);
  
  }
  else {
  System.out.println("isht ticket illa...");
  }
  
  }
  else {
  System.out.println("movie is not available");
  }
  }
  return totalTicketPrice;
  }
  
  public int buySnacks(String snacksName, int quantity,int bookedSeatNo) {
	  int totalSnackPrice = 0;
	  System.out.println("Arg 1 : Name of the snack "+snackName);
	  System.out.println("Arg 2 : Quantity of snack "+quantity);
	  System.out.println("Arg 3 : booked by seat No "+bookedSeatNo);
	  
	  for(int i=0; i<snacks.length; i++) {
		  if(snackName == snacks[i])
		  {
			  System.out.println("The snack Name is matched");
			  
			  if(quantity<totalnoOfSnacks) {
				  totalSnackPrice = quantity * snackPrice;
				  totalnoOfSnacks = totalnoOfSnacks - quantity;
				  System.out.println("For snacks : "+quantity + "snacks remaining "+ totalnoOfSnacks +"total price is "+totalTicketPrice);
	}
	else {
		System.out.println("snacks kali aagyavo");
		
	}
		  }
		  else{
			  System.out.println("snack is not Available");
		  }
	  }
	  return totalSnackPrice;
  }
}

