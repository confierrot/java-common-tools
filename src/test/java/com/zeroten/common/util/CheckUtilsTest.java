package com.zeroten.common.util;

import com.zeroten.common.util.CheckUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckUtilsTest {
    @Test
    public void testisAnyEmpty() {
        Assert.assertEquals(CheckUtils.isAnyEmpty("123","","456"), false);
        Assert.assertEquals(CheckUtils.isAnyEmpty("123","456"),true);
        Assert.assertEquals(CheckUtils.isAnyEmpty(),false);
    }
    @Test
    public void testisEmpty() {
        Object[] t = new Object[3];
        Object[] t2 = new Object[0];
        Assert.assertEquals(CheckUtils.isEmpty(t2), true);
        Assert.assertEquals(CheckUtils.isEmpty(null),true);
        Assert.assertEquals(CheckUtils.isEmpty(t),false);
    }

    @Test
    public void testEquals() {
        Assert.assertEquals(CheckUtils.equals("",null), false);
        Assert.assertEquals(CheckUtils.equals("",""), true);
        Assert.assertEquals(CheckUtils.equals("12","12"), true);

        Assert.assertEquals(CheckUtils.equals(12,12), true);
        Assert.assertEquals(CheckUtils.equals(null,12),false);
        Assert.assertEquals(CheckUtils.equals(11,12),false);
    }
}
