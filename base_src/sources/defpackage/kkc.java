package defpackage;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class kkc implements kik, kil {
    public final kie b;
    public final kjg c;
    public final kjt d;
    public final int f;
    public boolean g;
    public final /* synthetic */ kkg j;
    private final kle l;
    public final Queue a = new LinkedList();
    private final Set k = new HashSet();
    public final Map e = new HashMap();
    public final List h = new ArrayList();
    private khi m = null;
    public int i = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public kkc(kkg kkgVar, kij kijVar) {
        this.j = kkgVar;
        kie kieVarU = kijVar.e.b.u(kijVar.c, kkgVar.o.getLooper(), kijVar.c().a(), kijVar.f, this, this);
        String str = kijVar.d;
        if (str != null) {
            ((kmb) kieVarU).k = str;
        }
        this.b = kieVarU;
        this.c = kijVar.g;
        this.d = new kjt();
        this.f = kijVar.i;
        if (kieVarU.n()) {
            this.l = new kle(kkgVar.g, kkgVar.o, kijVar.c().a());
        } else {
            this.l = null;
        }
    }

    private final khk p(khk[] khkVarArr) {
        if (khkVarArr != null) {
            khk[] khkVarArrO = this.b.o();
            if (khkVarArrO == null) {
                khkVarArrO = new khk[0];
            }
            wy wyVar = new wy(khkVarArrO.length);
            for (khk khkVar : khkVarArrO) {
                wyVar.put(khkVar.a, Long.valueOf(khkVar.a()));
            }
            for (int i = 0; i <= 0; i++) {
                khk khkVar2 = khkVarArr[i];
                Long l = (Long) wyVar.get(khkVar2.a);
                if (l == null || l.longValue() < khkVar2.a()) {
                    return khkVar2;
                }
            }
        }
        return null;
    }

    private final Status q(khi khiVar) {
        return kkg.a(this.c, khiVar);
    }

    private final void r(khi khiVar) {
        Iterator it = this.k.iterator();
        if (!it.hasNext()) {
            this.k.clear();
            return;
        }
        if (mip.dx(khiVar, khi.a)) {
            this.b.q();
        }
        throw null;
    }

    private final void s(Status status, Exception exc, boolean z) {
        mip.m84do(this.j.o);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            kjf kjfVar = (kjf) it.next();
            if (!z || kjfVar.c == 2) {
                if (status != null) {
                    kjfVar.d(status);
                } else {
                    kjfVar.e(exc);
                }
                it.remove();
            }
        }
    }

    private final void t(kjf kjfVar) {
        kjfVar.g(this.d, o());
        try {
            kjfVar.f(this);
        } catch (DeadObjectException e) {
            a(1);
            this.b.j("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final boolean u(kjf kjfVar) {
        if (!(kjfVar instanceof kiz)) {
            t(kjfVar);
            return true;
        }
        kiz kizVar = (kiz) kjfVar;
        khk khkVarP = p(kizVar.b(this));
        if (khkVarP == null) {
            t(kjfVar);
            return true;
        }
        String name = this.b.getClass().getName();
        String str = khkVarP.a;
        long jA = khkVarP.a();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 77 + String.valueOf(str).length());
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(str);
        sb.append(", ");
        sb.append(jA);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        if (!this.j.p || !kizVar.a(this)) {
            kizVar.e(new kiy(khkVarP));
            return true;
        }
        kkd kkdVar = new kkd(this.c, khkVarP);
        int iIndexOf = this.h.indexOf(kkdVar);
        if (iIndexOf >= 0) {
            kkd kkdVar2 = (kkd) this.h.get(iIndexOf);
            this.j.o.removeMessages(15, kkdVar2);
            Handler handler = this.j.o;
            handler.sendMessageDelayed(Message.obtain(handler, 15, kkdVar2), 5000L);
            return false;
        }
        this.h.add(kkdVar);
        Handler handler2 = this.j.o;
        handler2.sendMessageDelayed(Message.obtain(handler2, 15, kkdVar), 5000L);
        Handler handler3 = this.j.o;
        handler3.sendMessageDelayed(Message.obtain(handler3, 16, kkdVar), 120000L);
        khi khiVar = new khi(2, null);
        if (v(khiVar)) {
            return false;
        }
        this.j.i(khiVar, this.f);
        return false;
    }

    private final boolean v(khi khiVar) {
        synchronized (kkg.c) {
            kkg kkgVar = this.j;
            if (kkgVar.m == null || !kkgVar.n.contains(this.c)) {
                return false;
            }
            kju kjuVar = this.j.m;
            kjk kjkVar = new kjk(khiVar, this.f);
            if (kjuVar.b.compareAndSet(null, kjkVar)) {
                kjuVar.c.post(new kjl(kjuVar, kjkVar));
            }
            return true;
        }
    }

    @Override // defpackage.kjq
    public final void a(int i) {
        if (Looper.myLooper() == this.j.o.getLooper()) {
            k(i);
        } else {
            this.j.o.post(new kjz(this, i));
        }
    }

    @Override // defpackage.kjq
    public final void b() {
        if (Looper.myLooper() == this.j.o.getLooper()) {
            h();
        } else {
            this.j.o.post(new kjy(this));
        }
    }

    public final void c() {
        mip.m84do(this.j.o);
        this.m = null;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [kie, kui] */
    public final void d() {
        mip.m84do(this.j.o);
        if (this.b.k() || this.b.l()) {
            return;
        }
        try {
            kkg kkgVar = this.j;
            kmx kmxVar = kkgVar.i;
            Context context = kkgVar.g;
            kie kieVar = this.b;
            mip.dk(context);
            mip.dk(kieVar);
            int iF = 0;
            if (kieVar.m()) {
                int iA = kieVar.a();
                int iB = kmxVar.b(iA);
                if (iB == -1) {
                    int i = 0;
                    while (true) {
                        if (i >= kmxVar.a.size()) {
                            iF = -1;
                            break;
                        }
                        int iKeyAt = kmxVar.a.keyAt(i);
                        if (iKeyAt > iA && kmxVar.a.get(iKeyAt) == 0) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (iF == -1) {
                        iF = kmxVar.b.f(context, iA);
                    }
                    kmxVar.a.put(iA, iF);
                } else {
                    iF = iB;
                }
            }
            if (iF != 0) {
                khi khiVar = new khi(iF, null);
                String name = this.b.getClass().getName();
                String strValueOf = String.valueOf(khiVar);
                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 35 + String.valueOf(strValueOf).length());
                sb.append("The service for ");
                sb.append(name);
                sb.append(" is not available: ");
                sb.append(strValueOf);
                Log.w("GoogleApiManager", sb.toString());
                i(khiVar);
                return;
            }
            kkf kkfVar = new kkf(this.j, this.b, this.c);
            if (this.b.n()) {
                kle kleVar = this.l;
                mip.dk(kleVar);
                kui kuiVar = kleVar.e;
                if (kuiVar != null) {
                    kuiVar.i();
                }
                kleVar.d.h = Integer.valueOf(System.identityHashCode(kleVar));
                mip mipVar = kleVar.g;
                Context context2 = kleVar.a;
                Looper looper = kleVar.b.getLooper();
                kmf kmfVar = kleVar.d;
                kleVar.e = mipVar.u(context2, looper, kmfVar, kmfVar.g, kleVar, kleVar);
                kleVar.f = kkfVar;
                Set set = kleVar.c;
                if (set == null || set.isEmpty()) {
                    kleVar.b.post(new klc(kleVar));
                } else {
                    kmb kmbVar = (kmb) kleVar.e;
                    kmbVar.h(new kly(kmbVar));
                }
            }
            try {
                this.b.h(kkfVar);
            } catch (SecurityException e) {
                j(new khi(10), e);
            }
        } catch (IllegalStateException e2) {
            j(new khi(10), e2);
        }
    }

    public final void e(kjf kjfVar) {
        mip.m84do(this.j.o);
        if (this.b.k()) {
            if (u(kjfVar)) {
                l();
                return;
            } else {
                this.a.add(kjfVar);
                return;
            }
        }
        this.a.add(kjfVar);
        khi khiVar = this.m;
        if (khiVar == null || !khiVar.b()) {
            d();
        } else {
            i(this.m);
        }
    }

    public final void f(Status status) {
        mip.m84do(this.j.o);
        s(status, null, false);
    }

    public final void g() {
        ArrayList arrayList = new ArrayList(this.a);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            kjf kjfVar = (kjf) arrayList.get(i);
            if (!this.b.k()) {
                return;
            }
            if (u(kjfVar)) {
                this.a.remove(kjfVar);
            }
        }
    }

    public final void h() {
        c();
        r(khi.a);
        n();
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            kla klaVar = (kla) it.next();
            kky kkyVar = klaVar.a;
            if (p(null) != null) {
                it.remove();
            } else {
                try {
                    klaVar.a.b(this.b, new kvm());
                } catch (DeadObjectException e) {
                    a(3);
                    this.b.j("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException e2) {
                    it.remove();
                }
            }
        }
        g();
        l();
    }

    @Override // defpackage.kkw
    public final void i(khi khiVar) {
        j(khiVar, null);
    }

    public final void j(khi khiVar, Exception exc) {
        kui kuiVar;
        mip.m84do(this.j.o);
        kle kleVar = this.l;
        if (kleVar != null && (kuiVar = kleVar.e) != null) {
            kuiVar.i();
        }
        c();
        this.j.i.a();
        r(khiVar);
        if ((this.b instanceof knv) && khiVar.c != 24) {
            kkg kkgVar = this.j;
            kkgVar.f = true;
            Handler handler = kkgVar.o;
            handler.sendMessageDelayed(handler.obtainMessage(19), 300000L);
        }
        if (khiVar.c == 4) {
            f(kkg.b);
            return;
        }
        if (this.a.isEmpty()) {
            this.m = khiVar;
            return;
        }
        if (exc != null) {
            mip.m84do(this.j.o);
            s(null, exc, false);
            return;
        }
        if (!this.j.p) {
            f(q(khiVar));
            return;
        }
        s(q(khiVar), null, true);
        if (this.a.isEmpty() || v(khiVar) || this.j.i(khiVar, this.f)) {
            return;
        }
        if (khiVar.c == 18) {
            this.g = true;
        }
        if (!this.g) {
            f(q(khiVar));
        } else {
            Handler handler2 = this.j.o;
            handler2.sendMessageDelayed(Message.obtain(handler2, 9, this.c), 5000L);
        }
    }

    public final void k(int i) {
        c();
        this.g = true;
        kjt kjtVar = this.d;
        String strF = this.b.f();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (strF != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(strF);
        }
        kjtVar.a(true, new Status(20, sb.toString()));
        Handler handler = this.j.o;
        handler.sendMessageDelayed(Message.obtain(handler, 9, this.c), 5000L);
        Handler handler2 = this.j.o;
        handler2.sendMessageDelayed(Message.obtain(handler2, 11, this.c), 120000L);
        this.j.i.a();
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            Runnable runnable = ((kla) it.next()).c;
        }
    }

    public final void l() {
        this.j.o.removeMessages(12, this.c);
        Handler handler = this.j.o;
        handler.sendMessageDelayed(handler.obtainMessage(12, this.c), this.j.e);
    }

    public final void m() {
        mip.m84do(this.j.o);
        f(kkg.a);
        this.d.a(false, kkg.a);
        for (kkr kkrVar : (kkr[]) this.e.keySet().toArray(new kkr[0])) {
            e(new kje(kkrVar, new kvm()));
        }
        r(new khi(4));
        if (this.b.k()) {
            this.b.p(new kkb(this));
        }
    }

    public final void n() {
        if (this.g) {
            this.j.o.removeMessages(11, this.c);
            this.j.o.removeMessages(9, this.c);
            this.g = false;
        }
    }

    public final boolean o() {
        return this.b.n();
    }
}
