import java.util.Scanner;

public class nestedloop {
	public static void main(String[] args) {
		int table1[][];
		int table2[][];
		int table3[][];
		int rows = 0;
		int columns = 0;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter the no of rows: ");
		rows = sc.nextInt();
		System.out.print("Enter the no of columns: ");
		columns = sc.nextInt();
		table1 = new int[rows][columns];
		table2 = new int[rows][columns];
		table3 = new int[rows][columns];
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print("Enter table 1 data, item on row "+(i+1)+", column "+(j+1)+": ");
				table1[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print("Enter table 2 data, item on row "+(i+1)+", column "+(j+1)+": ");
				table2[i][j] = sc.nextInt();
				table3[i][j] = table1[i][j]+table2[i][j];
			}
		}
		
		System.out.println("Table 1 data:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(table1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Table 2 data:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(table2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Table 3 - data summed:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(table3[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();

	}
}
