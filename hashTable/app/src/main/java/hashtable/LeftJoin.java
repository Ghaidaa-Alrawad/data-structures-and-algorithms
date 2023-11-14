package hashTable.app.src.main.java.hashtable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LeftJoin {
    public static List<List<String>> leftJoin(Map<String, String> synonyms, Map<String, String> antonyms) {
        List<List<String>> result = new ArrayList<>();

        for (Map.Entry<String, String> entry : synonyms.entrySet()) {
            List<String> row = new ArrayList<>();
            String key = entry.getKey();
            String synonymValue = entry.getValue();
            String antonymValue = antonyms.getOrDefault(key, null);

            row.add(key);
            row.add(synonymValue);
            row.add(antonymValue);

            result.add(row);
        }

        return result;
    }
}
