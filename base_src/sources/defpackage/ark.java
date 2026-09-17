package defpackage;

import android.database.Cursor;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ark implements Runnable {
    private static final String b = kus.g("EnqueueRunnable");
    public final anl a = new anl();
    private final anq c;

    public ark(anq anqVar) {
        this.c = anqVar;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f4 A[Catch: all -> 0x035a, TryCatch #4 {all -> 0x035a, blocks: (B:168:0x0325, B:41:0x00cb, B:113:0x01ea, B:114:0x01ee, B:116:0x01f4, B:120:0x0202, B:129:0x0220, B:133:0x022a, B:135:0x0251, B:137:0x025a, B:139:0x025e, B:141:0x0286, B:143:0x0293, B:144:0x0298, B:147:0x02a2, B:148:0x02a8, B:150:0x02ae, B:152:0x02d6, B:154:0x02dd, B:155:0x02e2, B:157:0x02e5, B:159:0x0307, B:161:0x030e, B:162:0x0313, B:165:0x031c, B:166:0x0323, B:123:0x0209, B:124:0x020d, B:125:0x0212, B:127:0x0219, B:128:0x021c, B:64:0x0124, B:65:0x0131, B:67:0x0137, B:69:0x014a, B:71:0x0151, B:78:0x016e, B:80:0x0176, B:84:0x0180, B:90:0x018d, B:93:0x019b, B:94:0x01a1, B:70:0x014e, B:107:0x01d7, B:101:0x01af, B:102:0x01bb, B:104:0x01c1, B:105:0x01cd, B:140:0x027c, B:72:0x015d, B:74:0x0163, B:134:0x0241, B:151:0x02cc, B:158:0x02fd), top: B:193:0x00cb, inners: #0, #3, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x0212 A[Catch: all -> 0x035a, TryCatch #4 {all -> 0x035a, blocks: (B:168:0x0325, B:41:0x00cb, B:113:0x01ea, B:114:0x01ee, B:116:0x01f4, B:120:0x0202, B:129:0x0220, B:133:0x022a, B:135:0x0251, B:137:0x025a, B:139:0x025e, B:141:0x0286, B:143:0x0293, B:144:0x0298, B:147:0x02a2, B:148:0x02a8, B:150:0x02ae, B:152:0x02d6, B:154:0x02dd, B:155:0x02e2, B:157:0x02e5, B:159:0x0307, B:161:0x030e, B:162:0x0313, B:165:0x031c, B:166:0x0323, B:123:0x0209, B:124:0x020d, B:125:0x0212, B:127:0x0219, B:128:0x021c, B:64:0x0124, B:65:0x0131, B:67:0x0137, B:69:0x014a, B:71:0x0151, B:78:0x016e, B:80:0x0176, B:84:0x0180, B:90:0x018d, B:93:0x019b, B:94:0x01a1, B:70:0x014e, B:107:0x01d7, B:101:0x01af, B:102:0x01bb, B:104:0x01c1, B:105:0x01cd, B:140:0x027c, B:72:0x015d, B:74:0x0163, B:134:0x0241, B:151:0x02cc, B:158:0x02fd), top: B:193:0x00cb, inners: #0, #3, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x0219 A[Catch: all -> 0x035a, TryCatch #4 {all -> 0x035a, blocks: (B:168:0x0325, B:41:0x00cb, B:113:0x01ea, B:114:0x01ee, B:116:0x01f4, B:120:0x0202, B:129:0x0220, B:133:0x022a, B:135:0x0251, B:137:0x025a, B:139:0x025e, B:141:0x0286, B:143:0x0293, B:144:0x0298, B:147:0x02a2, B:148:0x02a8, B:150:0x02ae, B:152:0x02d6, B:154:0x02dd, B:155:0x02e2, B:157:0x02e5, B:159:0x0307, B:161:0x030e, B:162:0x0313, B:165:0x031c, B:166:0x0323, B:123:0x0209, B:124:0x020d, B:125:0x0212, B:127:0x0219, B:128:0x021c, B:64:0x0124, B:65:0x0131, B:67:0x0137, B:69:0x014a, B:71:0x0151, B:78:0x016e, B:80:0x0176, B:84:0x0180, B:90:0x018d, B:93:0x019b, B:94:0x01a1, B:70:0x014e, B:107:0x01d7, B:101:0x01af, B:102:0x01bb, B:104:0x01c1, B:105:0x01cd, B:140:0x027c, B:72:0x015d, B:74:0x0163, B:134:0x0241, B:151:0x02cc, B:158:0x02fd), top: B:193:0x00cb, inners: #0, #3, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x021c A[Catch: all -> 0x035a, TryCatch #4 {all -> 0x035a, blocks: (B:168:0x0325, B:41:0x00cb, B:113:0x01ea, B:114:0x01ee, B:116:0x01f4, B:120:0x0202, B:129:0x0220, B:133:0x022a, B:135:0x0251, B:137:0x025a, B:139:0x025e, B:141:0x0286, B:143:0x0293, B:144:0x0298, B:147:0x02a2, B:148:0x02a8, B:150:0x02ae, B:152:0x02d6, B:154:0x02dd, B:155:0x02e2, B:157:0x02e5, B:159:0x0307, B:161:0x030e, B:162:0x0313, B:165:0x031c, B:166:0x0323, B:123:0x0209, B:124:0x020d, B:125:0x0212, B:127:0x0219, B:128:0x021c, B:64:0x0124, B:65:0x0131, B:67:0x0137, B:69:0x014a, B:71:0x0151, B:78:0x016e, B:80:0x0176, B:84:0x0180, B:90:0x018d, B:93:0x019b, B:94:0x01a1, B:70:0x014e, B:107:0x01d7, B:101:0x01af, B:102:0x01bb, B:104:0x01c1, B:105:0x01cd, B:140:0x027c, B:72:0x015d, B:74:0x0163, B:134:0x0241, B:151:0x02cc, B:158:0x02fd), top: B:193:0x00cb, inners: #0, #3, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x0225  */
    /* JADX WARN: Code duplicated, block: B:132:0x0228  */
    /* JADX WARN: Code duplicated, block: B:137:0x025a A[Catch: all -> 0x035a, TryCatch #4 {all -> 0x035a, blocks: (B:168:0x0325, B:41:0x00cb, B:113:0x01ea, B:114:0x01ee, B:116:0x01f4, B:120:0x0202, B:129:0x0220, B:133:0x022a, B:135:0x0251, B:137:0x025a, B:139:0x025e, B:141:0x0286, B:143:0x0293, B:144:0x0298, B:147:0x02a2, B:148:0x02a8, B:150:0x02ae, B:152:0x02d6, B:154:0x02dd, B:155:0x02e2, B:157:0x02e5, B:159:0x0307, B:161:0x030e, B:162:0x0313, B:165:0x031c, B:166:0x0323, B:123:0x0209, B:124:0x020d, B:125:0x0212, B:127:0x0219, B:128:0x021c, B:64:0x0124, B:65:0x0131, B:67:0x0137, B:69:0x014a, B:71:0x0151, B:78:0x016e, B:80:0x0176, B:84:0x0180, B:90:0x018d, B:93:0x019b, B:94:0x01a1, B:70:0x014e, B:107:0x01d7, B:101:0x01af, B:102:0x01bb, B:104:0x01c1, B:105:0x01cd, B:140:0x027c, B:72:0x015d, B:74:0x0163, B:134:0x0241, B:151:0x02cc, B:158:0x02fd), top: B:193:0x00cb, inners: #0, #3, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x025e A[Catch: all -> 0x035a, TRY_LEAVE, TryCatch #4 {all -> 0x035a, blocks: (B:168:0x0325, B:41:0x00cb, B:113:0x01ea, B:114:0x01ee, B:116:0x01f4, B:120:0x0202, B:129:0x0220, B:133:0x022a, B:135:0x0251, B:137:0x025a, B:139:0x025e, B:141:0x0286, B:143:0x0293, B:144:0x0298, B:147:0x02a2, B:148:0x02a8, B:150:0x02ae, B:152:0x02d6, B:154:0x02dd, B:155:0x02e2, B:157:0x02e5, B:159:0x0307, B:161:0x030e, B:162:0x0313, B:165:0x031c, B:166:0x0323, B:123:0x0209, B:124:0x020d, B:125:0x0212, B:127:0x0219, B:128:0x021c, B:64:0x0124, B:65:0x0131, B:67:0x0137, B:69:0x014a, B:71:0x0151, B:78:0x016e, B:80:0x0176, B:84:0x0180, B:90:0x018d, B:93:0x019b, B:94:0x01a1, B:70:0x014e, B:107:0x01d7, B:101:0x01af, B:102:0x01bb, B:104:0x01c1, B:105:0x01cd, B:140:0x027c, B:72:0x015d, B:74:0x0163, B:134:0x0241, B:151:0x02cc, B:158:0x02fd), top: B:193:0x00cb, inners: #0, #3, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x029e  */
    /* JADX WARN: Code duplicated, block: B:150:0x02ae A[Catch: all -> 0x035a, TRY_LEAVE, TryCatch #4 {all -> 0x035a, blocks: (B:168:0x0325, B:41:0x00cb, B:113:0x01ea, B:114:0x01ee, B:116:0x01f4, B:120:0x0202, B:129:0x0220, B:133:0x022a, B:135:0x0251, B:137:0x025a, B:139:0x025e, B:141:0x0286, B:143:0x0293, B:144:0x0298, B:147:0x02a2, B:148:0x02a8, B:150:0x02ae, B:152:0x02d6, B:154:0x02dd, B:155:0x02e2, B:157:0x02e5, B:159:0x0307, B:161:0x030e, B:162:0x0313, B:165:0x031c, B:166:0x0323, B:123:0x0209, B:124:0x020d, B:125:0x0212, B:127:0x0219, B:128:0x021c, B:64:0x0124, B:65:0x0131, B:67:0x0137, B:69:0x014a, B:71:0x0151, B:78:0x016e, B:80:0x0176, B:84:0x0180, B:90:0x018d, B:93:0x019b, B:94:0x01a1, B:70:0x014e, B:107:0x01d7, B:101:0x01af, B:102:0x01bb, B:104:0x01c1, B:105:0x01cd, B:140:0x027c, B:72:0x015d, B:74:0x0163, B:134:0x0241, B:151:0x02cc, B:158:0x02fd), top: B:193:0x00cb, inners: #0, #3, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:157:0x02e5 A[Catch: all -> 0x035a, TRY_LEAVE, TryCatch #4 {all -> 0x035a, blocks: (B:168:0x0325, B:41:0x00cb, B:113:0x01ea, B:114:0x01ee, B:116:0x01f4, B:120:0x0202, B:129:0x0220, B:133:0x022a, B:135:0x0251, B:137:0x025a, B:139:0x025e, B:141:0x0286, B:143:0x0293, B:144:0x0298, B:147:0x02a2, B:148:0x02a8, B:150:0x02ae, B:152:0x02d6, B:154:0x02dd, B:155:0x02e2, B:157:0x02e5, B:159:0x0307, B:161:0x030e, B:162:0x0313, B:165:0x031c, B:166:0x0323, B:123:0x0209, B:124:0x020d, B:125:0x0212, B:127:0x0219, B:128:0x021c, B:64:0x0124, B:65:0x0131, B:67:0x0137, B:69:0x014a, B:71:0x0151, B:78:0x016e, B:80:0x0176, B:84:0x0180, B:90:0x018d, B:93:0x019b, B:94:0x01a1, B:70:0x014e, B:107:0x01d7, B:101:0x01af, B:102:0x01bb, B:104:0x01c1, B:105:0x01cd, B:140:0x027c, B:72:0x015d, B:74:0x0163, B:134:0x0241, B:151:0x02cc, B:158:0x02fd), top: B:193:0x00cb, inners: #0, #3, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:171:0x0330  */
    /* JADX WARN: Code duplicated, block: B:173:0x034c  */
    /* JADX WARN: Code duplicated, block: B:214:0x0314 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        aqt aqtVar;
        boolean z6;
        boolean z7;
        aqu aquVarS;
        boolean z8;
        String[] strArr;
        arg argVarX;
        arg argVarW;
        int length;
        int i;
        arg argVarZ;
        boolean z9;
        ark arkVar;
        ark arkVar2 = this;
        try {
            anq anqVar = arkVar2.c;
            HashSet hashSet = new HashSet();
            hashSet.addAll(anqVar.d);
            Set setE = anq.e();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                if (setE.contains((String) it.next())) {
                    throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", arkVar2.c));
                }
            }
            hashSet.removeAll(anqVar.d);
            WorkDatabase workDatabase = arkVar2.c.a.d;
            workDatabase.h();
            try {
                anq anqVar2 = arkVar2.c;
                Set setE2 = anq.e();
                aof aofVar = anqVar2.a;
                List<anf> list = anqVar2.c;
                String[] strArr2 = (String[]) setE2.toArray(new String[0]);
                String str = anqVar2.b;
                int i2 = anqVar2.f;
                long jCurrentTimeMillis = System.currentTimeMillis();
                WorkDatabase workDatabase2 = aofVar.d;
                boolean z10 = strArr2 != null && strArr2.length > 0;
                if (z10) {
                    int length2 = strArr2.length;
                    int i3 = 0;
                    z = false;
                    z2 = false;
                    z3 = true;
                    while (true) {
                        if (i3 < length2) {
                            String str2 = strArr2[i3];
                            aqt aqtVarA = workDatabase2.s().a(str2);
                            if (aqtVarA == null) {
                                kus.l();
                                kus.i(b, String.format("Prerequisite %s doesn't exist; not enqueuing", str2), new Throwable[0]);
                                z5 = false;
                            } else {
                                int i4 = aqtVarA.p;
                                z3 &= i4 == 3;
                                if (i4 == 4) {
                                    z = true;
                                } else if (i4 == 6) {
                                    z2 = true;
                                }
                                i3++;
                            }
                        }
                        anqVar2.e = true;
                        workDatabase.j();
                        try {
                            workDatabase.i();
                            if (z5) {
                                arkVar = this;
                                arn.a(arkVar.c.a.b, RescheduleReceiver.class, true);
                                aof aofVar2 = arkVar.c.a;
                                anp.b(aofVar2.c, aofVar2.d, aofVar2.e);
                            } else {
                                arkVar = this;
                            }
                            arkVar.a.a(ana.a);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            arkVar2 = this;
                        }
                    }
                } else {
                    z = false;
                    z2 = false;
                    z3 = true;
                }
                boolean z11 = !TextUtils.isEmpty(str);
                if (!z11 || z10) {
                    z4 = false;
                    for (anf anfVar : list) {
                        aqtVar = anfVar.a;
                        if (z10 || z3) {
                            if (aqtVar.d()) {
                                aqtVar.l = 0L;
                            } else {
                                aqtVar.l = jCurrentTimeMillis;
                            }
                        } else if (z) {
                            aqtVar.p = 4;
                        } else if (z2) {
                            aqtVar.p = 6;
                        } else {
                            aqtVar.p = 5;
                        }
                        if (aqtVar.p == 1) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        z7 = z4 | (!z6);
                        aquVarS = workDatabase2.s();
                        ((are) aquVarS).a.g();
                        ((are) aquVarS).a.h();
                        try {
                            ((are) aquVarS).b.a(aqtVar);
                            ((are) aquVarS).a.j();
                            ((are) aquVarS).a.i();
                            if (z10) {
                                length = strArr2.length;
                                i = 0;
                                while (i < length) {
                                    boolean z12 = z7;
                                    String[] strArr3 = strArr2;
                                    ddg ddgVar = new ddg(anfVar.a(), strArr2[i], null, null);
                                    argVarZ = workDatabase2.z();
                                    argVarZ.a.g();
                                    argVarZ.a.h();
                                    try {
                                        argVarZ.b.a(ddgVar);
                                        argVarZ.a.j();
                                        argVarZ.a.i();
                                        i++;
                                        z7 = z12;
                                        strArr2 = strArr3;
                                    } catch (Throwable th2) {
                                        argVarZ.a.i();
                                        throw th2;
                                    }
                                }
                                z8 = z7;
                                strArr = strArr2;
                            } else {
                                z8 = z7;
                                strArr = strArr2;
                            }
                            for (String str3 : anfVar.b) {
                                argVarW = workDatabase2.w();
                                ddg ddgVar2 = new ddg(str3, anfVar.a(), null);
                                argVarW.a.g();
                                argVarW.a.h();
                                try {
                                    argVarW.b.a(ddgVar2);
                                    argVarW.a.j();
                                    argVarW.a.i();
                                } catch (Throwable th3) {
                                    argVarW.a.i();
                                    throw th3;
                                }
                            }
                            if (z11) {
                                argVarX = workDatabase2.x();
                                ddg ddgVar3 = new ddg(str, anfVar.a(), null);
                                argVarX.a.g();
                                argVarX.a.h();
                                try {
                                    argVarX.b.a(ddgVar3);
                                    argVarX.a.j();
                                    argVarX.a.i();
                                } catch (Throwable th4) {
                                    argVarX.a.i();
                                    throw th4;
                                }
                            }
                            z4 = z8;
                            strArr2 = strArr;
                        } catch (Throwable th5) {
                            ((are) aquVarS).a.i();
                            throw th5;
                        }
                    }
                    z5 = z4;
                    anqVar2.e = true;
                    workDatabase.j();
                    workDatabase.i();
                    if (z5) {
                        arkVar = this;
                        arn.a(arkVar.c.a.b, RescheduleReceiver.class, true);
                        aof aofVar3 = arkVar.c.a;
                        anp.b(aofVar3.c, aofVar3.d, aofVar3.e);
                    } else {
                        arkVar = this;
                    }
                    arkVar.a.a(ana.a);
                    return;
                }
                try {
                    List listD = workDatabase2.s().d(str);
                    if (listD.isEmpty()) {
                        z4 = false;
                    } else if (i2 == 3 || i2 == 4) {
                        arg argVarZ2 = workDatabase2.z();
                        List arrayList = new ArrayList();
                        Iterator it2 = listD.iterator();
                        while (it2.hasNext()) {
                            aqr aqrVar = (aqr) it2.next();
                            String str4 = aqrVar.a;
                            Iterator it3 = it2;
                            ais aisVarA = ais.a("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
                            if (str4 == null) {
                                aisVarA.f(1);
                            } else {
                                aisVarA.g(1, str4);
                            }
                            argVarZ2.a.g();
                            Cursor cursorI = fy.i(argVarZ2.a, aisVarA, false);
                            try {
                                boolean z13 = cursorI.moveToFirst() && cursorI.getInt(0) != 0;
                                cursorI.close();
                                aisVarA.j();
                                if (!z13) {
                                    int i5 = aqrVar.b;
                                    boolean z14 = z3 & (i5 == 3);
                                    if (i5 == 4) {
                                        z = true;
                                    } else if (i5 == 6) {
                                        z2 = true;
                                    }
                                    arrayList.add(aqrVar.a);
                                    z3 = z14;
                                }
                                it2 = it3;
                            } catch (Throwable th6) {
                                cursorI.close();
                                aisVarA.j();
                                throw th6;
                            }
                        }
                        if (i2 != 4) {
                            z9 = z;
                        } else if (z2 || z) {
                            aqu aquVarS2 = workDatabase2.s();
                            Iterator it4 = aquVarS2.d(str).iterator();
                            while (it4.hasNext()) {
                                aquVarS2.e(((aqr) it4.next()).a);
                            }
                            arrayList = Collections.emptyList();
                            z9 = false;
                            z2 = false;
                        } else {
                            z9 = false;
                            z2 = false;
                        }
                        strArr2 = (String[]) arrayList.toArray(strArr2);
                        z10 = strArr2.length > 0;
                        z = z9;
                        z4 = false;
                    } else {
                        if (i2 == 2) {
                            Iterator it5 = listD.iterator();
                            while (true) {
                                if (it5.hasNext()) {
                                    int i6 = ((aqr) it5.next()).b;
                                    if (i6 == 1 || i6 == 2) {
                                        z5 = false;
                                    }
                                }
                                anqVar2.e = true;
                                workDatabase.j();
                                workDatabase.i();
                                if (z5) {
                                    arkVar = this;
                                    arn.a(arkVar.c.a.b, RescheduleReceiver.class, true);
                                    aof aofVar4 = arkVar.c.a;
                                    anp.b(aofVar4.c, aofVar4.d, aofVar4.e);
                                } else {
                                    arkVar = this;
                                }
                                arkVar.a.a(ana.a);
                                return;
                            }
                        }
                        arj.b(str, aofVar, false).run();
                        aqu aquVarS3 = workDatabase2.s();
                        Iterator it6 = listD.iterator();
                        while (it6.hasNext()) {
                            aquVarS3.e(((aqr) it6.next()).a);
                        }
                        z4 = true;
                    }
                    while (r4.hasNext()) {
                        aqtVar = anfVar.a;
                        if (z10) {
                            if (aqtVar.d()) {
                                aqtVar.l = jCurrentTimeMillis;
                            } else {
                                aqtVar.l = 0L;
                            }
                        } else if (aqtVar.d()) {
                            aqtVar.l = jCurrentTimeMillis;
                        } else {
                            aqtVar.l = 0L;
                        }
                        if (aqtVar.p == 1) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        z7 = z4 | (!z6);
                        aquVarS = workDatabase2.s();
                        ((are) aquVarS).a.g();
                        ((are) aquVarS).a.h();
                        ((are) aquVarS).b.a(aqtVar);
                        ((are) aquVarS).a.j();
                        ((are) aquVarS).a.i();
                        if (z10) {
                            length = strArr2.length;
                            i = 0;
                            while (i < length) {
                                boolean z15 = z7;
                                String[] strArr4 = strArr2;
                                ddg ddgVar4 = new ddg(anfVar.a(), strArr2[i], null, null);
                                argVarZ = workDatabase2.z();
                                argVarZ.a.g();
                                argVarZ.a.h();
                                argVarZ.b.a(ddgVar4);
                                argVarZ.a.j();
                                argVarZ.a.i();
                                i++;
                                z7 = z15;
                                strArr2 = strArr4;
                            }
                            z8 = z7;
                            strArr = strArr2;
                        } else {
                            z8 = z7;
                            strArr = strArr2;
                        }
                        while (r1.hasNext()) {
                            argVarW = workDatabase2.w();
                            ddg ddgVar5 = new ddg(str3, anfVar.a(), null);
                            argVarW.a.g();
                            argVarW.a.h();
                            argVarW.b.a(ddgVar5);
                            argVarW.a.j();
                            argVarW.a.i();
                        }
                        if (z11) {
                            argVarX = workDatabase2.x();
                            ddg ddgVar6 = new ddg(str, anfVar.a(), null);
                            argVarX.a.g();
                            argVarX.a.h();
                            argVarX.b.a(ddgVar6);
                            argVarX.a.j();
                            argVarX.a.i();
                        }
                        z4 = z8;
                        strArr2 = strArr;
                    }
                    z5 = z4;
                    anqVar2.e = true;
                    workDatabase.j();
                    workDatabase.i();
                    if (z5) {
                        arkVar = this;
                        arn.a(arkVar.c.a.b, RescheduleReceiver.class, true);
                        aof aofVar5 = arkVar.c.a;
                        anp.b(aofVar5.c, aofVar5.d, aofVar5.e);
                    } else {
                        arkVar = this;
                    }
                    arkVar.a.a(ana.a);
                    return;
                } catch (Throwable th7) {
                    th = th7;
                    workDatabase.i();
                    throw th;
                }
            } catch (Throwable th8) {
                th = th8;
            }
        } catch (Throwable th9) {
            th = th9;
        }
        arkVar2.a.a(new amx(th));
    }
}
