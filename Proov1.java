public class Proov1{
	public static void main(String[] args){
		Ring Ratas1=new Ring(5);
		Ring Ratas2=new Ring(10);
		System.out.println(Ratas1.pindala()+" "+Ratas1.ümbermõõt());
		System.out.println(Ratas2.pindala()+" "+Ratas2.ümbermõõt());
		System.out.println(Ratas1.Vastus());
		System.out.println(Ratas2.Vastus());
	}
}

//[georvalg@greeny t02klass]$ java Proov1
//78.5 31.400000000000002
//314.0 62.800000000000004
//Ringi raadiusega 5.0 ümbermõõt on 31.400000000000002 ja pindala on 78.5.
//Ringi raadiusega 10.0 ümbermõõt on 62.800000000000004 ja pindala on 314.0.