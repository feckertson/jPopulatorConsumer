package com.cerner.feckertson.example.jpopulate.test;

import org.junit.Assert;
import org.junit.Test;

import com.cerner.feckertson.example.jpopulate.IdentifiedItem;

import io.github.benas.jpopulator.api.Populator;
import io.github.benas.jpopulator.impl.PopulatorBuilder;

/**
 * Unit tests for IdentifiedItem
 * @author Fred Eckertson
 *
 */
public class TestIdentifiedItem {

    @Test
    public void testIt() {
        Populator populator = new PopulatorBuilder().build();
        IdentifiedItem identifiedItem = populator.populateBean(IdentifiedItem.class);
        Assert.assertNotNull(identifiedItem);
    }
}
