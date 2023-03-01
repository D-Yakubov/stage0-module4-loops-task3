package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int firstFib=0, secondFib=1,nextFib;
        for (int i = 1; i<= lastFibonacci; i++){
            System.out.println(firstFib);
            nextFib = firstFib + secondFib;
            firstFib = secondFib;
            secondFib = nextFib;
        }
    }
}
