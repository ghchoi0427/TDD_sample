

public class Main {

    public static void main(String[] args){
        Junit junit = new Junit();

        System.out.println(junit.multi(2,4));

        System.out.println(junit.multi(5,7,9));

    }
}

class Junit{

    public int multi(int a, int b)
    {
        return a * b;
    }

    public int multi(int a, int b, int c)
    {
        return a * b * c;
    }
}
