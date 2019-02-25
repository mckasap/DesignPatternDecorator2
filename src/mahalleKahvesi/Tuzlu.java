package mahalleKahvesi;

public class Tuzlu  extends Dekorator{

protected Icecek icki;
	
	public Tuzlu(Icecek icki) {
		this.icki=icki;
	}
	
	
	@Override
	public String getTanim() {
		// TODO Auto-generated method stub
		return icki.getTanim() +", Tuzlu";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		if(getSize()==Size.Kucuk)
			return 0.29+ icki.getCost();
		else if(getSize()==Size.Orta)
			return .49 + icki.getCost();
		else
			return .69 + icki.getCost();
	}

	@Override
	public Size getSize() {
		// TODO Auto-generated method stub
		return icki.getSize();
	}
}
