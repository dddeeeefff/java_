class BoxingUnboxing {
	public static void main(String[] args) {
		Integer iValue = new Integer(10);  Double dValue = new Double(3.14);
		// boxing���� �⺻ �ڷ��� �����͸� �ν��Ͻ��� ����
		System.out.println("iValue : " + iValue + ", dValue : " + dValue );
		// iValue : 10, dValue : 3.14

		Integer iValue2 = new Integer(iValue.intValue() + 10);
		Double dValue2 = new Double(dValue.doubleValue() + 1.2);
		System.out.println("iValue2 : " + iValue2 + ", dValue2 : " + dValue2 );
		// iValue2 : 20, dValue2 : 4.3

		Integer iValue3 = 10;	Double dValue3 = 3.14;
		// auto boxing���� new����� ������� �ʰ� �⺻ �ڷ��� �����͸� ���� �־� boxing��
		System.out.println("iValue3 : " + iValue3 + ", dValue3 : " + dValue3 );
		// iValue3 : 10, dValue3 : 3.14

		int n1 = iValue + 10;	double d1 = dValue + 1.2;
		// auto nuboxing���� �ν��Ͻ��� ���� �⺻ �ڷ��� ������ ���� �� ����
		System.out.println("n1 : " + n1 + ", d1 : " + d1 );
		// n1 : 20, d1 : 4.34

		Integer strInt = new Integer("123");
		// ���ڿ��� Integer�� �ν��Ͻ��� ������ �� ����(��, ����ó�� ���� ���ڿ��� ����)
		int strInt2 = strInt + 10;
		System.out.println("strInt2 : " + strInt2); // strInt2 : 133

/*
		integer strInt3 = "333";
		int strInt4 = strInt3 + 10;
		System.out.println("strInt4 : " + strInt4);
		���ڿ� ��ü�� integer�� �ν��Ͻ��� �ִ� ���� �Ұ���
*/
	}
}
