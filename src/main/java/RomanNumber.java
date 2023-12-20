public class RomanNumber {
    private final int intValue;
    private final String stringValue;

    public RomanNumber(String value) {
        stringValue = value;
        intValue = Parse(value);
    }
    private int Parse(String s) {
        if (s.startsWith("M")) return 1000 + Parse(s.substring(1));
        if (s.startsWith("CM")) return 900 + Parse(s.substring(2));
        if (s.startsWith("D")) return 500 + Parse(s.substring(1));
        if (s.startsWith("CD")) return 400 + Parse(s.substring(2));
        if (s.startsWith("C")) return 100 + Parse(s.substring(1));
        if (s.startsWith("XC")) return 90 + Parse(s.substring(2));
        if (s.startsWith("L")) return 50 + Parse(s.substring(1));
        if (s.startsWith("XL")) return 40 + Parse(s.substring(2));
        if (s.startsWith("X")) return 10 + Parse(s.substring(1));
        if (s.startsWith("IX")) return 9 + Parse(s.substring(2));
        if (s.startsWith("V")) return 5 + Parse(s.substring(1));
        if (s.startsWith("IV")) return 4 + Parse(s.substring(2));
        if (s.startsWith("I")) return 1 + Parse(s.substring(1));
        return 0;
    }

    public RomanNumber(int value) {
        intValue = value;
        stringValue = ParseInt(value);
    }

    private String ParseInt(int value){
        if (value >= 1000) return "M" + ParseInt(value - 1000);
        if (value >= 900) return "CM" + ParseInt(value - 900);
        if (value >= 500) return "D" + ParseInt(value - 500);
        if (value >= 400) return "CD" + ParseInt(value - 400);
        if (value >= 100) return "C" + ParseInt(value - 100);
        if (value >= 90) return "XC" + ParseInt(value - 90);
        if (value >= 50) return "L" + ParseInt(value - 50);
        if (value >= 40) return "XL" + ParseInt(value - 40);
        if (value >= 10) return "X" + ParseInt(value - 10);
        if (value >= 9) return "IX" + ParseInt(value - 9);
        if (value >= 5) return "V" + ParseInt(value - 5);
        if (value >= 4) return "IV" + ParseInt(value - 4);
        if (value >= 1) return "I" + ParseInt(value - 1);
        return "";
    }

    public int getIntValue() {
        return intValue;
    }

    public String getStringValue() {
        return stringValue;
    }
}