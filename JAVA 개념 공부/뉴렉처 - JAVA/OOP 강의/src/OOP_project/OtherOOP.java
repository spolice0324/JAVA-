import java.io.FileWriter;
import java.io.IOException;

public class OtherOOP {
    public static void main(String[] args) throws IOException {
        System.out.println(Math.PI);

        FileWriter f1 = new FileWriter("data.txt");
        f1.write("Hello");
        f1.write(" Java");
        f1.close();

        //FileWriter는 똑같은 클래스지만 앞에 new를 붙여 f1이라는 변수에 담기는 복제본을 만듦.

        FileWriter f2 = new FileWriter("data2.txt");
        f2.write("Hello");
        f2.write(" Java2");
        f2.close();

        //f1과는 다른 복제본

    }
}
