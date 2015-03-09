import java.util.Scanner;

class procession{
	public static void main (String [] args){
		int [] p1 = new int[4];
		int [] p2 = new int[4];
		int [] p3 = new int[4];
		int i = 0;
		String [] P1 = new String[4];
		String [] P2 = new String[4];
		String I;

		System.out.println("ˆê‚Â–Ú‚Ìs—ñ‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢ —á:1 1 1 1");
		Scanner scan = new Scanner(System.in);
		P1[0] = scan.next();
		p1[0] =Integer.parseInt(P1[0]);
		P1[1] = scan.next();
		p1[1] =Integer.parseInt(P1[1]);
		P1[2] = scan.next();
		p1[2] =Integer.parseInt(P1[2]);
		P1[3] = scan.next();
		p1[3] =Integer.parseInt(P1[3]);

		System.out.println("“ñ‚Â–Ú‚Ìs—ñ‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢ —á:1 1 1 1");
		P2[0] = scan.next();
		p2[0] =Integer.parseInt(P2[0]);
		P2[1] = scan.next();
		p2[1] =Integer.parseInt(P2[1]);
		P2[2] = scan.next();
		p2[2] =Integer.parseInt(P2[2]);
		P2[3] = scan.next();
		p2[3] =Integer.parseInt(P2[3]);

		System.out.println("‘«‚µZ‚È‚ç 1 ‚ğŠ|‚¯Z‚È‚ç 2 ‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		I = scan.next();
		i =Integer.parseInt(I);
		if(i == 1){
			System.out.println("‘«‚µZ");
			p3 [0] = p1[0] + p2[0];
			p3 [1] = p1[1] + p2[1];
			p3 [2] = p1[2] + p2[2];
			p3 [3] = p1[3] + p2[3];
			System.out.print(P1[0] + " " + P1[1] + "   ");
			System.out.print(P2[0] + " " + P2[1] + "   ");
			System.out.println(p3[0] + " " + p3[1]);
			System.out.print("    " + "+");
			System.out.println("     " + "=");
			System.out.print(P1[2] + " " + P1[3] + "   ");
			System.out.print(P2[2] + " " + P2[3] + "   ");
			System.out.println(p3[2] + " " + p3[3]);
		}
		if(i == 2){
			System.out.println("Š|‚¯Z");
			p3 [0] = p1[0] * p2[0] + p1[1] * p2[2];
			p3 [1] = p1[0] * p2[1] + p1[1] * p2[3];
			p3 [2] = p1[2] * p2[0] + p1[3] * p2[2];
			p3 [3] = p1[2] * p2[1] + p1[3] * p2[3];
			System.out.print(P1[0] + " " + P1[1] + "   ");
			System.out.print(P2[0] + " " + P2[1] + "   ");
			System.out.println(p3[0] + " " + p3[1]);
			System.out.print("    " + "+");
			System.out.println("     " + "=");
			System.out.print(P1[2] + " " + P1[3] + "   ");
			System.out.print(P2[2] + " " + P2[3] + "   ");
			System.out.println(p3[2] + " " + p3[3]);
		}
	}
}