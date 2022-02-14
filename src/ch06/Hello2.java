package ch06;

// 하나의 소스파일에는 하나의 클레스만 작성하는 것이 바람직
// 소스 파일의 이름은 public class 이름과 일치
// 소스파일의 이름과 클래스 파일의 대소문자를 구분하기 때문에 대소문자 구분하여야 한다.
public class Hello2 {
    public static void main(String[] args){
    }
}

// 하나의 소스파일에는 하나의 public class 만 허용
class Hello3 {
}
// public class 가 없을 경우 소스 내 class 중 하나의 이름이랑 같으면 문제 X
class Hello4 {
}