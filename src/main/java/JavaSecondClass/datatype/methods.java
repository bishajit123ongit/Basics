package JavaSecondClass.datatype;

public class methods {
    int sum;
    public void sum(int a,int b){
        sum=a+b;
    }
    public int getSum(){
        return this.sum;
    }
    public static void main(String[] args){
        methods m = new methods();
        m.sum(10,5);
        System.out.println(m.getSum());

    }
}
