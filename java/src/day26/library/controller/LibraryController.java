package day26.library.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import day26.library.vo.Book;
import day26.library.vo.LoanBrowsing;

public class LibraryController {
	
	private Scanner sc = new Scanner(System.in);
	//���� ����Ʈ
	List<Book> bookList = new ArrayList<>();
	//���� ���� ����Ʈ
	List<LoanBrowsing> loanList = new ArrayList<>();
	
	public void run() {
		int menu;
		String bookFileName = "src/day26/library/book.txt";
		String loanFileName = "src/day26/library/loan.txt";
		loadBook(bookFileName);
		loadBook(loanFileName);
		do {
			//�޴� ���
			System.out.println("=============");
			printMenu();
			//�޴� ����(�޴��� �Է¹���) : Scanner �ʿ�
			menu = sc.nextInt();
			//���õ� �޴��� ���� ����� ����
			runMenu(menu);
			System.out.println("=============");
			
		}while(menu != 4);
		saveBook(bookFileName);
		saveBook(loanFileName);
		sc.close();
	}
	
	private void saveLoan(String fileName) {
		try(FileOutputStream fos = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
					for(LoanBrowsing tmp : loanList) {
						oos.writeObject(tmp);
					}
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	private void loadLoan(String fileName) {
		try(ObjectInputStream ois 
				= new ObjectInputStream(new FileInputStream(fileName))){
				while(true) {
					LoanBrowsing tmp = (LoanBrowsing)ois.readObject();
					loanList.add(tmp);
				}
			} catch (FileNotFoundException e) {
				System.out.println("�ҷ��� ������ �����ϴ�.");
			} catch (EOFException e) {
				System.out.println("�ҷ����� �Ϸ�!");
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				//ObjectInputStream�� �̿��Ͽ� ��ü������ �о�� �� Ŭ������ Serializable�������̽��� �������� ������ �߻� 
				System.out.println("loan Ŭ������ ã�� �� �����ϴ�.");
			}
	}

	private void saveBook(String fileName) {
		try(FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
				for(Book tmp : bookList) {
					oos.writeObject(tmp);
				}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void loadBook(String fileName) {
		try(ObjectInputStream ois 
			= new ObjectInputStream(new FileInputStream(fileName))){
			while(true) {
				Book tmp = (Book)ois.readObject();
				bookList.add(tmp);
			}
		} catch (FileNotFoundException e) {
			System.out.println("�ҷ��� ������ �����ϴ�.");
		} catch (EOFException e) {
			System.out.println("�ҷ����� �Ϸ�!");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			//ObjectInputStream�� �̿��Ͽ� ��ü������ �о�� �� Ŭ������ Serializable�������̽��� �������� ������ �߻� 
			System.out.println("Book Ŭ������ ã�� �� �����ϴ�.");
		} 
	}

	private void runMenu(int menu) {
		
		switch(menu) {
		case 1:
			insertBook();
			break;
		case 2:
			loanBook();
			break;
		case 3:
			retrunBook();
			break;
		case 4:
			System.out.println("���α׷� ����!");
			break;
		default:
			System.out.println("�߸��� �޴� ����!");
		}
		
	}

	private void retrunBook() {
		//����ó��
		sc.nextLine();
		//�ݳ����� ��ȣ�� �Է�
		System.out.println("���� ��ȣ");
		String num = sc.nextLine();
		//������ ������ �ƴϸ� �ݳ��� X
		int index = bookList.indexOf(new Book(num, null, null, null));
		if(index == -1) {
			System.out.println("������ ������ �ƴմϴ�.");
			return;
		}
		//������ �ݳ�
		//�ݳ��� ������ ���¸� ���� �������� ����
		Book returnBook = bookList.get(index);
		returnBook.returnBook();
		
		//���� ���� ����Ʈ���� ������ ������ �ݳ����� ���� ��¥�� ����
		//�ݳ��� ������ ���� ������ ã�ƾ� ��.
		int lbIndex = loanList.lastIndexOf(new LoanBrowsing(returnBook, null, 14));//�ֱ� index
		LoanBrowsing tmpLb = loanList.get(lbIndex);
		tmpLb.setReturnDate(new Date());
		System.out.println("������ : " + tmpLb.getLoanDateStr());
		System.out.println("�ݳ��� : " + tmpLb.getReturnDateStr());
	}

	private void loanBook() {
		//���� ������ �������� ��ȸ
		//Stream<Book> stream = bookList.stream();
		bookList
			.stream()
			.filter(b->!b.isLoan()) //���� ������ ������ ����
			.forEach(b->{	//������ ������ ���
				System.out.println("=============");
				System.out.println(b);
				System.out.println("=============");
			});
		/*
		for(Book tmp : bookList) {
			if(!tmp.isLoan()) {
				System.out.println("=============");
				System.out.println(tmp);
				System.out.println("=============");
			}
		}
		*/
		//���� ��ȣ�� �Է�
		sc.nextLine();//������ �Է��� ���� ó��
		System.out.print("���� ��ȣ : ");
		String num = sc.nextLine();
		
		//������ ��û
		//���� ��ȣ�� �ùٸ��� Ȯ��
		//��ȣ�� �´� ������ �ִ��� Ȯ��
		//������ ������ �ùٸ��� ����
		//������ ������ ���������� Ȯ��
		boolean possible 
			= bookList
				.stream()
				.filter(b->!b.isLoan()&&b.getNum().equals(num))
				.count() > 0;
		//�ùٸ��� ������(���� ������ȣ�̰ų�, �������� ������ ���)
		//�����Ҽ� ���ٰ� ���
		if(!possible) {
			System.out.println("������ �� �����ϴ�.");
			return;
		}
		//�ùٸ��� ������ ����
		//���� ���� ��ü�� ����. ����, ������, ����Ⱓ
		int index = bookList.indexOf(new Book(num, null, null, null));
		Date loanDate = new Date();
		LoanBrowsing lb 
			= new LoanBrowsing(bookList.get(index) , loanDate , 14);
		//���⿭�� ����Ʈ�� �߰�
		loanList.add(lb);
		bookList.get(index).loanBook();//������ �����ߴٰ� ����
		//�������� ���
		System.out.println("������ : " + lb.getLoanDateStr());
		//�ݳ������� ���
		System.out.println("�ݳ��� " + lb.getEstimatedDateStr());
	}

	private void insertBook() {
		sc.nextLine();//������ �Է��� ���� ó��
		//���� ���� �Է�
		System.out.print("���� ��ȣ : ");
		String num = sc.nextLine();
		System.out.print("���� ���� : ");
		String title = sc.nextLine();
		System.out.print("���� ���� : ");
		String author = sc.nextLine();
		System.out.print("ISBN    : ");
		String isbn = sc.nextLine();
		
		//�Է� ������ �̿��Ͽ� ���� ��ü�� ����
		Book book = new Book(num, title, author, isbn);
		
		//������ȣ �ߺ� üũ
		if(bookList.contains(book)) {
			System.out.println("�̹� ��ϵ� ���� ��ȣ�Դϴ�. Ȯ�����ּ���.");
			return;
		}
		
		//���� ����Ʈ�� ���� ��ü�� �߰�
		bookList.add(book);
	}

	private void printMenu() {
		System.out.println("�޴�");
		System.out.println("1. ���� ���");
		System.out.println("2. ���� ����");
		System.out.println("3. ���� �ݳ�");
		System.out.println("4. ����");
		System.out.print("�޴� ���� : ");
	}

	
}
