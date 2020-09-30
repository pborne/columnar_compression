package net.pborne.data;

import java.util.ArrayList;

/**
 * Created by pborne on 3/11/17.
 */
public class DebugGeneric<Type> {
  public void dump(ArrayList<Type> buffer) {
    for (Type type : buffer)
      System.out.print(type + " ");
    System.out.println();
  }
}
