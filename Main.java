
public class Main {
    public static void main(String[] args) {
        RandomCharacter random = new RandomCharacter();

        System.out.println("Lower Case Letters: ");
        for(int i=0;i<15;i++){
            System.out.print(random.getRandomLowerCaseLetter() + " ");
        }

        System.out.println("\nUpper Case Letters: ");
        for(int i=0;i<15;i++){
            System.out.print(random.getRandomUpperCaseLetter() + " ");
        }

        System.out.println("\nDigit Characters: ");
        for(int i=0;i<15;i++){
            System.out.print(random.getRandomDigitCharacter() + " ");
        }

        System.out.println("\nRandom Characters: ");
        for(int i=0;i<15;i++){
            System.out.print(random.getRandomCharacter() + " ");
        }

        System.out.println("\nPrime Numbers: ");
        for(int i=0;i<15;i++){
            System.out.print(random.getPrime() + " ");
        }

    }
}