package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public final class lwo extends mab implements mag {
    public final Object a;
    public boolean b;
    public int c;
    private boolean d;

    public lwo(mag magVar) {
        super(magVar);
        this.a = new Object();
        this.d = false;
        this.c = 0;
    }

    @Override // defpackage.mab, defpackage.mag, defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.a) {
            if (!this.d && !this.b) {
                this.b = true;
                j();
            }
        }
    }

    @Override // defpackage.mab, defpackage.mag
    public final mad f() {
        mad madVarF;
        synchronized (this.a) {
            if (this.b || this.d || (madVarF = super.f()) == null) {
                return null;
            }
            this.c++;
            return new lwn(this, madVarF);
        }
    }

    @Override // defpackage.mab, defpackage.mag
    public final mad g() {
        mad madVarG;
        synchronized (this.a) {
            if (this.b || this.d || (madVarG = super.g()) == null) {
                return null;
            }
            this.c++;
            return new lwn(this, madVarG);
        }
    }

    @Override // defpackage.mab, defpackage.mag
    public final void i(maf mafVar, Handler handler) {
        super.i(new lwm(this, mafVar), handler);
    }

    public final void j() {
        if (this.d) {
            return;
        }
        if (this.c == 0) {
            this.d = true;
            super.close();
        } else {
            mad madVarF = super.f();
            if (madVarF != null) {
                madVarF.close();
            }
            h();
        }
    }
}
