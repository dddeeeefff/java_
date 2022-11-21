class ExamLoop 
{
	public static void main(String[] args) 
	{
		/*
		구구단을 출력(2~5단)
		2 x 1 = 2	3 x 1 = 3
		2 x 2 = 4	3 x 2 = 6
		.....
		2 x 9 = 18	3 x 9 = 27
		*/
		for(int j = 1; j < 10; j++){
			for(int i = 2; i < 6; i++){
				System.out.print(i + " x " + j + " = " + i * j + (i * j < 10 ? "   " : "  "));
			}
			System.out.println();
		}
	}
}
