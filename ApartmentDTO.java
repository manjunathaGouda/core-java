public class ApartmentDTO
{
	public ApartmentDTO(){
		System.out.println("Apartment object is created");
	}
		
	private int id;
//	private String name;
	//private String owner;

	
	// we right getter by having a prefix as
	//public returnType getVariableName(){
	//}
		public int getId(){
		return id;
	}
		public void setId(int id){
		this.id=id;
	}
	
		//we right setter by having a prefix as setter
		//public void setVariableName(datatype variableName){
				//this.variableName = variableName;
		//}
	
}