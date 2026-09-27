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
                stack.push(stack.peek() * 2);
                total += stack.peek();
            } else if (c.equals("C")) {
                total -= stack.pop();
            } else {
                stack.push(Integer.valueOf(c));
                total += stack.peek();
            }
        }

        return total;
    }
}