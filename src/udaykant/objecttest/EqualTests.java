package udaykant.objecttest;

import junit.framework.Assert;
import org.testng.annotations.Test;

public class EqualTests {
    @Test
    public void test_equal_for_same_strings() throws Exception {
        Assert.assertTrue("rahul".equals("rahul"));
    }

    @Test
    public void test_for_different_strings() throws Exception {
        Assert.assertFalse("uday".equals("ansu"));
    }

    @Test
    public void test_equals_with_same_constructors() throws Exception {
        String udaykant = new String("udaykant");
        Assert.assertTrue(udaykant.equals(udaykant));
    }

    @Test
    public void test_equals_with_different_constructors() throws Exception {
        String ansu = new String("ansu");
        String uday = new String("uday");
        Assert.assertFalse(uday.equals(ansu));
    }

    @Test
    public void test_equals_with_same_string_constructor_and_string_literal() throws Exception {
        String uday = new String("uday");
        Assert.assertTrue(uday.equals("uday"));
    }

    @Test
    public void test_equals_with_different_string_constructor_and_string_literal() throws Exception {
        String uday = "uday";
        Assert.assertFalse(uday.equals("uday"));
    }

    @Test
    public void test_equals_with_same_string_and_string_constructor() throws Exception {
        String uday = new String("uday");
        Assert.assertTrue("uday".equals(uday));
    }

    @Test
    public void test_equals_with_different_string_and_string_constructor() throws Exception {
        String ansu = new String("ansu");
        Assert.assertFalse("uday".equals(ansu));
    }

    @Test
    public void test_equals_for_string_literal_and_null() throws Exception {
        Assert.assertFalse("uday".equals(null));
    }

    @Test
    public void test_equals_for_string_constructor_and_null() throws Exception {
        String ansu = new String("ansu");
        Assert.assertFalse(ansu.equals(null));
    }
}
