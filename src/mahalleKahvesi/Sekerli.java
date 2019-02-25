package mahalleKahvesi;

public class Sekerli  extends Dekorator{

	protected Icecek icki;
	
	public Sekerli(Icecek icki) {
		this.icki=icki;
	}
	@Override
	public String getTanim() {
		// TODO Auto-generated method stub
		return icki.getTanim() +", Sekerli";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 0.5 + icki.getCost();
	}
	@Override
	public Size getSize() {
		// TODO Auto-generated method stub
		return null;
	}

}
