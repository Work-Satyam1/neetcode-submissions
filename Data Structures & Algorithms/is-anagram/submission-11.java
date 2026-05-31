class Solution {
    public boolean isAnagram(String s, String t) {

        int n = s.length();
        int m = t.length();

        if (n != m) return false;

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : t.toCharArray()) {
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }

        for (char ch : s.toCharArray()) {
            if (!map.get(ch).equals(map2.get(ch))) {
                return false;
            }
        }

        return true;
    }
}