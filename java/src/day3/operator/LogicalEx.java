package day3.operator;

public class LogicalEx {

	public static void main(String[] args) {
		int score = 95;
		//성적이(score) 80점 이상이고, 성적이 90점 미만인가?
		//score가 80보다 크거나 같고 score가 90보다 작다
		//score가 80보다 크거나 같다 && score가 90보다 작다
		//score >= 80 && score < 90
		System.out.println("Is " + score + " a B? " + (score >= 80 && score < 90)); //점수 바꿔가면서 run해보기 ex) 75,80,95
		int age = 21;
		//20세 이상이면 성인
		boolean isAdult = age >= 20;
		//age살은 미성년자인가? =>성인이아님
		System.out.println("Is " + age + " your old a minor? " + !isAdult); //!isAdult : 성인이 아닌
		
		//주민등록증은 있고, 운전면허증은 없는 상태 토익 볼 수 있음?
		boolean hasIdCard = true;
		boolean hasDriverCard = false;
		//토익볼 수 있을까? (주민등록증이 있거나 운전면허증이 있으면 볼 수 있음)
		System.out.println("Can I take TOEIC? " + (hasIdCard || hasDriverCard)); // ||:\\와 shift를 같이 누름

	}

}
