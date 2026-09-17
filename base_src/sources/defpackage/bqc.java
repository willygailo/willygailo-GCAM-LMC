package defpackage;

import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class bqc {
    private final hug a;
    private final emb b;

    public bqc(emb embVar, hug hugVar, byte[] bArr, byte[] bArr2) {
        this.b = embVar;
        this.a = hugVar;
    }

    public final void a() {
        Intent intentA = this.b.a();
        if (intentA == null || !intentA.hasExtra("com.google.assistant.extra.CAMERA_FLASH_MODE")) {
            return;
        }
        if (bqe.m(intentA)) {
            this.a.e(htu.j, bqe.c(intentA).d);
        } else {
            this.a.e(htu.i, bqe.c(intentA).d);
        }
    }
}
