package khh.dfsbfs;

public class CallByVallue {


    public static void main(String[] args) {
        int num = 2;
        ValueTest valueTest = new ValueTest();
        valueTest.setName("VALUE");

        System.out.println("before-------------------------------------------");
        System.out.println("num = " + num);
        System.out.println("valueTest = " + System.identityHashCode(valueTest));
        System.out.println("valueTest.getName() = " + valueTest.getName());
        valueTest(num, valueTest);
        System.out.println("after-------------------------------------------");
        System.out.println("num = " + num);
        System.out.println("valueTest = " + System.identityHashCode(valueTest));
        System.out.println("valueTest.getName() = " + valueTest.getName());
    }

    public static void valueTest(int number, ValueTest valueTest){
        System.out.println();
        System.out.println("valueTest()_b_number = " + number);
        System.out.println("valueTest()_b_valueTest = " + System.identityHashCode(valueTest));
        System.out.println("valueTest()_b_valueTest.getName() = " + valueTest.getName());
        number = 3;
        valueTest.setName("VALUE11111");
        ValueTest vt = new ValueTest();
        vt.setName("VT");
        valueTest = vt;
        System.out.println("valueTest()_number = " + number);
        System.out.println("valueTest()_valueTest = " + System.identityHashCode(valueTest));
        System.out.println("valueTest()_valueTest.getName() = " + valueTest.getName());
    }
}
