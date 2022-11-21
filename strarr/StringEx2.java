class StringEx2 {
	public static void main(String[] args) {
		String file1 = "test.jpg";  String file2 = "test.gif";
		String file3 = "test.doc";  String file4 = "test.zip";

		imgfile(file1);  imgfile(file2);  imgfile(file3);  imgfile(file4);

	}
	public static void imgfile(String file){
		/*
		받아온 파일명 문자를 이용하여 이미지 파일인지 검사한 후 출력하는 메소드
		파일명에서 확장자를 추출하여 이미지 파일 확장자인지 여부를 검사
		1. 파일명에서 확장자 부분만 추출
		 - 마지막 점의 다음 글자부터 끝까지 잘라옴 : 마지막 점(lastIndexOf()), 자름(substring())
		2. 추출한 확장자가 이미지 파일의 확장자인지 검사 후 출력
		 - 이미지 확장자 : jpg, gif, pug, jpeg
		*/
		int dot = file.lastIndexOf('.');      // file 문자열에서 마지막 점의 위치를 dot에 저장
		String ext = file.substring(dot + 1); // file 문자열에서 마지막 점의 다음 글자부터 끝까지 추출
		
		if(ext.equals("jpg") || ext.equals("gif") || ext.equals("png") || ext.equals("jpeg")){
			System.out.println(file + " 은(는) 이미지 파일이 맞습니다");
		}else{
			System.out.println(file + " 은(는) 이미지 파일이 아닙니다");
		}
		


	}
}



