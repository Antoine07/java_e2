
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java oui !");

        // tester les déclarations de types ici 
        int a = 1 ;
        System.out.println(a + " " + a);
        double b = 16.9;
        System.out.println(b + " " + b);
        boolean status = true;
        System.out.println(status);
        char m = 'j';
        System.out.println(m);
        // Object 
        Integer[] numbers = {1, 2, 3};
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        for(Integer n: numbers){
            System.out.println(n);
        }
        // création de l'objet de type StringAnalyzer
        StringAnalyzer s = new StringAnalyzer("Bonjour tout 123 JAVA");

        // System.out.println( "Bonjour".indexOf("o") + " " + "Bonjour".indexOf("x"));

        System.out.println( "Nombre de voyelles " + s.countVowels());

        char letter = 'B';
        char letter2 = 'D';

        System.out.println( 'A' < letter && letter < 'C' );
        System.out.println( 'A' < letter2 && letter2 < 'C' );

        char number = '0';

        System.out.println( '0' <= number && number <= '9' );
        System.out.println( "nombre de digits " + s.countDigits() );
        System.out.println( "nombre de majuscule " + s.countUppercase() );
    }


}
