@Test(expectedExceptions = IllegalArgumentException.class)
public void testNegativeNumbers() {
    Factorial.factorial(-1);
}
