class Speaker{
static String name = "BOAT";
static double price = 4500.0;
static String colour = "Pink";
static boolean isConnected;
static int maxVolume = 6;
static int currentVolume;
static int minVolume;
public static void onOrOff()
{
     System.out.println("Invoking   onoroff");
     if(isConnected == false)
{
     isConnected = true;
         System.out.println("Speaker is turned on...Available for connection");
}
else if(isConnected == true)
{
isConnected = false;
System.out.println("Speaker is turned off...");
}
}
public static void main(String a[]){
	onOrOff();
	increaseVolume();
	increaseVolume();
	increaseVolume();
	increaseVolume();
	increaseVolume();
	increaseVolume();
	decreaseVolume();
	decreaseVolume();
	decreaseVolume();
	decreaseVolume();
	decreaseVolume();
	decreaseVolume();
	onOrOff();
}

public static void increaseVolume(){
	System.out.println("main method started");
	if(isConnected = true){
		System.out.println("speaker is turned on");
		if(currentVolume < maxVolume){
			currentVolume = currentVolume + 1;
			System.out.println("The current volume is: "+currentVolume);
		}
		else{
			System.out.println("The Speaker reached max volume");
		}
	}
	else{
		System.out.println("gube speaker on maadu");
	}
	System.out.println("main method ended");
}
public static void decreaseVolume(){
	System.out.println("main method started");
	if(isConnected = true){
		System.out.println("Speaker is turned on");
		if(currentVolume > minVolume){ 
			currentVolume = currentVolume - 1;
			System.out.println("The current volume is: "+currentVolume);
		}
		else{
			System.out.println("The speaker reached min volume");
		}
	}
	else{
		System.out.println("gube speaker on maadu");
		}
	System.out.println("main method ended");
}
}
			
			

