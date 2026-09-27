class Solution {
    public int calPoints(String[] operations) {
        int total = 0;
        Stack<Integer> stack = new Stack<>();

        for (String c : operations) {
            if (c.equals("+")) {
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
                total += newTop;
            } else if (c.equals("D")) {
                int tmp = stack.peek() * 2;
                total += tmp;
                stack.push(tmp);
            } else if (c.equals("C")) {
                total -= stack.pop();
            } else {
                int tmp = Integer.valueOf(c);
                total += tmp;
                stack.push(tmp);
            }
        }

        return total;
    }
}