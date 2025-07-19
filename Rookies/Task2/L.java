package Task2;
import java.util.*;

public class L {

    public static void StringFunctions(int N, int Q, String S, List<String> queries) {
        StringBuilder s = new StringBuilder(S);

        for (String query : queries) {
            String[] cmd = query.split(" ");

            switch (cmd[0]) {
                case "pop_back":
                    if (s.length() > 0)
                        s.deleteCharAt(s.length() - 1);
                    break;

                case "push_back":
                    s.append(cmd[1]);
                    break;

                case "front":
                    if (s.length() > 0)
                        System.out.println(s.charAt(0));
                    break;

                case "back":
                    if (s.length() > 0)
                        System.out.println(s.charAt(s.length() - 1));
                    break;

                case "print":
                    int pos = Integer.parseInt(cmd[1]) - 1;
                    if (pos >= 0 && pos < s.length())
                        System.out.println(s.charAt(pos));
                    break;

                case "substr":
                    int l1 = Integer.parseInt(cmd[1]) - 1;
                    int r1 = Integer.parseInt(cmd[2]);
                    if (l1 >= 0 && r1 <= s.length() && l1 < r1)
                        System.out.println(s.substring(l1, r1));
                    break;

                case "reverse":
                    int l2 = Integer.parseInt(cmd[1]) - 1;
                    int r2 = Integer.parseInt(cmd[2]);
                    if (l2 >= 0 && r2 <= s.length() && l2 < r2) {
                        String subRev = s.substring(l2, r2);
                        s.replace(l2, r2, new StringBuilder(subRev).reverse().toString());
                    }
                    break;

                case "sort":
                    int l3 = Integer.parseInt(cmd[1]) - 1;
                    int r3 = Integer.parseInt(cmd[2]);
                    if (l3 >= 0 && r3 <= s.length() && l3 < r3) {
                        char[] toSort = s.substring(l3, r3).toCharArray();
                        Arrays.sort(toSort);
                        s.replace(l3, r3, new String(toSort));
                    }
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int Q = in.nextInt();
        in.nextLine(); // مهم لتجنب قراءة سطر فاضي بعد nextInt
        String S = in.nextLine();

        List<String> queries = new ArrayList<>();
        for (int i = 0; i < Q; i++) {
            queries.add(in.nextLine());
        }

        StringFunctions(N, Q, S, queries);
    }
}

