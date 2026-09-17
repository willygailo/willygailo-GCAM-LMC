package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bkp implements bku, bks {
    public volatile bks a;
    public volatile bks b;
    private final Object c;
    private final bku d;
    private bkt e = bkt.CLEARED;
    private bkt f = bkt.CLEARED;

    public bkp(Object obj, bku bkuVar) {
        this.c = obj;
        this.d = bkuVar;
    }

    private final boolean o(bks bksVar) {
        return bksVar.equals(this.a) || (this.e == bkt.FAILED && bksVar.equals(this.b));
    }

    @Override // defpackage.bku
    public final bku a() {
        bku bkuVarA;
        synchronized (this.c) {
            bku bkuVar = this.d;
            bkuVarA = bkuVar != null ? bkuVar.a() : this;
        }
        return bkuVarA;
    }

    @Override // defpackage.bks
    public final void b() {
        synchronized (this.c) {
            if (this.e != bkt.RUNNING) {
                this.e = bkt.RUNNING;
                this.a.b();
            }
        }
    }

    @Override // defpackage.bks
    public final void c() {
        synchronized (this.c) {
            this.e = bkt.CLEARED;
            this.a.c();
            if (this.f != bkt.CLEARED) {
                this.f = bkt.CLEARED;
                this.b.c();
            }
        }
    }

    @Override // defpackage.bku
    public final void d(bks bksVar) {
        synchronized (this.c) {
            if (bksVar.equals(this.b)) {
                this.f = bkt.FAILED;
                bku bkuVar = this.d;
                if (bkuVar != null) {
                    bkuVar.d(this);
                }
                return;
            }
            this.e = bkt.FAILED;
            if (this.f != bkt.RUNNING) {
                this.f = bkt.RUNNING;
                this.b.b();
            }
        }
    }

    @Override // defpackage.bku
    public final void e(bks bksVar) {
        synchronized (this.c) {
            if (bksVar.equals(this.a)) {
                this.e = bkt.SUCCESS;
            } else if (bksVar.equals(this.b)) {
                this.f = bkt.SUCCESS;
            }
            bku bkuVar = this.d;
            if (bkuVar != null) {
                bkuVar.e(this);
            }
        }
    }

    @Override // defpackage.bks
    public final void f() {
        synchronized (this.c) {
            if (this.e == bkt.RUNNING) {
                this.e = bkt.PAUSED;
                this.a.f();
            }
            if (this.f == bkt.RUNNING) {
                this.f = bkt.PAUSED;
                this.b.f();
            }
        }
    }

    @Override // defpackage.bku
    public final boolean g(bks bksVar) {
        boolean z;
        synchronized (this.c) {
            bku bkuVar = this.d;
            z = false;
            if ((bkuVar == null || bkuVar.g(this)) && o(bksVar)) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.bku
    public final boolean h(bks bksVar) {
        boolean z;
        synchronized (this.c) {
            bku bkuVar = this.d;
            z = false;
            if ((bkuVar == null || bkuVar.h(this)) && o(bksVar)) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.bku
    public final boolean i(bks bksVar) {
        boolean z;
        synchronized (this.c) {
            bku bkuVar = this.d;
            z = false;
            if ((bkuVar == null || bkuVar.i(this)) && o(bksVar)) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.bku, defpackage.bks
    public final boolean j() {
        boolean z;
        synchronized (this.c) {
            z = true;
            if (!this.a.j() && !this.b.j()) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.bks
    public final boolean k() {
        boolean z;
        synchronized (this.c) {
            z = false;
            if (this.e == bkt.CLEARED && this.f == bkt.CLEARED) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.bks
    public final boolean l() {
        boolean z;
        synchronized (this.c) {
            z = true;
            if (this.e != bkt.SUCCESS && this.f != bkt.SUCCESS) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.bks
    public final boolean m(bks bksVar) {
        if (bksVar instanceof bkp) {
            bkp bkpVar = (bkp) bksVar;
            if (this.a.m(bkpVar.a) && this.b.m(bkpVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bks
    public final boolean n() {
        boolean z;
        synchronized (this.c) {
            z = true;
            if (this.e != bkt.RUNNING && this.f != bkt.RUNNING) {
                z = false;
            }
        }
        return z;
    }
}
