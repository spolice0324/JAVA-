package Part3.ex2.메소드;

import java.util.Scanner;

public class ExamList {
        Exam[] exams;
        private int current;
        //private이 이 클래스 외에 다른 클래스에서 current를 선언해도 문제가 없게 만들 수 있다.

        void printList() {
                this.printList(this.current);
        }
        void printList(int size) {
                System.out.println("성적 출력");
                //int size = list.current;
                Exam[] exams = this.exams;

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

        void inputList() {
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

                Exam[] exams = this.exams;
                int size = current;

                if (exams.length == size) {
                        //1. 크기가 더 큰 배열을 생성하기
                        Exam[] temp = new Exam[size + 5];
                        // 2. 값을 이주 시키기

                        for (int i = 0; i < size; i++)
                                temp[i] = exams[i];
                        //3. list.exams가 새로 만든 temp배열을 넘겨받아 참조할 수 있게 한다.
                        exams = temp;
                }
                exams[current] = exam;
                current++;

        }
        public ExamList() { //호출과 동시에 초기화 하기 때문에 Init의 역할을 함
                //생성자 ExamList는 반환의 목적이 아니기때문에 반환값이 없다.
                //만들어진 객체를 넘거받는 용도, 함수이름이 아님 (생성자는 함수명이 없다.)
                //초기화할 객체를 한정하기 위해 사용되는 명칭임
                this.exams = new Exam[3];
                this.current = 0;
                //사실 this. 를 통해 무조건 받기 때문에 지워도 됨
        }
}
