class ArrayMaxMinp {
	public static void main(String[] args) {
		int[] arr = {2, 5, 3, 7, 6};


		System.out.println("최소값 : " + minValue(arr));

		System.out.println("최대값 : " + maxValue(arr));
	}

	/*
	로직
	배열값을 받는 메소드 생성 -> 초기값 설정 -> foreach문으로 각 요소 비교 -> 리턴으로 배출
	*/

	// 배열을 인수로 받아 데이터들 중 최소값을 찾아 리턴하는 MinValue() 메소드 작성

	public static int minValue(int[] arr){
		int min = arr[0];
		for(int num : arr){
			if(num < min){
				min = num;
			}
		}
		return min;
	}


	// 배열을 인수로 받아 데이터들 중 최대값을 찾아 리턴하는 MaxValue() 메소드 작성

	public static int maxValue(int[] arr){
		int max = arr[0];
		for(int num : arr){
			if(num > max){
				max = num;
			}
		}
		return max;
	}

}
