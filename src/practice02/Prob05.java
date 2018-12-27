package practice02;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		int start;
		int end;
		int n;
		int check;
		int k;
		boolean endGame;
		
		
		
		while(true) {
		start = 1;
		end = 100;
		n = 1;
		k = r.nextInt(100) + 1;
		endGame =true;
		System.out.println("수를 결정하였습니다. 맞추어 보세요");
		while (endGame) {
			System.out.println(start + "-" + end);
			System.out.print(n++ + ">>");
			check = s.nextInt();

			if (check == k) {
				System.out.println("맞았습니다.");
				endGame = false;
			} else if (check > k) {
				System.out.println("더 낮게");
				end = check;
			} else if (check < k) {
				System.out.println("더 높게");
				start = check;
			}
		}
		
		
		
		
		System.out.print("다시하시겠습니까(y/n)>>");
		String answer = s.next();
		if(answer.equals("y")) {
			
		}else if(answer.equals("n")) {
			break;
		}
		
		
		
		
	}

}
}
