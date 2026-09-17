package com.google.android.apps.camera.brella.examplestore.beholder;

import android.content.Context;
import defpackage.cbq;
import defpackage.cbv;
import defpackage.cbz;
import defpackage.ccs;
import defpackage.ccu;
import defpackage.cdf;
import defpackage.enc;

/* JADX INFO: loaded from: classes.dex */
public class BeholderExampleStoreService extends cbz {
    public cdf a;

    @Override // defpackage.cbz
    protected final cbv a(Context context, ccu ccuVar, ccs ccsVar) {
        return b(context).a(ccuVar, ccsVar);
    }

    protected final synchronized cdf b(Context context) {
        if (this.a == null) {
            ((cbq) ((enc) context.getApplicationContext()).c(cbq.class)).d(this);
        }
        return this.a;
    }
}
