package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ner {
    public static final /* synthetic */ int c = 0;
    private static final Object d = new Object();
    private static volatile neq e = null;
    private static volatile boolean f = false;
    private static final nez g;
    private static final AtomicInteger h;
    final nep a;
    final String b;
    private final Object i;
    private volatile int j = -1;
    private volatile Object k;
    private final boolean l;

    static {
        new AtomicReference();
        g = new nez(ngh.b);
        h = new AtomicInteger();
    }

    public ner(nep nepVar, String str, Object obj, boolean z) {
        if (nepVar.b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.a = nepVar;
        this.b = str;
        this.i = obj;
        this.l = z;
    }

    public static ner b(nep nepVar, String str, Boolean bool, boolean z) {
        return new nel(nepVar, str, bool, z);
    }

    public static ner c(nep nepVar, String str, Long l, boolean z) {
        return new nej(nepVar, str, l, z);
    }

    public static ner d(nep nepVar, String str, String str2, boolean z) {
        return new nen(nepVar, str, str2, z);
    }

    static void g() {
        h.incrementAndGet();
    }

    public static void h(Context context) {
        if (e == null) {
            Object obj = d;
            synchronized (obj) {
                if (e == null) {
                    synchronized (obj) {
                        neq neqVar = e;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        if (neqVar == null || neqVar.a != context) {
                            ndz.b();
                            net.a();
                            nee.c();
                            e = new neq(context, obr.au(new ndq(context, 3)));
                            g();
                        }
                    }
                }
            }
        }
    }

    private final String i(String str) {
        if (str.isEmpty()) {
            return this.b;
        }
        String strValueOf = String.valueOf(this.b);
        return strValueOf.length() != 0 ? str.concat(strValueOf) : new String(str);
    }

    public abstract Object a(Object obj);

    /* JADX WARN: Code duplicated, block: B:93:0x019b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r6v8, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final Object e() {
        ProviderInfo providerInfoResolveContentProvider;
        boolean zBooleanValue;
        final ndz ndzVarA;
        Object objA;
        ?? EmptyMap;
        ?? r6;
        Map map;
        boolean z = true;
        if (!this.l) {
            nez nezVar = g;
            this.b.getClass();
            boolean z2 = nezVar.a;
            obr.aR(true, "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error.");
        }
        int i = h.get();
        if (this.j < i) {
            synchronized (this) {
                if (this.j < i) {
                    neq neqVar = e;
                    obr.aR(neqVar != null, "Must call PhenotypeFlag.init() first");
                    nep nepVar = this.a;
                    boolean z3 = nepVar.f;
                    boolean z4 = nepVar.g;
                    String strB = nee.a(neqVar.a).b("gms:phenotype:phenotype_flag:debug_bypass_phenotype");
                    Object objA2 = null;
                    if (strB == null || !kzv.c.matcher(strB).matches()) {
                        nep nepVar2 = this.a;
                        Uri uri = nepVar2.b;
                        if (uri == null) {
                            Context context = neqVar.a;
                            String str = nepVar2.a;
                            int i2 = mez.a;
                            throw null;
                        }
                        Context context2 = neqVar.a;
                        Object obj = nef.b;
                        String authority = uri.getAuthority();
                        if ("com.google.android.gms.phenotype".equals(authority)) {
                            if (nef.a.g()) {
                                zBooleanValue = ((Boolean) nef.a.c()).booleanValue();
                            } else {
                                synchronized (nef.b) {
                                    if (nef.a.g()) {
                                        zBooleanValue = ((Boolean) nef.a.c()).booleanValue();
                                    } else {
                                        if (!"com.google.android.gms".equals(context2.getPackageName()) && ((providerInfoResolveContentProvider = context2.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", 268435456)) == null || !"com.google.android.gms".equals(providerInfoResolveContentProvider.packageName))) {
                                            z = false;
                                        } else {
                                            try {
                                                if ((context2.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) == 0) {
                                                    z = false;
                                                }
                                            } catch (PackageManager.NameNotFoundException e2) {
                                                z = false;
                                            }
                                        }
                                        nef.a = ojc.i(Boolean.valueOf(z));
                                        zBooleanValue = ((Boolean) nef.a.c()).booleanValue();
                                    }
                                }
                            }
                            if (zBooleanValue) {
                                ndzVarA = this.a.h ? ndz.a(neqVar.a.getContentResolver(), neg.a(neg.b(neqVar.a, this.a.b.getLastPathSegment()))) : ndz.a(neqVar.a.getContentResolver(), this.a.b);
                            } else {
                                ndzVarA = null;
                            }
                        } else {
                            StringBuilder sb = new StringBuilder(String.valueOf(authority).length() + 91);
                            sb.append(authority);
                            sb.append(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
                            Log.e("PhenotypeClientHelper", sb.toString());
                            ndzVarA = null;
                        }
                        if (ndzVarA != null) {
                            String strF = f();
                            Map map2 = ndzVarA.f;
                            if (map2 == null) {
                                EmptyMap = map2;
                                synchronized (ndzVarA.e) {
                                    Map map3 = ndzVarA.f;
                                    r6 = map3;
                                    if (map3 == null) {
                                        ?? AllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                        try {
                                            try {
                                                map = (Map) mzi.f(new neb() { // from class: ndx
                                                    @Override // defpackage.neb
                                                    public final Object a() {
                                                        ndz ndzVar = ndzVarA;
                                                        Cursor cursorQuery = ndzVar.c.query(ndzVar.d, ndz.b, null, null, null);
                                                        if (cursorQuery == null) {
                                                            return Collections.emptyMap();
                                                        }
                                                        try {
                                                            int count = cursorQuery.getCount();
                                                            if (count == 0) {
                                                                return Collections.emptyMap();
                                                            }
                                                            Map wyVar = count <= 256 ? new wy(count) : new HashMap(count, 1.0f);
                                                            while (cursorQuery.moveToNext()) {
                                                                wyVar.put(cursorQuery.getString(0), cursorQuery.getString(1));
                                                            }
                                                            return wyVar;
                                                        } finally {
                                                            cursorQuery.close();
                                                        }
                                                    }
                                                });
                                                StrictMode.setThreadPolicy(AllowThreadDiskReads);
                                            } catch (Throwable th) {
                                                StrictMode.setThreadPolicy(AllowThreadDiskReads);
                                                throw th;
                                            }
                                        } catch (SQLiteException | IllegalStateException | SecurityException e3) {
                                            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
                                            StrictMode.setThreadPolicy(AllowThreadDiskReads);
                                            map = null;
                                        }
                                        ndzVarA.f = map;
                                        AllowThreadDiskReads = map;
                                        r6 = AllowThreadDiskReads;
                                    }
                                }
                                EmptyMap = r6;
                            }
                            if (EmptyMap == 0) {
                                EmptyMap = Collections.emptyMap();
                            }
                            String str2 = (String) EmptyMap.get(strF);
                            if (str2 != null) {
                                objA = a(str2);
                            } else {
                                objA = null;
                            }
                        } else {
                            objA = null;
                        }
                    } else {
                        objA = null;
                    }
                    if (objA == null) {
                        nep nepVar3 = this.a;
                        if (!nepVar3.e) {
                            oiu oiuVar = nepVar3.i;
                            nee neeVarA = nee.a(neqVar.a);
                            nep nepVar4 = this.a;
                            String strB2 = neeVarA.b(nepVar4.e ? null : i(nepVar4.c));
                            objA2 = strB2 != null ? a(strB2) : null;
                        }
                        objA = objA2 == null ? this.i : objA2;
                    }
                    ojc ojcVar = (ojc) neqVar.b.a();
                    if (ojcVar.g()) {
                        nvb nvbVar = (nvb) ojcVar.c();
                        nep nepVar5 = this.a;
                        Uri uri2 = nepVar5.b;
                        String str3 = nepVar5.a;
                        String strB3 = nvbVar.b(uri2, nepVar5.d, this.b);
                        objA = strB3 == null ? this.i : a(strB3);
                    }
                    this.k = objA;
                    this.j = i;
                }
            }
        }
        return this.k;
    }

    public final String f() {
        return i(this.a.d);
    }
}
