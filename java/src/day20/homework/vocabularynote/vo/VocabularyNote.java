package day20.homework.vocabularynote.vo;

import java.util.ArrayList;

/* �ܾ��� Ŭ����
 * - �ܾ���� ����
 * - Word���� ����
 * */
public class VocabularyNote {
	//��� ����
	//�ܾ��
	private ArrayList<Word> wordList;//�ܾ��
	
	//������
	public VocabularyNote() {
		wordList = new ArrayList<>();
	}
	
	public VocabularyNote(ArrayList<Word> wordList) {
		this.wordList = (ArrayList<Word>) wordList.clone();
	}
	//�޼���
	/**�ܾ���� ����ϴ� �޼���
	 * �Ű����� : ����
	 * ����Ÿ�� : ���� => void
	 * �޼���� : print
	 * */
	public void print() {
		System.out.println("======================");
		for(Word tmp : wordList) {
			tmp.print();
			System.out.println("======================");
		}
	}
	/**�ܾ �־����� �ܾ��忡 �߰��ϴ� �޼���(�ܾ� ��ü�� �Ѱ��ִ� ���)
	 * �Ű����� : �ܾ�(�ܾ� ��ü) => Word word
	 * ����Ÿ�� : ���� => void
	 * �޼���� : insert
	 */
	public void insert(Word word) {
		//���� ���縦 ���� Word�� ���� �����ڸ� �̿��Ͽ� �� �ܾ ������ �� �߰�
		wordList.add(new Word(word));
	}
	
	/**�ܾ�� ���� �־����� ���� �ܾ��̸� ���� �ܾ �߰��ϰ� true�� ����,
	 * �ִ� �ܾ��̸� �游 ���� �߰��ϴ� false�� ����
	 * �Ű����� : �ܾ�� �� => String title, String meaning 
	 * ����Ÿ�� : �ܾ��߰��ϸ� true, �� �߰��ϸ� false
	 * �޼���� : insert
	 */
	public boolean insert(String title, String meaning) {
		int index = wordList.indexOf(new Word(title));
		//���� �ܾ��̸� �� �ܾ�� �߰�
		if(index == -1) {
			//�ܾ�� ���� �̿��� �ܾ� ��ü�� ������ �� �ܾ��忡 �߰�
			wordList.add(new Word(title, meaning));
			return true;
		}
		//�ִ� �ܾ��̸� ���� �߰�.
		wordList.get(index).addMeaning(meaning);
		return false;
	}
	/**�ܾ �־����� �ܾ��忡�� �����ϰ� ���� ���θ� �˷��ִ� �޼���
	 * �Ű����� : ������ �ܾ� => String title
	 * ����Ÿ�� : �������� => boolean
	 * �޼���� : delete
	 */
	public boolean delete(String title) {
		if(!wordList.remove(new Word(title))) {
			return false;
		}
		return true;
	}
	
	
	/**�ܾ �־����� �ܾ��忡 �ش� �ܾ ����ϰ� �ܾ �ִ��� �������� �˷��ִ�
	 * �޼���
	 * �Ű����� : �ܾ� => String title
	 * ����Ÿ�� : �ܾ �ִ��� ������ => boolean
	 * �޼���� : search
	 */
	public boolean search(String title) {
		int index = wordList.indexOf(new Word(title));
		
		if(index == -1) {
			return false;
		}
		
		wordList.get(index).print();
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

		int index = wordList.indexOf(new Word(title));
		
		if(index == -1) {
			return false; 
		}
		
		if(!wordList.get(index).updateMeaning(meaningIndex, meaning)) {
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
		int index = wordList.indexOf(new Word(title));
		
		if(index == -1) {
			//System.out.println("No words found");
			return false; 
		}
		
		wordList.get(index).setTitle(updateTitle);
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
		int index = wordList.indexOf(new Word(title));
		//�ܾ ������ ���� ����
		if(index == -1) {
			return false;
		}
		Word tmp = wordList.get(index);
		if(tmp.removeMeaning(num)) {
			return true;
		}
		return false;
	}
}

