public class FizzBuzzed {
    public static void main(String[] args){
        System.out.println(fizzBuzz(20));
    }
    public static String fizzBuzz(Integer num){
        String fizzBuzz ="";
        for (int i = 0; i < num; i++){
            if (num % 3 == 0 && num % 5 == 0){
                fizzBuzz = "FizzBuzz";
            } else if (num % 5 == 0){
                fizzBuzz = "Buzz";

            } else if (num % 3 == 0){
                fizzBuzz = "Fizz";
            } else {
                return num.toString();
            }
        }
        return fizzBuzz;
    }
}
