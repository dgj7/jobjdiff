package io.dgj7.jod.e2e.builtin.types;

import io.dgj7.jod.Differencer;
import io.dgj7.jod.model.delta.Delta;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;
import java.util.List;

public class BigIntegerEndToEndTest {
    private final Differencer differencer = new Differencer();

    @Test
    public final void testExpectedNull() {
        final List<Delta> results = differencer.difference(null, BigInteger.valueOf(1000000));

        Assert.assertNotNull(results);
        Assert.assertEquals(1, results.size());
        Assert.assertEquals("NULLITY: java.math.BigInteger (java.math.BigInteger): expected=[null], actual=[1000000]", results.get(0).toString());
    }

    @Test
    public final void testActualNull() {
        final List<Delta> results = differencer.difference(BigInteger.valueOf(9999), null);

        Assert.assertNotNull(results);
        Assert.assertEquals(1, results.size());
        Assert.assertEquals("NULLITY: java.math.BigInteger (java.math.BigInteger): expected=[9999], actual=[null]", results.get(0).toString());
    }

    @Test
    public final void testNotEqual() {
        final List<Delta> results = differencer.difference(BigInteger.valueOf(9999), BigInteger.valueOf(1000000));

        Assert.assertNotNull(results);
        Assert.assertEquals(1, results.size());
        Assert.assertEquals("NOT_EQUAL: java.math.BigInteger (java.math.BigInteger): expected=[9999], actual=[1000000]", results.get(0).toString());
    }

    @Test
    public final void testEqual() {
        final List<Delta> results = differencer.difference(BigInteger.valueOf(9999), BigInteger.valueOf(9999));

        Assert.assertNotNull(results);
        Assert.assertEquals(0, results.size());
    }
}
