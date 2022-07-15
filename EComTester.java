import java.util.Scanner;
class EComTester
{
	public static void main(String a[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre the No of item : ");
		int size =sc.nextInt();
		E_commerce ec = new E_commerce(size);
		for(int i=0; i<size;i++)
		{
			System.out.println("Entre the ID of item : ");
			int id = sc.nextInt();
			System.out.println("Entre a Type of the item : ");
			String type = sc.next();
			System.out.println("Entre a Name of the item : ");
			String name = sc.next();
			System.out.println("Entre the cost of item : ");
			int price = sc.nextInt();
			
			OrderDTO odr = new OrderDTO();
			odr.setId(id);
			odr.setType(type);
			odr.setName(name);
			odr.setPrice(price);
			
			ec.shopping(odr);
			
		}
		 ec.getItem();
		System.out.println("Entre the ID of item : ");
			int existingid = sc.nextInt();
			System.out.println("Entre a Type of the item : ");
			String existingtype = sc.next();
			ec.updateTypeById(existingid, existingtype);
	       
			
			System.out.print("Enter the existing type for delete order: ");
	   String existingType1 = sc.next();
	   ec.deleteOrderByType(existingType1);
	   ec.getItem();
	   
	   System.out.print("Enter the existing Name for delete order: ");
	   String existingName1 = sc.next();
	   ec.deleteOrderByName(existingName1);
	   ec.getItem();
	}
}