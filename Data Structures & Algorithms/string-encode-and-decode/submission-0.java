class Solution {
    //encode
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String s : strs) {
            sb.append(s.length()).append('#').append(s);
        }

        return sb.toString();
    }
    //decode
    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            // 1) Read length until '#'
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }

            int len = Integer.parseInt(str.substring(i, j));

            // 2) Extract string of that length
            j++; // move past '#'
            String s = str.substring(j, j + len);
            res.add(s);

            // 3) Move index to next encoded part
            i = j + len;
        }

        return res;
    }
}
