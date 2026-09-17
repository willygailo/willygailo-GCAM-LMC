package defpackage;

import android.view.View;
import android.view.ViewGroup;
import j$.time.Duration;

/* JADX INFO: loaded from: classes2.dex */
public final class ish {
    public Duration a;
    public ViewGroup b;
    public String d;
    public String e;
    public gtg h;
    public elw i;
    public fjs j;
    public View c = null;
    public Runnable f = isd.d;
    public boolean g = false;
    public int k = 1;

    public final isi a() {
        this.i.getClass();
        boolean z = this.g;
        if (z && this.c == null) {
            this.h.getClass();
            this.j.getClass();
        } else if (this.c != null) {
            this.b.getClass();
        } else {
            this.e.getClass();
            this.d.getClass();
            this.b.getClass();
            this.a.getClass();
        }
        final isi isiVar = new isi(this.a, this.b, this.c, this.d, this.e, this.f, this.k, z, this.h, this.j);
        isiVar.e = new Runnable() { // from class: isg
            @Override // java.lang.Runnable
            public final void run() {
                ish ishVar = this.a;
                ishVar.i.g(isiVar);
            }
        };
        return isiVar;
    }
}
