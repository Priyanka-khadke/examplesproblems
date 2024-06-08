package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

import static org.example.TestExample10.getUniqueCharacter;

public class TestExample10Test {

    @Test
    public void getUniqueCharacterTestWithSpecialCharacter() {
        String random = "AAAC@CBEEE";
        Character c = getUniqueCharacter(random);
        Assert.assertEquals(c.charValue(),'B');

    }

    //@Test
    public void getUniqueCharacterTestWithDigit() {
        String random = "AAAC1CBEEE";
        Character c = getUniqueCharacter(random);
        Assert.assertEquals(c.charValue(),'B');

    }
}
