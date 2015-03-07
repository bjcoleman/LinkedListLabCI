import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class SortedLinkedListTest extends TestCase 
{
  public void testEmptyList()
  {
    SortedLinkedList l = new SortedLinkedList();
    
    assertEquals(0, l.length());
    assertFalse(l.isMember("foo"));
    assertEquals(null, l.getName(0));
    assertEquals(-1, l.getQuantity(0));
  }  
}
