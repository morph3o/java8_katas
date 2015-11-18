package com.katas;

import static java.util.Arrays.asList;

import java.util.List;

public class ToUpperCase {

  public List<Object> transform(List<String> collection) {
    return asList(collection.stream()
                            .filter(str -> !str.isEmpty())
                            .map(str -> new String(str).toUpperCase())
                            .toArray());
  }

}
