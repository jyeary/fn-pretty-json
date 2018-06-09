package com.example.fn;

import com.bluelotussoftware.fn.PrettyPrint;
import com.fnproject.fn.testing.*;
import org.junit.*;
import static org.junit.Assert.*;

public class PrettyPrintFunctionTest {

    @Rule
    public final FnTestingRule testing = FnTestingRule.createDefault();

    @Test
    public void shouldReturnEmptyJson() {
        testing.givenEvent().enqueue();
        testing.thenRun(PrettyPrint.class, "handleRequest");
        FnResult result = testing.getOnlyResult();
        assertEquals("{}", result.getBodyAsString());
    }
}
