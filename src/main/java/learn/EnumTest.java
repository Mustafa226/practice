package learn;

import java.util.Arrays;

public class EnumTest {

    public static void main(String[] args) {
        System.out.println(Color.getColorForCode("1"));
    }

    public enum Color {

        PURPLE("0"), WHITE("1"), RED("2");

        String code;

        Color(String code) {
            this.code = code;
        }

        public String getCode() {
            return this.code;
        }

        public static Color getColorForCode(String code) {
            return Arrays.stream(Color.values())
                    .filter(color -> color.getCode().equals(code))
                    .findFirst().orElse(null);
        }

    }

}
