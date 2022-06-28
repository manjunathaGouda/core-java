class Ncr {

public static void main(String arg[]) {                // npr=n!/(n-r)
                                                        // ncr=n!/r!(n-r)
int ncr=fact(5)/(fact(3)*fact(5-3));
System.out.println(ncr);

}
//method decleration
public static int fact(int factNumber){
	int f=1;
	for(int i=1; i<=factNumber;i++){
		f=f*i;
	}
	return f;
}
}
