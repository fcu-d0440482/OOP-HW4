package fcu.iecs.oop.password;
import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		int i;
		PasswordEncorder pass = new PasswordEncorder();
		String name;
		sc = new Scanner(System.in);
		do{
			System.out.println("請輸入字串(如想離開,請輸入exit)");
			name = sc.nextLine();
			i = name.compareToIgnoreCase("exit");
			if( i != 0 )
			{
				pass.setName(name);
			}
			
		}while( i != 0 );

	}

}
