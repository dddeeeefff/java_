class MathEx {
	public static void main(String[] args) 
	{
		System.out.println("������ : " + Math.PI);		  // ������ : 3.141592653589793
		System.out.println("5�� ������ : " + Math.sqrt(5)); // 5�� ������ : 2.23606797749979
		System.out.println("�α� 25 : " + Math.log(25));   // �α� 25 : 3.2188758248682006
		System.out.println("2�� 4�� : " + Math.pow(2, 4)); // 2�� 4�� : 16.0

		double rad = Math.toRadians(45);
		System.out.println("���� 45 : " + Math.sin(rad));   // ���� 45 : 0.7071067811865475
		System.out.println("�ڻ��� 45 : " + Math.cos(rad)); // �ڻ��� 45 : 0.7071067811865476
		System.out.println("ź��Ʈ 45 : " + Math.tan(rad)); // ź��Ʈ 45 : 0.9999999999999999
	}
}
