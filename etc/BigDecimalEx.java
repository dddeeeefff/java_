import java.math.*;

class BigDecimalEx {
	public static void main(String[] args) {
		double d1 = 1.6, d2 = 0.1;
		System.out.println("1.6 + 0.1 : " + (d1 + d2)); // 1.7000000000000002
		System.out.println("1.6 + 0.1 : " + (d1 * d2)); // 0.16000000000000003

		BigDecimal d3 = new BigDecimal(1.6);
		BigDecimal d4 = new BigDecimal(0.1);
		// java������ �Ǽ��� ��Ȯ�� ���꺸�� �Ǽ� ǥ�� ������ �� �� �Ű��� �Ἥ �������� ��Ȯ���� ����
		System.out.println("1.6 + 0.1 : " + d3.add(d4)); // 1.7000000000000000949436895...
		System.out.println("1.6 * 0.1 : " + d3.multiply(d4)); // 0.1600000000000000177...
		// BigDecimal �ν��Ͻ� ���� ���� �̹� double�� �����͸� ��������Ƿ� ��Ȯ�� ������ �Ұ���

		BigDecimal d5 = new BigDecimal("1.6");
		BigDecimal d6 = new BigDecimal("0.1");
		System.out.println("1.6 + 0.1 : " + d5.add(d6)); // 1.7
		System.out.println("1.6 * 0.1 : " + d5.multiply(d6)); // 0.16
		// BigDecimal �ν��Ͻ� �����ÿ��� ���ڿ��� �Ǽ��� ǥ���ؾ� ��Ȯ�� ������ ������
	}
}
