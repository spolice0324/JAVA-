import java.util.Scanner;

public class ExamConsole { //콘솔 = 입출력 메소드 모음
    //composition Has A 상속 관계  (일체형)
    private ExamList list;
    public ExamConsole() {
        list = new ExamList();
    }
   //위 코드와 같음 =>  private ExamList list = new ExamList();


    public void printList() {
        printList(list.size());
    }
    public void printList(int size) {
        System.out.println("성적 출력");

        //int size = list.current;

        for(int i = 0; i<size; i++) {
            Exam exam = list.get(i); //this.exams[i];
            int kor = exam.getKor(); //exam.kor;
            int eng = exam.getEng();
            int math = exam.getMath();

            int total = exam.total(); //kor+eng+math;
            float avg = exam.avg(); //total()/3.0f;

            System.out.printf("국어:  %d\n ", kor);
            System.out.printf("영어:  %d\n ", eng);
            System.out.printf("수학:  %d\n ", math);
            System.out.printf("총점:  %d\n ", total);
            System.out.printf("평균:  %f\n ", avg);
        }
    }

    public void inputList() {
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

        Exam exam = new Exam(kor, eng, math);

//                Exam exam = new Exam();
//                exam.setKor(kor); //exam.kor = kor;
//                exam.setEng(eng); //exam.eng = eng;
//                exam.setMath(math);

//---------add-------------------------------------------------
        list.add(exam);
    }
}


