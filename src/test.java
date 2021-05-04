class Solution {
    public static void main(String[] args) {
        String str=" S     ";
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                sb.append("%20");
            }else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
        public String replaceSpace(String s) {
            StringBuilder sb=new StringBuilder();
            for (int i=0;i<s.length();i++){
                if(s.charAt(i)==' '){
                    sb.append("%20");
                }else{
                    sb.append(s.charAt(i));
                }
            }
            s=sb.toString();
            return s;
        }
}