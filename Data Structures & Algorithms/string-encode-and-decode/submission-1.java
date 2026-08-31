class Solution {


    public String encode(List<String> strs) {
        if (strs.isEmpty()) return "EMPTY_LIST";
        StringBuilder encoded = new StringBuilder();
        for (int i = 0; i < strs.size(); i++) {
            for (char c : strs.get(i).toCharArray())
                encoded.append((int) c).append(' ');
            if (i < strs.size() - 1) encoded.append("-1 ");
        }
        return encoded.toString().trim();
    }

    public List<String> decode(String str) {
        if (str.equals("EMPTY_LIST"))
            return new ArrayList<>();
        if (str == null || str.isEmpty())
            return List.of("");
        String[] codes = str.split(" ");
        List<String> out = new ArrayList<>();
        StringBuilder cur = new StringBuilder();
        for (String code : codes) {
            int n = Integer.parseInt(code);
            if (n == -1)
            {
                out.add(cur.toString());
                cur.setLength(0);
            }
            else
                cur.append((char) n);
        }
        out.add(cur.toString());
        return out;
    }
}
