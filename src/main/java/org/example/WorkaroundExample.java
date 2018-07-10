/*
 * Copyright 2018 Yubico.
 *
 * Use of this source code is governed by a BSD-style license that can be found
 * in the LICENSE file in the repository root.
 */
package org.example;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class WorkaroundExample {

    int a;
    @EqualsAndHashCode.Exclude
    transient int b;

    public WorkaroundExample(int a, int b) {
        this.a = a;
        this.b = b;
    }

}
