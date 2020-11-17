package org.example;

import static org.junit.Assert.assertTrue;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Before
    public void setUp() {
        Configuration.startMaximized=true;
    }

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void googleSearch() {
        open("https://www.google.ru/");
        $x("//*[@name='q']").setValue("GeekBrains").pressEnter();
        $x("//*[starts-with(@class, 'qrShPb')]/span").shouldHave(text("GeekBrains"));
    }
}
