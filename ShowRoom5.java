class ShowRoom5 {

int id;
String location;
long contactNo;

static String name= "Adidas";
static int noOfBranches=45;

public ShowRoom5(int id, String location,long contactNo) {
	
	//this keyword help compiler to point to instance variables.
	
  this.id = id;
  this.location=location;
  this.contactNo=contactNo;
  
  }
public static void main(String []a) {
	  
ShowRoom5 showRoom5 = new ShowRoom5(5624,"Banglore",78562325464L);
System.out.println("id:"+showRoom5.id + "\n"+ "location:"+showRoom5.location+ "\n"+  "contactNo:"+showRoom5.contactNo+"\n");

}
}
