package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.IBinder;
import com.google.vr.vrcore.base.api.VrCoreUtils;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes2.dex */
public final class qmd {
    static volatile qcn a;
    static volatile qco b;
    public static volatile qco c;
    public static volatile qco d;
    public static volatile qco e;
    public static volatile qco f;
    public static volatile qco g;
    public static volatile qco h;
    public static volatile qco i;
    public static volatile qco j;
    public static volatile qco k;
    public static volatile qco l;
    public static volatile qco m;
    public static volatile qco n;
    public static volatile qcm o;
    public static volatile qcm p;
    public static volatile qcm q;
    public static volatile qcm r;
    public static volatile qcm s;
    public static int t;
    public static pyi u;
    public static volatile Boolean v;
    private static Context w;

    public static void A(Collection collection, Iterable iterable) {
        collection.addAll(iterable);
    }

    public static int B(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.CharSequence, java.lang.Object] */
    public static void C(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, qmu qmuVar) throws IOException {
        charSequence2.getClass();
        appendable.append(charSequence2);
        int i3 = 0;
        for (Object obj : iterable) {
            i3++;
            if (i3 > 1) {
                appendable.append(charSequence);
            }
            if (i2 >= 0 && i3 > 0) {
                i2 = 0;
                break;
            }
            if (qmuVar != null) {
                appendable.append((CharSequence) qmuVar.a(obj));
            } else if (obj == null || (obj instanceof CharSequence)) {
                appendable.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                appendable.append(((Character) obj).charValue());
            } else {
                appendable.append(String.valueOf(obj));
            }
        }
        if (i2 >= 0 && i3 > 0) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
    }

    public static /* synthetic */ String D(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, qmu qmuVar, int i2) throws IOException {
        if (1 == (i2 & 1)) {
            charSequence = ", ";
        }
        CharSequence charSequence4 = charSequence;
        CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i2 & 4) != 0 ? "" : charSequence3;
        int i3 = (i2 & 8) != 0 ? -1 : 0;
        CharSequence charSequence7 = (i2 & 16) != 0 ? "..." : null;
        qmu qmuVar2 = (i2 & 32) != 0 ? null : qmuVar;
        iterable.getClass();
        charSequence5.getClass();
        charSequence6.getClass();
        charSequence7.getClass();
        StringBuilder sb = new StringBuilder();
        C(iterable, sb, charSequence4, charSequence5, charSequence6, i3, charSequence7, qmuVar2);
        String string = sb.toString();
        string.getClass();
        return string;
    }

    public static /* synthetic */ void E(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, int i2) throws IOException {
        if ((i2 & 2) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence3 = charSequence;
        if ((i2 & 4) != 0) {
            charSequence2 = "";
        }
        C(iterable, appendable, charSequence3, charSequence2, "", -1, "...", null);
    }

    public static List F(Object[] objArr) {
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }

    public static void G(Object[] objArr, Object obj, int i2, int i3) {
        objArr.getClass();
        Arrays.fill(objArr, i2, i3, obj);
    }

    public static Set H(Object[] objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(o(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }

    public static qoj I(Object[] objArr) {
        return new qku(objArr);
    }

    public static /* synthetic */ void J(Object[] objArr, Object[] objArr2, int i2, int i3, int i4, int i5) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = objArr.length;
        }
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i3, objArr2, i2, i4 - i3);
    }

    public static final qkl K(Object obj, Object obj2) {
        return new qkl(obj, obj2);
    }

    public static final Object L(Throwable th) {
        return new qkm(th);
    }

    public static final void M(Object obj) {
        if (obj instanceof qkm) {
            throw ((qkm) obj).a;
        }
    }

    public static final qkj N(qmj qmjVar) {
        return new qkp(qmjVar);
    }

    public static final qkj O(qmj qmjVar) {
        return new qko(qmjVar);
    }

    public static final void P(Throwable th, Throwable th2) {
        th2.getClass();
        if (th != th2) {
            int i2 = qme.a;
            Method method = qmc.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static qbt Q(Callable callable) {
        try {
            qbt qbtVar = (qbt) callable.call();
            W(qbtVar, "Scheduler Callable result can't be null");
            return qbtVar;
        } catch (Throwable th) {
            throw qjq.a(th);
        }
    }

    public static void R(Throwable th) {
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!(th instanceof qci) && !(th instanceof qch) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof qcg)) {
            th = new qck(th);
        }
        th.printStackTrace();
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }

    public static void S(Runnable runnable) {
        W(runnable, "run is null");
    }

    public static int T(int i2) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i2 - 1));
    }

    public static long U(AtomicLong atomicLong, long j2) {
        long j3;
        do {
            j3 = atomicLong.get();
            if (j3 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j3, V(j3, j2)));
        return j3;
    }

    public static long V(long j2, long j3) {
        long j4 = j2 + j3;
        if (j4 < 0) {
            return Long.MAX_VALUE;
        }
        return j4;
    }

    public static void W(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void X(int i2, String str) {
        if (i2 > 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 36);
        sb.append(str);
        sb.append(" > 0 required but it was ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void Y(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static qbz Z() {
        return new qcb(qdd.b);
    }

    public static final void a(Closeable closeable, Throwable th) throws IOException {
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            P(th, th2);
        }
    }

    public static final pyw aa(List list, List list2) {
        return new pyw(list, list2);
    }

    public static final void ab(qkg qkgVar, List list) {
        list.add(qkgVar);
    }

    public static final void ac(qkg qkgVar, List list) {
        list.add(qkgVar);
    }

    public static void ad(Object obj, Class cls) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }

    public static void ae(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static int af(int i2) {
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((i2 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static LinkedHashMap ag(int i2) {
        return new LinkedHashMap(af(i2));
    }

    public static List ah(int i2) {
        return i2 == 0 ? Collections.emptyList() : new ArrayList(i2);
    }

    public static final pyu ai(LinkedHashMap linkedHashMap) {
        return new pyu(linkedHashMap);
    }

    public static final void aj(Object obj, qkg qkgVar, LinkedHashMap linkedHashMap) {
        obj.getClass();
        qkgVar.getClass();
        linkedHashMap.put(obj, qkgVar);
    }

    public static Context ak(Context context) throws pxj {
        if (w == null) {
            int vrCoreClientApiVersion = VrCoreUtils.getVrCoreClientApiVersion(context);
            if (vrCoreClientApiVersion < 9) {
                throw new pxj(4);
            }
            try {
                w = context.createPackageContext("com.google.vr.vrcore", 3);
                t = vrCoreClientApiVersion;
            } catch (PackageManager.NameNotFoundException e2) {
                throw new pxj(1);
            }
        }
        return w;
    }

    public static IBinder al(ClassLoader classLoader) {
        try {
            return (IBinder) classLoader.loadClass("com.google.vr.vrcore.library.VrCreator").newInstance();
        } catch (ClassNotFoundException e2) {
            throw new IllegalStateException("Unable to find dynamic class com.google.vr.vrcore.library.VrCreator");
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException("Unable to call the default constructor of com.google.vr.vrcore.library.VrCreator");
        } catch (InstantiationException e4) {
            throw new IllegalStateException("Unable to instantiate the remote class com.google.vr.vrcore.library.VrCreator");
        }
    }

    public static synchronized boolean am(Context context) {
        if (v == null) {
            try {
                v = Boolean.valueOf(pxi.a(context.getPackageManager().getPackageInfo(context.getPackageName(), 64), pxi.c, pxi.d, pxi.b));
            } catch (PackageManager.NameNotFoundException e2) {
                throw new IllegalStateException("Unable to find self package info", e2);
            }
        }
        return v.booleanValue();
    }

    public static Uri an(String str, String str2) {
        return new Uri.Builder().scheme("content").authority(str).path(str2).build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final qlh b(qmy qmyVar, Object obj, qlh qlhVar) {
        if (qmyVar instanceof qls) {
            return ((qls) qmyVar).create(obj, qlhVar);
        }
        qln context = qlhVar.getContext();
        return context == qlo.a ? new qlq(qlhVar, qmyVar, obj) : new qlr(qlhVar, context, qmyVar, obj);
    }

    public static final qlh c(qlh qlhVar) {
        qlhVar.getClass();
        qlu qluVar = (qlu) (true != (qlhVar instanceof qlu) ? null : qlhVar);
        return qluVar != null ? qluVar.intercepted() : qlhVar;
    }

    public static Object d(qlk qlkVar, Object obj, qmy qmyVar) {
        return qmyVar.invoke(obj, qlkVar);
    }

    public static qlk e(qlk qlkVar, qll qllVar) {
        qllVar.getClass();
        if (!qno.c(qlkVar.getKey(), qllVar)) {
            return null;
        }
        if (qlkVar != null) {
            return qlkVar;
        }
        throw new NullPointerException("null cannot be cast to non-null type E");
    }

    public static qln f(qlk qlkVar, qll qllVar) {
        qllVar.getClass();
        return qno.c(qlkVar.getKey(), qllVar) ? qlo.a : qlkVar;
    }

    public static qln g(qlk qlkVar, qln qlnVar) {
        qlnVar.getClass();
        return n(qlkVar, qlnVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object h(Object obj, qlh qlhVar) {
        qlhVar.getClass();
        if (!(obj instanceof qpy)) {
            return obj;
        }
        Throwable thA = ((qpy) obj).b;
        if (qql.b) {
            thA = qvq.a(thA, qlhVar);
        }
        return L(thA);
    }

    public static final Object i(Object obj) {
        Throwable thA = qkn.a(obj);
        return thA == null ? obj : new qpy(thA);
    }

    public static final qpo j(qlh qlhVar) {
        qpo qpoVar;
        qpo qpoVar2;
        if (!(qlhVar instanceof quz)) {
            return new qpo(qlhVar, 1);
        }
        quz quzVar = (quz) qlhVar;
        qpe qpeVar = quzVar.f;
        while (true) {
            Object obj = qpeVar.a;
            qpoVar = null;
            if (obj == null) {
                qpe qpeVar2 = quzVar.f;
                qvr qvrVar = qva.b;
                int i2 = qpf.a;
                qpeVar2.a = qvrVar;
                qpoVar2 = null;
                break;
            }
            if (obj instanceof qpo) {
                if (quzVar.f.c(obj, qva.b)) {
                    qpoVar2 = (qpo) obj;
                    break;
                }
            } else if (obj != qva.b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(qno.a("Inconsistent state ", obj).toString());
            }
        }
        if (qpoVar2 != null) {
            boolean z = qql.a;
            Object obj2 = qpoVar2.c.a;
            if (obj2 instanceof qpx) {
                Object obj3 = ((qpx) obj2).d;
            }
            qpc qpcVar = qpoVar2.b;
            int i3 = qpf.a;
            qpcVar.b = 0;
            qpoVar2.c.a = qph.a;
            qpoVar = qpoVar2;
        }
        return qpoVar == null ? new qpo(qlhVar, 2) : qpoVar;
    }

    public static final Object k(qln qlnVar, qmy qmyVar, qlh qlhVar) throws Throwable {
        Object objB;
        qln context = qlhVar.getContext();
        qln qlnVarPlus = context.plus(qlnVar);
        qnt.n(qlnVarPlus);
        if (qlnVarPlus == context) {
            qvo qvoVar = new qvo(qlnVarPlus, qlhVar);
            objB = qno.J(qvoVar, qvoVar, qmyVar);
        } else if (!qno.c(qlnVarPlus.get(qlj.a), context.get(qlj.a))) {
            qqn qqnVar = new qqn(qlnVarPlus, qlhVar);
            qnm.m(qmyVar, qqnVar, qqnVar);
            qpc qpcVar = qqnVar.b;
            while (true) {
                switch (qpcVar.b) {
                    case 0:
                        if (qqnVar.b.d(0, 1)) {
                            objB = qlp.COROUTINE_SUSPENDED;
                        }
                        break;
                    case 1:
                    default:
                        throw new IllegalStateException("Already suspended".toString());
                    case 2:
                        objB = qrp.b(qqnVar.v());
                        if (objB instanceof qpy) {
                            throw ((qpy) objB).b;
                        }
                        break;
                }
            }
        } else {
            qsc qscVar = new qsc(qlnVarPlus, qlhVar);
            Object objB2 = qvt.b(qlnVarPlus, null);
            try {
                Object objJ = qno.J(qscVar, qscVar, qmyVar);
                qvt.c(qlnVarPlus, objB2);
                objB = objJ;
            } catch (Throwable th) {
                qvt.c(qlnVarPlus, objB2);
                throw th;
            }
        }
        if (objB == qlp.COROUTINE_SUSPENDED) {
            qlhVar.getClass();
        }
        return objB;
    }

    public static /* synthetic */ qrg l(qqj qqjVar, qln qlnVar, qmy qmyVar, int i2) {
        if ((i2 & 1) != 0) {
            qlnVar = qlo.a;
        }
        qqjVar.getClass();
        qlnVar.getClass();
        qrx qrxVar = new qrx(qqd.b(qqjVar, qlnVar));
        qrxVar.i(1, qrxVar, qmyVar);
        return qrxVar;
    }

    public static /* synthetic */ Object m(qmy qmyVar) throws Throwable {
        qlo qloVar = qlo.a;
        Thread threadCurrentThread = Thread.currentThread();
        qloVar.get(qlj.a);
        ThreadLocal threadLocal = qrz.a;
        qqu qquVarA = qrz.a();
        qpj qpjVar = new qpj(qqd.b(qqz.a, qquVarA), threadCurrentThread, qquVarA);
        qpjVar.i(1, qpjVar, qmyVar);
        qqu qquVar = qpjVar.b;
        if (qquVar != null) {
            qquVar.i(false);
        }
        while (!Thread.interrupted()) {
            try {
                qqu qquVar2 = qpjVar.b;
                long jF = qquVar2 == null ? Long.MAX_VALUE : qquVar2.f();
                if (qpjVar.H()) {
                    qqu qquVar3 = qpjVar.b;
                    if (qquVar3 != null) {
                        qquVar3.g(false);
                    }
                    Object objB = qrp.b(qpjVar.v());
                    qpy qpyVar = objB instanceof qpy ? (qpy) objB : null;
                    if (qpyVar == null) {
                        return objB;
                    }
                    throw qpyVar.b;
                }
                LockSupport.parkNanos(qpjVar, jF);
            } catch (Throwable th) {
                qqu qquVar4 = qpjVar.b;
                if (qquVar4 != null) {
                    qquVar4.g(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        qpjVar.E(interruptedException);
        throw interruptedException;
    }

    public static qln n(qln qlnVar, qln qlnVar2) {
        return qlnVar2 == qlo.a ? qlnVar : (qln) qlnVar2.fold(qlnVar, qlm.a);
    }

    public static int o(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 >= 1073741824) {
            return Integer.MAX_VALUE;
        }
        return (int) ((i2 / 0.75f) + 1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Map p(Iterable iterable) {
        switch (iterable.size()) {
            case 0:
                return qky.a;
            case 1:
                qkl qklVar = (qkl) iterable.get(0);
                qklVar.getClass();
                Map mapSingletonMap = Collections.singletonMap(qklVar.a, qklVar.b);
                mapSingletonMap.getClass();
                return mapSingletonMap;
            default:
                LinkedHashMap linkedHashMap = new LinkedHashMap(o(iterable.size()));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    qkl qklVar2 = (qkl) it.next();
                    linkedHashMap.put(qklVar2.a, qklVar2.b);
                }
                return linkedHashMap;
        }
    }

    public static final List q(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        listSingletonList.getClass();
        return listSingletonList;
    }

    public static int r(List list) {
        return list.size() - 1;
    }

    public static void s() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static Object t(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object u(List list, int i2) {
        if (i2 < 0 || i2 > r(list)) {
            return null;
        }
        return list.get(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List v(Collection collection, Iterable iterable) {
        ArrayList arrayList = new ArrayList(collection.size() + iterable.size());
        arrayList.addAll(collection);
        arrayList.addAll(iterable);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List w(Iterable iterable) {
        iterable.getClass();
        switch (iterable.size()) {
            case 0:
                return qkx.a;
            case 1:
                return q(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
            default:
                return x(iterable);
        }
    }

    public static List x(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Set y(Iterable iterable) {
        switch (iterable.size()) {
            case 0:
                return qkz.a;
            case 1:
                Set setSingleton = Collections.singleton(iterable.get(0));
                setSingleton.getClass();
                return setSingleton;
            default:
                LinkedHashSet linkedHashSet = new LinkedHashSet(o(iterable.size()));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(it.next());
                }
                return linkedHashSet;
        }
    }

    public static qoj z(Iterable iterable) {
        return new qkv(iterable);
    }
}
