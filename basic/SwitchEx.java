class SwitchEx 
{
	public static void main(String[] args) 
	{
		int num = 2;
		switch (num)
		{
		case 1:
			System.out.println("num 값은 1");
		break;
		case 2:
			System.out.println("num 값은 2");
		break;
		case 3:
			System.out.println("num 값은 3");
		break;
		default:
			System.out.println("num 값은 몰라");
		}

		int score = 77;
		// score점수를 이용하여 학점을 출력하는 switch문 작성
		switch ((int)score / 10)
		{
		case 9: case 10:
			System.out.println("score 학점은 A"); break;
		case 8:
			System.out.println("score 학점은 B"); break;
		case 7:
			System.out.println("score 학점은 C"); break;
		case 6:
			System.out.println("score 학점은 D"); break;
		default:
			System.out.println("score 학점은 F");
		}

		//jdk 1.7부터 문자열도 사용가능
		switch ("bb")
		{
		case "ab":
			System.out.println("값은 ab"); break;
		case "bb":
			System.out.println("값은 bb"); break;
		case "cb":
			System.out.println("값은 cb"); break;
		}
}
}
