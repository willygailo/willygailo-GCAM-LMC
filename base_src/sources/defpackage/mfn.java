package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.lens.sdk.PendingIntentConsumer;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
public final class mfn implements mfo {
    public final mfp a;
    public PendingIntentConsumer b;
    private final Queue c = new ArrayDeque();

    public mfn(Context context, mfk mfkVar) {
        this.a = new mfv(context, this, mfkVar);
    }

    private final boolean g() {
        kcr kcrVarA = a();
        return (kcrVarA.a & 2) != 0 && this.a.a() >= kcrVarA.c;
    }

    public final kcr a() {
        mip.F();
        mip.G(this.a.f(), "getServerFlags() called before ready.");
        if (!this.a.f()) {
            return kcr.f;
        }
        mfp mfpVar = this.a;
        mip.F();
        mfv mfvVar = (mfv) mfpVar;
        mip.G(mfvVar.l(), "Attempted to use ServerFlags before ready.");
        return mfvVar.f;
    }

    public final void b() {
        while (this.c.peek() != null) {
            ((mfm) this.c.remove()).a(this.a.g());
        }
    }

    public final boolean c(Bundle bundle) {
        mip.F();
        if (!this.a.f()) {
            return false;
        }
        ppa ppaVar = (ppa) kcj.c.m();
        if (ppaVar.c) {
            ppaVar.m();
            ppaVar.c = false;
        }
        kcj kcjVar = (kcj) ppaVar.b;
        kcjVar.b = 341;
        kcjVar.a |= 1;
        try {
            this.a.c(((kcj) ppaVar.j()).g(), new kch(bundle));
            return true;
        } catch (RemoteException | SecurityException e) {
            Log.e("LensServiceBridge", "Failed to inject image.", e);
            return false;
        }
    }

    public final void d(mfm mfmVar) {
        mip.F();
        if (this.a.f() || this.a.e()) {
            mfmVar.a(this.a.g());
            return;
        }
        this.c.add(mfmVar);
        mfv mfvVar = (mfv) this.a;
        if (mfvVar.j() || mfvVar.k()) {
            return;
        }
        mfvVar.m();
    }

    public final int e() {
        mip.F();
        if (this.a.f()) {
            return g() ? 2 : 13;
        }
        return this.a.g();
    }

    public final int f() {
        mip.F();
        if (!this.a.f()) {
            return this.a.g();
        }
        if (!g()) {
            return 13;
        }
        kcr kcrVarA = a();
        return ((kcrVarA.a & 8) == 0 || this.a.a() < kcrVarA.e) ? 13 : 2;
    }
}
