package org.opencds.cqf.cql.engine.execution;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class NamespaceHelperTests {

    @Test
    public void TestNamespaceUriParsing() {
        String actual = NamespaceHelper.getUriPart(null);
        assertNull(null);

        actual = NamespaceHelper.getUriPart("http://cql-engine.test/Library/TestUri");
        assertEquals("http://cql-engine.test/Library", actual);

        actual = NamespaceHelper.getUriPart("TestUri");
        assertNull(actual);
    }

    @Test
    public void TestNamespaceNameParsing() {
        String actual = NamespaceHelper.getNamePart(null);
        assertNull(actual);

        actual = NamespaceHelper.getNamePart("http://cql-engine.test/Library/TestUri");
        assertEquals("TestUri", actual);

        actual = NamespaceHelper.getNamePart("TestUri");
        assertEquals("TestUri", actual);
    }
}
