package day12.practice;

/* �ܾ��� Ŭ����
 * - �ܾ���� ����
 * - Word���� ����
 * */
public class VocabularyNote {
	//��� ����
	//�ܾ��
	private Word wordList[];//�ܾ��
	private int wordCount;//����� �ܾ��� ����
	
	//������
	public VocabularyNote() {
		wordList = new Word[10];
	}
	
	public VocabularyNote(Word wordList[]) {
		//���� �ܾ����� ũ��� 10�� ���ؼ� ū���� �ܾ��� ũ��� ����
		int size = wordList.length > 10 ? wordList.length : 10;
		
		this.wordList = new Word[size];
		
		for(int i = 0; i < wordList.length; i++) {
			this.wordList[i] = new Word(wordList[i]);
		}
		wordCount = wordList.length;
	}
	//�޼���
	/**�ܾ���� ����ϴ� �޼���
	 * �Ű����� : ����
	 * ����Ÿ�� : ���� => void
	 * �޼���� : print
	 * */
	public void print() {
		System.out.println("======================");
		for(int i = 0; i<wordCount; i++) {
			wordList[i].print();
			System.out.println("======================");
		}
	}
	/**�ܾ �־����� �ܾ��忡 �߰��ϴ� �޼���
	 * �Ű����� : 
	 * ����Ÿ�� : 
	 * �޼���� : 
	 */
	
	/**�ܾ �־����� �ܾ��忡�� �����ϴ� �޼���
	 * �Ű����� : 
	 * ����Ÿ�� : 
	 * �޼���� : 
	 */
	
	/**�ܾ �־����� �ܾ��忡 �ش� �ܾ ����ϴ� �޼���
	 * �Ű����� : 
	 * ����Ÿ�� : 
	 * �޼���� : 
	 */
	
	/**�ܾ�� ���� �־����� ���� �ܾ��̸� ���� �ܾ �߰��ϰ�,
	 * �ִ� �ܾ��̸� �游 ���� �߰��ϴ� �޼���
	 * �Ű����� : 
	 * ����Ÿ�� : 
	 * �޼���� : 
	 */
	
	/**�ܾ�� ������ ���� ��ȣ�� ������ ���� �־����� �ܾ��� ���� �����ϴ� �޼���
	 * �Ű����� : 
	 * ����Ÿ�� : 
	 * �޼���� : 
	 */
	
	/**�ܾ�� ������ �ܾ �ܾ �־����� �ܾ �����ϴ� �޼���
	 * �Ű����� : 
	 * ����Ÿ�� : 
	 * �޼���� : 
	 */
}
