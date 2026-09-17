package com.google.vr.vrcore.library.api;

import defpackage.bmo;

/* JADX INFO: loaded from: classes.dex */
public final class ObjectWrapper extends bmo {
    private final Object wrappedObject;

    private ObjectWrapper(Object obj) {
        super("com.google.vr.vrcore.library.api.IObjectWrapper");
        this.wrappedObject = obj;
    }

    public static bmo b(Object obj) {
        return new ObjectWrapper(obj);
    }
}
