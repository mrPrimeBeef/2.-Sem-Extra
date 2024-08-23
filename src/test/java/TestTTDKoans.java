import org.app.NameGreet;
import org.junit.Assert;
import org.junit.Test;

public class TestTTDKoans {
private NameGreet nameGreet = new NameGreet();

@Test
public void nameGreet1Test() {
// Arrange
        String input = "Bob";
        String expected = "Hello, Bob.";
        String actual = "";

// Act
        actual = nameGreet.greet(input);

// Assert
        Assert.assertEquals(expected, actual);

    }

@Test
public void nameGreet2Test() {
// Arrange
        String input = null;
        String expected = "Hello, my friend.";
        String actual = "";

// Act
        actual = nameGreet.greet(input);

// Assert
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void nameGreet3Test() {
// Arrange
        String input = "JERRY";
        String expected = "HELLO JERRY!";
        String actual = "";

// Act
        actual = nameGreet.greet(input);

// Assert
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void nameGreet4Test() {
// Arrange
        String[] input = {"Jill", "Jane"};
        String expected = "Hello, Jill and Jane.";
        String actual = "";

// Act
        actual = nameGreet.greet(input);

// Assert
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void nameGreet5Test() {
// Arrange
        String[] input = {"Amy", "Brian", "Charlotte"};
        String expected = "Hello, Amy, Brian, and Charlotte.";
        String actual = "";

// Act
        actual = nameGreet.greet(input);

// Assert
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void nameGreet6Test() {
// Arrange
        String[] input = {"Amy", "BRIAN", "Charlotte"};
        String expected = "Hello, Amy and Charlotte. AND HELLO BRIAN";
        String actual = "";

// Act
        actual = nameGreet.greet(input);

// Assert
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void nameGreet7Test() {
// Arrange
        String[] input = {"Bob", "Charlie,", "Dianne"};
        String expected = "Hello, Bob, Charlie, and Dianne.";
        String actual = "";

// Act
        actual = nameGreet.greet(input);

// Assert
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void nameGreet8Test() {
// Arrange
        String[] input = {"Bob", "\"Charlie, Dianne\""};
        String expected = "Hello, Bob and Charlie, Dianne.";
        String actual = "";

// Act
        actual = nameGreet.greet(input);

// Assert
        Assert.assertEquals(expected, actual);

    }
}
