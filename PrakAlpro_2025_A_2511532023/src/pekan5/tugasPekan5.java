package pekan5;

public class tugasPekan5 {
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
		    if (i == 0) {
		        System.out.print("#");
		        for (int j = 0; j < 16; j++) {
		            System.out.print("=");
		        }
		        System.out.println("#");
		    } else if (i== 9) {
		    	System.out.print("#");
		    	for (int j = 0; j < 16; j++) {
		    		System.out.print("=");
		    	}
		    	System.out.print("#");
		    } else {
		     	int spasi = 0;
		        int titik = 0;

		        if (i == 1) {
		            spasi = 6;
		            titik = 0;
		        } else if (i == 2) {
		            spasi = 4;
		            titik = 4;
		        } else if (i == 3) {
		            spasi = 2;
		            titik = 8;
		        } else if (i == 4) {
		            spasi = 0;
		            titik = 12; 
		        } else if (i == 5) {
		            spasi = 0;
		            titik = 12;
		        } else if (i == 6) {
		            spasi = 2;
		            titik = 8;
		        } else if (i == 7) {
		            spasi = 4;
		            titik = 4;
                } else if (i == 8) {
		            spasi = 6;
		            titik = 0;
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
		        System.out.println("|");
		    }
		}
    }
}