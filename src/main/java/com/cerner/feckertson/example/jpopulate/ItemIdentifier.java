package com.cerner.feckertson.example.jpopulate;

/**
 * Immutable POJO representing a <name, version> pair.
 *
 * @author Fred Eckertson
 *
 */
public class ItemIdentifier {
    private String name;
    private String version;

    /**
     * Hide the default constructor to discourage use.
     */
    @SuppressWarnings("unused")
    private ItemIdentifier() {

    }

    /**
     * Constructor that sets all fields
     *
     * @param name
     *            The name to set
     * @param version
     *            The version to set
     */
    public ItemIdentifier(String name, String version) {
        super();
        this.name = name;
        this.version = version;
    }

    /**
     * @return the name.
     */
    public String getName() {
        return name;
    }

    /**
     * @return the version.
     */
    public String getVersion() {
        return version;
    }
}
