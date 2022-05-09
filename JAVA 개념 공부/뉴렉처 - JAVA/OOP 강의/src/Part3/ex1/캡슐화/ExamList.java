package Part3.ex1.캡슐화;

import java.util.Scanner;

public class ExamList {
        Exam[] exams;
        int current;

        static void printList(ExamList list) {
                printList(list, list.current);
        }
        static void printList(ExamList list, int size) {
                System.out.println("성적 출력");
                //int size = list.current;
                Exam[] exams = list.exams;

                for(int i = 0; i<size; i++) {
                        Exam exam = exams[i];
                        int kor = exam.kor;
                        int eng = exam.eng;
                        int math = exam.math;

                        int total = kor+eng+math;
                        float avg = total/3.0f;

                        System.out.printf("국어:  %d\n ", kor);
                        System.out.printf("영어:  %d\n ", eng);
                        System.out.printf("수학:  %d\n ", math);
                        System.out.printf("총점:  %d\n ", total);
                        System.out.printf("평균:  %f\n ", avg);
                }
        }
        static void inputList(ExamList list) {
                Scanner scan = new Scanner(System.in);
                System.out.println("성적입력");
                int kor, eng, math;

                do {
                        System.out.printf("국어 : ");
                        kor = scan.nextInt();

                        if (kor < 0 || 100 < kor)
                                System.out.println("국어 성적 범위는 1~100");
                } while (kor < 0 || 100 < kor);

                do {
                        System.out.printf("영어 : ");
                        eng = scan.nextInt();

                        if (eng < 0 || 100 < eng)
                                System.out.println("영어 성적 범위는 1~100");
                } while (eng < 0 || 100 < eng);

                do {
                        System.out.printf("수학 : ");
                        math = scan.nextInt();

                        if (math < 0 || 100 < math)
                                System.out.println("국어 성적 범위는 1~100");
                } while (math < 0 || 100 < math);

                Exam exam = new Exam();
                exam.kor = kor;
                exam.eng = eng;
                exam.math = math;

                Exam[] exams = list.exams;
                int size = list.current;

                if (exams.length == size) {
                        //1. 크기가 더 큰 배열을 생성하기
                        Exam[] temp = new Exam[size + 5];
                        // 2. 값을 이주 시키기

                        for (int i = 0; i < size; i++)
                                temp[i] = exams[i];
                        //3. list.exams가 새로 만든 temp배열을 넘겨받아 참조할 수 있게 한다.
                        list.exams = temp;
                }
                list.exams[list.current] = exam;
                list.current++;

        }
        public static void init(ExamList list) {
                list.exams = new Exam[3];
                list.current = 0;
        }
}
