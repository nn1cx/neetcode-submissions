class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();
        for (String string: strs) {
            str.append(string.length() + "#" + string);
        }

        return str.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded_strs = new ArrayList<>();
        
        int left = 0;
        int right = 0;
        while (left < str.length()) {
            if (str.charAt(right) != '#') {
                right++;
            }
            else {
                int length = Integer.parseInt(str.substring(left, right));
                left = right + 1;
                right = left + length;
                decoded_strs.add(str.substring(left, right));
                left = right;
            }
        }

        return decoded_strs;
    }
}
