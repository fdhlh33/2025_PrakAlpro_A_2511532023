package pekan5;

public class tugasPekan5 {
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
		    if (i == 0 || i == 9) {
		        System.out.print("#");
		        for (int j = 0; j < 16; j++) {
		            System.out.print("=");
		        }
		        System.out.print("#");
		    } else {
                int spasi = 0;
                int titik = 0;
               switch (i) {
                   case 1:
                   case 8:
                       spasi = 6;
                       titik = 0;
                       break;
                   case 2:
                   case 7:
                       spasi = 4;
                       titik = 4;
                       break;
                   case 3:
                   case 6:
                       spasi = 2;
                       titik = 8;
                       break;
                   case 4:
                   case 5:
                       spasi = 0;
                       titik = 12; 
                       break;
               }
		        System.out.print("|");
		        for (int j = 0; j < spasi; j++) {
		            System.out.print(" ");
		        }
		        System.out.print("<>");

		        for (int j = 0; j < titik; j++) {
		            System.out.print(".");
		        }
		        System.out.print("<>");

		        for (int j = 0; j < spasi; j++) {
		            System.out.print(" ");
		        }
		        System.out.print("|");
		    }
		    System.out.println();
		}
    }
}