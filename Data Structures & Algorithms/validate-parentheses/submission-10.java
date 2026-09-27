class Solution {
    public boolean isValid(String s) {
        // Declaramos un stack 
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            switch(c) {
                case '(':
                    stack.push(c);
                    break;
                case ')':
                    if(!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    }  else {
                        stack.push(c);
                    }
                    break;
                case '{':
                    stack.push(c);
                    break;
                case '}':
                    if(!stack.isEmpty() && stack.peek() == '{') {
                        stack.pop();
                    }  else {
                        stack.push(c);
                    }
                    break;
                case '[':
                    stack.push(c);
                    break;
                case ']':
                    if(!stack.isEmpty() && stack.peek() == '[') {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                    break;
            }
        }

        return stack.isEmpty();
    }
}
