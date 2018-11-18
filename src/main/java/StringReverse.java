public class StringReverse {

    String solution(String source) {
        if (source == null || source.isEmpty())
            return source;
        StringBuilder target = new StringBuilder();
        for (int i = source.length() - 1; i >= 0; i--) {
            target.append(source.charAt(i));
        }
        return target.toString();
    }

}
