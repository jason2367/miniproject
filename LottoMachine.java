package javastudy;

/*
 1. 1~45 까지 써 있는 Ball을 로또 기계에 넣는다
 2. 로또 기계에 있는 Ball들을 섞는다.
 3. 섞인 Ball중에서 6개를 꺼낸다.
 */
public interface LottoMachine {
	int MAX_BALL_COUNT = 45;
	int RETURN_BALL_COUNT = 6;
	// int 위에 두 줄은 public static이 생략된 상태
	public void setBalls(Ball[] balls); //Ball[] 은 Ball이 여러개를 받겠다.
	public void mix(); //자신이 가지고 있는 Ball들을 섞는다.
	public Ball[] getBalls(); //6개의 Ball을 반환한다
	// 위에 3줄은 public abstract void abstract가 생략된 상태이다.
} 
