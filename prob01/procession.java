import java.util.Scanner;

class procession{
	public static void main (String [] args){
		int [][] p = new int[3][4];
		int i = 0;
		String [][] P = new String[2][4];
		String I;

		System.out.println("一つ目の行列を入力してください 例:1 1 1 1");
		Scanner scan = new Scanner(System.in);
		P[0][0] = scan.next();
		p[0][0] =Integer.parseInt(P[0][0]);
		P[0][1] = scan.next();
		p[0][1] =Integer.parseInt(P[0][1]);
		P[0][2] = scan.next();
		p[0][2] =Integer.parseInt(P[0][2]);
		P[0][3] = scan.next();
		p[0][3] =Integer.parseInt(P[0][3]);

		System.out.println("二つ目の行列を入力してください 例:1 1 1 1");
		P[1][0] = scan.next();
		p[1][0] =Integer.parseInt(P[1][0]);
		P[1][1] = scan.next();
		p[1][1] =Integer.parseInt(P[1][1]);
		P[1][2] = scan.next();
		p[1][2] =Integer.parseInt(P[1][2]);
		P[1][3] = scan.next();
		p[1][3] =Integer.parseInt(P[1][3]);

		System.out.println("足し算なら 1 を掛け算なら 2 を入力してください");
		I = scan.next();
		i =Integer.parseInt(I);
		if(i == 1){
			System.out.println("足し算");
			p[2][0] = p[0][0] + p[1][0];
			p[2][1] = p[0][1] + p[1][1];
			p[2][2] = p[0][2] + p[1][2];
			p[2][2] = p[0][3] + p[1][3];
			System.out.print(P[0][0] + " " + P[0][1] + "   ");
			System.out.print(P[1][0] + " " + P[1][1] + "   ");
			System.out.println(p[2][0] + " " + p[2][1]);
			System.out.print("    " + "+");
			System.out.println("     " + "=");
			System.out.print(P[0][2] + " " + P[0][3] + "   ");
			System.out.print(P[0][2] + " " + P[0][3] + "   ");
			System.out.println(p[2][2] + " " + p[2][2]);
		}
		if(i == 2){
			System.out.println("掛け算");
			p[2][0] = p[0][0] * p[1][0] + p[0][1] * p[1][2];
			p[2][1] = p[0][0] * p[1][1] + p[0][1] * p[1][3];
			p[2][2] = p[0][2] * p[1][0] + p[0][3] * p[1][2];
			p[2][3] = p[0][2] * p[1][1] + p[0][3] * p[1][3];
			System.out.print(P[0][0] + " " + P[0][1] + "   ");
			System.out.print(P[1][0] + " " + P[1][1] + "   ");
			System.out.println(p[2][0] + " " + p[2][1]);
			System.out.print("    " + "+");
			System.out.println("     " + "=");
			System.out.print(P[0][2] + " " + P[0][3] + "   ");
			System.out.print(P[1][2] + " " + P[1][3] + "   ");
			System.out.println(p[2][2] + " " + p[2][3]);
		}
	}
}