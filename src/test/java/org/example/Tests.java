/*
 * Copyright 2018 Yubico.
 *
 * Use of this source code is governed by a BSD-style license that can be found
 * in the LICENSE file in the repository root.
 */
package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Tests {

    @Test
    public void fieldAShouldMatter() {
        assertEquals(new BugExample(0, 0), new BugExample(0, 0));
        assertNotEquals(new BugExample(0, 0), new BugExample(1, 0));
    }

    @Test
    public void fieldBShouldNotMatter() {
        assertEquals(new BugExample(0, 0), new BugExample(0, 0));
        assertEquals(new BugExample(0, 0), new BugExample(0, 1));
    }

    @Test
    public void workaroundWorks() {
        assertEquals(new WorkaroundExample(0, 0), new WorkaroundExample(0, 0));
        assertNotEquals(new WorkaroundExample(0, 0), new WorkaroundExample(1, 0));
        assertEquals(new WorkaroundExample(0, 0), new WorkaroundExample(0, 1));
    }

}
