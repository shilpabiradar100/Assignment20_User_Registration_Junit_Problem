package org.example;
import org.junit.Assert;
import org.junit.Test;

public class UserValidator {
    UserValidator validator = new UserValidator();

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean isValid = validator.validateLastName("Aravind");
        Assert.assertTrue(isValid);
    }

    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
        boolean isValid = validator.validateLastName("Ar");
        Assert.assertFalse(isValid);
    }

    @Test
    public void givenFirstName_WhenFirstLetterIsSmall_ShouldReturnFalse() {
        boolean isValid = validator.validateLastName("Shilpa");
        Assert.assertFalse(isValid);
    }

    @Test
    public void givenFirstName_WhenSpecialCharPassed_ShouldReturnFalse() {
        boolean isValid = validator.validateLastName("@#!");
        Assert.assertFalse(isValid);
    }

    @Test
    public void givenFirstName_WhenSpecialNumPassed_ShouldReturnFalse() {
        boolean isValid = validator.validateLastName("1234");
        Assert.assertFalse(isValid);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean isValid = validator.givenLastName_WhenProper_ShouldReturnTrue("Karri");
        Assert.assertTrue(isValid);
    }

    @Test
    public void givenLastName_WhenShort_ShouldReturnFalse() {
        boolean isValid = validator.validateLastName("Ka");
        Assert.assertFalse(isValid);
    }

    @Test
    public void givenLastName_WhenFirstLetterIsSmall_ShouldReturnFalse() {
        boolean isValid = validator.validateLastName("karri");
        Assert.assertFalse(isValid);
    }

    @Test
    public void givenLastName_WhenSpecialCharPassed_ShouldReturnFalse() {
        boolean isValid = validator.validateLastName("@#!");
        Assert.assertFalse(isValid);
    }

    @Test
    public void givenLastName_WhenSpecialNumPassed_ShouldReturnFalse() {
        boolean isValid = validator.validateLastName("1234");
        Assert.assertFalse(isValid);
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        boolean isValid = validator.validateLastName("@A98495karri");
        Assert.assertTrue(isValid);
    }

    @Test
    public void givenPassword_WhenSpecialCharNotPassed_ShouldReturnFalse() {
        boolean isValid = validator.validateLastName("A93939Karri");
        Assert.assertFalse(isValid);
    }

    @Test
    public void givenPassword_WhenNumberNotPassed_ShouldReturnFalse() {
        boolean isValid = validator.validateLastName("karriaraviD");
        Assert.assertFalse(isValid);
    }

    @Test
    public void givenPassword_WhenCapitalLetterNotPassed_ShouldReturnFalse() {
        boolean isValid = validator.validateLastName("aravin@kari333");
        Assert.assertFalse(isValid);
    }

    @Test
    public void givenPassword_WhenSmallLetterNotPassed_ShouldReturnFalse() {
        boolean isValid = validator.validateLastName("KDENDIE#4422");
        Assert.assertFalse(isValid);
    }

    @Test
    public void givenPassword_WhenShort_ShouldReturnFalse() {
        boolean isValid = validator.validateLastName("kA@ss");
        Assert.assertFalse(isValid);
    }

}
