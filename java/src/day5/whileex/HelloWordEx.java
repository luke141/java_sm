package day5.whileex;

public class HelloWordEx {

	public static void main(String[] args) {
		//Hello world�� 10�� ����ϴ� �ڵ带 �ۼ��ϼ���.
				/* �ݺ�Ƚ�� : 10��, 1������ 10������ 1�� ����
				 *  => ������ �ʱⰪ : 1
				 *  => ���ǽ� : 10���� => 10���� �۰ų� ���� ������
				 *  => �����ϴ� �� : 1�� ����
				 * ��Ģ��  : Hello world�� ���
				 *  => ���๮
				 * */
				int max = 3;
				int i = 1; //������ �ʱⰪ : 1
				//i�� 10���� �۰ų� ���� ������
				while(i <= max) {
					System.out.println("Hello world");
					++i;//i�� 1�� ����, i++, i = i+1, i+=1
				}
				System.out.println("===============");
				/* �ݺ�Ƚ�� : i�� 10���� 1���� 1�� ����
				 * */
				i = max;
				while(i >= 1) {
					System.out.println("Hello world");
					--i;
				}
				System.out.println("===============");
				i = max;
				while(i-- > 0) {
					System.out.println("Hello world");
				}
			}

		}