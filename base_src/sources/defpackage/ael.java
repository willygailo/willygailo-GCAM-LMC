package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ael {
    public final aeo c;
    boolean d;
    int e = -1;
    final /* synthetic */ aem f;

    public ael(aem aemVar, aeo aeoVar) {
        this.f = aemVar;
        this.c = aeoVar;
    }

    public void b() {
    }

    public boolean c(aee aeeVar) {
        return false;
    }

    public final void d(boolean z) {
        boolean z2;
        if (z == this.d) {
            return;
        }
        this.d = z;
        aem aemVar = this.f;
        int i = true != z ? -1 : 1;
        int i2 = aemVar.d;
        aemVar.d = i + i2;
        if (!aemVar.e) {
            aemVar.e = true;
            while (true) {
                try {
                    int i3 = aemVar.d;
                    if (i2 == i3) {
                        break;
                    }
                    if (i2 != 0) {
                        z2 = false;
                    } else if (i3 > 0) {
                        i2 = 0;
                        z2 = true;
                    } else {
                        i2 = 0;
                        z2 = false;
                    }
                    boolean z3 = i2 > 0 && i3 == 0;
                    if (z2) {
                        aemVar.d();
                    } else if (z3) {
                        aemVar.e();
                    }
                    i2 = i3;
                } catch (Throwable th) {
                    aemVar.e = false;
                    throw th;
                }
            }
            aemVar.e = false;
        }
        if (this.d) {
            this.f.b(this);
        }
    }

    public abstract boolean g();
}
