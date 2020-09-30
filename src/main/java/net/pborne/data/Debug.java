package net.pborne.data;

public class Debug {

  public static void dump(byte[] buffer) {
    for (byte b : buffer)
      System.out.print(b + " ");
    System.out.println();
  }

  public static void dump(float[] floats) {
    for (float aFloat : floats)
      System.out.print(aFloat + " ");
    System.out.println();
  }

  public static void dump(double[] doubles) {
    for (double aDouble : doubles)
      System.out.print(aDouble + " ");
    System.out.println();
  }

  public static void dump(short[] shorts) {
    for (short aShort : shorts)
      System.out.print(aShort + " ");
    System.out.println();
  }

  public static void dump(int[] ints) {
    for (int anInt : ints)
      System.out.print(anInt + " ");
    System.out.println();
  }

  public static void dump(long[] longs) {
    for (long aLong : longs)
      System.out.print(aLong + " ");
    System.out.println();
  }

  public static void compareByteBuffers(byte[] reference, byte[] other, String beginning) {
    if (reference == null || other == null || reference.length != other.length) {
      System.err.println(beginning + " Buffers are different or one of them is empty.");
      return;
    }

    for (int i = 0; i < reference.length; i++)
      if (reference[i] != other[i]) {
        System.err.println(beginning + " Difference detected between buffers.");
        Debug.dump(reference);
        Debug.dump(other);
        return;
      }

    System.out.println(beginning + " Buffers are identical.");
  }

  public static void compareIntegerBuffers(int[] reference, int[] other, String beginning) {
    if (reference == null || other == null || reference.length != other.length) {
      System.err.println(beginning + " Buffers are different or one of them is empty.");
      return;
    }

    for (int i = 0; i < reference.length; i++)
      if (reference[i] != other[i]) {
        System.err.println(beginning + " Difference detected between buffers.");
        Debug.dump(reference);
        Debug.dump(other);
        return;
      }

    System.out.println(beginning + " Buffers are identical.");
  }

  public static void compareFloatBuffers(float[] reference, float[] other, String beginning) {
    if (reference == null || other == null || reference.length != other.length) {
      System.err.println(beginning + " Buffers are different or one of them is empty.");
      return;
    }

    for (int i = 0; i < reference.length; i++)
      if (reference[i] != other[i]) {
        System.err.println(beginning + " Difference detected between buffers.");
        Debug.dump(reference);
        Debug.dump(other);
        return;
      }

    System.out.println(beginning + " Buffers are identical.");
  }
}
