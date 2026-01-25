package Questions;
import java.util.List;
import java.util.Stack;
public class ExvlusiveTimeOfFunction {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        int prevTime = 0;

        for (String log : logs) {
            String[] parts = log.split(":");
            int id = Integer.parseInt(parts[0]);
            boolean isStart = parts[1].equals("start");
            int time = Integer.parseInt(parts[2]);

            if (isStart) {

                if (!stack.isEmpty()) {
                    result[stack.peek()] += time - prevTime;
                }
                stack.push(id);
                prevTime = time;
            }
            else {
                result[stack.peek()] += time - prevTime + 1;
                stack.pop();
                prevTime = time + 1;
            }
        }

        return result;
    }
}
