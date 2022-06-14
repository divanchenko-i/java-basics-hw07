/**
 * Compute the sum and average for running integers using loop.
 */
public class SumAverage {

  /**
   * Computes sum of running integers from a lower bound to an upper bound.
   *
   * @param lowerBound lower bound
   * @param upperBound upper bound
   * @return sum of integers
   */
  public static int sum(int lowerBound, int upperBound) {
    int sum = 0;
    for (int i = lowerBound; i <= upperBound; i++){
      sum = sum + i;
    }
    return sum;
  }

  /**
   * Computes sum of running integers from a lower bound to an upper bound within an array.
   *
   * @param numbers running integers array
   * @return sum of integers
   */
  public static int sum(int[] numbers) {
    int sum = 0;
    for(int i : numbers){
      sum = sum + i;
    }
    return sum;
  }

  /**
   * Computes average of running integers from a lower bound to an upper bound.
   *
   * @param lowerBound lower bound
   * @param upperBound upper bound
   * @return average of integers
   */
  public static double average(int lowerBound, int upperBound) {
    double average;
    double sum = 0;
    int count = 0;
    int i = lowerBound;
    while (i <= upperBound){
      sum = sum + i;
      count++;
      i++;
    }
    average = sum / count;
    return average;
  }

  /**
   * Computes average of running integers from a lower bound to an upper bound within an array.
   *
   * @param numbers running integers array
   * @return average of integers
   */
  public static double average(int[] numbers) {
    double average;
    double sum = 0;
    double count = 1;
    int i = numbers [0];
    do {
      sum = sum + i;
      count++;
      i++;
    }
    while (count <= numbers.length);
    average = sum / numbers.length;
    return average;
  }
}