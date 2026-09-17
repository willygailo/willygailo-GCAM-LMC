package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class boa implements hlu {
    private final hlv a;
    private final lnc b;

    public boa(hlv hlvVar, lnc lncVar) {
        this.a = hlvVar;
        this.b = lncVar;
    }

    private final void e(int i) {
        if (kdd.g != null) {
            this.b.h(kdd.g, Integer.valueOf(i));
        }
    }

    @Override // defpackage.hlu
    public final void a(int i) {
    }

    @Override // defpackage.hlu
    public final void b(boolean z) {
        if (!z) {
            e(0);
        } else {
            if (this.a.d()) {
                return;
            }
            e(Integer.MAX_VALUE);
        }
    }

    @Override // defpackage.hlu
    public final void c(float f) {
        hlv hlvVar = this.a;
        if (hlvVar.a && hlvVar.d()) {
            e(Math.round(f) * 100);
        }
    }

    @Override // defpackage.hlu
    public final void d(float f) {
    }
}
