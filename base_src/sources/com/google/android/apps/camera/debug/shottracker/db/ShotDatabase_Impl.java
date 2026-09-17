package com.google.android.apps.camera.debug.shottracker.db;

import defpackage.ahy;
import defpackage.aif;
import defpackage.ajd;
import defpackage.ajq;
import defpackage.ajr;
import defpackage.ajs;
import defpackage.aju;
import defpackage.dil;
import defpackage.dir;
import defpackage.dis;
import defpackage.diu;
import defpackage.diy;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ShotDatabase_Impl extends ShotDatabase {
    private volatile dil m;
    private volatile diu n;

    @Override // defpackage.aii
    protected final aif a() {
        return new aif(this, new HashMap(0), new HashMap(0), "shots", "shot_log");
    }

    @Override // defpackage.aii
    protected final aju b(ahy ahyVar) {
        ajq ajqVar = new ajq(ahyVar, new dis(this), "d5a320f0e030e16072c0c60f65398e1d", "9330e297cee824d2d260a862d56ce4e4");
        ajr ajrVarA = ajs.a(ahyVar.b);
        ajrVarA.b = ahyVar.c;
        ajrVarA.c = ajqVar;
        return ahyVar.a.a(ajrVarA.a());
    }

    @Override // defpackage.aii
    protected final Map c() {
        HashMap map = new HashMap();
        map.put(dil.class, Collections.emptyList());
        map.put(diu.class, Collections.emptyList());
        return map;
    }

    @Override // defpackage.aii
    public final Set d() {
        return new HashSet();
    }

    @Override // defpackage.aii
    public final List n() {
        return Arrays.asList(new ajd[0]);
    }

    @Override // com.google.android.apps.camera.debug.shottracker.db.ShotDatabase
    public final dil r() {
        dil dilVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new dir(this);
            }
            dilVar = this.m;
        }
        return dilVar;
    }

    @Override // com.google.android.apps.camera.debug.shottracker.db.ShotDatabase
    public final diu s() {
        diu diuVar;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = new diy(this);
            }
            diuVar = this.n;
        }
        return diuVar;
    }
}
