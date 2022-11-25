import java.math.*;

class BigIntegerEx {
	public static void main(String[] args) {
		System.out.println("�⺻ �ڷ��� �ִ� ���� : " + Long.MAX_VALUE);
		// �⺻ �ڷ��� �ִ� ���� : 9223372036854775807
		System.out.println("�⺻ �ڷ��� �ּ� ���� : " + Long.MIN_VALUE);
		// �⺻ �ڷ��� �ּ� ���� : -9223372036854775808
		BigInteger bigValue1 = new BigInteger("10000000000000000000000");
		BigInteger bigValue2 = new BigInteger("-9999999999999999999999");

		// bigValue1�� bigValue2�� ���� ���ϰ�, ���� ������� ���
		BigInteger addResult = bigValue1.add(bigValue2);
		BigInteger mulResult = bigValue1.multiply(bigValue2);

		System.out.println("�� : " + addResult); // �� : 1
		System.out.println("�� : " + mulResult); // �� : -99999999999999999999990000000000000000000000
	}
}
