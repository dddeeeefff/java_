import java.util.*;

class ArrayMaxMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i = 0; i < arr.length; i++){
			System.out.print(i + 1 + "번째 정수 : ");
			arr[i] = sc.nextInt();
		}

		System.out.println("최소값 : " + minValue(arr));

		System.out.println("최대값 : " + maxValue(arr));
	}

	/*
	로직
	배열을 받는 메소드 생성 -> 초기값 설정 -> foreach문으로 각 요소 비교 후 계산 -> 리턴으로 추출
	*/

	// 배열을 인수로 받아 데이터들 중 최소값을 찾아 리턴하는 MinValue() 메소드 작성
	public static int minValue(int[] arr){
		int min = arr[0];
		// arr배열의 최소값을 처장할 변수로 배열의 첫번째 값을 복사하여 다른 값들과 비교하면서 작업을 함
		for(int i = 1; i < arr.length; i++){
			if(min > arr[i]) min = arr[i];
			//배열의 현재 값(i인덱스)이 min변수의 값보다 작으면 min에 배열의 현재 값을 저장
		}
		return min;
	}


	// 배열을 인수로 받아 데이터들 중 최대값을 찾아 리턴하는 MaxValue() 메소드 작성
	public static int maxValue(int[] arr){
		int max = arr[0];
		// arr배열의 최대값을 처장할 변수로 배열의 첫번째 값을 복사하여 다른 값들과 비교하면서 작업을 함
		for(int num : arr){
			if(num > max){
				max = num;
				//배열의 현재 값(i인덱스)이 max변수의 값보다 크면 max에 배열의 현재 값을 저장
			}
		}
		return max;
	}

}
