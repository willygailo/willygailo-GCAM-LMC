package androidx.work.impl;

import defpackage.ahy;
import defpackage.aif;
import defpackage.ajq;
import defpackage.ajr;
import defpackage.ajs;
import defpackage.aju;
import defpackage.aoe;
import defpackage.aqk;
import defpackage.aqq;
import defpackage.aqu;
import defpackage.are;
import defpackage.arg;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    private volatile aqu m;
    private volatile arg n;
    private volatile aqk o;
    private volatile aqq p;
    private volatile arg q;
    private volatile arg r;
    private volatile arg s;

    @Override // defpackage.aii
    protected final aif a() {
        return new aif(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // defpackage.aii
    protected final aju b(ahy ahyVar) {
        ajq ajqVar = new ajq(ahyVar, new aoe(this), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6");
        ajr ajrVarA = ajs.a(ahyVar.b);
        ajrVarA.b = ahyVar.c;
        ajrVarA.c = ajqVar;
        return ahyVar.a.a(ajrVarA.a());
    }

    @Override // androidx.work.impl.WorkDatabase
    public final aqu s() {
        aqu aquVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new are(this);
            }
            aquVar = this.m;
        }
        return aquVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final aqk u() {
        aqk aqkVar;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            if (this.o == null) {
                this.o = new aqk(this);
            }
            aqkVar = this.o;
        }
        return aqkVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final aqq v() {
        aqq aqqVar;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            if (this.p == null) {
                this.p = new aqq(this);
            }
            aqqVar = this.p;
        }
        return aqqVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final arg w() {
        arg argVar;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = new arg(this);
            }
            argVar = this.n;
        }
        return argVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final arg x() {
        arg argVar;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            if (this.q == null) {
                this.q = new arg(this, (byte[]) null);
            }
            argVar = this.q;
        }
        return argVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final arg y() {
        arg argVar;
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            if (this.r == null) {
                this.r = new arg(this, (char[]) null);
            }
            argVar = this.r;
        }
        return argVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final arg z() {
        arg argVar;
        if (this.s != null) {
            return this.s;
        }
        synchronized (this) {
            if (this.s == null) {
                this.s = new arg(this, null, null);
            }
            argVar = this.s;
        }
        return argVar;
    }
}
