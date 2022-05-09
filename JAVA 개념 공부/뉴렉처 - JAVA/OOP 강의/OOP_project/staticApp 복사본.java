
public class staticApp {
    public static void main(String[] args) {
        System.out.println(Foo.classVar); //Ok
//        System.out.println(Foo.instanceVar); //Error
          Foo.classMethod();
//        Foo.instanceMethod();
}
    class Foo{
        public static String classVar = "I class var";
        public String instanceVAr ="I instance var";
        public static void classMethod()
        {
            System.out.println(classVar); //OK
//            System.out.println(instanceVar); //Error
        }
        public void instancMethod()
        {
            System.out.println(classVar);
            System.out.println(instanceVAr);
        }

    }

}
