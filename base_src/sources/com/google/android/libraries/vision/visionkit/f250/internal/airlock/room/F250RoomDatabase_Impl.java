package com.google.android.libraries.vision.visionkit.f250.internal.airlock.room;

import defpackage.ahy;
import defpackage.aif;
import defpackage.ajd;
import defpackage.ajq;
import defpackage.ajr;
import defpackage.ajs;
import defpackage.aju;
import defpackage.noy;
import defpackage.npd;
import defpackage.npf;
import defpackage.npj;
import defpackage.npl;
import defpackage.npx;
import defpackage.npz;
import defpackage.nqf;
import defpackage.nql;
import defpackage.nqu;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class F250RoomDatabase_Impl extends F250RoomDatabase {
    private volatile npz m;
    private volatile noy n;
    private volatile nql o;
    private volatile npf p;

    @Override // defpackage.aii
    protected final aif a() {
        HashMap map = new HashMap(1);
        map.put("ResourceFts", "ResourceEntity");
        return new aif(this, map, new HashMap(0), "ResourceEntity", "ResourceFts", "AnnotachmentEntity", "F250LogEntity");
    }

    @Override // defpackage.aii
    protected final aju b(ahy ahyVar) {
        ajq ajqVar = new ajq(ahyVar, new npx(this), "7be8e383f6d467ee893379ce9fd98a66", "e25960550bb53c218360ce1db158a569");
        ajr ajrVarA = ajs.a(ahyVar.b);
        ajrVarA.b = ahyVar.c;
        ajrVarA.c = ajqVar;
        return ahyVar.a.a(ajrVarA.a());
    }

    @Override // defpackage.aii
    protected final Map c() {
        HashMap map = new HashMap();
        map.put(npz.class, Collections.emptyList());
        map.put(noy.class, Collections.emptyList());
        map.put(nql.class, Collections.emptyList());
        map.put(npf.class, Collections.emptyList());
        map.put(npl.class, Collections.emptyList());
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

    @Override // com.google.android.libraries.vision.visionkit.f250.internal.airlock.room.F250RoomDatabase
    public final noy r() {
        noy noyVar;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = new npd(this);
            }
            noyVar = this.n;
        }
        return noyVar;
    }

    @Override // com.google.android.libraries.vision.visionkit.f250.internal.airlock.room.F250RoomDatabase
    public final npf s() {
        npf npfVar;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            if (this.p == null) {
                this.p = new npj(this);
            }
            npfVar = this.p;
        }
        return npfVar;
    }

    @Override // com.google.android.libraries.vision.visionkit.f250.internal.airlock.room.F250RoomDatabase
    public final npz t() {
        npz npzVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new nqf(this);
            }
            npzVar = this.m;
        }
        return npzVar;
    }

    @Override // com.google.android.libraries.vision.visionkit.f250.internal.airlock.room.F250RoomDatabase
    public final nql u() {
        nql nqlVar;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            if (this.o == null) {
                this.o = new nqu(this);
            }
            nqlVar = this.o;
        }
        return nqlVar;
    }
}
