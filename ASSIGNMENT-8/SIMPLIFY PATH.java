class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] parts = path.split("/");

        for (String part : parts) {
            if (part.equals("") || part.equals(".")) {
                continue;
            }else if(part.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            } else{
                stack.push(part);
            }
        }
        return "/"+String.join("/", stack);
    }
}
