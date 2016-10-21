package fcu.iecs.oop.tiida;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		NissanTiida Nissa = new NissanTiida();
		Scanner sc = new Scanner(System.in);
		int i,num;
		System.out.print("請輸入想要呼叫幾次:");
		num = sc.nextInt();
		for( i = 1 ; i <= num ; i++ )
		{
			Nissa.Tiida(i);
			System.out.println("--------------------------");
		}
		sc.close();
	}

}
