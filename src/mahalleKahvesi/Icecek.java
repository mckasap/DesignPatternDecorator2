package mahalleKahvesi;


public abstract class Icecek {
	String tanim="Henüz atanmadı";
	Size mySize;
	protected String getTanim() {
		return tanim;
		}
	
	public Size getSize() {return mySize;}
	public void setSize(Size s) {mySize=s;}
	public abstract double getCost(); 
	
}
