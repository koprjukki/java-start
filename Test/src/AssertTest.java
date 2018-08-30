public class AssertTest {
    public static void main(String args[]){
        int x = 10;
        assert x == 10;
        assert x == 11 : "x == 11, mda" + x;

    }
}
