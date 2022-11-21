class CondOpEx
{
	public static void main(String[] args) 
	{
		int n1 = 10, n2 = 20, result;
		//n1과 n2중 더 큰수를 result에 저장한 후 출력(if문 사용)

		if(n1>n2) result = n1;
		else result = n2;
		System.out.println("result1 : " + result); // result1 : 20

		result = n1;
		if(n2 > n1) result = n2;
		System.out.println("result2 : " + result); // result2 : 20

		result = n1 > n2 ? n1 : n2;
		//n1이 n2보다 크면 n21을 아니면 n2를 result에 저장
		System.out.println("result3 : " + result); // result3 : 20

		System.out.println("result4 : " + (n1 > n2 ? n1 : n2)); // result4 : 20
		//출력시 조건연산자의 수식을 괄호로 묶어 그대로 사용할 수 있음

		
	}
}
