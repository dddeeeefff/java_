import java.util.*;

class StringTokenizerEx {
	public static void main(String[] args) {
		String data = "11 22 33";
		//data 문자열을 띄어쓰기를 기준으로 문자열 배열로 만들어 각 데이터를 출력(가로로)
		String[] arr = data.split(" ");
		for(String str : arr) System.out.print(str + " ");
		System.out.println();

		// 위와 동일한 작업을 StringTokenizer를 이용하여 작업

		StringTokenizer tokenizer = new StringTokenizer(data);
		// 특정 구분자를 지정하지 않으면 기본으로 띄어쓰기를 기분으로 문자열을 조각냄
        while (tokenizer.hasMoreTokens())// hasMoreElements도 가능
		System.out.print(tokenizer.nextToken() + " "); // nextElement()도 가능
		//StringTokenizer는 한 번만 루프를 돌릴 수 있으며, 다시 돌려야 할 경우 새로 만들거나 배열에 담아서 사용
		System.out.println();

		String data2 = "1+2-3*4/5";
		StringTokenizer st2 = new StringTokenizer(data2, "+-*/");
		// StringTokenizer에서는 구분자는 한 글자만 허용되므로 여러 글자 입력시 각 글자별로 구분자로 동작함
		while(st2.hasMoreTokens()) System.out.print(st2.nextToken() + " ");
		// 1 2 3 4 5
		System.out.println();

		StringTokenizer st3 = new StringTokenizer(data2, "+-*/",true);
		// true : 구분자들도 토크으로 취급
		while(st3.hasMoreTokens()) System.out.print(st3.nextToken() + " ");
		// 1 + 2 - 3 * 4 / 5
		System.out.println();
	}
}
