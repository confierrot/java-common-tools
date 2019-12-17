package com.zeroten.javales;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckUtilsTest {
    @Test
    public void testisAnyEmpty() {
        Assert.assertEquals(CheckUtils.isAnyEmpty("123","","456"), false);
        Assert.assertEquals(CheckUtils.isAnyEmpty("123","456"),true);
        Assert.assertEquals(CheckUtils.isAnyEmpty(),false);
    }
}
