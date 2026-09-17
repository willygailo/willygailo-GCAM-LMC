package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import defpackage.kkm;
import defpackage.kkn;
import defpackage.mip;

/* JADX INFO: loaded from: classes.dex */
public class LifecycleCallback {
    public final kkn f;

    protected LifecycleCallback(kkn kknVar) {
        this.f = kknVar;
    }

    private static kkn getChimeraLifecycleFragmentImpl(kkm kkmVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public void c(int i, int i2, Intent intent) {
    }

    public void d(Bundle bundle) {
    }

    public void g(Bundle bundle) {
    }

    public void h() {
    }

    public void i() {
    }

    public void j() {
    }

    public final Activity l() {
        Activity activityA = this.f.a();
        mip.dk(activityA);
        return activityA;
    }
}
