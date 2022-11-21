class MethodDef2 {
	public static void main(String[] args) {
		double height = 173.1;
		double weight = 71.6;
		testMethod1(33, height);
		testMethod2(28, weight);
	}

	public static void testMethod1(int age, double height){
		System.out.println("제 나이는 " + age + "세 입니다.");
		System.out.println("제 키는 " + height + "cm 입니다.");
	}

	//나이(age)와 무게(weight)를 받아 출력을 하는 testMethod2
	public static void testMethod2(int age, double weight){
		System.out.println("제 나이는 " + age + "세 입니다.");
		System.out.println("제 몸무게는 " + weight + "kg 입니다.");
	}

	
}
