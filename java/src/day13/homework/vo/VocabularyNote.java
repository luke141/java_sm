package day13.homework.vo;

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
	/**�ܾ �־����� �ܾ��忡 �߰��ϴ� �޼���(�ܾ� ��ü�� �Ѱ��ִ� ���)
	 * �Ű����� : �ܾ�(�ܾ� ��ü) => Word word
	 * ����Ÿ�� : ���� => void
	 * �޼���� : insert
	 */
	public void insert(Word word) {
		//�ܾ��忡 �ܾ �� á���� �߰��� ���� ����.
		if(wordCount == wordList.length) {
			System.out.println("Vocabulary note is full!");
			return;
		}
		//���� ���縦 ���� Word�� ���� �����ڸ� �̿��Ͽ� �� �ܾ ������ �� �߰�
		wordList[wordCount++] = new Word(word);
	}
	
	/**�ܾ�� ���� �־����� ���� �ܾ��̸� ���� �ܾ �߰��ϰ� 1�� ����,
	 * �ִ� �ܾ��̸� �游 ���� �߰��ϴ� -1�� �����ϰ�
	 * �߰��� �����ϸ� 0�� �����ϴ� �޼���(�ܾ�� ���� �Ѱ��ִ� ���)
	 * �Ű����� : �ܾ�� �� => String title, String meaning 
	 * ����Ÿ�� : -1(���߰�), 0(�߰�����), 1(�ܾ��߰�) => int
	 * �޼���� : insert
	 */
	public int insert(String title, String meaning) {
		//�ܾ��忡 �ܾ �� á���� �߰��� ���� ����.
		if(wordCount == wordList.length) {
			//System.out.println("Vocabulary note is full!");
			return 0;
		}
		int index = indexOf(title);
		//���� �ܾ��̸� �� �ܾ�� �߰�
		if(index == -1) {
			//�ܾ�� ���� �̿��� �ܾ� ��ü�� ������ �� �ܾ��忡 �߰�
			wordList[wordCount++] = new Word(title, meaning);
			return 1;
		}
		//�ִ� �ܾ��̸� ���� �߰�.
		wordList[index].addMeaning(meaning);
		return -1;
	}
	/**�ܾ �־����� �ܾ��忡�� �����ϰ� ���� ���θ� �˷��ִ� �޼���
	 * �Ű����� : ������ �ܾ� => String title
	 * ����Ÿ�� : �������� => boolean
	 * �޼���� : delete
	 */
	public boolean delete(String title) {
		//�ܾ ����ִ��� ã�ƾ� ��.
		int index = indexOf(title);
		//�ܾ �ܾ��忡 ������ �˸� �޼��� ����� ����
		if(index == -1) {
			//System.out.println("No words found");
			return false;
		}
		//ã�� ��ġ���� ��ĭ�� �о���.
		for(int i = index; i < wordCount-1; i++) {
			wordList[i] = wordList[i+1];
		}
		//�ܾ��� ������ �ϳ� �ٿ���
		wordCount--;
		//������ �ܾ �����(null)
		wordList[wordCount] = null;
		return true;
	}
	/**�ܾ �־����� �ܾ �ִ� ��ġ�� �˷��ִ� �޼���
	 * �ܾ ������ -1
	 * �Ű����� : �ܾ� => String title
	 * ����Ÿ�� : ��ġ => ���� => ���� => int
	 * �޼���� : indexOf
	 * */
	public int indexOf(String title) {
		//�ܾ��忡 ��ϵ� �ܾ���� ��ȸ
		for(int i = 0; i<wordCount; i++) {
			//�ܾ ������ i������ ����
			if(wordList[i].getTitle().equals(title)) {
				return i;
			}
		}
		//������� ���� ��ġ�ϴ� �ܾ ���� ����̹Ƿ� -1�� ����
		return -1;
	}
	
	/**�ܾ �־����� �ܾ��忡 �ش� �ܾ ����ϰ� �ܾ �ִ��� �������� �˷��ִ�
	 * �޼���
	 * �Ű����� : �ܾ� => String title
	 * ����Ÿ�� : �ܾ �ִ��� ������ => boolean
	 * �޼���� : search
	 */
	public boolean search(String title) {
		int index = indexOf(title);
		
		if(index == -1) {
			System.out.println("No words found");
			return false;
		}
		
		wordList[index].print();
		return true;
	}
	
	/**�ܾ�� ������ ���� ��ȣ�� ������ ���� �־����� �ܾ��� ���� �����ϰ�
	 * ���� ���θ� �˷��ִ� �޼���
	 * �Ű����� : �ܾ�, ������ �� ��ȣ, ������ ��
	 * 		=> String title, int meaningIndex, String meaning
	 * ����Ÿ�� : �������� => boolean
	 * �޼���� : updateMeaing
	 */
	public boolean updateMeaning(String title, int meaningIndex, String meaning) {

		int index = indexOf(title);
		
		if(index == -1) {
			System.out.println("No words found");
			return false; 
		}
		
		if(!wordList[index].updateMeaning(meaningIndex, meaning)) {
			//System.out.println("Wrong number");
			return false;
		}
		return true;
	}
	
	/**�ܾ�� ������ �ܾ �ܾ �־����� �ܾ �����ϰ� ���� ���θ� �˷��ִ� �޼���
	 * �Ű����� : �ܾ�� ������ �ܾ� => String title, String updateTitle
	 * ����Ÿ�� : ���� ���� => boolean
	 * �޼���� : updateTitle
	 */
	public boolean updateTitle(String title, String updateTitle) {
		int index = indexOf(title);
		
		if(index == -1) {
			//System.out.println("No words found");
			return false; 
		}
		
		wordList[index].setTitle(updateTitle);
		return true;
	}

	/**�ܾ�� ������ ���� ��ȣ�� �־����� ���� �����ϰ�, ���� ���θ� �˷��ִ�
	 * �޼���
	 * �Ű����� : �ܾ�� �� ��ȣ => String title, int num
	 * ����Ÿ�� : �� ���� ���� => boolean
	 * �޼���� : deleteMeaning
	 */
	public boolean deleteMeaning(String title, int num) {
		//�ܾ��� ��ġ�� ã��
		int index = indexOf(title);
		//�ܾ ������ ���� ����
		if(index == -1) {
			return false;
		}
		Word tmp = wordList[index];
		if(tmp.removeMeaning(num)) {
			return true;
		}
		return false;
	}
}