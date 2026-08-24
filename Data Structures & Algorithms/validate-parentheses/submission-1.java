class Solution {
    public boolean isValid(String s) {
        Stack<Character> so = new Stack<>();

        for ( int i =0 ; i < s.length(); i ++){
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                so.push(c);
            } else {
                if (so.isEmpty()) return false;
                char top = so.pop();
                if (c == ')' && top != '(') return false;
                if (c == ']' && top != '[') return false;
                if (c == '}' && top != '{') return false;
            }
        }
        return so.isEmpty();
    }
}
