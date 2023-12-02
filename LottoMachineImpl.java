package javastudy;

public class LottoMachineImpl implements LottoMachine {
	private Ball[] balls;
	
	@Override
	public void setBalls(Ball[] balls) {
		this.balls = balls;

	}

	@Override
	//Math.random() ==>   0.0 <= x < 1.0
//						  0.0 <= x < 45.0
//					(int) 0 <= x < 45   0~44 까지의 범위가 된다
	public void mix() {
		for(int i = 0; i < 10000; i++) {
			int x1 = (int)(Math.random() * 45);
			int x2 = (int)(Math.random() * 45);
			if(x1 != x2) {
				Ball tmp = balls[x1]; //값을 치환할때는 같은타입의 임시변수가 필요하다
				balls[x1] = balls[x2];
				balls[x2] = tmp;
			} //if
		} //for
		

	}

	@Override
	public Ball[] getBalls() {
		Ball[] result = new Ball[6]; //Ball 6개를 참조할 수 있는 배열
		for(int i = 0; i < 6; i++) {
			result[i] = balls[i];
		}
		return result;
	}

}
