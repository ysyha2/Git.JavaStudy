package myobj.seotda;

public class Check {
	
	public Check(Player player) {
		int len;
		String card1;
		String card2;
		char text1;
		char text2;
		int number1;
		int number2;

		len = player.player_card.get(0).length();
		card1 = player.player_card.get(0);
		card2 = player.player_card.get(1);
		text1 = player.player_card.get(0).charAt(0);
		text2 = player.player_card.get(1).charAt(0);
		number1 = (player.player_card.get(0).charAt(len-1) - '0');
		number2 = (player.player_card.get(1).charAt(len-1) - '0');
		if(text1 == '광' && text2 == '광' ) 
		{
			if((number1 == 3 && number2 == 8) || (number2 == 3 && number1 == 8))
			{
				player.rank = 1;
				System.out.println(player + "의 패는 38광땡입니다.");
			}
			
			else if((number1 == 1 && number2 == 3) || (number2 == 3 && number1 == 1))
			{
				player.rank = 2;
				System.out.println(player + "의 패는 13광땡입니다.");
			}
			
			else
			{
				player.rank = 2;
				System.out.println(player + "의 패는 18광땡입니다.");
			}
			
		}
		
		else if(number1 == number2)
		{
			if(number1 == 0)
			{
				System.out.println(player + "의 패는 장땡입니다.");
				player.rank = 3;
			}
			
			else if(number1 == 9)
			{
				System.out.println(player + "의 패는 9땡입니다.");
				player.rank = 4;
			}
			
			else if(number1 == 8)
			{
				System.out.println(player + "의 패는 8땡입니다.");
				player.rank = 5;
			}
			
			else if(number1 == 7)
			{
				System.out.println(player + "의 패는 7땡입니다.");
				player.rank = 6;
			}
			
			else if(number1 == 6)
			{
				System.out.println(player + "의 패는 6땡입니다.");
				player.rank = 7;
			}
			
			else if(number1 == 5)
			{
				System.out.println(player + "의 패는 5땡입니다.");
				player.rank = 8;
			}
			
			else if(number1 == 4)
			{
				System.out.println(player + "의 패는 4땡입니다.");
				player.rank = 9;
			}
			
			else if(number1 == 3)
			{
				System.out.println(player + "의 패는 3땡입니다.");
				player.rank = 10;
			}
			
			else if(number1 == 2)
			{
				System.out.println(player + "의 패는 2땡입니다.");
				player.rank = 11;
			}
			
			else
			{
				System.out.println(player + "의 패는 1땡입니다.");
				player.rank = 12;
			}
	
		}
		
		else if((number1 == 1 && number2 == 2) || (number2 == 2 && number1 == 1))
		{
			System.out.println(player + "의 패는 알리입니다.");
			player.rank = 13;
		}
		
		else if((number1 == 1 && number2 == 4) || (number2 == 4 && number1 == 1))
		{
			System.out.println(player + "의 패는 독사입니다.");
			player.rank = 14;
		}
		
		else if((number1 == 1 && number2 == 9) || (number2 == 9 && number1 == 1))
		{
			System.out.println(player + "의 패는 구삥입니다.");
			player.rank = 15;
		}
		
		else if((number1 == 1 && number2 == 0) || (number2 == 0 && number1 == 1))
		{
			System.out.println(player + "의 패는 장삥입니다.");
			player.rank = 16;
		}
		
		else if((number1 == 4 && number2 == 0) || (number2 == 0 && number1 == 4))
		{
			System.out.println(player + "의 패는 장사입니다.");
			player.rank = 17;
		}
		
		else if((number1 == 4 && number2 == 6) || (number2 == 6 && number1 == 4))
		{
			System.out.println(player + "의 패는 세륙입니다.");
			player.rank = 18;
		}
		
		
		else if(text1 == '특' && text2 == '특')
		{
			if((number1 == 4 && number2 == 9) || (number1 == 9 && number2 == 4)) {
				System.out.println(player + "의 패는 멍텅구리 사구입니다.");
				player.rank = 100;
			}
			
			else if((number1 == 4 && number2 == 7) || (number1 == 7 && number2 == 4)) {
				System.out.println(player + "의 패는 암행어사입니다.");
				player.rank = 100;
			}
			
		}
		
		else if( ((text1 == '특' && text2 == '광') || (text1 == '광' && text2 == '특'))
				&& ((number1 == 3 && number2 == 7) || (number1 == 7 && number2 == 3)))
		{
			System.out.println(player + "의 패는 땡잡이입니다.");
			player.rank = 100;
		}
		
		else if((number1 + number2)%10 == 9)
		{
			System.out.println(player + "의 패는 갑오입니다.");
			player.rank = 19;
		}
		
		else if((number1 + number2)%10 == 8)
		{
			System.out.println(player + "의 패는 여덟끗입니다.");
			player.rank = 20;
		}
		else if((number1 + number2)%10 == 7)
		{
			System.out.println(player + "의 패는 일곱끗입니다.");
			player.rank = 21;
		}
		else if((number1 + number2)%10 == 6)
		{
			System.out.println(player + "의 패는 여섯끗입니다.");
			player.rank = 22;
		}
		else if((number1 + number2)%10 == 5)
		{
			System.out.println(player + "의 패는 다섯끗입니다.");
			player.rank = 23;
		}
		else if((number1 + number2)%10 == 4)
		{
			System.out.println(player + "의 패는 네끗입니다.");
			player.rank = 24;
		}
		else if((number1 + number2)%10 == 3)
		{
			System.out.println(player + "의 패는 세끗입니다.");
			player.rank = 25;
		}
		else if((number1 + number2)%10 == 2)
		{
			System.out.println(player + "의 패는 두끗입니다.");
			player.rank = 26;
		}
		else if((number1 + number2)%10 == 1)
		{
			System.out.println(player + "의 패는 한끗입니다.");
			player.rank = 27;
		}
		
		else if((number1 + number2)%10 == 0)
		{
			System.out.println(player + "의 패는 망통입니다.");
			player.rank = 28;
		}
		

		
		
		
	}

}
