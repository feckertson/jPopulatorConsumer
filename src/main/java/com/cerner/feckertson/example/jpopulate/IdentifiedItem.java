package com.cerner.feckertson.example.jpopulate;

import java.util.List;

/**
 * Example immutable object with an ItemIdentifer plus other attributes.
 * 
 * @author Fred Eckertson
 *
 */
public class IdentifiedItem {
    private ItemIdentifier itemIdentifier;
    private List<String> namesOfThings;
    private List<String> namesOfOtherThings;

    /**
     * @return the itemIdentifier.
     */
    public ItemIdentifier getItemIdentifier() {
        return itemIdentifier;
    }

    /**
     * @return the namesOfThings.
     */
    public List<String> getNamesOfThings() {
        return namesOfThings;
    }

    /**
     * @return the namesOfOtherThings.
     */
    public List<String> getNamesOfOtherThings() {
        return namesOfOtherThings;
    }
}
