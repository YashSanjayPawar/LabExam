class SumOf100EvenNo
{
    public static void main(String[] args) {
        {
            int sum = 0;
            for (int i = 2; i <= 200; i += 2) {
                sum += i;
            }
            System.out.println("The sum of the first 100 even numbers is: " + sum);
        }
    }
}