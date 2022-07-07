class CarryBagTester {
	public static void main(String []a){
	
		CarryBagDTO carry = new CarryBagDTO();
		//carry.name = "Baba's carryBag";
		//carry.price=5;
		carry.setName("Baba's carryBag");
		carry.setPrice(5);
		
		System.out.println(carry.getName()+" "+carry.getPrice());
		//carry.holdThings();
	}
}
