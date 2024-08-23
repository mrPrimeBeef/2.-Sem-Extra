import org.app.Utilities;
import org.junit.Assert;
import org.junit.Test;

public class UtilitiesTest {

@Test
public void testTrailingZero(){
// Arrange
    int input = 3;
    int actual = 0;
    int expected = 3000000;

// Act
    actual = Utilities.trailingZeros(input);

// Assert
    Assert.assertEquals(expected, actual);

// Arrange
    input = 13;

    expected = 1300000;

// Act
    actual = Utilities.trailingZeros(input);

// Assert
    Assert.assertEquals(expected, actual);

// Arrange
    input = 159;
    expected = 1590000;

// Act
    actual = Utilities.trailingZeros(input);

// Assert
    Assert.assertEquals(expected, actual);

// Arrange
    input = 159852;
    expected = 1598520;

// Act
    actual = Utilities.trailingZeros(input);

// Assert
    Assert.assertEquals(expected, actual);
}

}
