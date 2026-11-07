class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str: strs) {
            sb.append(str.length()).append("#").append(str);
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList();
        int index = 0;
        while(index < str.length()) {
            int nextDelimeterIndex = str.indexOf("#", index);
            int length = Integer.parseInt(str.substring(index, nextDelimeterIndex));
            int endIndex = nextDelimeterIndex + 1 + length;
            result.add(str.substring(nextDelimeterIndex + 1, endIndex));
            index = endIndex;
        }
        return result;
    }
       
}
