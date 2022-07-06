class $ShowRoom {

 int showRoomId;    // object member
 static String name= "WoodLands";  // static member
 static int noOFBranches = 56;  
 String location;
 long contactNo;
 
 public $ShowRoom () {
 System.out.println("ShowRoom object is created");
 }
 
 public static void main(String a[]){
 
 $ShowRoom showRoom = new ShowRoom ();
 showRoom.showRoomId = 1;
 showRoom.location ="commercial street";
 showRoom.contactNo = 78526225461L;
 
System.out.println("The showRoomId of the ShowRoom is : "+showRoom.showRoomId);
System.out.println("The name of the ShowRoom is : "+$ShowRoom.name);
System.out.println("The noOFBranches of the ShowRoom is : "+$ShowRoom.noOFBranches);
System.out.println("The location of the ShowRoom is : "+showRoom.location);
System.out.println("The contactNo of the ShowRoom is : "+showRoom.contactNo);
 
 $ShowRoom showRoom = new ShowRoom ();
 showRoom1.showRoomId = 2;
 showRoom1.location ="Dharwad";
 showRoom1.contactNo = 98655552241L;
 
 System.out.println("The showRoomId of the ShowRoom is : "+$ShowRoom.showRoomId);
System.out.println("The name of the ShowRoom is : "+$ShowRoom.name);
System.out.println("The noOFBranches of the ShowRoom is : "+showRoom.noOFBranches);
System.out.println("The location of the ShowRoom is : "+showRoom.location);
System.out.println("The contactNo of the ShowRoom is : "+showRoom.contactNo);
 
}

}
 
 
 
 
 
 
 