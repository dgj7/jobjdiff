package io.dgj7.jod.e2e.builtin.primitive;

import io.dgj7.jod.Differencer;
import io.dgj7.jod.model.delta.Delta;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class IntegerEndToEndTest {
    private final Differencer differencer = new Differencer();

    @Test
    public final void testExpectedNull() {
        final List<Delta> results = differencer.difference(null, 0);

        Assert.assertNotNull(results);
        Assert.assertEquals(1, results.size());
        Assert.assertEquals("NULLITY: java.lang.Integer (java.lang.Integer): expected=[null], actual=[0]", results.get(0).toString());
    }

    @Test
    public final void testActualNull() {
        final List<Delta> results = differencer.difference(1, null);

        Assert.assertNotNull(results);
        Assert.assertEquals(1, results.size());
        Assert.assertEquals("NULLITY: java.lang.Integer (java.lang.Integer): expected=[1], actual=[null]", results.get(0).toString());
    }

    @Test
    public final void testNotEqual() {
        final List<Delta> results = differencer.difference(1, 0);

        Assert.assertNotNull(results);
        Assert.assertEquals(1, results.size());
        Assert.assertEquals("NOT_EQUAL: java.lang.Integer (java.lang.Integer): expected=[1], actual=[0]", results.get(0).toString());
    }

    @Test
    public final void testEqual() {
        final List<Delta> results = differencer.difference(1, 1);

        Assert.assertNotNull(results);
        Assert.assertEquals(0, results.size());
    }
}
