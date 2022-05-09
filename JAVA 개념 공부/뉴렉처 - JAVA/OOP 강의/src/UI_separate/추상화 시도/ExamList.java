package 추상화;

public class ExamList {

        private Exam[] exams;
        private int current;

        public Exam get(int i) { return this.exams[i];
        }
        public void add(Exam exam) {
                Exam[] exams = this.exams;
                int size = this.current;

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

        public int size() {
                return current;
        }
}
