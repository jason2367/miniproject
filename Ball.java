package javastudy;

//불변객체
public class Ball {
	private int number; //로또머신의 숫자가 꺼냈을때 변하면 안 되므로 private선언
	public Ball(int number) {
		this.number = number; //Ball은 태어날때 부터 number을 가지고 있게 한다
		
	}
	
	public int getNumber() {
		return number; //private이라고 돼있으면 내부적으로 사용되고 외부는 알 수 없다 외부에도 알려주기 위해서 생성
	}
}
