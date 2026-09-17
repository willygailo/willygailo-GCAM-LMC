package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bla implements bku, bks {
    public volatile bks a;
    public volatile bks b;
    private final bku c;
    private final Object d;
    private bkt e = bkt.CLEARED;
    private bkt f = bkt.CLEARED;
    private boolean g;

    public bla(Object obj, bku bkuVar) {
        this.d = obj;
        this.c = bkuVar;
    }

    @Override // defpackage.bku
    public final bku a() {
        bku bkuVarA;
        synchronized (this.d) {
            bku bkuVar = this.c;
            bkuVarA = bkuVar != null ? bkuVar.a() : this;
        }
        return bkuVarA;
    }

    @Override // defpackage.bks
    public final void b() {
        synchronized (this.d) {
            this.g = true;
            try {
                if (this.e != bkt.SUCCESS && this.f != bkt.RUNNING) {
                    this.f = bkt.RUNNING;
                    this.b.b();
                }
                if (this.g && this.e != bkt.RUNNING) {
                    this.e = bkt.RUNNING;
                    this.a.b();
                }
                this.g = false;
            } catch (Throwable th) {
                this.g = false;
                throw th;
            }
        }
    }

    @Override // defpackage.bks
    public final void c() {
        synchronized (this.d) {
            this.g = false;
            this.e = bkt.CLEARED;
            this.f = bkt.CLEARED;
            this.b.c();
            this.a.c();
        }
    }

    @Override // defpackage.bku
    public final void d(bks bksVar) {
        synchronized (this.d) {
            if (!bksVar.equals(this.a)) {
                this.f = bkt.FAILED;
                return;
            }
            this.e = bkt.FAILED;
            bku bkuVar = this.c;
            if (bkuVar != null) {
                bkuVar.d(this);
            }
        }
    }

    @Override // defpackage.bku
    public final void e(bks bksVar) {
        synchronized (this.d) {
            if (bksVar.equals(this.b)) {
                this.f = bkt.SUCCESS;
                return;
            }
            this.e = bkt.SUCCESS;
            bku bkuVar = this.c;
            if (bkuVar != null) {
                bkuVar.e(this);
            }
            if (!this.f.f) {
                this.b.c();
            }
        }
    }

    @Override // defpackage.bks
    public final void f() {
        synchronized (this.d) {
            if (!this.f.f) {
                this.f = bkt.PAUSED;
                this.b.f();
            }
            if (!this.e.f) {
                this.e = bkt.PAUSED;
                this.a.f();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000f  */
    @Override // defpackage.bku
    public final boolean g(bks bksVar) {
        boolean z;
        synchronized (this.d) {
            bku bkuVar = this.c;
            z = false;
            if (bkuVar == null || bkuVar.g(this)) {
                if (bksVar.equals(this.a) && this.e != bkt.PAUSED) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000f  */
    @Override // defpackage.bku
    public final boolean h(bks bksVar) {
        boolean z;
        synchronized (this.d) {
            bku bkuVar = this.c;
            z = false;
            if (bkuVar == null || bkuVar.h(this)) {
                if (bksVar.equals(this.a) && !j()) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0010  */
    @Override // defpackage.bku
    public final boolean i(bks bksVar) {
        boolean z;
        synchronized (this.d) {
            bku bkuVar = this.c;
            z = true;
            if (bkuVar != null && !bkuVar.i(this)) {
                z = false;
            } else if (!bksVar.equals(this.a) && this.e == bkt.SUCCESS) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.bku, defpackage.bks
    public final boolean j() {
        boolean z;
        synchronized (this.d) {
            z = true;
            if (!this.b.j() && !this.a.j()) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.bks
    public final boolean k() {
        boolean z;
        synchronized (this.d) {
            z = this.e == bkt.CLEARED;
        }
        return z;
    }

    @Override // defpackage.bks
    public final boolean l() {
        boolean z;
        synchronized (this.d) {
            z = this.e == bkt.SUCCESS;
        }
        return z;
    }

    @Override // defpackage.bks
    public final boolean m(bks bksVar) {
        if (!(bksVar instanceof bla)) {
            return false;
        }
        bla blaVar = (bla) bksVar;
        if (this.a != null ? this.a.m(blaVar.a) : blaVar.a == null) {
            if (this.b == null) {
                if (blaVar.b == null) {
                    return true;
                }
            } else if (this.b.m(blaVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bks
    public final boolean n() {
        boolean z;
        synchronized (this.d) {
            z = this.e == bkt.RUNNING;
        }
        return z;
    }
}
