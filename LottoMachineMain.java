package javastudy;

public class LottoMachineMain {

	public static void main(String[] args) {
		
		
		
//		Ball b1 = new Ball(1);
//		Ball b2 = new Ball(2);
//		...
//		Ball b45 = new Ball(45);
//		���� Ÿ���� ������ �������� �ʿ��� ��� �迭�� ����Ѵ�.
		
		Ball[] balls = new Ball[45];
//		Ball�ν��Ͻ��� 45�� ������ �� �ִ� �迭�� ����
		
//		Ball[0] = new Ball(1);
//		Ball[1] = new Ball(2);
//		...
//		Ball[44] = new Ball(15);
//		������ �̷��� �迭�� ���� �־���� �ϴµ� �Ʒ��� for������ �����ϰ� �ذ� ����
		
		for(int i = 0; i < 45; i++) {
			balls[i] = new Ball(i + 1);
		}
		
		LottoMachine lottoMachine = new LottoMachineImpl();//�ζǸӽ� �ν��Ͻ��� ������
		lottoMachine.setBalls(balls);
		lottoMachine.mix();
		Ball[] result = lottoMachine.getBalls();
		
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i].getNumber());
		}
	}
	

}
