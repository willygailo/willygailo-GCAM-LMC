package defpackage;

import android.database.Cursor;
import android.os.Looper;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public abstract class aii {
    public Executor a;
    public Executor b;
    public aju c;
    public boolean e;

    @Deprecated
    public List f;

    @Deprecated
    public volatile ajy l;
    public final ReentrantReadWriteLock h = new ReentrantReadWriteLock();
    public final ThreadLocal i = new ThreadLocal();
    public final Map j = DesugarCollections.synchronizedMap(new HashMap());
    public final aif d = a();
    public final Map k = new HashMap();
    protected final Map g = new HashMap();

    public static final Object q(Class cls, aju ajuVar) {
        if (cls.isInstance(ajuVar)) {
            return ajuVar;
        }
        return null;
    }

    protected abstract aif a();

    protected abstract aju b(ahy ahyVar);

    protected Map c() {
        return Collections.emptyMap();
    }

    public Set d() {
        return Collections.emptySet();
    }

    final Lock e() {
        return this.h.readLock();
    }

    public final void f() {
        if (!this.e && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void g() {
        if (!k() && this.i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public final void h() {
        f();
        f();
        ajy ajyVarA = this.c.a();
        this.d.b(ajyVarA);
        if (ajyVarA.k()) {
            ajyVarA.e();
        } else {
            ajyVarA.d();
        }
    }

    @Deprecated
    public final void i() {
        this.c.a().f();
        if (k()) {
            return;
        }
        aif aifVar = this.d;
        if (aifVar.e.compareAndSet(false, true)) {
            adf adfVar = aifVar.k;
            aifVar.d.a.execute(aifVar.i);
        }
    }

    @Deprecated
    public final void j() {
        this.c.a().h();
    }

    public final boolean k() {
        return this.c.a().i();
    }

    public final boolean l() {
        ajy ajyVar = this.l;
        return ajyVar != null && ajyVar.j();
    }

    public final ake m(String str) {
        f();
        g();
        return this.c.a().l(str);
    }

    public List n() {
        return Collections.emptyList();
    }

    public final Cursor o(ajw ajwVar) {
        f();
        g();
        return this.c.a().a(ajwVar);
    }

    public final void p(ajy ajyVar) {
        aif aifVar = this.d;
        synchronized (aifVar) {
            if (aifVar.f) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            ajyVar.g("PRAGMA temp_store = MEMORY;");
            ajyVar.g("PRAGMA recursive_triggers='ON';");
            ajyVar.g("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            aifVar.b(ajyVar);
            aifVar.j = ajyVar.l("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            aifVar.f = true;
        }
    }
}
