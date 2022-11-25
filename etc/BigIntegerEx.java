import java.math.*;

class BigIntegerEx {
	public static void main(String[] args) {
		System.out.println("기본 자료형 최대 정수 : " + Long.MAX_VALUE);
		// 기본 자료형 최대 정수 : 9223372036854775807
		System.out.println("기본 자료형 최소 정수 : " + Long.MIN_VALUE);
		// 기본 자료형 최소 정수 : -9223372036854775808
		BigInteger bigValue1 = new BigInteger("10000000000000000000000");
		BigInteger bigValue2 = new BigInteger("-9999999999999999999999");

		// bigValue1과 bigValue2를 각각 더하고, 곱한 결과값을 출력
		BigInteger addResult = bigValue1.add(bigValue2);
		BigInteger mulResult = bigValue1.multiply(bigValue2);

		System.out.println("합 : " + addResult); // 합 : 1
		System.out.println("곱 : " + mulResult); // 곱 : -99999999999999999999990000000000000000000000
	}
}
