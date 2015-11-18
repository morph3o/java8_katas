package com.katas;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ToUpperCaseSpec_Kata1 {
    
    private ToUpperCase service;
    
    @Before
    public void init(){
      this.service = new ToUpperCase();
    }
  
    @Test
    public void transformShouldConvertCollectionElementsToUpperCase() {
        List<String> collection = asList("My", "name", "is", "John", "Doe");
        List<String> expected = asList("MY", "NAME", "IS", "JOHN", "DOE");
        assertThat(service.transform(collection)).hasSameElementsAs(expected);
    }

}
