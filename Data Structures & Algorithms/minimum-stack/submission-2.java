class MinStack {

    private ArrayList<Integer> arr;

    public MinStack() {
        arr = new ArrayList<>();
    }
    
    public void push(int val) {
        arr.add(val);
    }
    
    public void pop() {
        arr.remove(arr.size() - 1);
    }
    
    public int top() {
        return arr.get(arr.size() - 1);
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int i : arr) {
            min = Math.min(min, i);
        }

        return min;
    }
}
