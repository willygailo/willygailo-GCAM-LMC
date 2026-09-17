package androidx.work;

import defpackage.amq;
import defpackage.ani;
import defpackage.aso;
import java.util.Collection;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class WorkerParameters {
    public UUID a;
    public amq b;
    public int c;
    public Executor d;
    public ani e;
    public aso f;

    public WorkerParameters(UUID uuid, amq amqVar, Collection collection, int i, Executor executor, aso asoVar, ani aniVar) {
        this.a = uuid;
        this.b = amqVar;
        new HashSet(collection);
        this.c = i;
        this.d = executor;
        this.f = asoVar;
        this.e = aniVar;
    }
}
