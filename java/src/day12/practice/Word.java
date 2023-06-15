package day12.practice;

/* �� �ܾ �����ϴ� Ŭ����
 *  - �ܾ�
 *  - ��� 
 * */
public class Word{
	//��� ����
	private String title;
	private String meaning[];
	private int meaningCount;
	//������
	public Word(String title, String meaning) {
		this.title = title;
		this.meaning = new String[5]; //�⺻ 5��
		this.meaning[0] = meaning;
		meaningCount++;
	}
	public Word(String title) {
		this.title = title;
		this.meaning = new String[5]; //�⺻ 5��
	}
	public Word(Word w) {
		this.title = w.title;
		this.meaning = new String[5]; //�⺻ 5��
		for(int i = 0; i<w.meaningCount; i++) {
			this.meaning[i] = w.meaning[i];
		}
		meaningCount = w.meaningCount;
	}
	//�޼���
	/**�ܾ�� ���� ����ϴ� �޼���
	 * �Ű����� : ����
	 * ����Ÿ�� : ���� => void
	 * �޼���� : print
	 */
	public void print() {
		System.out.println("word : " + title);
		System.out.println("meaning : ");
		for(int i = 0; i<meaningCount; i++) {
			System.out.println(i+1+". " + meaning[i]);
		}
	}
	/**���� �߰��ϴ� �޼���
	 * �Ű����� : �߰��� �� => String meaning
	 * ����Ÿ�� : ���� => void
	 * �޼���� : addMeaning
	 */
	public void addMeaning(String meaning) {
		//���� �� á���� �� á�ٰ� ����ϰ� ����
		if(meaningCount == this.meaning.length) {
			System.out.println("It's all filled.");
			return;
		}
		this.meaning[meaningCount] = meaning;
		meaningCount++;
	}
	/**���� �����ϴ� �޼���
	 * �Ű����� : ������ ���� ��ȣ => int num
	 * ����Ÿ�� : ���� => void
	 * �޼���� : removeMeaning
	 */
	public void removeMeaning(int num) {
		if(num > meaningCount || num < 1) {
			System.out.println("I can't work.");
			return;
		}
		//num-1�������� �ϳ��� ��ܿͼ� �������.
		for(int i = num-1; i < meaningCount-1; i++) {
			meaning[i] = meaning[i+1];
		}
		//�������� ������� �����͸� ����
		meaning[meaningCount-1] = null;
		//���� ������ �� ������ �ϳ� ����
		meaningCount--;
	}
}