package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class ShufflerTest {

  @Test
  void shuffleByte() {
    byte[] source = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    byte[] dest = Arrays.copyOf(source, source.length);
    Shuffler.shuffle(dest);
    assertFalse(Arrays.equals(source, dest));
    Arrays.sort(source);
    Arrays.sort(dest);
    assertArrayEquals(source, dest);
  }

  @Test
  void shuffleChar() {
    char[] source = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    char[] dest = Arrays.copyOf(source, source.length);
    Shuffler.shuffle(dest);
    assertFalse(Arrays.equals(source, dest));
    Arrays.sort(source);
    Arrays.sort(dest);
    assertArrayEquals(source, dest);
  }

  @Test
  void shuffleDouble() {
    double[] source = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    double[] dest = Arrays.copyOf(source, source.length);
    Shuffler.shuffle(dest);
    assertFalse(Arrays.equals(source, dest));
    Arrays.sort(source);
    Arrays.sort(dest);
    assertArrayEquals(source, dest);
  }

  @Test
  void shuffleFloat() {
    float[] source = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    float[] dest = Arrays.copyOf(source, source.length);
    Shuffler.shuffle(dest);
    assertFalse(Arrays.equals(source, dest));
    Arrays.sort(source);
    Arrays.sort(dest);
    assertArrayEquals(source, dest);
  }

  @Test
  void shuffleInt() {
    int[] source = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] dest = Arrays.copyOf(source, source.length);
    Shuffler.shuffle(dest);
    assertFalse(Arrays.equals(source, dest));
    Arrays.sort(source);
    Arrays.sort(dest);
    assertArrayEquals(source, dest);
  }

  @Test
  void shuffleLong() {
    long[] source = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    long[] dest = Arrays.copyOf(source, source.length);
    Shuffler.shuffle(dest);
    assertFalse(Arrays.equals(source, dest));
    Arrays.sort(source);
    Arrays.sort(dest);
    assertArrayEquals(source, dest);
  }

  @Test
  void shuffleShort() {
    short[] source = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    short[] dest = Arrays.copyOf(source, source.length);
    Shuffler.shuffle(dest);
    assertFalse(Arrays.equals(source, dest));
    Arrays.sort(source);
    Arrays.sort(dest);
    assertArrayEquals(source, dest);
  }

  @Test
  void shuffleGeneric() {
    Integer[] source = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    Integer[] dest = Arrays.copyOf(source, source.length);
    Shuffler.shuffle(dest);
    assertFalse(Arrays.equals(source, dest));
    Arrays.sort(source);
    Arrays.sort(dest);
    assertArrayEquals(source, dest);
  }
}