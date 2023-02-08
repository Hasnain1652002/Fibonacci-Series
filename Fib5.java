import java.util.stream.IntStream;

public class Fib5 {
    private int last=0, next=1 ;

    private IntStream stream () 
    {
        return IntStream.generate(() ->{
            int oldlast = last ;
            last = next;
            next= oldlast + last;
            return oldlast;
        }
        );   
    }
    public static void main(String[] args) {
        Fib5 fib5 = new Fib5();
        fib5.stream().limit(41).forEachOrdered(System.out::println);  
    }
}
