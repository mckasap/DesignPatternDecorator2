package mahalleKahvesi;

public class TurkKahvesi extends Icecek {

	
	public  TurkKahvesi(Size s) {
		// TODO Auto-generated constructor stub
		setSize(s);
		tanim="Turk Kahvesi";
	}
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		if(getSize()==Size.Kucuk)
			return 0.99;
		else if(getSize()==Size.Orta)
			return 1.49;
		else
			return 1.99;
	}

}
