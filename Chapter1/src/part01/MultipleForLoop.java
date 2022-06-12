package part01;

public class MultipleForLoop {

	public static void main(String[] args) {

//		for(int i=1; i<10; i++) {
//			for(int j=2; j<10; j++) {
//				System.out.print(j + " X "+ i + " = " + i*j + " ");
//			}
//			System.out.println();
//		}
//		System.out.println();
		
		
//		int dan = 2;
//		int count = 1;
//		while( dan <= 9 ) {
//			
//			while( count <= 9 ) {
//				System.out.print(dan + " X "+ count + " = " + dan*count + " ");
//				count++;
//			}
//			System.out.println();
//			count = 1;
//			dan++;
//		}
//		
		
		int x = 1;
		int y = 2;
		while(x<10) {
			
			while(y<10) {	
				System.out.print(y + " X "+ x + " = " + x*y + " ");
				y++;
			}
			y=2;
			x++;
			System.out.println();
		}
	}

}
