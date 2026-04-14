class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(char s1 : s.toCharArray()){
            if(s1 == '('){
                stack.push(')');
            }
            else if(s1 == '{'){
                stack.push('}');
            } else if(s1 == '['){
                stack.push(']');
            }
            else if(stack.isEmpty() || stack.pop() != s1){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
