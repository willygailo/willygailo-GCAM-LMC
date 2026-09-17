package defpackage;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class hoa implements hnx {
    public final Context a;
    public final qkg b;
    public final Class c;
    public hnw d;
    private final boolean e;
    private final Activity f;
    private final KeyguardManager g;
    private final huf h;
    private final emb i;

    public hoa(emb embVar, Activity activity, qkg qkgVar, boolean z, Class cls, KeyguardManager keyguardManager, huf hufVar, byte[] bArr, byte[] bArr2) {
        this.i = embVar;
        this.a = activity.getApplicationContext();
        this.e = z;
        this.f = activity;
        this.c = cls;
        this.b = qkgVar;
        this.g = keyguardManager;
        this.h = hufVar;
    }

    private final void h(Intent intent, boolean z) {
        if (!this.e) {
            this.i.b(intent);
        } else {
            b(this.f, new hnz(this, z, intent));
        }
    }

    @Override // defpackage.hnx
    public final void a() {
        this.d = null;
    }

    @Override // defpackage.hnx
    public final void b(Activity activity, KeyguardManager.KeyguardDismissCallback keyguardDismissCallback) {
        if (this.e) {
            hnw hnwVar = this.d;
            if (hnwVar != null) {
                hnwVar.B();
            }
            int i = ((epj) this.b.get()).f;
            ((epj) this.b.get()).g(3);
            this.g.requestDismissKeyguard(activity, new hny(this, i, keyguardDismissCallback));
        }
    }

    @Override // defpackage.hnx
    public final void c(hnw hnwVar) {
        this.d = hnwVar;
    }

    @Override // defpackage.hnx
    public final void d(Parcelable parcelable, Serializable serializable) {
        Intent intent = new Intent(this.a, (Class<?>) this.c);
        intent.putExtra("open_socialshare", true);
        intent.putExtra("filmstrip_item_data", parcelable);
        intent.putExtra("filmstrip_item_type", serializable);
        h(intent, false);
    }

    @Override // defpackage.hnx
    public final void e() {
        Intent intent = new Intent(this.a, (Class<?>) this.c);
        intent.putExtra("open_empty_vault", true);
        h(intent, false);
    }

    @Override // defpackage.hnx
    public final void f() {
        Intent intent = new Intent(this.a, (Class<?>) this.c);
        intent.putExtra("open_filmstrip", true);
        if (((Boolean) this.h.c(htu.ab)).booleanValue()) {
            intent.putExtra("open_mars", true);
        }
        h(intent, false);
    }

    @Override // defpackage.hnx
    public final void g(Intent intent) {
        h(intent, true);
    }
}
