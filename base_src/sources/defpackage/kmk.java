package defpackage;

import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class kmk extends kml {
    final /* synthetic */ Intent a;
    final /* synthetic */ kkn b;

    public kmk(Intent intent, kkn kknVar) {
        this.a = intent;
        this.b = kknVar;
    }

    @Override // defpackage.kml
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, 2);
        }
    }
}
