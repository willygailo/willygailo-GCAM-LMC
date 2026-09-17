package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.util.Log;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ngi implements ojz {
    public static final /* synthetic */ int a = 0;
    private static volatile nez b = new nez(ngh.a);
    private final String c;
    private final String d;
    private final Object e;
    private final nfh f;
    private final Object g = new Object();
    private final Map h = new HashMap();

    public ngi(String str, String str2, Object obj, nfh nfhVar) {
        obj.getClass();
        this.c = str;
        this.d = str2;
        this.e = obj;
        this.f = nfhVar;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0129 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x00d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x00fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x0152 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d4 A[Catch: all -> 0x0183, TryCatch #0 {, blocks: (B:8:0x000f, B:10:0x0015, B:12:0x0019, B:13:0x0020, B:15:0x002d, B:17:0x0035, B:19:0x003c, B:20:0x0041, B:22:0x0072, B:24:0x0080, B:26:0x0093, B:27:0x0095, B:35:0x00af, B:36:0x00b0, B:38:0x00c1, B:40:0x00d4, B:41:0x00d6, B:64:0x0120, B:67:0x0128, B:76:0x013a, B:77:0x013b, B:79:0x0141, B:82:0x0152, B:94:0x017a, B:95:0x017c, B:96:0x0181, B:87:0x015e, B:89:0x0168, B:91:0x0173, B:90:0x016d, B:54:0x00fa, B:59:0x0107, B:61:0x0111, B:63:0x011c, B:62:0x0116, B:50:0x00f1, B:51:0x00f2, B:68:0x0129, B:70:0x012d, B:71:0x0133, B:72:0x0135, B:28:0x0096, B:30:0x009a, B:31:0x00ab, B:42:0x00d7, B:44:0x00db, B:45:0x00e9, B:46:0x00ed), top: B:101:0x000f, inners: #3, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00db A[Catch: all -> 0x00ef, TryCatch #7 {, blocks: (B:42:0x00d7, B:44:0x00db, B:45:0x00e9, B:46:0x00ed), top: B:106:0x00d7, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f2 A[Catch: all -> 0x0183, TRY_LEAVE, TryCatch #0 {, blocks: (B:8:0x000f, B:10:0x0015, B:12:0x0019, B:13:0x0020, B:15:0x002d, B:17:0x0035, B:19:0x003c, B:20:0x0041, B:22:0x0072, B:24:0x0080, B:26:0x0093, B:27:0x0095, B:35:0x00af, B:36:0x00b0, B:38:0x00c1, B:40:0x00d4, B:41:0x00d6, B:64:0x0120, B:67:0x0128, B:76:0x013a, B:77:0x013b, B:79:0x0141, B:82:0x0152, B:94:0x017a, B:95:0x017c, B:96:0x0181, B:87:0x015e, B:89:0x0168, B:91:0x0173, B:90:0x016d, B:54:0x00fa, B:59:0x0107, B:61:0x0111, B:63:0x011c, B:62:0x0116, B:50:0x00f1, B:51:0x00f2, B:68:0x0129, B:70:0x012d, B:71:0x0133, B:72:0x0135, B:28:0x0096, B:30:0x009a, B:31:0x00ab, B:42:0x00d7, B:44:0x00db, B:45:0x00e9, B:46:0x00ed), top: B:101:0x000f, inners: #3, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:66:0x0126  */
    /* JADX WARN: Code duplicated, block: B:70:0x012d A[Catch: all -> 0x0138, TryCatch #3 {, blocks: (B:68:0x0129, B:70:0x012d, B:71:0x0133, B:72:0x0135), top: B:102:0x0129, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0141 A[Catch: all -> 0x0183, TRY_LEAVE, TryCatch #0 {, blocks: (B:8:0x000f, B:10:0x0015, B:12:0x0019, B:13:0x0020, B:15:0x002d, B:17:0x0035, B:19:0x003c, B:20:0x0041, B:22:0x0072, B:24:0x0080, B:26:0x0093, B:27:0x0095, B:35:0x00af, B:36:0x00b0, B:38:0x00c1, B:40:0x00d4, B:41:0x00d6, B:64:0x0120, B:67:0x0128, B:76:0x013a, B:77:0x013b, B:79:0x0141, B:82:0x0152, B:94:0x017a, B:95:0x017c, B:96:0x0181, B:87:0x015e, B:89:0x0168, B:91:0x0173, B:90:0x016d, B:54:0x00fa, B:59:0x0107, B:61:0x0111, B:63:0x011c, B:62:0x0116, B:50:0x00f1, B:51:0x00f2, B:68:0x0129, B:70:0x012d, B:71:0x0133, B:72:0x0135, B:28:0x0096, B:30:0x009a, B:31:0x00ab, B:42:0x00d7, B:44:0x00db, B:45:0x00e9, B:46:0x00ed), top: B:101:0x000f, inners: #3, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0177  */
    /* JADX WARN: Code duplicated, block: B:94:0x017a A[Catch: all -> 0x0183, TryCatch #0 {, blocks: (B:8:0x000f, B:10:0x0015, B:12:0x0019, B:13:0x0020, B:15:0x002d, B:17:0x0035, B:19:0x003c, B:20:0x0041, B:22:0x0072, B:24:0x0080, B:26:0x0093, B:27:0x0095, B:35:0x00af, B:36:0x00b0, B:38:0x00c1, B:40:0x00d4, B:41:0x00d6, B:64:0x0120, B:67:0x0128, B:76:0x013a, B:77:0x013b, B:79:0x0141, B:82:0x0152, B:94:0x017a, B:95:0x017c, B:96:0x0181, B:87:0x015e, B:89:0x0168, B:91:0x0173, B:90:0x016d, B:54:0x00fa, B:59:0x0107, B:61:0x0111, B:63:0x011c, B:62:0x0116, B:50:0x00f1, B:51:0x00f2, B:68:0x0129, B:70:0x012d, B:71:0x0133, B:72:0x0135, B:28:0x0096, B:30:0x009a, B:31:0x00ab, B:42:0x00d7, B:44:0x00db, B:45:0x00e9, B:46:0x00ed), top: B:101:0x000f, inners: #3, #5, #7 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    private final Object c(final nei neiVar) {
        ngg nggVar;
        Map map;
        Object objA;
        Object obj;
        Object objA2;
        Context context;
        ojc ojcVar;
        String strB;
        Map map2;
        ?? r8;
        Object obj2 = this.h.get("");
        if (obj2 != null) {
            return obj2;
        }
        synchronized (this.g) {
            int i = 1;
            nei.e = true;
            if (nei.b == null && nei.f == null) {
                nei.f = new Exception();
            }
            nfh nfhVar = this.f;
            String str = this.c;
            String str2 = this.d;
            final String strB2 = ((nfg) nfhVar).b ? neg.b(neiVar.g, str) : str;
            if (((nfg) nfhVar).c) {
                obr.aT(true, "DirectBoot aware package %s can not access account-scoped flags.", strB2);
            }
            naq.d(neiVar.c().submit(new ngb(neiVar, strB2, i)));
            nfl nflVar = nfm.a;
            final boolean z = ((nfg) nfhVar).c;
            final boolean z2 = ((nfg) nfhVar).b;
            ojz ojzVar = new ojz() { // from class: nfj
                @Override // defpackage.ojz
                public final Object a() {
                    return new nfm(neiVar, strB2, z, z2);
                }
            };
            ojd ojdVarA = ojd.a(strB2, "");
            Object objA3 = (nfm) nflVar.a.get(ojdVarA);
            if (objA3 == null) {
                objA3 = ojzVar.a();
                nfm nfmVar = (nfm) nflVar.a.putIfAbsent(ojdVarA, objA3);
                if (nfmVar == null) {
                    Context context2 = neiVar.g;
                    nge.c.putIfAbsent(ojdVarA, new nfi((nfm) objA3));
                    if (!nge.b) {
                        synchronized (nge.a) {
                            if (!nge.b) {
                                context2.registerReceiver(new nge(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
                                nge.b = true;
                            }
                        }
                    }
                    nfq.a.putIfAbsent(ojdVarA, new nfk((nfm) objA3, 0));
                } else {
                    objA3 = nfmVar;
                }
                boolean z3 = ((nfm) objA3).f;
                obr.aK(true, "Package %s cannot be registered both with and without stickyAccountSupport", strB2);
                nggVar = ((nfm) objA3).e;
                map = nggVar.b;
                objA = null;
                if (map == null) {
                    synchronized (nggVar.a) {
                        map2 = nggVar.b;
                        r8 = map2;
                        if (map2 == null) {
                            ?? A = nggVar.c.a();
                            A.getClass();
                            nggVar.b = A;
                            nggVar.c = null;
                            r8 = A;
                        }
                        obj = r8.get(str2);
                    }
                } else {
                    obj = map.get(str2);
                }
                if (obj == null) {
                    objA2 = null;
                } else {
                    try {
                        objA2 = ((nfg) nfhVar).e.a(obj);
                    } catch (IOException | ClassCastException e) {
                        Log.e("PhenotypeCombinedFlags", str2.length() != 0 ? "Invalid Phenotype flag value for flag ".concat(str2) : new String("Invalid Phenotype flag value for flag "), e);
                        objA2 = null;
                    }
                }
                context = neiVar.g;
                ojcVar = nfg.a;
                if (ojcVar == null) {
                    synchronized (nfg.class) {
                        if (nfg.a == null) {
                            nfg.a = mzi.e(context);
                        }
                        ojc ojcVar2 = nfg.a;
                    }
                    ojcVar = ojcVar2;
                }
                if (ojcVar.g()) {
                    strB = ((nvb) ojcVar.c()).b(neg.a(str), null, str2);
                    if (strB != null) {
                        try {
                            objA = ((nfg) nfhVar).d.a(strB);
                        } catch (IOException | IllegalArgumentException e2) {
                            Log.e("PhenotypeCombinedFlags", str2.length() != 0 ? "Invalid Phenotype flag value for flag ".concat(str2) : new String("Invalid Phenotype flag value for flag "), e2);
                        }
                    }
                } else {
                    objA = objA2;
                }
                if (objA == null) {
                    objA = this.e;
                }
                this.h.put("", objA);
            } else {
                boolean z4 = ((nfm) objA3).f;
                obr.aK(true, "Package %s cannot be registered both with and without stickyAccountSupport", strB2);
                nggVar = ((nfm) objA3).e;
                map = nggVar.b;
                objA = null;
                if (map == null) {
                    synchronized (nggVar.a) {
                        map2 = nggVar.b;
                        r8 = map2;
                        if (map2 == null) {
                            ?? A2 = nggVar.c.a();
                            A2.getClass();
                            nggVar.b = A2;
                            nggVar.c = null;
                            r8 = A2;
                        }
                        obj = r8.get(str2);
                    }
                } else {
                    obj = map.get(str2);
                }
                if (obj == null) {
                    objA2 = null;
                } else {
                    objA2 = ((nfg) nfhVar).e.a(obj);
                }
                context = neiVar.g;
                ojcVar = nfg.a;
                if (ojcVar == null) {
                    synchronized (nfg.class) {
                        if (nfg.a == null) {
                            nfg.a = mzi.e(context);
                        }
                        ojc ojcVar3 = nfg.a;
                        ojcVar = ojcVar3;
                    }
                }
                if (ojcVar.g()) {
                    strB = ((nvb) ojcVar.c()).b(neg.a(str), null, str2);
                    if (strB != null) {
                        objA = ((nfg) nfhVar).d.a(strB);
                    }
                } else {
                    objA = objA2;
                }
                if (objA == null) {
                    objA = this.e;
                }
                this.h.put("", objA);
            }
            throw th;
        }
        return objA;
    }

    @Override // defpackage.ojz
    public final Object a() {
        nei.c = true;
        Context context = nei.b;
        if (context != null) {
            return c(nei.a(context));
        }
        if (nei.d == null) {
            nei.d = new Exception();
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    public final Object b(Context context) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        return c(nei.a(applicationContext));
    }
}
