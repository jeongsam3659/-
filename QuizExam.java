/**
������ �����ϸ� 
�ϴ�

1 .���� �Ӵ� +1000
 �Ʒ��� ���� ����

	1) �ָ�, 2) ����, 3) ���ڱ� ,0) �������� 
	����� ���� :

2. ���� �ݾ� ����

3. ��� ������ enter�� �Է�

4. ���������� ����
 you : �ָ�, com : ����

 �¸��� �ܾ�??

 5. �޴��� �̵�.
*/

import java.io.*;

public class QuizExam{
	public static void main (String []ar)throws IOException{
		
		BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));

		//���ӸӴ� ����
		int money = 1000;
		int batt = 0;

		int game = 0;
		int com =0;
		String comch = "";
		String you ="";
		
		boolean choose = true;

		while( choose){
			System.out.println( "1: ���� ");
			System.out.println( "2: ���� ");
			System.out.println( "3: �� ");
			System.out.print( "0: ������ ���� ");


				System.out.println();
				System.out.println(" ----- ���� ���� �� �� �ϳ��� �������ּ��� -----");
				game = Integer.parseInt(br.readLine());	

					switch(game){
						case 1 :
							 you = ("����");
							break;
						case 2 :
							you = ("����");
							break;
						case 3 :
							you = ("��");
							break;

						case 0 :// ���� ���� ó��
							game = 0;
							System.out.println();
							System.out.print(" ���� ������ �����Ͻðڽ��ϱ� ???  [ y /n ]");
								char gmover = (char)(System.in.read());
									System.in.read(); System.in.read();// enter�� ó��
								if ( gmover == 'y' || gmover == 'Y' ){
								choose = false;
									}
								System.out.println();
								continue ;	
						default :// ���Է½�Ű��
							System.out.println();
							System.out.println(" ���ڸ� �ٽ� �Է��ϼ��� . [1] [2] [3] ");
							continue ;
					
				}//end switch 
				System.out.println(" ����� " + you + " �� �����Ͽ����ϴ�." );

				System.out.println();
				System.out.println("���� �ݾ��� �Է��ϼ���." );
					batt = Integer.parseInt(br.readLine());
						
						if(batt > money){// ���� > �����Ͻ� �ڵ�����
							System.out.println();
							System.out.println(" ���� �ݾ��� ���� ���� ������ Ů�ϴ�." + money +
								" ��ŭ �ڵ����� �����˴ϴ� ");
							batt = money;
						}
				
				System.out.println();
				System.out.println(" enter�� ���� ���Ӱ���� Ȯ���ϼ���.");
				System.in.read(); System.in.read();//\n �� ����			

					com = (int)(Math.random()*3 +1);// 1~3������ ����
					switch (com){
						case 1 :
							comch = (" ���� ");
							break;
						case 2 :
							comch = (" ���� ");
							break;
						case 3 :
							comch = (" �� ");
						}//end com���� switch 

				System.out.println("");
				System.out.println(" ��� : ����� " + you + " �̰�, ��ǻ�ʹ� " +
					 comch + " �Դϴ�. ");// ���


				if((game ==1 && com == 2) || 
						(game == 2 && com ==3) ||
							(game ==3 && com ==1)){
								System.out.println();
								System.out.println(" ����� �̰���ϴ� . +" + batt); 
								money += batt;
							}else if((game ==1 && com == 3) || 
											(game == 2 && com == 1) ||
												(game == 3 && com == 2)){
								System.out.println();
								System.out.println(" ����� �����ϴ� . -" + batt); 
								money -= batt;
								
							}else{
								System.out.println();
								System.out.println(" ���� �����ϴ�. . " ); 
							}// �� ��� ����.

				System.out.println();
				System.out.println("���� ���� �ܾ��� :" + money + " �Դϴ�.");



		}//end while 
		System.out.println();
		System.out.println("���α׷��� �����մϴ�."); 

	}//end main
}