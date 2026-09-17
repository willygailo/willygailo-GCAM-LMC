package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public class mpl extends mmb implements mpi {
    private static final Callable b = new ogr(1);
    private final Executor c;
    private final mnb d;
    private final moa e = moa.i();
    private final HashMap f = new HashMap();
    public volatile boolean a = true;

    public mpl(Executor executor) {
        this.c = executor;
        this.d = mip.X(executor, b);
    }

    private final Collection k() {
        ArrayList arrayList;
        synchronized (this.f) {
            arrayList = new ArrayList(this.f.values());
            this.f.clear();
        }
        return arrayList;
    }

    @Override // defpackage.mmb
    protected final mne b() {
        Collection collectionK = k();
        Executor executor = this.c;
        mpk mpkVar = mpk.a;
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionK.iterator();
        while (it.hasNext()) {
            arrayList.add(mip.Y(it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((mnb) it2.next()).b(executor, mpkVar));
        }
        return mne.i(mip.Z(arrayList2).b(this.c, new mng(this.e)).b(this.c, new mpk(1)).b(this.c, new mpj(this)));
    }

    @Override // defpackage.mpi
    public final mrh d() {
        return ((mqq) ((mrd) mip.aa(this.e)).f()).h();
    }

    @Override // defpackage.mpi
    public final void e(mqj mqjVar, Runnable runnable) {
        execute(new qcy(1));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (!this.a) {
            throw new RejectedExecutionException("Attempting to execute task on a GLContext that is already closed!");
        }
        this.c.execute(runnable);
    }

    @Override // defpackage.mpi
    public final boolean f() {
        return mip.ab(this.d) == Thread.currentThread();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, mtu] */
    @Override // defpackage.mpi
    public final mua g(Object obj, ojz ojzVar) {
        mua muaVar;
        synchronized (this.f) {
            mua muaVar2 = (mua) this.f.get(obj);
            if (muaVar2 == null) {
                try {
                    muaVar2 = new mua((mtu) ojzVar.a());
                    this.f.put(obj, muaVar2);
                } catch (Throwable th) {
                    throw okd.a(th);
                }
            }
            if (!muaVar2.b.get()) {
                throw new mtx();
            }
            muaVar2.a.a.incrementAndGet();
            muaVar = new mua(muaVar2.a);
        }
        return muaVar;
    }

    @Override // defpackage.mmb
    protected final void gy() {
        Iterator it = k().iterator();
        while (it.hasNext()) {
            ((mua) it.next()).close();
        }
        ((mrd) mip.ac(this.e)).close();
        this.a = false;
        mip.ac(i());
    }

    @Override // defpackage.mpi
    public final mrd h() {
        return (mrd) mip.aa(this.e);
    }

    protected mne i() {
        return mnd.a;
    }

    public final void j(mrd mrdVar) {
        this.e.k(mrdVar);
    }
}
