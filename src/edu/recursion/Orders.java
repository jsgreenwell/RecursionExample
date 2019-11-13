package edu.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Orders
{
  private String id;

  private final List<Orders> subOrders = new ArrayList<>();

  public Stream<Orders> streamOrders()
  {
    return Stream.concat(
        Stream.of(this),
        subOrders.stream().flatMap(Orders::streamOrders));
  }

  protected void setId(String id)
  {
    this.id = id;
  }

  protected String getId()
  {
    return id;
  }

  @Override
  public String toString()
  {
    return this.id;
  }
}