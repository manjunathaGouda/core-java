class WeaponsTesterDTO
{
	public static void main(String a[])
	{
		
		WeaponsDTO w = new WeaponsDTO();
		w.setName("Doddamma");
		w.setPrice(20000.00);
		w.setColor("Black");
		w.setNoOfBullets(100);
		
		System.out.println(w.getName()+"\n"+w.getPrice()+"\n"+w.getColor()+"\n"+w.getNoOfBullets());
		//w.shootingPurpose();
	}
	
	
}