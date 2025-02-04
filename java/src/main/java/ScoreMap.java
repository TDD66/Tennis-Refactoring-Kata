import java.util.AbstractMap;
import java.util.Map;

public class ScoreMap {
    private static final Map<Integer, String> scoreMap = Map.ofEntries(
            new AbstractMap.SimpleEntry<Integer, String>(0, "Love"),
            new AbstractMap.SimpleEntry<Integer, String>(1, "Fifteen"),
            new AbstractMap.SimpleEntry<Integer, String>(2, "Thirty"),
            new AbstractMap.SimpleEntry<Integer, String>(3, "Forty")
    );
}
