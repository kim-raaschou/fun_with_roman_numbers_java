import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RomanNumberTests {

    static Stream<Arguments> romanNumberTestScenarios() {
        return Stream.of(
                arguments(1, "I"),
                arguments(4, "IV"),
                arguments(5, "V"),
                arguments(9, "IX"),
                arguments(10, "X"),
                arguments(40, "XL"),
                arguments(50, "L"),
                arguments(90, "XC"),
                arguments(100, "C"),
                arguments(400, "CD"),
                arguments(500, "D"),
                arguments(900, "CM"),
                arguments(1000, "M")
        );
    }

    @ParameterizedTest
    @MethodSource("romanNumberTestScenarios")
    public void Should_parse_roman_number_int_to_stringValue(int i, String s){
        assertEquals(s, new RomanNumber(i).getStringValue());
    }

    @ParameterizedTest
    @MethodSource("romanNumberTestScenarios")
    public void Should_parse_roman_number_string_to_intValue(int i, String s){
        assertEquals(i, new RomanNumber(s).getIntValue());
    }


    @Test
    public void Should_parse_MCDXXXIII_to_1433(){
        assertEquals(1433, new RomanNumber("MCDXXXIII").getIntValue());
    }
}
