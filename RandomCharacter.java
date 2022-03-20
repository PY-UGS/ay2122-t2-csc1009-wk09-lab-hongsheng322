import java.util.Random;

public class RandomCharacter {
    private char c;
    Random r = new Random();

    public char getRandomLowerCaseLetter(){
        c = (char)('a' + Math.random() * 26);
        return c;
    }

    public char getRandomUpperCaseLetter(){
        c = (char)('A' + Math.random() * 26);
        return c;
    }

    public char getRandomDigitCharacter(){
        int i = r.nextInt(10);
        c = Character.forDigit(i,10);
        return c;
    }

    public char getRandomCharacter(){
        c = (char)(r.nextInt(95) + 32);
        return c;
    }

    public static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;
  
        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
  
        return true;
    }

    public int getPrime(){
        int x = r.nextInt(100) + 1;

        while (!isPrime(x)) {
            x = r.nextInt(100) + 1;
        }
        return x;
    }

    public static void main(String[] args) {
        RandomCharacter random = new RandomCharacter();

        System.out.println("Lower Case Letters: ");
        for(int i=0;i<15;i++){
            System.out.print(random.getRandomLowerCaseLetter() + " ");;;
        }

        System.out.println("\nUpper Case Letters: ");
        for(int i=0;i<15;i++){
            System.out.print(random.getRandomUpperCaseLetter() + " ");;;
        }

        System.out.println("\nDigit Characters: ");
        for(int i=0;i<15;i++){
            System.out.print(random.getRandomDigitCharacter() + " ");;;
        }

        System.out.println("\nRandom Characters: ");
        for(int i=0;i<15;i++){
            System.out.print(random.getRandomCharacter() + " ");;;
        }

        System.out.println("\nPrime Numbers: ");
        for(int i=0;i<15;i++){
            System.out.print(random.getPrime() + " ");;;
        }

    }
}