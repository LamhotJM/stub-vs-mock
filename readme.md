
# Stub VS Mock
## Stub Object
```java
private ISquaresComputingService sqCompService = new ISquaresComputingService() {
      public int[] computesSquares(int[] ints) {
		return new int[] { 1, 4, 9 };
      }
};
``` 

## Stub Test
```java
@Test
public final void testComputeSumOfSquares() {
	int sumOfSquares = ssc.computeSumOfSquares(new int[] { 1, 2, 3 });
	assertEquals(14, sumOfSquares);
}
``` 
## Mock Object
```java

private ISquaresComputingService sqCompService2 = mock(ISquaresComputingService.class);

``` 

##  Mock Test

```java
@Test
public final void testComputeSumOfSquares() {
        when(sqCompService2.computesSquares(new int[] {1,2,3})).thenReturn(new int[] {1,4,9});
        int sumOfSquares = ssc.computeSumOfSquares(new int[] {1,2,3});
	assertThat(sumOfSquares, is(14));
	assertEquals(14, sumOfSquares);
	verify(sqCompService2).computesSquares(new int[] {1,2,3});
}
``` 