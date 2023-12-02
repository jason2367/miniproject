package javastudy;

public class LottoMachineMain {

	public static void main(String[] args) {
		
		
		
//		Ball b1 = new Ball(1);
//		Ball b2 = new Ball(2);
//		...
//		Ball b45 = new Ball(45);
//		같은 타입의 변수가 여러개가 필요할 경우 배열을 사용한다.
		
		Ball[] balls = new Ball[45];
//		Ball인스턴스를 45개 참조할 수 있는 배열을 생성
		
//		Ball[0] = new Ball(1);
//		Ball[1] = new Ball(2);
//		...
//		Ball[44] = new Ball(15);
//		원래는 이렇게 배열의 값을 넣어줘야 하는데 아래의 for문으로 간결하게 해결 가능
		
		for(int i = 0; i < 45; i++) {
			balls[i] = new Ball(i + 1);
		}
		
		LottoMachine lottoMachine = new LottoMachineImpl();//로또머신 인스턴스가 생성됨
		lottoMachine.setBalls(balls);
		lottoMachine.mix();
		Ball[] result = lottoMachine.getBalls();
		
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i].getNumber());
		}
	}
	

}
