public class Ring{
	double r;
	public Ring(double raadius){
		if(raadius<=0){throw new RuntimeException("Sobimatu pikkus");}
		r=raadius;
	}
	public double pindala(){
		return (3.14*r*r);
	}

	public double ümbermõõt(){
		return 2*3.14*r;
	}
	public String Vastus(){
		return "Ringi raadiusega "+r+" ümbermõõt on "+
		       ümbermõõt()+" ja pindala on "+pindala()+".";
	}
}