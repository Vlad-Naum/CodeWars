package zadachi;

import java.util.*;

public class Permutations {
    public static List<String> singlePermutations(String s) {
        Set<String> set = new HashSet<>();
        set.add(s);
        char[] ch = s.toCharArray();
        Random r = new Random();
        for (int i = 0; i < 50000; i++) {
            String str = new String();
            Set<Integer> set2 = new LinkedHashSet<>();
            for (int j = 0; j < 1000; j++) {
                int rr = r.nextInt(ch.length);
                set2.add(rr);
                if (set2.size() == ch.length){
                    break;
                }
            }
            Iterator<Integer> iter = set2.iterator();
            while (iter.hasNext()){
                str += ch[iter.next()];
            }
            set.add(str);
        }
        return new ArrayList(set);
    }
}
