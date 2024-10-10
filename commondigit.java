import java.util.*;

class commondigit {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int d = obj.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        while (a > 0) {
            int c = a % 10;
            list.add(c);
            a = a / 10;
        }

        while (b > 0) {
            int c = b % 10;
            list.add(c);
            b = b / 10;
        }

        while (d > 0) {
            int c = d % 10;
            list.add(c);
            d = d / 10;
        }

        HashSet<Integer> printed = new HashSet<>();

        for (int i = 0; i < list.size(); i++) {
            int digit = list.get(i);
            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) == digit) {
                    count++;
                }
            }

            if (count == 3 && !printed.contains(digit)) {
                System.out.print(digit + " ");
                printed.add(digit); 
            }
 }
}
}
