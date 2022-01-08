public class NormalAlgorithm {

    private int first;
    private int second;

    public NormalAlgorithm(int first, int second) {
        this.first = first;
        this.second = second;
    }
    public void searchGCD(){
        while (first != 0 & second !=0 ) {
            if (first > second)
                first = first % second;
            else second = second % first;
        }
        System.out.println("By normal algorithm gcd = " + (first+second));
    }
}