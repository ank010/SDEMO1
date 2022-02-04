import static org.junit.Assert.*;
import org.junit.*;

public class additionTester{
  addition Apple = new addition(2,3);

  @Test
  public void MultiplyAddTest(){
      assertEquals(100, Apple.MultiplyAdd(5, 6));
  }
}
