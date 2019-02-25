package mahalleKahvesi;

public class Kahvehane {

	public static void main(String[] args) {
	
		Icecek kv= new TurkKahvesi(Size.Buyuk);
		System.out.println(kv.getTanim() +" " +kv.getCost());
		
		kv= new Tuzlu(kv);
		System.out.println(kv.getTanim() +" " +kv.getCost());
		
		
		
		
	}
}
