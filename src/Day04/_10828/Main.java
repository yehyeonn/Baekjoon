package Day04._10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        for (int i = 1; i <=n ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();

            switch (a) {
                case "push":
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if(!stack.empty()) sb.append(stack.pop()).append("\n");
                    else sb.append(-1).append("\n");    // 비어있을 경우
                    break;
                case "size":
                    sb.append(stack.size()).append("\n");
                    break;
                case "empty":
                    if(!stack.empty()) sb.append(0).append("\n");
                    else sb.append(1).append("\n");
                    break;
                case "top":
                    if(!stack.empty()) sb.append(stack.peek()).append("\n");
                    else sb.append(-1).append("\n");
                    break;
            }
        }
            System.out.println(sb);
    }
}
