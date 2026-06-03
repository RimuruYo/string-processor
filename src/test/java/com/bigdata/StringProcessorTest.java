package com.bigdata;

import org.junit.Test;
import java.util.Map;
import static org.junit.Assert.*;

public class StringProcessorTest {

    @Test
    public void testReverseString() {
        assertEquals("olleh", StringProcessor.reverseString("hello"));
        assertEquals("", StringProcessor.reverseString(""));
        assertNull(StringProcessor.reverseString(null));
    }

    @Test
    public void testCountCharacterFrequency() {
        // 传入正确的参数 "character"
        Map<Character, Integer> result = StringProcessor.countCharacterFrequency("character");

        assertEquals(2, (int)result.get('c'));
        assertEquals(1, (int)result.get('h'));
        assertEquals(2, (int)result.get('a'));
        assertEquals(2, (int)result.get('r'));
        assertEquals(1, (int)result.get('t'));
        assertEquals(1, (int)result.get('e'));

        assertNull(StringProcessor.countCharacterFrequency(null));
        assertTrue(StringProcessor.countCharacterFrequency("").isEmpty());
    }
}