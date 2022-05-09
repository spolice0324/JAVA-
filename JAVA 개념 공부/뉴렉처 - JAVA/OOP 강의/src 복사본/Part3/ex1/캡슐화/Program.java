package Part3.ex1.캡슐화;

import java.util.Scanner;

public class Program
{
    public static void main(String[] args) {

        ExamList list = new ExamList();
        ExamList.init(list);
        //exams와 current를 포함하여 묶여있는 list라는 클래스를 전달하여 메소드에서 인자로 받을 때에서 List로 보내준다.
        int menu;
        boolean Loop = true;

        while(Loop)
        {
            menu = inputMenu();

            switch(menu) {
                case 1:
                    ExamList.inputList(list);
                    break;
                case 2:
                    ExamList.printList(list);
                    break;
                case 3:
                    System.out.println("Bye");
                    Loop = false;
                    break;

                default:
                    System.out.println("error 1~3 입력");
            }
        }
    }

    static int inputMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("메인 메뉴");
        System.out.println("1. 성적입력");
        System.out.println("2. 성적출력");
        System.out.println("3. 종료");
        int menu = scan.nextInt();

        return menu;
    }

}
