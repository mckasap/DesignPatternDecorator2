package mahalleKahvesi;

public abstract class Dekorator  extends Icecek{
	protected Icecek icki;
	public abstract String getTanim();
	public abstract Size getSize();
}
