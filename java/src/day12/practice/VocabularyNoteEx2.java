package day12.practice;

public class VocabularyNoteEx2 {

	public static void main(String[] args) {
		//영어 단어장 클래스를 만들고 테스트 하는 코드를 작성하세요.
		//word 클래스 이용.
		/* 한 단어를 관리하는 클래스
		 * - 단어
		 * - 뜻들 
		 */
		Word wordList[] = {
				new Word("abc"),
				new Word("def","def is define")
		};

		VocabularyNote note = new VocabularyNote(wordList);
		note.print();
	}

}