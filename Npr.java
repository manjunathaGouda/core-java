class _Npr{
                                                          //method
public static void main(String arg[]) {                // npr=n!/(n-r)
                                                      // ncr=n!/r!(n-r)
int npr=fact(5)/fact(5-2);
System.out.println(npr);

}
public static int fact(int factNumber){
	int f=1;
	for(int i=1; i<=factNumber;i++){
		f=f*i;
	}
	return f;
}
}

														