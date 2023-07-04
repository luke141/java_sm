package day20.homework.vocabularynote.vo;

import java.util.ArrayList;
import java.util.Objects;

import lombok.Data;

@Data
public class Word{
	//��� ����
	private String title;
	private ArrayList<String> meanings;
	
	//������
	public Word(String title, String meaning) {
		this(title);
		meanings.add(meaning);
	}
	public Word(String title) {
		this.title = title;
		meanings = new ArrayList<>();
	}
	public Word(Word w) {
		this.title = w.title;
		this.meanings = (ArrayList<String>) w.meanings.clone();
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
		for(int i = 0; i< meanings.size(); i++) {
			System.out.println(i+1+". " + meanings.get(i));
		}
	}
	/**���� �߰��ϴ� �޼���
	 * �Ű����� : �߰��� �� => String meaning
	 * ����Ÿ�� : ���� => void
	 * �޼���� : addMeaning
	 */
	public void addMeaning(String meaning) {
		//�� ���� ��찡 ����
		this.meanings.add(meaning);
	}
	/**���� �����ϰ� ���� ���θ� �˷��ִ� �޼���
	 * �Ű����� : ������ ���� ��ȣ => int num
	 * ����Ÿ�� : ���� ���� => boolean
	 * �޼���� : removeMeaning
	 */
	public boolean removeMeaning(int num) {
		if(num > meanings.size() || num < 1) {
			//System.out.println("I can't work.");
			return false;
		}
		meanings.remove(num-1);
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
		if(meaningNum > meanings.size() || meaningNum <= 0) {
			return false;
		}
		//meaningNum�� 1�����̰� ������ 0�����̱� ������ ���� 1�� �Ѵ�
		meanings.remove(meaningNum-1);
		meanings.add(meaning);
		return true;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		return Objects.equals(title, other.title);
	}
	@Override
	public int hashCode() {
		return Objects.hash(title);
	}
	
}
