package d0527;

public class AccumulaterMain {
	public static void main(String[] args) {
		
		System.out.println(Accumulator.getgTotal());
		
		System.out.println(Accumulator.gTotal);
		
		Accumulator a1 = new Accumulator();
		
		Accumulator a2 = new Accumulator();
		
		a1.accumulate(10);
		System.out.println("a1: total " + a1.total);
		System.out.println("a1: gTotal " + a1.gTotal);
		
		a2.accumulate(20);
		System.out.println("a2: total " + a2.total);
		System.out.println("a2: gTotal " + a2.gTotal);
		
		
		System.out.println( "static gTotal " + Accumulator.gTotal);
			
		System.out.println("총누적: " + Accumulator.getgTotal());
		System.out.println("a1 누적: " + a1.total);
		System.out.println("a2 누적: " + a2.total);
	}
}
