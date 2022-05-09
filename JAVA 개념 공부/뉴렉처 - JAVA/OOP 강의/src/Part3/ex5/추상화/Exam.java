package Part3.ex5.추상화;

public abstract class Exam {
    int kor;
    int eng;
    int math;

    public Exam() {
        this(0,0,0);
    }

    public Exam(int kor, int eng, int math) {
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public abstract int total();

    protected int onTotal() { //자식에게만 허용해주는 옵션 protected, 일반적으로 공개된 다른 메소드들에서는 보여지지 않음.
        return kor + eng + math;
    }
    public abstract float avg();
}

