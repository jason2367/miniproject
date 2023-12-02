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
//					(int) 0 <= x < 45   0~44 ������ ������ �ȴ�
	public void mix() {
		for(int i = 0; i < 10000; i++) {
			int x1 = (int)(Math.random() * 45);
			int x2 = (int)(Math.random() * 45);
			if(x1 != x2) {
				Ball tmp = balls[x1]; //���� ġȯ�Ҷ��� ����Ÿ���� �ӽú����� �ʿ��ϴ�
				balls[x1] = balls[x2];
				balls[x2] = tmp;
			} //if
		} //for
		

	}

	@Override
	public Ball[] getBalls() {
		Ball[] result = new Ball[6]; //Ball 6���� ������ �� �ִ� �迭
		for(int i = 0; i < 6; i++) {
			result[i] = balls[i];
		}
		return result;
	}

}
