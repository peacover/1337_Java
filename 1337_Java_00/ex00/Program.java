
class Program {

    public static void main(String[] args) {
        int num = 479598;
        if (num < 0) {
            num *= -1;
        }
        int ret = num % 10;
        while (num > 0) {
            num = (num / 10);
            ret += num % 10;
        }
        System.out.println(ret);
    }
}
