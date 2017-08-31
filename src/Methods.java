/**
 * Created by Lenovo on 31.08.2017.
 */
public class Methods {

    public static void saySomething(){
        System.out.println("Witaj świecie, jestem metodą!");
    }

    public static int getMyLuckyNumber(){
        int lucky = 2 * 2 + 5 * 3;
        return lucky;
    }

    public static String getSomeText(int myInt, int mySecondInt){
        return myInt + " : " + mySecondInt;
    }

    public static void someMethodWithArray(String ... names){
        for(String name : names){
            System.out.println(name);
        }
    }

    // Napisz metodę, która doda do siebie dwie liczby i zwróci wynik
    public static int sum(int a, int b){
        return a + b;
    }

    //Napisz metodę, która wymnoży przez siebie dwie zadane liczby i zwróci wynik
    public static int multiply(int a, int b){
        return a * b;
    }

    //Napisz metodę, która podzieli przez siebie dwie zadane liczby i zwróci wynik
    public static double divide(double a, double b){
        if(b == 0){
            System.out.println("Nie dziel przez 0!");
            return 0;
        }
        return a / b;
    }

    //Napisz metodę, która wypisze do konsoli dzielniki zadanej liczby
    public static void dividers(int n){
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.println(i);
            }
        }
    }

    //Sprawdź czy zadana liczba, jest liczbą pierwszą
    public static boolean isPrimaryNumber(int n){
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    //Napisz metodę, która zwróci liczbę n do a
    //Napisz metodę, która wypisze liczby pierwsze z przedziału a do n*
    //Napisz metodę, która znajdzie największy wspólny dzielnik dwóch liczb (euklides)

    public static void findPrimaryNumbers(int a, int b){
        for(int i = a; i <= b; i++){
            if(isPrimaryNumber(i)){
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args) {
        System.out.println(sum(5, 5));
        System.out.println(multiply(5, 5));
        dividers(10);
    }


}
