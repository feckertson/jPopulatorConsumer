package com.cerner.feckertson.example.jpopulate.test;

import org.junit.Assert;
import org.junit.Test;

import com.cerner.feckertson.example.jpopulate.ItemIdentifier;

import io.github.benas.jpopulator.api.Populator;
import io.github.benas.jpopulator.impl.PopulatorBuilder;

/**
 * Unit Test for ItemIdentifier.
 * 
 * @author Fred Eckertson
 *
 */
public class TestItemIdentifier {

    @Test
    public void testIt() {
        Populator populator = new PopulatorBuilder().build();
        ItemIdentifier itemIdentifier = populator.populateBean(ItemIdentifier.class);
        Assert.assertNotNull(itemIdentifier);
    }
}
