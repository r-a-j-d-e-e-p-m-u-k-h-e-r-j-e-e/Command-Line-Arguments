class Fibonacci{ 
    public static void main (String args[]) throws Exception{
        int num = Integer.parseInt(args[0]);
        System.out.println(" Fibonaaci series upto " + args[0] + " is as follows:");
        int firstTerm = 0, secondTerm = 1, nextTerm = 0;

        for (int i = 0; i <= num; i++) {
            System.out.print(" " + nextTerm + " ");
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            nextTerm = firstTerm + secondTerm;
        }
    }
}