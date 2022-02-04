public class addition{
    int a;
    int b;

    addition(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int MultiplyAdd(int c, int d){
        int newValue1 = c*a;
        int newValue2 = d*b;
        return newValue1 + newValue2;
    }
}
