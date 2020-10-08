import java.util.Scanner;

class MethOverload{


	double max(double a,int b){return ((a>b)?a:b);}
	double max(double a,double b){return ((a>b)?a:b);}

}
class Maxfind{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		MethOverload mt = new MethOverload();
		while(true){	
			System.out.println("PRESS..\n1: For two integer value\n2: For one integer and one decimal value\n3: For one decimal and one integer value\n4: For two decimal value\n5: Exit");
			int ch = sc.nextInt();

			switch(ch){
				case 1: System.out.println("Input two number: ");
					int a = sc.nextInt();
					int b = sc.nextInt();
					double res = mt.max(a,b);
					System.out.println("Maximum between "+a+" & "+b+" is = "+res);
					break;

				case 2: System.out.println("Input two number: ");
					int c = sc.nextInt();
					double d = sc.nextDouble();
					double res1 = mt.max(c,d);
					System.out.println("Maximum between "+c+" & "+d+" is = "+res1);
					break;

				case 3: System.out.println("Input two number: ");
					double e = sc.nextDouble();
					int f = sc.nextInt();
					double res2 = mt.max(e,f);
					System.out.println("Maximum between "+e+" & "+f+" is = "+res2);
					break;

				case 4: System.out.println("Input two number: ");
					
					double res3 = mt.max(g,h);
					System.out.println("Maximum between "+g+" & "+h+" is = "+res3);
					break;
				case 5: return;

				default: System.out.println("Wrong Input");
					 break;
			}
		}

	}
}
