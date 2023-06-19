package day13.homework.vo;

import lombok.Data;

/* �� �ܾ �����ϴ� Ŭ����
 *  - �ܾ�
 *  - ��� 
 * */
@Data //getter, setter, toString, equals�� �߰�
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
	/**���� �����ϰ� ���� ���θ� �˷��ִ� �޼���
	 * �Ű����� : ������ ���� ��ȣ => int num
	 * ����Ÿ�� : ���� ���� => boolean
	 * �޼���� : removeMeaning
	 */
	public boolean removeMeaning(int num) {
		if(num > meaningCount || num < 1) {
			//System.out.println("I can't work.");
			return false;
		}
		//num-1�������� �ϳ��� ��ܿͼ� �������.
		for(int i = num-1; i < meaningCount-1; i++) {
			meaning[i] = meaning[i+1];
		}
		//�������� ������� �����͸� ����
		meaning[meaningCount-1] = null;
		//���� ������ �� ������ �ϳ� ����
		meaningCount--;
		return true;
	}
	/**������ ���� ��ȣ�� ������ ���� �־����� ���� �����ϰ� ���� ���θ� �˷��ִ� �޼���
	 * �Ű����� : ������ ���� ��ȣ, ������ �� => int meaningNum, String meaning 
	 * ����Ÿ�� : ���� ���� => boolean
	 * �޼���� : updateMeaning
	 * @param meaningNum
	 * @param meaning2
	 * @return
	 */
	public boolean updateMeaning(int meaningNum, String meaning) {
		//������ ���� ��ȣ�� �߸��� ��� 
		if(meaningNum > meaningCount || meaningNum <= 0) {
			return false;
		}
		//meaningNum�� 1�����̰� ������ 0�����̱� ������ ���� 1�� �Ѵ�
		this.meaning[meaningNum-1] = meaning;
		return true;
	}
	
	//getter
	public String getTitle() {
		return title;
	}
	//setter
	public void setTitle(String title) {
		this.title = title;
	}
	
	
}