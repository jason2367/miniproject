package javastudy;

/*
 1. 1~45 ���� �� �ִ� Ball�� �ζ� ��迡 �ִ´�
 2. �ζ� ��迡 �ִ� Ball���� ���´�.
 3. ���� Ball�߿��� 6���� ������.
 */
public interface LottoMachine {
	int MAX_BALL_COUNT = 45;
	int RETURN_BALL_COUNT = 6;
	// int ���� �� ���� public static�� ������ ����
	public void setBalls(Ball[] balls); //Ball[] �� Ball�� �������� �ްڴ�.
	public void mix(); //�ڽ��� ������ �ִ� Ball���� ���´�.
	public Ball[] getBalls(); //6���� Ball�� ��ȯ�Ѵ�
	// ���� 3���� public abstract void abstract�� ������ �����̴�.
} 
