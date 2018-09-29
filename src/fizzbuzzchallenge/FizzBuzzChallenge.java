
package fizzbuzzchallenge;

/*
    Author Dan St Jean
*/
public class FizzBuzzChallenge {

    
    public static void main(String[] args) {
        
        numberRunner();
    }
    
    static void numberRunner()
    {
        for(int i = 1; i <=100; i++)
        {
            if(i % 5 == 0 && i % 3 == 0)
            {
                System.out.println("FizzBuzz");
            }
            else if(i % 3 == 0)
            {
                System.out.println("Fizz");
            }
            else if(i % 5 == 0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
    
}
