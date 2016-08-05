package com.bitwise.assignment.cascading;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InnerJoin1Test{
    @Test
    public void itShouldReturnTheCorrectDefaultNameAndAge(){
        //given
        InnerJoin1 x=new InnerJoin1();
        //when
        assertEquals("Aniruddha",x.getName());
        assertEquals(23,x.getAge());
    }
}