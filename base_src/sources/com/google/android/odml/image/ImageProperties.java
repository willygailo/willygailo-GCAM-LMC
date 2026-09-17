package com.google.android.odml.image;

import defpackage.odo;

/* JADX INFO: loaded from: classes.dex */
public abstract class ImageProperties {

    public abstract class Builder {
        abstract ImageProperties build();

        abstract Builder setImageFormat(int i);

        abstract Builder setStorageType(int i);
    }

    static Builder builder() {
        return new odo();
    }

    public abstract int a();

    public abstract int b();
}
