package defpackage;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.apps.camera.bottombar.R;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.lasagna.LasagnaCallbacks;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class plk {
    public static void $default$onFinalStatusNative(LasagnaCallbacks lasagnaCallbacks, int i, int i2, String str, byte[] bArr) {
        ojc ojcVarI = oih.a;
        if (bArr != null) {
            try {
                ojcVarI = ojc.i((plp) ppd.s(plp.q, bArr, pos.b()));
            } catch (ppp e) {
            }
        }
        lasagnaCallbacks.a(i, i2, str, ojcVarI);
    }

    public static void $default$onImageNative(LasagnaCallbacks lasagnaCallbacks, int i, long j, int i2, String str, long j2) {
        int i3;
        switch (i2) {
            case 0:
                i3 = 1;
                break;
            case 1:
                i3 = 2;
                break;
            case 2:
                i3 = 3;
                break;
            case 3:
                i3 = 4;
                break;
            case 4:
                i3 = 5;
                break;
            default:
                i3 = 0;
                break;
        }
        lasagnaCallbacks.b(i, j, i3, str, new ShotMetadata(j2));
    }

    public static int A(byte[] bArr, int i, pnr pnrVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            pnrVar.b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        pnrVar.b = j2;
        return i3;
    }

    public static int B(int i, byte[] bArr, int i2, int i3, pnr pnrVar) throws ppp {
        if (psa.a(i) == 0) {
            throw ppp.c();
        }
        switch (psa.b(i)) {
            case 0:
                return A(bArr, i2, pnrVar);
            case 1:
                return i2 + 8;
            case 2:
                return x(bArr, i2, pnrVar) + pnrVar.a;
            case 3:
                int i4 = (i & (-8)) | 4;
                int i5 = 0;
                while (i2 < i3) {
                    i2 = x(bArr, i2, pnrVar);
                    i5 = pnrVar.a;
                    if (i5 == i4) {
                        if (i2 <= i3 || i5 != i4) {
                            throw ppp.g();
                        }
                        return i2;
                    }
                    i2 = B(i5, bArr, i2, i3, pnrVar);
                }
                if (i2 <= i3) {
                }
                throw ppp.g();
            case 4:
            default:
                throw ppp.c();
            case 5:
                return i2 + 4;
        }
    }

    public static long C(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static int D(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            default:
                return 0;
        }
    }

    public static void E(ShotMetadata shotMetadata) {
        GcamModuleJNI.RotateShotMetadata__SWIG_1(ShotMetadata.c(shotMetadata), shotMetadata, 60);
    }

    public static int F(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            default:
                return 0;
        }
    }

    public static int G(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 0;
        }
    }

    public static /* synthetic */ String H(int i) {
        switch (i) {
            case 1:
                return "ERROR";
            case 2:
                return "DONE";
            case 3:
                return "NEEDS_MORE_INPUT";
            case 4:
                return "NEEDS_MORE_OUTPUT";
            case 5:
                return "OK";
            default:
                return "null";
        }
    }

    public static Object I(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException e) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static phv J(ExecutorService executorService) {
        if (executorService instanceof phv) {
            return (phv) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new pic((ScheduledExecutorService) executorService) : new phz(executorService);
    }

    public static phv K() {
        return new phy();
    }

    public static phw L(ScheduledExecutorService scheduledExecutorService) {
        return scheduledExecutorService instanceof phw ? (phw) scheduledExecutorService : new pic(scheduledExecutorService);
    }

    public static Executor M(Executor executor) {
        return new pig(executor);
    }

    public static Executor N(Executor executor, pfx pfxVar) {
        executor.getClass();
        return executor == pgr.INSTANCE ? executor : new phx(executor, pfxVar);
    }

    public static phm O(Iterable iterable) {
        return new phm(false, oom.i(iterable));
    }

    @SafeVarargs
    public static phm P(pht... phtVarArr) {
        return new phm(false, oom.k(phtVarArr));
    }

    public static phm Q(Iterable iterable) {
        return new phm(true, oom.i(iterable));
    }

    public static pht R(Iterable iterable) {
        return new pgm(oom.i(iterable), true);
    }

    @SafeVarargs
    public static pht S(pht... phtVarArr) {
        return new pgm(oom.k(phtVarArr), true);
    }

    public static pht T() {
        return new php();
    }

    public static pht U(Throwable th) {
        th.getClass();
        return new php(th);
    }

    public static pht V(Object obj) {
        return obj == null ? phq.a : new phq(obj);
    }

    public static pht W(pht phtVar) {
        if (phtVar.isDone()) {
            return phtVar;
        }
        phn phnVar = new phn(phtVar);
        phtVar.d(phnVar, pgr.INSTANCE);
        return phnVar;
    }

    public static pht X(pgj pgjVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        pip pipVarF = pip.f(pgjVar);
        pipVarF.d(new phi(scheduledExecutorService.schedule(pipVarF, j, timeUnit)), pgr.INSTANCE);
        return pipVarF;
    }

    public static pht Y(Runnable runnable, Executor executor) {
        pip pipVarH = pip.h(runnable, null);
        executor.execute(pipVarH);
        return pipVarH;
    }

    public static pht Z(Callable callable, Executor executor) {
        pip pipVarG = pip.g(callable);
        executor.execute(pipVarG);
        return pipVarG;
    }

    private static int a(byte b) {
        return b & 63;
    }

    public static boolean aA(byte b) {
        return b < -16;
    }

    public static boolean aB(byte b) {
        return b < -32;
    }

    public static /* bridge */ /* synthetic */ void aD(Object obj, int i, poc pocVar) {
        ((prn) obj).d(psa.c(i, 2), pocVar);
    }

    public static /* bridge */ /* synthetic */ void aE(Object obj, int i, long j) {
        ((prn) obj).d(psa.c(i, 0), Long.valueOf(j));
    }

    public static prn aF(Object obj) {
        return ((ppd) obj).aF;
    }

    public static void aG(Object obj, prn prnVar) {
        ((ppd) obj).aF = prnVar;
    }

    public static /* bridge */ /* synthetic */ Object aH(Object obj) {
        prn prnVarAF = aF(obj);
        if (prnVarAF != prn.a) {
            return prnVarAF;
        }
        prn prnVarB = prn.b();
        aG(obj, prnVarB);
        return prnVarB;
    }

    public static void aI(Object obj) {
        aF(obj).c();
    }

    public static String aJ(poc pocVar) {
        StringBuilder sb = new StringBuilder(pocVar.d());
        for (int i = 0; i < pocVar.d(); i++) {
            byte bA = pocVar.a(i);
            switch (bA) {
                case 7:
                    sb.append("\\a");
                    break;
                case 8:
                    sb.append("\\b");
                    break;
                case 9:
                    sb.append("\\t");
                    break;
                case 10:
                    sb.append("\\n");
                    break;
                case 11:
                    sb.append("\\v");
                    break;
                case 12:
                    sb.append("\\f");
                    break;
                case 13:
                    sb.append("\\r");
                    break;
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    sb.append("\\\"");
                    break;
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                    sb.append("\\'");
                    break;
                case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                    sb.append("\\\\");
                    break;
                default:
                    if (bA < 32 || bA > 126) {
                        sb.append('\\');
                        sb.append((char) (((bA >>> 6) & 3) + 48));
                        sb.append((char) (((bA >>> 3) & 7) + 48));
                        sb.append((char) ((bA & 7) + 48));
                    } else {
                        sb.append((char) bA);
                    }
                    break;
            }
        }
        return sb.toString();
    }

    public static void aK(poc pocVar, ArrayDeque arrayDeque) {
        if (!pocVar.h()) {
            if (pocVar instanceof pra) {
                pra praVar = (pra) pocVar;
                int[] iArr = pra.a;
                aK(praVar.e, arrayDeque);
                aK(praVar.f, arrayDeque);
                return;
            }
            String strValueOf = String.valueOf(pocVar.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 49);
            sb.append("Has a new type of ByteString been created? Found ");
            sb.append(strValueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        int iAT = aT(pocVar.d());
        int iC = pra.c(iAT + 1);
        if (arrayDeque.isEmpty() || ((poc) arrayDeque.peek()).d() >= iC) {
            arrayDeque.push(pocVar);
            return;
        }
        int iC2 = pra.c(iAT);
        poc praVar2 = (poc) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((poc) arrayDeque.peek()).d() < iC2) {
            praVar2 = new pra((poc) arrayDeque.pop(), praVar2);
        }
        pra praVar3 = new pra(praVar2, pocVar);
        while (!arrayDeque.isEmpty()) {
            if (((poc) arrayDeque.peek()).d() >= pra.c(aT(praVar3.d) + 1)) {
                break;
            } else {
                praVar3 = new pra((poc) arrayDeque.pop(), praVar3);
            }
        }
        arrayDeque.push(praVar3);
    }

    static void aL(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                aL(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                aL(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(aJ(poc.v((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof poc) {
            sb.append(": \"");
            sb.append(aJ((poc) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof ppd) {
            sb.append(" {");
            aM((ppd) obj, sb, i + 2);
            sb.append("\n");
            while (i2 < i) {
                sb.append(' ');
                i2++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj.toString());
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i4 = i + 2;
        aL(sb, i4, "key", entry.getKey());
        aL(sb, i4, "value", entry.getValue());
        sb.append("\n");
        while (i2 < i) {
            sb.append(' ');
            i2++;
        }
        sb.append("}");
    }

    public static void aM(pqm pqmVar, StringBuilder sb, int i) {
        boolean zEquals;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : pqmVar.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String strSubstring = str.startsWith("get") ? str.substring(3) : str;
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List")) {
                String strValueOf = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strValueOf2 = String.valueOf(strSubstring.substring(1, strSubstring.length() - 4));
                String strConcat = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
                Method method2 = (Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    aL(sb, i, aU(strConcat), ppd.D(method2, pqmVar, new Object[0]));
                }
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map")) {
                String strValueOf3 = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strValueOf4 = String.valueOf(strSubstring.substring(1, strSubstring.length() - 3));
                String strConcat2 = strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3);
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    aL(sb, i, aU(strConcat2), ppd.D(method3, pqmVar, new Object[0]));
                }
            }
            String strValueOf5 = String.valueOf(strSubstring);
            if (((Method) map2.get(strValueOf5.length() != 0 ? "set".concat(strValueOf5) : new String("set"))) != null) {
                if (strSubstring.endsWith("Bytes")) {
                    String strValueOf6 = String.valueOf(strSubstring.substring(0, strSubstring.length() - 5));
                    if (!map.containsKey(strValueOf6.length() != 0 ? "get".concat(strValueOf6) : new String("get"))) {
                    }
                }
                String strValueOf7 = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strValueOf8 = String.valueOf(strSubstring.substring(1));
                String strConcat3 = strValueOf8.length() != 0 ? strValueOf7.concat(strValueOf8) : new String(strValueOf7);
                String strValueOf9 = String.valueOf(strSubstring);
                Method method4 = (Method) map.get(strValueOf9.length() != 0 ? "get".concat(strValueOf9) : new String("get"));
                String strValueOf10 = String.valueOf(strSubstring);
                Method method5 = (Method) map.get(strValueOf10.length() != 0 ? "has".concat(strValueOf10) : new String("has"));
                if (method4 != null) {
                    Object objD = ppd.D(method4, pqmVar, new Object[0]);
                    if (method5 == null) {
                        if (objD instanceof Boolean) {
                            if (((Boolean) objD).booleanValue()) {
                                aL(sb, i, aU(strConcat3), objD);
                            }
                        } else if (objD instanceof Integer) {
                            if (((Integer) objD).intValue() != 0) {
                                aL(sb, i, aU(strConcat3), objD);
                            }
                        } else if (objD instanceof Float) {
                            if (((Float) objD).floatValue() != 0.0f) {
                                aL(sb, i, aU(strConcat3), objD);
                            }
                        } else if (!(objD instanceof Double)) {
                            if (objD instanceof String) {
                                zEquals = objD.equals("");
                            } else if (objD instanceof poc) {
                                zEquals = objD.equals(poc.b);
                            } else if (objD instanceof pqm) {
                                if (objD != ((pqm) objD).l()) {
                                    aL(sb, i, aU(strConcat3), objD);
                                }
                            } else if (!(objD instanceof Enum) || ((Enum) objD).ordinal() != 0) {
                                aL(sb, i, aU(strConcat3), objD);
                            }
                            if (!zEquals) {
                                aL(sb, i, aU(strConcat3), objD);
                            }
                        } else if (((Double) objD).doubleValue() != 0.0d) {
                            aL(sb, i, aU(strConcat3), objD);
                        }
                    } else if (((Boolean) ppd.D(method5, pqmVar, new Object[0])).booleanValue()) {
                        aL(sb, i, aU(strConcat3), objD);
                    }
                }
            }
        }
        if (pqmVar instanceof ppb) {
            Iterator itD = ((ppb) pqmVar).h.d();
            while (itD.hasNext()) {
                Map.Entry entry = (Map.Entry) itD.next();
                int i2 = ((ppc) entry.getKey()).b;
                StringBuilder sb2 = new StringBuilder(13);
                sb2.append("[");
                sb2.append(i2);
                sb2.append("]");
                aL(sb, i, sb2.toString(), entry.getValue());
            }
        }
        prn prnVar = ((ppd) pqmVar).aF;
        if (prnVar != null) {
            for (int i3 = 0; i3 < prnVar.b; i3++) {
                aL(sb, i, String.valueOf(psa.a(prnVar.c[i3])), prnVar.d[i3]);
            }
        }
    }

    public static pqf aN(Object obj) {
        return ((pqg) obj).a;
    }

    public static int aO(int i, Object obj, Object obj2) {
        pqh pqhVar = (pqh) obj;
        pqg pqgVar = (pqg) obj2;
        int iAb = 0;
        if (!pqhVar.isEmpty()) {
            for (Map.Entry entry : pqhVar.entrySet()) {
                iAb += pom.ab(i) + pom.R(pqg.a(pqgVar.a, entry.getKey(), entry.getValue()));
            }
        }
        return iAb;
    }

    public static boolean aP(Object obj) {
        return !((pqh) obj).b;
    }

    public static Object aQ(Object obj, Object obj2) {
        pqh pqhVarA = (pqh) obj;
        pqh pqhVar = (pqh) obj2;
        if (!pqhVar.isEmpty()) {
            if (!pqhVarA.b) {
                pqhVarA = pqhVarA.a();
            }
            pqhVarA.b();
            if (!pqhVar.isEmpty()) {
                pqhVarA.putAll(pqhVar);
            }
        }
        return pqhVarA;
    }

    public static Object aR() {
        return pqh.a.a();
    }

    private static boolean aS(byte b) {
        return b > -65;
    }

    private static int aT(int i) {
        int iBinarySearch = Arrays.binarySearch(pra.a, i);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }

    private static String aU(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    public static pht aa(pgj pgjVar, Executor executor) {
        pip pipVarF = pip.f(pgjVar);
        executor.execute(pipVarF);
        return pipVarF;
    }

    public static pht ab(Iterable iterable) {
        return new pgm(oom.i(iterable), false);
    }

    public static pht ac(pht phtVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (phtVar.isDone()) {
            return phtVar;
        }
        pim pimVar = new pim(phtVar);
        pik pikVar = new pik(pimVar);
        pimVar.b = scheduledExecutorService.schedule(pikVar, j, timeUnit);
        phtVar.d(pikVar, pgr.INSTANCE);
        return pimVar;
    }

    public static Object ad(Future future) {
        obr.aT(future.isDone(), "Future was expected to be done: %s", future);
        return I(future);
    }

    public static Object ae(Future future) {
        future.getClass();
        try {
            return I(future);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new pgs((Error) cause);
            }
            throw new piq(cause);
        }
    }

    public static void af(pht phtVar, phh phhVar, Executor executor) {
        phhVar.getClass();
        phtVar.d(new phj(phtVar, phhVar), executor);
    }

    public static void ag(pht phtVar, Future future) {
        if (phtVar instanceof pfx) {
            ((pfx) phtVar).n(future);
        } else {
            if (phtVar == null || !phtVar.isCancelled() || future == null) {
                return;
            }
            future.cancel(false);
        }
    }

    public static Callable ah() {
        return new ngd(3);
    }

    public static pwo ai(Context context) {
        ArrayList<String> arrayList;
        pwp pwpVar = null;
        if ("com.google.vr.vrcore".equals(context.getPackageName())) {
            arrayList = new ArrayList();
            arrayList.add("com.google.vr.vrcore.settings");
        } else {
            List<ResolveInfo> listQueryIntentContentProviders = context.getPackageManager().queryIntentContentProviders(new Intent("android.content.action.VR_SETTINGS_PROVIDER"), 0);
            if (listQueryIntentContentProviders == null || listQueryIntentContentProviders.isEmpty()) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Iterator<ResolveInfo> it = listQueryIntentContentProviders.iterator();
                while (it.hasNext()) {
                    ProviderInfo providerInfo = it.next().providerInfo;
                    String str = providerInfo.packageName;
                    if (str != null && str.startsWith("com.google.")) {
                        arrayList2.add(providerInfo.authority);
                    }
                }
                arrayList = arrayList2;
            }
        }
        if (arrayList != null) {
            for (String str2 : arrayList) {
                ContentProviderClient contentProviderClientAcquireContentProviderClient = context.getContentResolver().acquireContentProviderClient(str2);
                if (contentProviderClientAcquireContentProviderClient != null) {
                    pwpVar = new pwp(contentProviderClientAcquireContentProviderClient, str2);
                    break;
                }
            }
        }
        return pwpVar != null ? new pvz(pwpVar.a, pwpVar.b) : new pwl(context);
    }

    public static float aj(pxe pxeVar) {
        if (pxeVar == null || (pxeVar.a & 4) == 0) {
            return 0.003f;
        }
        return pxeVar.d;
    }

    public static DisplayMetrics ak(Display display) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getRealMetrics(displayMetrics);
        if (displayMetrics.widthPixels < displayMetrics.heightPixels) {
            int i = displayMetrics.widthPixels;
            displayMetrics.widthPixels = displayMetrics.heightPixels;
            displayMetrics.heightPixels = i;
        }
        float f = displayMetrics.xdpi;
        displayMetrics.xdpi = displayMetrics.ydpi;
        displayMetrics.ydpi = f;
        return displayMetrics;
    }

    public static Display al(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public static String am(int i) {
        if (i != 1) {
            return Integer.toString(i - 2);
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static pvn an(String str, String str2, pvf pvfVar, pvd pvdVar) {
        try {
            return new pvi((HttpURLConnection) new URL(str).openConnection(), str2, pvfVar, pvdVar);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Url is malformed.", e);
        } catch (IOException e2) {
            throw new IllegalStateException("Http connection could not be created.", e2);
        }
    }

    public static int ao(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return 31;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return 32;
            case 32:
                return 33;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return 34;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                return 35;
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                return 36;
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                return 37;
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                return 38;
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                return 39;
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                return 40;
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                return 41;
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                return 42;
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                return 43;
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                return 44;
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                return 45;
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                return 46;
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                return 47;
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                return 48;
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                return 49;
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                return 50;
            case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                return 51;
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                return 52;
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                return 53;
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                return 54;
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                return 55;
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                return 56;
            case R.styleable.AppCompatTheme_colorError /* 56 */:
                return 57;
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                return 58;
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                return 59;
            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                return 60;
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                return 61;
            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                return 62;
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                return 63;
            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                return 64;
            case 64:
                return 65;
            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                return 66;
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                return 67;
            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                return 68;
            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                return 69;
            case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                return 70;
            case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                return 71;
            case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                return 72;
            case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                return 73;
            case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                return 74;
            case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                return 75;
            case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                return 76;
            case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                return 77;
            case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                return 78;
            case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                return 79;
            case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
                return 80;
            case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                return 81;
            case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                return 82;
            case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                return 83;
            case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                return 84;
            case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                return 85;
            case R.styleable.AppCompatTheme_listPreferredItemPaddingStart /* 85 */:
                return 86;
            case R.styleable.AppCompatTheme_panelBackground /* 86 */:
                return 87;
            case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                return 88;
            case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                return 89;
            case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
                return 90;
            case R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
                return 91;
            case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                return 92;
            case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                return 93;
            case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                return 94;
            case R.styleable.AppCompatTheme_ratingBarStyleSmall /* 94 */:
                return 95;
            case R.styleable.AppCompatTheme_searchViewStyle /* 95 */:
                return 96;
            case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                return 97;
            case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                return 98;
            case R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
                return 99;
            case R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
                return 100;
            case R.styleable.AppCompatTheme_spinnerStyle /* 100 */:
                return R.styleable.AppCompatTheme_switchStyle;
            case R.styleable.AppCompatTheme_switchStyle /* 101 */:
                return R.styleable.AppCompatTheme_textAppearanceLargePopupMenu;
            case R.styleable.AppCompatTheme_textAppearanceLargePopupMenu /* 102 */:
                return R.styleable.AppCompatTheme_textAppearanceListItem;
            case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
                return R.styleable.AppCompatTheme_textAppearanceListItemSecondary;
            case R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 104 */:
                return R.styleable.AppCompatTheme_textAppearanceListItemSmall;
            case R.styleable.AppCompatTheme_textAppearanceListItemSmall /* 105 */:
                return R.styleable.AppCompatTheme_textAppearancePopupMenuHeader;
            case R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
                return R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle;
            case R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 107 */:
                return R.styleable.AppCompatTheme_textAppearanceSearchResultTitle;
            case R.styleable.AppCompatTheme_textAppearanceSearchResultTitle /* 108 */:
                return R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu;
            case R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu /* 109 */:
                return R.styleable.AppCompatTheme_textColorAlertDialogListItem;
            case R.styleable.AppCompatTheme_textColorAlertDialogListItem /* 110 */:
                return 111;
            case 111:
                return 112;
            case 112:
                return 113;
            case 113:
                return R.styleable.AppCompatTheme_tooltipForegroundColor;
            case R.styleable.AppCompatTheme_tooltipForegroundColor /* 114 */:
                return R.styleable.AppCompatTheme_tooltipFrameBackground;
            case R.styleable.AppCompatTheme_tooltipFrameBackground /* 115 */:
                return R.styleable.AppCompatTheme_viewInflaterClass;
            case R.styleable.AppCompatTheme_viewInflaterClass /* 116 */:
                return R.styleable.AppCompatTheme_windowActionBar;
            case R.styleable.AppCompatTheme_windowActionBar /* 117 */:
                return R.styleable.AppCompatTheme_windowActionBarOverlay;
            case R.styleable.AppCompatTheme_windowActionBarOverlay /* 118 */:
                return R.styleable.AppCompatTheme_windowActionModeOverlay;
            case R.styleable.AppCompatTheme_windowActionModeOverlay /* 119 */:
                return R.styleable.AppCompatTheme_windowFixedHeightMajor;
            case R.styleable.AppCompatTheme_windowFixedHeightMajor /* 120 */:
                return 121;
            case 121:
                return 122;
            case 122:
                return R.styleable.AppCompatTheme_windowFixedWidthMinor;
            case R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
                return R.styleable.AppCompatTheme_windowMinWidthMajor;
            case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                return R.styleable.AppCompatTheme_windowMinWidthMinor;
            case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                return R.styleable.AppCompatTheme_windowNoTitle;
            case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                return 127;
            case 127:
                return 128;
            case 128:
                return 129;
            case 129:
                return 130;
            case 130:
                return ScriptIntrinsicBLAS.NON_UNIT;
            case ScriptIntrinsicBLAS.NON_UNIT /* 131 */:
                return ScriptIntrinsicBLAS.UNIT;
            case ScriptIntrinsicBLAS.UNIT /* 132 */:
                return 133;
            case 133:
                return 134;
            case 134:
                return 135;
            case 135:
                return 136;
            case 136:
                return 137;
            case 137:
                return 138;
            case 138:
                return 139;
            case 139:
                return 140;
            case 140:
                return ScriptIntrinsicBLAS.LEFT;
            case ScriptIntrinsicBLAS.LEFT /* 141 */:
                return ScriptIntrinsicBLAS.RIGHT;
            case ScriptIntrinsicBLAS.RIGHT /* 142 */:
                return 143;
            case 143:
                return 144;
            case 144:
                return 145;
            case 145:
                return 146;
            case 146:
                return 147;
            case 147:
                return 148;
            case 148:
                return 149;
            case 149:
                return 150;
            case 150:
                return 151;
            case 151:
                return 152;
            case 152:
                return 153;
            case 153:
                return 154;
            case 154:
                return 155;
            case 155:
                return 156;
            case 156:
                return 157;
            case 157:
                return 158;
            case 158:
                return 159;
            case 159:
                return 160;
            case 160:
                return 161;
            case 161:
                return 162;
            case 162:
                return 163;
            case 163:
                return 164;
            case 164:
                return 165;
            case 165:
                return 166;
            case 166:
                return 167;
            case 167:
                return 168;
            case 168:
                return 169;
            case 169:
                return 170;
            case 170:
                return 171;
            case 171:
                return 172;
            case 172:
                return 173;
            case 173:
                return 174;
            case 174:
                return 175;
            case 175:
                return 176;
            case 176:
                return 177;
            case 177:
                return 178;
            case 178:
                return 179;
            case 179:
                return 180;
            case 180:
                return 181;
            case 181:
                return 182;
            case 182:
                return 183;
            case 183:
                return 184;
            case 184:
                return 185;
            case 185:
                return 186;
            case 186:
                return 187;
            case 187:
                return 188;
            case 188:
                return 189;
            case 189:
                return 190;
            case 190:
                return 191;
            case 191:
                return 192;
            case 192:
                return 193;
            case 193:
                return 194;
            case 194:
                return 195;
            case 195:
                return 196;
            case 196:
                return 197;
            case 197:
                return 198;
            case 198:
                return 199;
            case 199:
                return 200;
            case 200:
                return 201;
            case 201:
                return 202;
            default:
                return 0;
        }
    }

    public static int ap(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int aq(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            default:
                return 0;
        }
    }

    public static String ar(ByteBuffer byteBuffer, int i, int i2) throws ppp {
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = byteBuffer.get(i);
            if (!az(b)) {
                break;
            }
            i++;
            aw(b, cArr, i4);
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte b2 = byteBuffer.get(i);
            if (az(b2)) {
                aw(b2, cArr, i5);
                i = i6;
                i5++;
                while (i < i3) {
                    byte b3 = byteBuffer.get(i);
                    if (!az(b3)) {
                        break;
                    }
                    i++;
                    aw(b3, cArr, i5);
                    i5++;
                }
            } else if (aB(b2)) {
                if (i6 >= i3) {
                    throw ppp.d();
                }
                ay(b2, byteBuffer.get(i6), cArr, i5);
                i = i6 + 1;
                i5++;
            } else if (aA(b2)) {
                if (i6 >= i3 - 1) {
                    throw ppp.d();
                }
                int i7 = i6 + 1;
                ax(b2, byteBuffer.get(i6), byteBuffer.get(i7), cArr, i5);
                i = i7 + 1;
                i5++;
            } else {
                if (i6 >= i3 - 2) {
                    throw ppp.d();
                }
                int i8 = i6 + 1;
                int i9 = i8 + 1;
                av(b2, byteBuffer.get(i6), byteBuffer.get(i8), byteBuffer.get(i9), cArr, i5);
                i5 += 2;
                i = i9 + 1;
            }
        }
        return new String(cArr, 0, i5);
    }

    public static String as(byte[] bArr, int i, int i2) throws ppp {
        int length = bArr.length;
        if ((i | i2 | ((length - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = bArr[i];
            if (!az(b)) {
                break;
            }
            i++;
            aw(b, cArr, i4);
            i4++;
        }
        while (i < i3) {
            int i5 = i + 1;
            byte b2 = bArr[i];
            if (az(b2)) {
                aw(b2, cArr, i4);
                i = i5;
                i4++;
                while (i < i3) {
                    byte b3 = bArr[i];
                    if (!az(b3)) {
                        break;
                    }
                    i++;
                    aw(b3, cArr, i4);
                    i4++;
                }
            } else if (aB(b2)) {
                if (i5 >= i3) {
                    throw ppp.d();
                }
                ay(b2, bArr[i5], cArr, i4);
                i = i5 + 1;
                i4++;
            } else if (aA(b2)) {
                if (i5 >= i3 - 1) {
                    throw ppp.d();
                }
                int i6 = i5 + 1;
                ax(b2, bArr[i5], bArr[i6], cArr, i4);
                i = i6 + 1;
                i4++;
            } else {
                if (i5 >= i3 - 2) {
                    throw ppp.d();
                }
                int i7 = i5 + 1;
                int i8 = i7 + 1;
                av(b2, bArr[i5], bArr[i7], bArr[i8], cArr, i4);
                i4 += 2;
                i = i8 + 1;
            }
        }
        return new String(cArr, 0, i4);
    }

    public static int at(int i, byte[] bArr, int i2, int i3) {
        int i4;
        if (i != 0) {
            if (i2 >= i3) {
                return i;
            }
            byte b = (byte) i;
            if (b < -32) {
                if (b >= -62) {
                    int i5 = i2 + 1;
                    if (bArr[i2] <= -65) {
                        i2 = i5;
                    }
                }
                return -1;
            }
            if (b < -16) {
                byte b2 = (byte) ((i >> 8) ^ (-1));
                if (b2 == 0) {
                    int i6 = i2 + 1;
                    byte b3 = bArr[i2];
                    if (i6 >= i3) {
                        return prx.c(b, b3);
                    }
                    i2 = i6;
                    b2 = b3;
                }
                if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                    int i7 = i2 + 1;
                    if (bArr[i2] <= -65) {
                        i2 = i7;
                    }
                }
                return -1;
            }
            byte b4 = (byte) ((i >> 8) ^ (-1));
            if (b4 == 0) {
                int i8 = i2 + 1;
                b4 = bArr[i2];
                if (i8 >= i3) {
                    return prx.c(b, b4);
                }
                i2 = i8;
                i4 = 0;
            } else {
                i4 = i >> 16;
            }
            if (i4 == 0) {
                int i9 = i2 + 1;
                byte b5 = bArr[i2];
                if (i9 >= i3) {
                    return prx.d(b, b4, b5);
                }
                i2 = i9;
                i4 = b5;
            }
            if (b4 <= -65 && (((b << 28) + (b4 + 112)) >> 30) == 0 && i4 <= -65) {
                int i10 = i2 + 1;
                if (bArr[i2] <= -65) {
                    i2 = i10;
                }
            }
            return -1;
        }
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 >= i3) {
            return 0;
        }
        while (i2 < i3) {
            int i11 = i2 + 1;
            byte b6 = bArr[i2];
            if (b6 < 0) {
                if (b6 < -32) {
                    if (i11 >= i3) {
                        return b6;
                    }
                    if (b6 >= -62) {
                        i2 = i11 + 1;
                        if (bArr[i11] > -65) {
                        }
                    }
                    return -1;
                }
                if (b6 >= -16) {
                    if (i11 >= i3 - 2) {
                        return prx.e(bArr, i11, i3);
                    }
                    int i12 = i11 + 1;
                    byte b7 = bArr[i11];
                    if (b7 <= -65 && (((b6 << 28) + (b7 + 112)) >> 30) == 0) {
                        int i13 = i12 + 1;
                        if (bArr[i12] <= -65) {
                            i2 = i13 + 1;
                            if (bArr[i13] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i11 >= i3 - 1) {
                    return prx.e(bArr, i11, i3);
                }
                int i14 = i11 + 1;
                byte b8 = bArr[i11];
                if (b8 <= -65 && ((b6 != -32 || b8 >= -96) && (b6 != -19 || b8 < -96))) {
                    i2 = i14 + 1;
                    if (bArr[i14] > -65) {
                    }
                }
                return -1;
            }
            i2 = i11;
        }
        return 0;
    }

    public static boolean au(byte[] bArr, int i, int i2) {
        return at(0, bArr, i, i2) == 0;
    }

    public static void av(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws ppp {
        if (aS(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || aS(b3) || aS(b4)) {
            throw ppp.d();
        }
        int iA = ((b & 7) << 18) | (a(b2) << 12) | (a(b3) << 6) | a(b4);
        cArr[i] = (char) ((iA >>> 10) + 55232);
        cArr[i + 1] = (char) ((iA & 1023) + 56320);
    }

    public static void aw(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0014 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x0016  */
    /* JADX WARN: Code duplicated, block: B:12:0x0018 A[PHI: r2
      0x0018: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0012, B:11:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x001e  */
    public static void ax(byte b, byte b2, byte b3, char[] cArr, int i) throws ppp {
        if (!aS(b2)) {
            if (b != -32) {
                if (b != -19) {
                    if (!aS(b3)) {
                        cArr[i] = (char) (((b & 15) << 12) | (a(b2) << 6) | a(b3));
                        return;
                    }
                } else if (b2 < -96) {
                    b = -19;
                    if (!aS(b3)) {
                        cArr[i] = (char) (((b & 15) << 12) | (a(b2) << 6) | a(b3));
                        return;
                    }
                }
            } else if (b2 >= -96) {
                b = -32;
                if (b != -19) {
                    if (!aS(b3)) {
                        cArr[i] = (char) (((b & 15) << 12) | (a(b2) << 6) | a(b3));
                        return;
                    }
                } else if (b2 < -96) {
                    b = -19;
                    if (!aS(b3)) {
                        cArr[i] = (char) (((b & 15) << 12) | (a(b2) << 6) | a(b3));
                        return;
                    }
                }
            }
        }
        throw ppp.d();
    }

    public static void ay(byte b, byte b2, char[] cArr, int i) throws ppp {
        if (b < -62 || aS(b2)) {
            throw ppp.d();
        }
        cArr[i] = (char) (((b & 31) << 6) | a(b2));
    }

    public static boolean az(byte b) {
        return b >= 0;
    }

    public static /* synthetic */ String c(int i) {
        switch (i) {
            case 1:
                return "PROCESSOR_OUTPUT_IMAGE_TYPE_UNDEFINED";
            case 2:
                return "HDR_PLUS";
            case 3:
                return "LONG_EXPOSURE";
            case 4:
                return "ACTION_PAN";
            default:
                return "POSTVIEW_THUMBNAIL";
        }
    }

    public static int d(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 0;
        }
    }

    public static int e(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            default:
                return 0;
        }
    }

    public static int f(Map.Entry entry) {
        return ((ppc) entry.getKey()).b;
    }

    public static pou g(Object obj) {
        return ((ppb) obj).h;
    }

    public static pou h(Object obj) {
        return ((ppb) obj).i();
    }

    public static void i(pqx pqxVar, Object obj, pos posVar, pou pouVar) {
        poq poqVar = (poq) obj;
        pouVar.l(poqVar.d, pqxVar.t(poqVar.c.getClass(), posVar));
    }

    public static void j(pon ponVar, Map.Entry entry) {
        ppc ppcVar = (ppc) entry.getKey();
        pry pryVar = pry.DOUBLE;
        switch (ppcVar.c) {
            case DOUBLE:
                ponVar.c(ppcVar.b, ((Double) entry.getValue()).doubleValue());
                break;
            case FLOAT:
                ponVar.g(ppcVar.b, ((Float) entry.getValue()).floatValue());
                break;
            case INT64:
                ponVar.j(ppcVar.b, ((Long) entry.getValue()).longValue());
                break;
            case UINT64:
                ponVar.s(ppcVar.b, ((Long) entry.getValue()).longValue());
                break;
            case INT32:
                ponVar.i(ppcVar.b, ((Integer) entry.getValue()).intValue());
                break;
            case FIXED64:
                ponVar.f(ppcVar.b, ((Long) entry.getValue()).longValue());
                break;
            case FIXED32:
                ponVar.e(ppcVar.b, ((Integer) entry.getValue()).intValue());
                break;
            case BOOL:
                ponVar.a(ppcVar.b, ((Boolean) entry.getValue()).booleanValue());
                break;
            case STRING:
                ponVar.q(ppcVar.b, (String) entry.getValue());
                break;
            case GROUP:
                ponVar.h(ppcVar.b, entry.getValue(), pqu.a.a(entry.getValue().getClass()));
                break;
            case MESSAGE:
                ponVar.k(ppcVar.b, entry.getValue(), pqu.a.a(entry.getValue().getClass()));
                break;
            case BYTES:
                ponVar.b(ppcVar.b, (poc) entry.getValue());
                break;
            case UINT32:
                ponVar.r(ppcVar.b, ((Integer) entry.getValue()).intValue());
                break;
            case ENUM:
                ponVar.i(ppcVar.b, ((Integer) entry.getValue()).intValue());
                break;
            case SFIXED32:
                ponVar.m(ppcVar.b, ((Integer) entry.getValue()).intValue());
                break;
            case SFIXED64:
                ponVar.n(ppcVar.b, ((Long) entry.getValue()).longValue());
                break;
            case SINT32:
                ponVar.o(ppcVar.b, ((Integer) entry.getValue()).intValue());
                break;
            case SINT64:
                ponVar.p(ppcVar.b, ((Long) entry.getValue()).longValue());
                break;
        }
    }

    public static void k(Object obj) {
        g(obj).e();
    }

    public static poc l(pom pomVar, byte[] bArr) {
        pomVar.ak();
        return new pob(bArr);
    }

    public static double m(byte[] bArr, int i) {
        return Double.longBitsToDouble(C(bArr, i));
    }

    public static float n(byte[] bArr, int i) {
        return Float.intBitsToFloat(p(bArr, i));
    }

    public static int o(byte[] bArr, int i, pnr pnrVar) throws ppp {
        int iX = x(bArr, i, pnrVar);
        int i2 = pnrVar.a;
        if (i2 < 0) {
            throw ppp.f();
        }
        if (i2 > bArr.length - iX) {
            throw ppp.i();
        }
        if (i2 == 0) {
            pnrVar.c = poc.b;
            return iX;
        }
        pnrVar.c = poc.u(bArr, iX, i2);
        return iX + i2;
    }

    public static int p(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int q(prb prbVar, byte[] bArr, int i, int i2, int i3, pnr pnrVar) {
        pqo pqoVar = (pqo) prbVar;
        Object objE = pqoVar.e();
        int iC = pqoVar.c(objE, bArr, i, i2, i3, pnrVar);
        pqoVar.f(objE);
        pnrVar.c = objE;
        return iC;
    }

    public static int r(prb prbVar, byte[] bArr, int i, int i2, pnr pnrVar) throws ppp {
        int i3;
        int i4 = i + 1;
        int i5 = bArr[i];
        if (i5 < 0) {
            int iY = y(i5, bArr, i4, pnrVar);
            i5 = pnrVar.a;
            i3 = iY;
        } else {
            i3 = i4;
        }
        if (i5 < 0 || i5 > i2 - i3) {
            throw ppp.i();
        }
        Object objE = prbVar.e();
        int i6 = i5 + i3;
        prbVar.i(objE, bArr, i3, i6, pnrVar);
        prbVar.f(objE);
        pnrVar.c = objE;
        return i6;
    }

    public static int s(prb prbVar, int i, byte[] bArr, int i2, int i3, ppm ppmVar, pnr pnrVar) throws ppp {
        int iR = r(prbVar, bArr, i2, i3, pnrVar);
        ppmVar.add(pnrVar.c);
        while (iR < i3) {
            int iX = x(bArr, iR, pnrVar);
            if (i != pnrVar.a) {
                break;
            }
            iR = r(prbVar, bArr, iX, i3, pnrVar);
            ppmVar.add(pnrVar.c);
        }
        return iR;
    }

    public static int t(byte[] bArr, int i, ppm ppmVar, pnr pnrVar) throws ppp {
        ppe ppeVar = (ppe) ppmVar;
        int iX = x(bArr, i, pnrVar);
        int i2 = pnrVar.a + iX;
        while (iX < i2) {
            iX = x(bArr, iX, pnrVar);
            ppeVar.g(pnrVar.a);
        }
        if (iX == i2) {
            return iX;
        }
        throw ppp.i();
    }

    public static int u(byte[] bArr, int i, pnr pnrVar) throws ppp {
        int iX = x(bArr, i, pnrVar);
        int i2 = pnrVar.a;
        if (i2 < 0) {
            throw ppp.f();
        }
        if (i2 == 0) {
            pnrVar.c = "";
            return iX;
        }
        pnrVar.c = new String(bArr, iX, i2, ppn.a);
        return iX + i2;
    }

    public static int v(byte[] bArr, int i, pnr pnrVar) throws ppp {
        int iX = x(bArr, i, pnrVar);
        int i2 = pnrVar.a;
        if (i2 < 0) {
            throw ppp.f();
        }
        if (i2 == 0) {
            pnrVar.c = "";
            return iX;
        }
        pnrVar.c = prx.g(bArr, iX, i2);
        return iX + i2;
    }

    public static int w(int i, byte[] bArr, int i2, int i3, prn prnVar, pnr pnrVar) throws ppp {
        if (psa.a(i) == 0) {
            throw ppp.c();
        }
        switch (psa.b(i)) {
            case 0:
                int iA = A(bArr, i2, pnrVar);
                prnVar.d(i, Long.valueOf(pnrVar.b));
                return iA;
            case 1:
                prnVar.d(i, Long.valueOf(C(bArr, i2)));
                return i2 + 8;
            case 2:
                int iX = x(bArr, i2, pnrVar);
                int i4 = pnrVar.a;
                if (i4 < 0) {
                    throw ppp.f();
                }
                if (i4 > bArr.length - iX) {
                    throw ppp.i();
                }
                if (i4 == 0) {
                    prnVar.d(i, poc.b);
                } else {
                    prnVar.d(i, poc.u(bArr, iX, i4));
                }
                return iX + i4;
            case 3:
                int i5 = (i & (-8)) | 4;
                prn prnVarB = prn.b();
                int i6 = 0;
                while (i2 < i3) {
                    int iX2 = x(bArr, i2, pnrVar);
                    int i7 = pnrVar.a;
                    if (i7 == i5) {
                        i6 = i7;
                        i2 = iX2;
                        if (i2 <= i3 || i6 != i5) {
                            throw ppp.g();
                        }
                        prnVar.d(i, prnVarB);
                        return i2;
                    }
                    i6 = i7;
                    i2 = w(i7, bArr, iX2, i3, prnVarB, pnrVar);
                }
                if (i2 <= i3) {
                }
                throw ppp.g();
            case 4:
            default:
                throw ppp.c();
            case 5:
                prnVar.d(i, Integer.valueOf(p(bArr, i2)));
                return i2 + 4;
        }
    }

    public static int x(byte[] bArr, int i, pnr pnrVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return y(b, bArr, i2, pnrVar);
        }
        pnrVar.a = b;
        return i2;
    }

    public static int y(int i, byte[] bArr, int i2, pnr pnrVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            pnrVar.a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            pnrVar.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            pnrVar.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            pnrVar.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                pnrVar.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int z(int i, byte[] bArr, int i2, int i3, ppm ppmVar, pnr pnrVar) {
        ppe ppeVar = (ppe) ppmVar;
        int iX = x(bArr, i2, pnrVar);
        ppeVar.g(pnrVar.a);
        while (iX < i3) {
            int iX2 = x(bArr, iX, pnrVar);
            if (i != pnrVar.a) {
                break;
            }
            iX = x(bArr, iX2, pnrVar);
            ppeVar.g(pnrVar.a);
        }
        return iX;
    }

    public final boolean aC(Object obj, pqx pqxVar) throws ppp {
        int iD = pqxVar.d();
        int iA = psa.a(iD);
        switch (psa.b(iD)) {
            case 0:
                aE(obj, iA, pqxVar.l());
                return true;
            case 1:
                ((prn) obj).d(psa.c(iA, 1), Long.valueOf(pqxVar.k()));
                return true;
            case 2:
                aD(obj, iA, pqxVar.q());
                return true;
            case 3:
                int iC = psa.c(iA, 4);
                prn prnVarB = prn.b();
                while (pqxVar.c() != Integer.MAX_VALUE && aC(prnVarB, pqxVar)) {
                }
                if (iC != pqxVar.d()) {
                    throw ppp.b();
                }
                prnVarB.c();
                ((prn) obj).d(psa.c(iA, 3), prnVarB);
                return true;
            case 4:
                return false;
            case 5:
                ((prn) obj).d(psa.c(iA, 5), Integer.valueOf(pqxVar.f()));
                return true;
            default:
                throw ppp.a();
        }
    }

    public void b(pvn pvnVar) {
    }
}
