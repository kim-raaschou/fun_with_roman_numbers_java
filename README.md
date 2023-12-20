# Fun With Roman Numbers Java edition

Velkommen til "Fun With Roman Numbers" - en legende og humoristisk kode kata, hvor jeg udforsker den spændende verden af romertal i Java.

## Opgaven

Med udgangspunkt i kodekataen [Roman Numerals Kata](https://codingdojo.org/kata/RomanNumerals) har jeg udviklet en enkel implementering, der kan konvertere mellem romertal som strenge og numeriske tal.

Tag en dyb indånding, og dyk ned i koden.

God fornøjelse. 

## Kode Eksempeler
```java
@Test
public void Should_parse_MCDXXXIII_to_1433(){
    assertEquals(1433, new RomanNumber("MCDXXXIII").getIntValue());
}

@Test
public void Should_parse_1433_MCDXXXIII(){
    assertEquals("MCDXXXIII", new RomanNumber(1433).getStringValue());
}
