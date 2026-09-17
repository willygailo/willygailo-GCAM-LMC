package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import android.os.Parcel;
import android.os.TransactionTooLargeException;
import android.util.Log;
import android.util.LruCache;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class kha extends kji {
    final /* synthetic */ khb a;
    private final kgp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kha(khb khbVar, kgp kgpVar, kim kimVar) {
        super(kimVar);
        this.a = khbVar;
        kif kifVar = kgt.a;
        this.b = kgpVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ kiv a(Status status) {
        return status;
    }

    @Override // defpackage.kji, defpackage.kjj
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        super.j((kiv) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:323:0x0641 A[Catch: IOException -> 0x06ec, TryCatch #10 {IOException -> 0x06ec, blocks: (B:338:0x066d, B:340:0x0678, B:342:0x067e, B:344:0x0686, B:346:0x068c, B:348:0x0696, B:350:0x069c, B:352:0x06a2, B:354:0x06ac, B:357:0x06c6, B:339:0x0672, B:315:0x0620, B:317:0x0626, B:319:0x062c, B:321:0x0632, B:323:0x0641, B:326:0x0652, B:330:0x0659, B:331:0x065f, B:307:0x05fb, B:309:0x0603, B:311:0x060b, B:313:0x0611, B:359:0x06e4, B:360:0x06eb), top: B:435:0x066d }] */
    /* JADX WARN: Code duplicated, block: B:326:0x0652 A[Catch: IOException -> 0x06ec, TryCatch #10 {IOException -> 0x06ec, blocks: (B:338:0x066d, B:340:0x0678, B:342:0x067e, B:344:0x0686, B:346:0x068c, B:348:0x0696, B:350:0x069c, B:352:0x06a2, B:354:0x06ac, B:357:0x06c6, B:339:0x0672, B:315:0x0620, B:317:0x0626, B:319:0x062c, B:321:0x0632, B:323:0x0641, B:326:0x0652, B:330:0x0659, B:331:0x065f, B:307:0x05fb, B:309:0x0603, B:311:0x060b, B:313:0x0611, B:359:0x06e4, B:360:0x06eb), top: B:435:0x066d }] */
    /* JADX WARN: Code duplicated, block: B:328:0x0656  */
    /* JADX WARN: Code duplicated, block: B:331:0x065f A[Catch: IOException -> 0x06ec, TryCatch #10 {IOException -> 0x06ec, blocks: (B:338:0x066d, B:340:0x0678, B:342:0x067e, B:344:0x0686, B:346:0x068c, B:348:0x0696, B:350:0x069c, B:352:0x06a2, B:354:0x06ac, B:357:0x06c6, B:339:0x0672, B:315:0x0620, B:317:0x0626, B:319:0x062c, B:321:0x0632, B:323:0x0641, B:326:0x0652, B:330:0x0659, B:331:0x065f, B:307:0x05fb, B:309:0x0603, B:311:0x060b, B:313:0x0611, B:359:0x06e4, B:360:0x06eb), top: B:435:0x066d }] */
    /* JADX WARN: Code duplicated, block: B:333:0x0665  */
    /* JADX WARN: Code duplicated, block: B:337:0x066b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:339:0x0672 A[Catch: IOException -> 0x06ec, TryCatch #10 {IOException -> 0x06ec, blocks: (B:338:0x066d, B:340:0x0678, B:342:0x067e, B:344:0x0686, B:346:0x068c, B:348:0x0696, B:350:0x069c, B:352:0x06a2, B:354:0x06ac, B:357:0x06c6, B:339:0x0672, B:315:0x0620, B:317:0x0626, B:319:0x062c, B:321:0x0632, B:323:0x0641, B:326:0x0652, B:330:0x0659, B:331:0x065f, B:307:0x05fb, B:309:0x0603, B:311:0x060b, B:313:0x0611, B:359:0x06e4, B:360:0x06eb), top: B:435:0x066d }] */
    /* JADX WARN: Code duplicated, block: B:342:0x067e A[Catch: IOException -> 0x06ec, TryCatch #10 {IOException -> 0x06ec, blocks: (B:338:0x066d, B:340:0x0678, B:342:0x067e, B:344:0x0686, B:346:0x068c, B:348:0x0696, B:350:0x069c, B:352:0x06a2, B:354:0x06ac, B:357:0x06c6, B:339:0x0672, B:315:0x0620, B:317:0x0626, B:319:0x062c, B:321:0x0632, B:323:0x0641, B:326:0x0652, B:330:0x0659, B:331:0x065f, B:307:0x05fb, B:309:0x0603, B:311:0x060b, B:313:0x0611, B:359:0x06e4, B:360:0x06eb), top: B:435:0x066d }] */
    /* JADX WARN: Code duplicated, block: B:346:0x068c A[Catch: IOException -> 0x06ec, TryCatch #10 {IOException -> 0x06ec, blocks: (B:338:0x066d, B:340:0x0678, B:342:0x067e, B:344:0x0686, B:346:0x068c, B:348:0x0696, B:350:0x069c, B:352:0x06a2, B:354:0x06ac, B:357:0x06c6, B:339:0x0672, B:315:0x0620, B:317:0x0626, B:319:0x062c, B:321:0x0632, B:323:0x0641, B:326:0x0652, B:330:0x0659, B:331:0x065f, B:307:0x05fb, B:309:0x0603, B:311:0x060b, B:313:0x0611, B:359:0x06e4, B:360:0x06eb), top: B:435:0x066d }] */
    /* JADX WARN: Code duplicated, block: B:348:0x0696 A[Catch: IOException -> 0x06ec, TryCatch #10 {IOException -> 0x06ec, blocks: (B:338:0x066d, B:340:0x0678, B:342:0x067e, B:344:0x0686, B:346:0x068c, B:348:0x0696, B:350:0x069c, B:352:0x06a2, B:354:0x06ac, B:357:0x06c6, B:339:0x0672, B:315:0x0620, B:317:0x0626, B:319:0x062c, B:321:0x0632, B:323:0x0641, B:326:0x0652, B:330:0x0659, B:331:0x065f, B:307:0x05fb, B:309:0x0603, B:311:0x060b, B:313:0x0611, B:359:0x06e4, B:360:0x06eb), top: B:435:0x066d }] */
    /* JADX WARN: Code duplicated, block: B:352:0x06a2 A[Catch: IOException -> 0x06ec, TryCatch #10 {IOException -> 0x06ec, blocks: (B:338:0x066d, B:340:0x0678, B:342:0x067e, B:344:0x0686, B:346:0x068c, B:348:0x0696, B:350:0x069c, B:352:0x06a2, B:354:0x06ac, B:357:0x06c6, B:339:0x0672, B:315:0x0620, B:317:0x0626, B:319:0x062c, B:321:0x0632, B:323:0x0641, B:326:0x0652, B:330:0x0659, B:331:0x065f, B:307:0x05fb, B:309:0x0603, B:311:0x060b, B:313:0x0611, B:359:0x06e4, B:360:0x06eb), top: B:435:0x066d }] */
    /* JADX WARN: Code duplicated, block: B:354:0x06ac A[Catch: IOException -> 0x06ec, TryCatch #10 {IOException -> 0x06ec, blocks: (B:338:0x066d, B:340:0x0678, B:342:0x067e, B:344:0x0686, B:346:0x068c, B:348:0x0696, B:350:0x069c, B:352:0x06a2, B:354:0x06ac, B:357:0x06c6, B:339:0x0672, B:315:0x0620, B:317:0x0626, B:319:0x062c, B:321:0x0632, B:323:0x0641, B:326:0x0652, B:330:0x0659, B:331:0x065f, B:307:0x05fb, B:309:0x0603, B:311:0x060b, B:313:0x0611, B:359:0x06e4, B:360:0x06eb), top: B:435:0x066d }] */
    /* JADX WARN: Code duplicated, block: B:357:0x06c6 A[Catch: IOException -> 0x06ec, LOOP:3: B:340:0x0678->B:357:0x06c6, LOOP_END, TryCatch #10 {IOException -> 0x06ec, blocks: (B:338:0x066d, B:340:0x0678, B:342:0x067e, B:344:0x0686, B:346:0x068c, B:348:0x0696, B:350:0x069c, B:352:0x06a2, B:354:0x06ac, B:357:0x06c6, B:339:0x0672, B:315:0x0620, B:317:0x0626, B:319:0x062c, B:321:0x0632, B:323:0x0641, B:326:0x0652, B:330:0x0659, B:331:0x065f, B:307:0x05fb, B:309:0x0603, B:311:0x060b, B:313:0x0611, B:359:0x06e4, B:360:0x06eb), top: B:435:0x066d }] */
    /* JADX WARN: Code duplicated, block: B:382:0x0721  */
    /* JADX WARN: Code duplicated, block: B:384:0x0731  */
    /* JADX WARN: Code duplicated, block: B:387:0x0752  */
    /* JADX WARN: Code duplicated, block: B:390:0x076d  */
    /* JADX WARN: Code duplicated, block: B:392:0x07b3  */
    /* JADX WARN: Code duplicated, block: B:395:0x07c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:399:0x07d6 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:435:0x066d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:463:0x064f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:464:0x0686 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:465:0x069c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:473:0x06c0 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kji
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void b(khc khcVar) {
        kgp kgpVar;
        List<pyl> listEmptyList;
        ArrayList arrayList;
        int i;
        kgz kgzVar;
        kgp kgpVar2;
        kgw kgwVar;
        ojc ojcVar;
        mes mesVar;
        mdo mdoVar;
        byte[] bArr;
        boolean z;
        poy poyVarM;
        int i2;
        boolean z2;
        qyx qyxVarD;
        int i3;
        Integer numValueOf;
        int iD;
        int i4;
        Integer num;
        int i5;
        long jLongValue;
        long jLongValue2;
        long jDG;
        kha khaVar = this;
        kgz kgzVar2 = new kgz(khaVar);
        try {
            kgp kgpVarA = khaVar.b;
            Iterator it = kgpVarA.a.i.iterator();
            while (true) {
                if (it.hasNext()) {
                    kgpVarA = ((kgo) it.next()).a();
                    if (kgpVarA == null) {
                        kgpVar = null;
                        break;
                    }
                } else {
                    Iterator it2 = kgt.c.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            kgpVar = kgpVarA;
                            break;
                        }
                        kgpVarA = ((kgo) it2.next()).a();
                        if (kgpVarA == null) {
                            kgpVar = null;
                            break;
                        }
                    }
                }
            }
            if (kgpVar == null) {
                kgzVar2.c(Status.a);
                return;
            }
            kgq kgqVar = kgpVar.a.h;
            String str = kgpVar.g;
            int i6 = ((pyk) kgpVar.l.b).d;
            if (str == null || str.isEmpty()) {
                str = null;
            }
            if (str == null) {
                arrayList = new ArrayList();
            } else {
                if (((khf) kgqVar).f == null) {
                    listEmptyList = Collections.emptyList();
                } else {
                    ner nerVar = (ner) khf.c.get(str);
                    if (nerVar == null) {
                        neo neoVar = new neo(khf.b, str, pym.b);
                        nerVar = (ner) khf.c.putIfAbsent(str, neoVar);
                        if (nerVar == null) {
                            nerVar = neoVar;
                        }
                    }
                    listEmptyList = ((pym) nerVar.e()).a;
                }
                ArrayList arrayList2 = new ArrayList();
                for (pyl pylVar : listEmptyList) {
                    if ((pylVar.a & 1) == 0 || (i = pylVar.b) == 0 || i == i6) {
                        arrayList2.add(pylVar);
                    }
                }
                arrayList = arrayList2;
            }
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    try {
                        kgt kgtVar = kgpVar.a;
                        String str2 = kgtVar.f;
                        Context context = kgtVar.e;
                        if (kgt.d == -1) {
                            synchronized (kgt.class) {
                                if (kgt.d == -1) {
                                    try {
                                        kgt.d = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                                    } catch (PackageManager.NameNotFoundException e) {
                                        Log.wtf("ClearcutLogger", "This can't happen.", e);
                                    }
                                }
                            }
                        }
                        khg khgVar = new khg(str2, kgt.d, kgpVar.g, kgpVar.f, kgpVar.j, kgpVar.a.g);
                        pyk pykVar = (pyk) kgpVar.l.j();
                        kgm kgmVar = kgpVar.i;
                        int[] iArrD = kgt.d(null);
                        ArrayList arrayList3 = kgpVar.c;
                        kgw kgwVar2 = new kgw(khgVar, pykVar, kgmVar, iArrD, arrayList3 != null ? (String[]) arrayList3.toArray(kgt.b) : null, kgt.d(kgpVar.d), true);
                        pyk pykVar2 = kgwVar2.j;
                        pykVar2.getClass();
                        poy poyVar = (poy) pykVar2.G(5);
                        poyVar.o(pykVar2);
                        ppa ppaVar = (ppa) poyVar;
                        if (kgwVar2.k != null && pykVar2.e.d() == 0) {
                            poc pocVarD = kgwVar2.k.a.d();
                            if (ppaVar.c) {
                                ppaVar.m();
                                ppaVar.c = false;
                            }
                            pyk pykVar3 = (pyk) ppaVar.b;
                            pykVar3.a |= 1024;
                            pykVar3.e = pocVarD;
                        }
                        kgwVar2.j = (pyk) ppaVar.j();
                        kgwVar2.c = kgwVar2.j.g();
                        mes mesVar2 = kgpVar.k;
                        if (mesVar2 != null) {
                            pyk pykVar4 = kgwVar2.j;
                            pykVar4.getClass();
                            poc pocVar = pykVar4.e;
                            mdw mdwVar = mesVar2.b;
                            mdo mdoVar2 = mesVar2.a;
                            byte[] bArrB = pocVar.B();
                            mdv mdvVar = mdwVar.a;
                            mds mdsVar = mdr.a;
                            if (Looper.getMainLooper().equals(Looper.myLooper())) {
                                throw new NetworkOnMainThreadException();
                            }
                            mep mepVar = ((mdt) mdsVar).f;
                            Context context2 = mdoVar2.a;
                            meq meqVar = mdt.c;
                            if (!mep.b) {
                                synchronized (mep.c) {
                                    if (!mep.b) {
                                        mep.b = true;
                                        synchronized (nei.a) {
                                            if (nei.b == null) {
                                                nei.b = context2.getApplicationContext();
                                            }
                                        }
                                        ner.h(context2);
                                        if (!"com.google.android.gms".equals(context2.getPackageName())) {
                                            final kij kijVarA = kty.a(context2);
                                            String strValueOf = String.valueOf(context2.getPackageName());
                                            final String strConcat = strValueOf.length() != 0 ? "com.google.android.libraries.consentverifier#".concat(strValueOf) : new String("com.google.android.libraries.consentverifier#");
                                            final int iA = meqVar.a(context2);
                                            final String[] strArr = mep.a;
                                            kli kliVarA = klj.a();
                                            kliVarA.a = new klb() { // from class: kub
                                                @Override // defpackage.klb
                                                public final void a(Object obj, Object obj2) {
                                                    String str3 = strConcat;
                                                    int i7 = iA;
                                                    String[] strArr2 = strArr;
                                                    kud kudVar = new kud((kvm) obj2);
                                                    kue kueVar = (kue) ((kuf) obj).u();
                                                    Parcel parcelA = kueVar.a();
                                                    bmp.e(parcelA, kudVar);
                                                    parcelA.writeString(str3);
                                                    parcelA.writeInt(i7);
                                                    parcelA.writeStringArray(strArr2);
                                                    parcelA.writeByteArray(null);
                                                    kueVar.z(1, parcelA);
                                                }
                                            };
                                            kijVarA.d(kliVarA.a()).f(new kvc() { // from class: mem
                                                @Override // defpackage.kvc
                                                public final void a(kvk kvkVar) {
                                                    kij kijVar = kijVarA;
                                                    String str3 = strConcat;
                                                    String[] strArr2 = mep.a;
                                                    if (kvkVar.e()) {
                                                        new Thread(new meo(new men(kijVar, str3)), "CBVerifier").start();
                                                    } else {
                                                        Log.w("CBVerifier", String.format("Registering phenotype for %s failed", str3));
                                                    }
                                                }
                                            });
                                        }
                                    }
                                }
                            }
                            if (pzl.a.a().d()) {
                                Context context3 = mdoVar2.a;
                                meq meqVar2 = mdt.c;
                                if (meu.a == null || meu.c != meu.a(context3, meqVar2)) {
                                    synchronized (meu.b) {
                                        boolean zA = meu.a(context3, meqVar2);
                                        if (meu.a == null || meu.c != zA) {
                                            if (zA) {
                                                meu.a = new mer(new kgt(context3, "COLLECTION_BASIS_VERIFIER"));
                                            } else {
                                                meu.a = new mex();
                                            }
                                            meu.c = zA;
                                        }
                                    }
                                }
                                ojc ojcVarI = ojc.i(meu.a);
                                try {
                                    mdq mdqVar = new mdq(mdoVar2.a, mdvVar.b(), ((mdt) mdsVar).d, ((mdt) mdsVar).e);
                                    int iA2 = mdvVar.a();
                                    met metVar = (met) ((ojj) ojcVarI).a;
                                    poh pohVarI = poh.I(bArrB);
                                    ArrayDeque arrayDeque = new ArrayDeque();
                                    mew mewVar = new mew(mdt.c, mdt.b, metVar, mdoVar2, iA2, bArrB.length, arrayDeque);
                                    qza qzaVarA = mdqVar.a(iA2);
                                    if (qzaVarA == null) {
                                        if (pzl.c()) {
                                            mewVar.a(mewVar.b(7));
                                        }
                                        kgzVar = kgzVar2;
                                        kgpVar2 = kgpVar;
                                        kgwVar = kgwVar2;
                                        mesVar = mesVar2;
                                        z = false;
                                    } else if (pohVarI.C() || mdt.c(mdoVar2, mdt.e(qzaVarA), mewVar, oih.a)) {
                                        boolean zA2 = mdt.a(mdt.e(qzaVarA));
                                        int iIntValue = iA2;
                                        Integer numValueOf2 = null;
                                        int iD2 = 0;
                                        kgpVar2 = kgpVar;
                                        String strX = null;
                                        loop2: while (true) {
                                            try {
                                                if (pohVarI.C()) {
                                                    kgzVar = kgzVar2;
                                                    kgwVar = kgwVar2;
                                                    mesVar = mesVar2;
                                                    z = true;
                                                    break;
                                                }
                                                kgwVar = kgwVar2;
                                                try {
                                                    int iM = pohVarI.m();
                                                    kgzVar = kgzVar2;
                                                    try {
                                                        int iA3 = psa.a(iM);
                                                        int iB = psa.b(iM);
                                                        mesVar = mesVar2;
                                                        try {
                                                            Map mapUnmodifiableMap = Collections.unmodifiableMap(qzaVarA.b);
                                                            mdo mdoVar3 = mdoVar2;
                                                            bArr = bArrB;
                                                            long j = iA3;
                                                            ojcVar = ojcVarI;
                                                            try {
                                                                Long lValueOf = Long.valueOf(j);
                                                                if (!mapUnmodifiableMap.containsKey(lValueOf)) {
                                                                    if (!zA2) {
                                                                        if (pzl.c()) {
                                                                            poy poyVarB = mewVar.b(8);
                                                                            poyVarB.G(j);
                                                                            mewVar.a(poyVarB);
                                                                        }
                                                                        z = false;
                                                                        break;
                                                                    }
                                                                    pohVarI.E(iM);
                                                                    i2 = iB;
                                                                    mdoVar = mdoVar3;
                                                                    zA2 = true;
                                                                    if (numValueOf2 == null || i2 == 4) {
                                                                        if (numValueOf2 == null) {
                                                                            try {
                                                                                iD = pohVarI.d();
                                                                            } catch (IOException e2) {
                                                                                if (pzl.c()) {
                                                                                    poyVarM = psl.m.m();
                                                                                    String packageName = mdoVar.a.getPackageName();
                                                                                    if (poyVarM.c) {
                                                                                        poyVarM.m();
                                                                                        poyVarM.c = false;
                                                                                    }
                                                                                    psl pslVar = (psl) poyVarM.b;
                                                                                    packageName.getClass();
                                                                                    pslVar.a |= 1;
                                                                                    pslVar.b = packageName;
                                                                                    int iA4 = mdt.c.a(mdoVar.a);
                                                                                    if (poyVarM.c) {
                                                                                        poyVarM.m();
                                                                                        poyVarM.c = false;
                                                                                    }
                                                                                    psl pslVar2 = (psl) poyVarM.b;
                                                                                    pslVar2.a |= 2;
                                                                                    pslVar2.c = iA4;
                                                                                    long jA = mdvVar.a();
                                                                                    if (poyVarM.c) {
                                                                                        poyVarM.m();
                                                                                        poyVarM.c = false;
                                                                                    }
                                                                                    psl pslVar3 = (psl) poyVarM.b;
                                                                                    int i7 = pslVar3.a | 4;
                                                                                    pslVar3.a = i7;
                                                                                    pslVar3.d = jA;
                                                                                    int i8 = 8 | i7;
                                                                                    pslVar3.a = i8;
                                                                                    pslVar3.e = -2032180703L;
                                                                                    int length = bArr.length;
                                                                                    pslVar3.a = i8 | 16;
                                                                                    pslVar3.f = length;
                                                                                    pslVar3.h = plk.ap(5);
                                                                                    pslVar3.a |= 64;
                                                                                    ((met) ((ojj) ojcVar).a).a((psl) poyVarM.j());
                                                                                    z = false;
                                                                                } else {
                                                                                    z = false;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            iD = iD2 + numValueOf2.intValue();
                                                                        }
                                                                        while (pohVarI.d() >= iD) {
                                                                            if (pohVarI.d() > iD) {
                                                                                if (pzl.c()) {
                                                                                    mewVar.a(mewVar.b(11));
                                                                                }
                                                                                z = false;
                                                                                break loop2;
                                                                            }
                                                                            if (arrayDeque.isEmpty()) {
                                                                                if (pzl.c()) {
                                                                                    mewVar.a(mewVar.b(11));
                                                                                }
                                                                                z = false;
                                                                                break loop2;
                                                                            }
                                                                            mdu mduVar = (mdu) arrayDeque.pop();
                                                                            i4 = mduVar.a;
                                                                            num = mduVar.b;
                                                                            i5 = mduVar.c;
                                                                            zA2 = mduVar.d;
                                                                            qzaVarA = mdqVar.b(i4);
                                                                            if (num == null) {
                                                                                iIntValue = i4;
                                                                                numValueOf2 = num;
                                                                                iD2 = i5;
                                                                                break;
                                                                            } else {
                                                                                numValueOf2 = num;
                                                                                iD2 = i5;
                                                                                iD = num.intValue() + i5;
                                                                                iIntValue = i4;
                                                                            }
                                                                        }
                                                                    }
                                                                    mdoVar2 = mdoVar;
                                                                    kgwVar2 = kgwVar;
                                                                    kgzVar2 = kgzVar;
                                                                    mesVar2 = mesVar;
                                                                    bArrB = bArr;
                                                                    ojcVarI = ojcVar;
                                                                } else {
                                                                    pqh pqhVar = qzaVarA.b;
                                                                    if (!pqhVar.containsKey(lValueOf)) {
                                                                        throw new IllegalArgumentException();
                                                                    }
                                                                    qyw qywVar = (qyw) pqhVar.get(lValueOf);
                                                                    if (iB == 2 || iB == 3) {
                                                                        i2 = iB;
                                                                        z2 = false;
                                                                    } else if (iB != 4) {
                                                                        i2 = iB;
                                                                        z2 = true;
                                                                    } else {
                                                                        z2 = false;
                                                                        i2 = 4;
                                                                    }
                                                                    if (z2) {
                                                                        mdoVar = mdoVar3;
                                                                        if ((qywVar.a & 2) != 0 && mdqVar.d(qywVar.b)) {
                                                                            if (pzl.c()) {
                                                                                poy poyVarB2 = mewVar.b(10);
                                                                                poyVarB2.G(j);
                                                                                mewVar.a(poyVarB2);
                                                                            }
                                                                            z = false;
                                                                            break;
                                                                        }
                                                                        qyxVarD = mdt.d(qywVar);
                                                                        if (!zA2) {
                                                                            if (!mdt.c(mdoVar, qyxVarD, mewVar, ojc.i(Integer.valueOf(iA3)))) {
                                                                                z = false;
                                                                                break;
                                                                            }
                                                                            if (iIntValue == mdt.a) {
                                                                                pohVarI.E(iM);
                                                                                strX = null;
                                                                            } else {
                                                                                pohVarI.E(iM);
                                                                                strX = null;
                                                                            }
                                                                            if (numValueOf2 == null) {
                                                                                if (numValueOf2 == null) {
                                                                                    iD = pohVarI.d();
                                                                                } else {
                                                                                    iD = iD2 + numValueOf2.intValue();
                                                                                }
                                                                                while (pohVarI.d() >= iD) {
                                                                                    if (pohVarI.d() > iD) {
                                                                                        if (pzl.c()) {
                                                                                            mewVar.a(mewVar.b(11));
                                                                                        }
                                                                                        z = false;
                                                                                        break loop2;
                                                                                    }
                                                                                    if (arrayDeque.isEmpty()) {
                                                                                        if (pzl.c()) {
                                                                                            mewVar.a(mewVar.b(11));
                                                                                        }
                                                                                        z = false;
                                                                                        break loop2;
                                                                                    }
                                                                                    mdu mduVar2 = (mdu) arrayDeque.pop();
                                                                                    i4 = mduVar2.a;
                                                                                    num = mduVar2.b;
                                                                                    i5 = mduVar2.c;
                                                                                    zA2 = mduVar2.d;
                                                                                    qzaVarA = mdqVar.b(i4);
                                                                                    if (num == null) {
                                                                                        iIntValue = i4;
                                                                                        numValueOf2 = num;
                                                                                        iD2 = i5;
                                                                                        break;
                                                                                        break;
                                                                                    }
                                                                                    numValueOf2 = num;
                                                                                    iD2 = i5;
                                                                                    iD = num.intValue() + i5;
                                                                                    iIntValue = i4;
                                                                                }
                                                                                mdoVar2 = mdoVar;
                                                                                kgwVar2 = kgwVar;
                                                                                kgzVar2 = kgzVar;
                                                                                mesVar2 = mesVar;
                                                                                bArrB = bArr;
                                                                                ojcVarI = ojcVar;
                                                                            } else {
                                                                                if (numValueOf2 == null) {
                                                                                    iD = pohVarI.d();
                                                                                } else {
                                                                                    iD = iD2 + numValueOf2.intValue();
                                                                                }
                                                                                while (pohVarI.d() >= iD) {
                                                                                    if (pohVarI.d() > iD) {
                                                                                        if (pzl.c()) {
                                                                                            mewVar.a(mewVar.b(11));
                                                                                        }
                                                                                        z = false;
                                                                                        break loop2;
                                                                                    }
                                                                                    if (arrayDeque.isEmpty()) {
                                                                                        if (pzl.c()) {
                                                                                            mewVar.a(mewVar.b(11));
                                                                                        }
                                                                                        z = false;
                                                                                        break loop2;
                                                                                    }
                                                                                    mdu mduVar3 = (mdu) arrayDeque.pop();
                                                                                    i4 = mduVar3.a;
                                                                                    num = mduVar3.b;
                                                                                    i5 = mduVar3.c;
                                                                                    zA2 = mduVar3.d;
                                                                                    qzaVarA = mdqVar.b(i4);
                                                                                    if (num == null) {
                                                                                        iIntValue = i4;
                                                                                        numValueOf2 = num;
                                                                                        iD2 = i5;
                                                                                        break;
                                                                                        break;
                                                                                    }
                                                                                    numValueOf2 = num;
                                                                                    iD2 = i5;
                                                                                    iD = num.intValue() + i5;
                                                                                    iIntValue = i4;
                                                                                }
                                                                                mdoVar2 = mdoVar;
                                                                                kgwVar2 = kgwVar;
                                                                                kgzVar2 = kgzVar;
                                                                                mesVar2 = mesVar;
                                                                                bArrB = bArr;
                                                                                ojcVarI = ojcVar;
                                                                            }
                                                                        } else {
                                                                            if (!mdt.c(mdoVar, qyxVarD, mewVar, ojc.i(Integer.valueOf(iA3)))) {
                                                                                z = false;
                                                                                break;
                                                                            }
                                                                            if (iIntValue == mdt.a) {
                                                                                pohVarI.E(iM);
                                                                                strX = null;
                                                                            } else {
                                                                                pohVarI.E(iM);
                                                                                strX = null;
                                                                            }
                                                                            if (numValueOf2 == null) {
                                                                                if (numValueOf2 == null) {
                                                                                    iD = pohVarI.d();
                                                                                } else {
                                                                                    iD = iD2 + numValueOf2.intValue();
                                                                                }
                                                                                while (pohVarI.d() >= iD) {
                                                                                    if (pohVarI.d() > iD) {
                                                                                        if (pzl.c()) {
                                                                                            mewVar.a(mewVar.b(11));
                                                                                        }
                                                                                        z = false;
                                                                                        break loop2;
                                                                                    }
                                                                                    if (arrayDeque.isEmpty()) {
                                                                                        if (pzl.c()) {
                                                                                            mewVar.a(mewVar.b(11));
                                                                                        }
                                                                                        z = false;
                                                                                        break loop2;
                                                                                    }
                                                                                    mdu mduVar4 = (mdu) arrayDeque.pop();
                                                                                    i4 = mduVar4.a;
                                                                                    num = mduVar4.b;
                                                                                    i5 = mduVar4.c;
                                                                                    zA2 = mduVar4.d;
                                                                                    qzaVarA = mdqVar.b(i4);
                                                                                    if (num == null) {
                                                                                        iIntValue = i4;
                                                                                        numValueOf2 = num;
                                                                                        iD2 = i5;
                                                                                        break;
                                                                                        break;
                                                                                    }
                                                                                    numValueOf2 = num;
                                                                                    iD2 = i5;
                                                                                    iD = num.intValue() + i5;
                                                                                    iIntValue = i4;
                                                                                }
                                                                                mdoVar2 = mdoVar;
                                                                                kgwVar2 = kgwVar;
                                                                                kgzVar2 = kgzVar;
                                                                                mesVar2 = mesVar;
                                                                                bArrB = bArr;
                                                                                ojcVarI = ojcVar;
                                                                            } else {
                                                                                if (numValueOf2 == null) {
                                                                                    iD = pohVarI.d();
                                                                                } else {
                                                                                    iD = iD2 + numValueOf2.intValue();
                                                                                }
                                                                                while (pohVarI.d() >= iD) {
                                                                                    if (pohVarI.d() > iD) {
                                                                                        if (pzl.c()) {
                                                                                            mewVar.a(mewVar.b(11));
                                                                                        }
                                                                                        z = false;
                                                                                        break loop2;
                                                                                    }
                                                                                    if (arrayDeque.isEmpty()) {
                                                                                        if (pzl.c()) {
                                                                                            mewVar.a(mewVar.b(11));
                                                                                        }
                                                                                        z = false;
                                                                                        break loop2;
                                                                                    }
                                                                                    mdu mduVar5 = (mdu) arrayDeque.pop();
                                                                                    i4 = mduVar5.a;
                                                                                    num = mduVar5.b;
                                                                                    i5 = mduVar5.c;
                                                                                    zA2 = mduVar5.d;
                                                                                    qzaVarA = mdqVar.b(i4);
                                                                                    if (num == null) {
                                                                                        iIntValue = i4;
                                                                                        numValueOf2 = num;
                                                                                        iD2 = i5;
                                                                                        break;
                                                                                        break;
                                                                                    }
                                                                                    numValueOf2 = num;
                                                                                    iD2 = i5;
                                                                                    iD = num.intValue() + i5;
                                                                                    iIntValue = i4;
                                                                                }
                                                                                mdoVar2 = mdoVar;
                                                                                kgwVar2 = kgwVar;
                                                                                kgzVar2 = kgzVar;
                                                                                mesVar2 = mesVar;
                                                                                bArrB = bArr;
                                                                                ojcVarI = ojcVar;
                                                                            }
                                                                        }
                                                                    } else if ((qywVar.a & 2) == 0 && (strX == null || !mdt.b(iIntValue, iA3))) {
                                                                        mdoVar = mdoVar3;
                                                                        qyxVarD = mdt.d(qywVar);
                                                                        if (!zA2 && !mdt.a(qyxVarD)) {
                                                                            if (pzl.c()) {
                                                                                poy poyVarB3 = mewVar.b(8);
                                                                                poyVarB3.G(j);
                                                                                mewVar.a(poyVarB3);
                                                                            }
                                                                            z = false;
                                                                            break;
                                                                        }
                                                                        if (!mdt.c(mdoVar, qyxVarD, mewVar, ojc.i(Integer.valueOf(iA3)))) {
                                                                            z = false;
                                                                            break;
                                                                        }
                                                                        if (iIntValue == mdt.a || iA3 != 1) {
                                                                            pohVarI.E(iM);
                                                                            strX = null;
                                                                        } else {
                                                                            strX = pohVarI.x();
                                                                        }
                                                                        if (numValueOf2 == null) {
                                                                            if (numValueOf2 == null) {
                                                                                iD = pohVarI.d();
                                                                            } else {
                                                                                iD = iD2 + numValueOf2.intValue();
                                                                            }
                                                                            while (pohVarI.d() >= iD) {
                                                                                if (pohVarI.d() > iD) {
                                                                                    if (pzl.c()) {
                                                                                        mewVar.a(mewVar.b(11));
                                                                                    }
                                                                                    z = false;
                                                                                    break loop2;
                                                                                }
                                                                                if (arrayDeque.isEmpty()) {
                                                                                    if (pzl.c()) {
                                                                                        mewVar.a(mewVar.b(11));
                                                                                    }
                                                                                    z = false;
                                                                                    break loop2;
                                                                                }
                                                                                mdu mduVar6 = (mdu) arrayDeque.pop();
                                                                                i4 = mduVar6.a;
                                                                                num = mduVar6.b;
                                                                                i5 = mduVar6.c;
                                                                                zA2 = mduVar6.d;
                                                                                qzaVarA = mdqVar.b(i4);
                                                                                if (num == null) {
                                                                                    iIntValue = i4;
                                                                                    numValueOf2 = num;
                                                                                    iD2 = i5;
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                numValueOf2 = num;
                                                                                iD2 = i5;
                                                                                iD = num.intValue() + i5;
                                                                                iIntValue = i4;
                                                                            }
                                                                            mdoVar2 = mdoVar;
                                                                            kgwVar2 = kgwVar;
                                                                            kgzVar2 = kgzVar;
                                                                            mesVar2 = mesVar;
                                                                            bArrB = bArr;
                                                                            ojcVarI = ojcVar;
                                                                        } else {
                                                                            if (numValueOf2 == null) {
                                                                                iD = pohVarI.d();
                                                                            } else {
                                                                                iD = iD2 + numValueOf2.intValue();
                                                                            }
                                                                            while (pohVarI.d() >= iD) {
                                                                                if (pohVarI.d() > iD) {
                                                                                    if (pzl.c()) {
                                                                                        mewVar.a(mewVar.b(11));
                                                                                    }
                                                                                    z = false;
                                                                                    break loop2;
                                                                                }
                                                                                if (arrayDeque.isEmpty()) {
                                                                                    if (pzl.c()) {
                                                                                        mewVar.a(mewVar.b(11));
                                                                                    }
                                                                                    z = false;
                                                                                    break loop2;
                                                                                }
                                                                                mdu mduVar7 = (mdu) arrayDeque.pop();
                                                                                i4 = mduVar7.a;
                                                                                num = mduVar7.b;
                                                                                i5 = mduVar7.c;
                                                                                zA2 = mduVar7.d;
                                                                                qzaVarA = mdqVar.b(i4);
                                                                                if (num == null) {
                                                                                    iIntValue = i4;
                                                                                    numValueOf2 = num;
                                                                                    iD2 = i5;
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                numValueOf2 = num;
                                                                                iD2 = i5;
                                                                                iD = num.intValue() + i5;
                                                                                iIntValue = i4;
                                                                            }
                                                                            mdoVar2 = mdoVar;
                                                                            kgwVar2 = kgwVar;
                                                                            kgzVar2 = kgzVar;
                                                                            mesVar2 = mesVar;
                                                                            bArrB = bArr;
                                                                            ojcVarI = ojcVar;
                                                                        }
                                                                    } else {
                                                                        if (i2 != 2) {
                                                                            if (i2 == 3) {
                                                                                i3 = 3;
                                                                                i2 = 3;
                                                                            } else {
                                                                                mdoVar = mdoVar3;
                                                                            }
                                                                            if (numValueOf2 == null) {
                                                                                if (numValueOf2 == null) {
                                                                                    iD = pohVarI.d();
                                                                                } else {
                                                                                    iD = iD2 + numValueOf2.intValue();
                                                                                }
                                                                                while (pohVarI.d() >= iD) {
                                                                                    if (pohVarI.d() > iD) {
                                                                                        if (pzl.c()) {
                                                                                            mewVar.a(mewVar.b(11));
                                                                                        }
                                                                                        z = false;
                                                                                        break loop2;
                                                                                    }
                                                                                    if (arrayDeque.isEmpty()) {
                                                                                        if (pzl.c()) {
                                                                                            mewVar.a(mewVar.b(11));
                                                                                        }
                                                                                        z = false;
                                                                                        break loop2;
                                                                                    }
                                                                                    mdu mduVar8 = (mdu) arrayDeque.pop();
                                                                                    i4 = mduVar8.a;
                                                                                    num = mduVar8.b;
                                                                                    i5 = mduVar8.c;
                                                                                    zA2 = mduVar8.d;
                                                                                    qzaVarA = mdqVar.b(i4);
                                                                                    if (num == null) {
                                                                                        iIntValue = i4;
                                                                                        numValueOf2 = num;
                                                                                        iD2 = i5;
                                                                                        break;
                                                                                        break;
                                                                                    }
                                                                                    numValueOf2 = num;
                                                                                    iD2 = i5;
                                                                                    iD = num.intValue() + i5;
                                                                                    iIntValue = i4;
                                                                                }
                                                                                mdoVar2 = mdoVar;
                                                                                kgwVar2 = kgwVar;
                                                                                kgzVar2 = kgzVar;
                                                                                mesVar2 = mesVar;
                                                                                bArrB = bArr;
                                                                                ojcVarI = ojcVar;
                                                                            } else {
                                                                                if (numValueOf2 == null) {
                                                                                    iD = pohVarI.d();
                                                                                } else {
                                                                                    iD = iD2 + numValueOf2.intValue();
                                                                                }
                                                                                while (pohVarI.d() >= iD) {
                                                                                    if (pohVarI.d() > iD) {
                                                                                        if (pzl.c()) {
                                                                                            mewVar.a(mewVar.b(11));
                                                                                        }
                                                                                        z = false;
                                                                                        break loop2;
                                                                                    }
                                                                                    if (arrayDeque.isEmpty()) {
                                                                                        if (pzl.c()) {
                                                                                            mewVar.a(mewVar.b(11));
                                                                                        }
                                                                                        z = false;
                                                                                        break loop2;
                                                                                    }
                                                                                    mdu mduVar9 = (mdu) arrayDeque.pop();
                                                                                    i4 = mduVar9.a;
                                                                                    num = mduVar9.b;
                                                                                    i5 = mduVar9.c;
                                                                                    zA2 = mduVar9.d;
                                                                                    qzaVarA = mdqVar.b(i4);
                                                                                    if (num == null) {
                                                                                        iIntValue = i4;
                                                                                        numValueOf2 = num;
                                                                                        iD2 = i5;
                                                                                        break;
                                                                                        break;
                                                                                    }
                                                                                    numValueOf2 = num;
                                                                                    iD2 = i5;
                                                                                    iD = num.intValue() + i5;
                                                                                    iIntValue = i4;
                                                                                }
                                                                                mdoVar2 = mdoVar;
                                                                                kgwVar2 = kgwVar;
                                                                                kgzVar2 = kgzVar;
                                                                                mesVar2 = mesVar;
                                                                                bArrB = bArr;
                                                                                ojcVarI = ojcVar;
                                                                            }
                                                                        } else {
                                                                            i3 = i2;
                                                                        }
                                                                        if (mdqVar.d(qywVar.b) || mdt.b(iIntValue, iA3)) {
                                                                            arrayDeque.push(new mdu(iIntValue, numValueOf2, iD2, zA2, iA3));
                                                                            if (mdt.b(iIntValue, iA3)) {
                                                                                if (strX != null && strX.startsWith("type.googleapis.com/")) {
                                                                                    int iC = d.c(strX.substring(20));
                                                                                    try {
                                                                                        LruCache lruCache = mdqVar.a;
                                                                                        Integer numValueOf3 = Integer.valueOf(iC);
                                                                                        Integer numValueOf4 = (Integer) lruCache.get(numValueOf3);
                                                                                        if (numValueOf4 == null) {
                                                                                            if (mdqVar.b == null) {
                                                                                                mdqVar.b = mdqVar.c();
                                                                                            }
                                                                                            pqh pqhVar2 = mdqVar.b.b;
                                                                                            if (!pqhVar2.containsKey(numValueOf3)) {
                                                                                                throw new IllegalArgumentException();
                                                                                            }
                                                                                            numValueOf4 = Integer.valueOf(((Integer) pqhVar2.get(numValueOf3)).intValue());
                                                                                            mdqVar.a.put(numValueOf3, numValueOf4);
                                                                                        }
                                                                                        numValueOf = Integer.valueOf(numValueOf4.intValue());
                                                                                    } catch (IllegalArgumentException e3) {
                                                                                        numValueOf = null;
                                                                                    }
                                                                                } else {
                                                                                    numValueOf = null;
                                                                                }
                                                                                if (numValueOf == null) {
                                                                                    if (pzl.c()) {
                                                                                        poy poyVarB4 = mewVar.b(9);
                                                                                        String strC = oje.c(strX);
                                                                                        if (poyVarB4.c) {
                                                                                            poyVarB4.m();
                                                                                            poyVarB4.c = false;
                                                                                        }
                                                                                        psl pslVar4 = (psl) poyVarB4.b;
                                                                                        psl pslVar5 = psl.m;
                                                                                        pslVar4.a |= 32;
                                                                                        pslVar4.g = strC;
                                                                                        mewVar.a(poyVarB4);
                                                                                    }
                                                                                    z = false;
                                                                                    break;
                                                                                }
                                                                                iIntValue = numValueOf.intValue();
                                                                            } else {
                                                                                iIntValue = qywVar.b;
                                                                            }
                                                                            numValueOf2 = i2 == 3 ? null : Integer.valueOf(pohVarI.j());
                                                                            iD2 = pohVarI.d();
                                                                            qzaVarA = mdqVar.b(iIntValue);
                                                                            boolean z3 = zA2 || mdt.a(mdt.d(qywVar)) || mdt.a(mdt.e(qzaVarA));
                                                                            if (numValueOf2 == null || numValueOf2.intValue() > 0) {
                                                                                if (!mdt.c(mdoVar3, mdt.d(qywVar), mewVar, ojc.i(Integer.valueOf(iA3))) || !mdt.c(mdoVar3, mdt.e(qzaVarA), mewVar, oih.a)) {
                                                                                    z = false;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            zA2 = z3;
                                                                            mdoVar = mdoVar3;
                                                                            strX = null;
                                                                            if (numValueOf2 == null) {
                                                                                if (numValueOf2 == null) {
                                                                                    iD = pohVarI.d();
                                                                                } else {
                                                                                    iD = iD2 + numValueOf2.intValue();
                                                                                }
                                                                                while (pohVarI.d() >= iD) {
                                                                                    if (pohVarI.d() > iD) {
                                                                                        if (pzl.c()) {
                                                                                            mewVar.a(mewVar.b(11));
                                                                                        }
                                                                                        z = false;
                                                                                        break loop2;
                                                                                    }
                                                                                    if (arrayDeque.isEmpty()) {
                                                                                        if (pzl.c()) {
                                                                                            mewVar.a(mewVar.b(11));
                                                                                        }
                                                                                        z = false;
                                                                                        break loop2;
                                                                                    }
                                                                                    mdu mduVar10 = (mdu) arrayDeque.pop();
                                                                                    i4 = mduVar10.a;
                                                                                    num = mduVar10.b;
                                                                                    i5 = mduVar10.c;
                                                                                    zA2 = mduVar10.d;
                                                                                    qzaVarA = mdqVar.b(i4);
                                                                                    if (num == null) {
                                                                                        iIntValue = i4;
                                                                                        numValueOf2 = num;
                                                                                        iD2 = i5;
                                                                                        break;
                                                                                        break;
                                                                                    }
                                                                                    numValueOf2 = num;
                                                                                    iD2 = i5;
                                                                                    iD = num.intValue() + i5;
                                                                                    iIntValue = i4;
                                                                                }
                                                                                mdoVar2 = mdoVar;
                                                                                kgwVar2 = kgwVar;
                                                                                kgzVar2 = kgzVar;
                                                                                mesVar2 = mesVar;
                                                                                bArrB = bArr;
                                                                                ojcVarI = ojcVar;
                                                                            } else {
                                                                                if (numValueOf2 == null) {
                                                                                    iD = pohVarI.d();
                                                                                } else {
                                                                                    iD = iD2 + numValueOf2.intValue();
                                                                                }
                                                                                while (pohVarI.d() >= iD) {
                                                                                    if (pohVarI.d() > iD) {
                                                                                        if (pzl.c()) {
                                                                                            mewVar.a(mewVar.b(11));
                                                                                        }
                                                                                        z = false;
                                                                                        break loop2;
                                                                                    }
                                                                                    if (arrayDeque.isEmpty()) {
                                                                                        if (pzl.c()) {
                                                                                            mewVar.a(mewVar.b(11));
                                                                                        }
                                                                                        z = false;
                                                                                        break loop2;
                                                                                    }
                                                                                    mdu mduVar11 = (mdu) arrayDeque.pop();
                                                                                    i4 = mduVar11.a;
                                                                                    num = mduVar11.b;
                                                                                    i5 = mduVar11.c;
                                                                                    zA2 = mduVar11.d;
                                                                                    qzaVarA = mdqVar.b(i4);
                                                                                    if (num == null) {
                                                                                        iIntValue = i4;
                                                                                        numValueOf2 = num;
                                                                                        iD2 = i5;
                                                                                        break;
                                                                                        break;
                                                                                    }
                                                                                    numValueOf2 = num;
                                                                                    iD2 = i5;
                                                                                    iD = num.intValue() + i5;
                                                                                    iIntValue = i4;
                                                                                }
                                                                                mdoVar2 = mdoVar;
                                                                                kgwVar2 = kgwVar;
                                                                                kgzVar2 = kgzVar;
                                                                                mesVar2 = mesVar;
                                                                                bArrB = bArr;
                                                                                ojcVarI = ojcVar;
                                                                            }
                                                                        } else {
                                                                            try {
                                                                                if (!mdt.c(mdoVar3, mdt.d(qywVar), mewVar, ojc.i(Integer.valueOf(iA3)))) {
                                                                                    z = false;
                                                                                    break;
                                                                                }
                                                                                pohVarI.E(iM);
                                                                                i2 = i3;
                                                                                mdoVar = mdoVar3;
                                                                                if (numValueOf2 == null) {
                                                                                    if (numValueOf2 == null) {
                                                                                        iD = pohVarI.d();
                                                                                    } else {
                                                                                        iD = iD2 + numValueOf2.intValue();
                                                                                    }
                                                                                    while (pohVarI.d() >= iD) {
                                                                                        if (pohVarI.d() > iD) {
                                                                                            if (pzl.c()) {
                                                                                                mewVar.a(mewVar.b(11));
                                                                                            }
                                                                                            z = false;
                                                                                            break loop2;
                                                                                        }
                                                                                        if (arrayDeque.isEmpty()) {
                                                                                            if (pzl.c()) {
                                                                                                mewVar.a(mewVar.b(11));
                                                                                            }
                                                                                            z = false;
                                                                                            break loop2;
                                                                                        }
                                                                                        mdu mduVar12 = (mdu) arrayDeque.pop();
                                                                                        i4 = mduVar12.a;
                                                                                        num = mduVar12.b;
                                                                                        i5 = mduVar12.c;
                                                                                        zA2 = mduVar12.d;
                                                                                        qzaVarA = mdqVar.b(i4);
                                                                                        if (num == null) {
                                                                                            iIntValue = i4;
                                                                                            numValueOf2 = num;
                                                                                            iD2 = i5;
                                                                                            break;
                                                                                            break;
                                                                                        }
                                                                                        numValueOf2 = num;
                                                                                        iD2 = i5;
                                                                                        iD = num.intValue() + i5;
                                                                                        iIntValue = i4;
                                                                                    }
                                                                                    mdoVar2 = mdoVar;
                                                                                    kgwVar2 = kgwVar;
                                                                                    kgzVar2 = kgzVar;
                                                                                    mesVar2 = mesVar;
                                                                                    bArrB = bArr;
                                                                                    ojcVarI = ojcVar;
                                                                                } else {
                                                                                    if (numValueOf2 == null) {
                                                                                        iD = pohVarI.d();
                                                                                    } else {
                                                                                        iD = iD2 + numValueOf2.intValue();
                                                                                    }
                                                                                    while (pohVarI.d() >= iD) {
                                                                                        if (pohVarI.d() > iD) {
                                                                                            if (pzl.c()) {
                                                                                                mewVar.a(mewVar.b(11));
                                                                                            }
                                                                                            z = false;
                                                                                            break loop2;
                                                                                        }
                                                                                        if (arrayDeque.isEmpty()) {
                                                                                            if (pzl.c()) {
                                                                                                mewVar.a(mewVar.b(11));
                                                                                            }
                                                                                            z = false;
                                                                                            break loop2;
                                                                                        }
                                                                                        mdu mduVar13 = (mdu) arrayDeque.pop();
                                                                                        i4 = mduVar13.a;
                                                                                        num = mduVar13.b;
                                                                                        i5 = mduVar13.c;
                                                                                        zA2 = mduVar13.d;
                                                                                        qzaVarA = mdqVar.b(i4);
                                                                                        if (num == null) {
                                                                                            iIntValue = i4;
                                                                                            numValueOf2 = num;
                                                                                            iD2 = i5;
                                                                                            break;
                                                                                            break;
                                                                                        }
                                                                                        numValueOf2 = num;
                                                                                        iD2 = i5;
                                                                                        iD = num.intValue() + i5;
                                                                                        iIntValue = i4;
                                                                                    }
                                                                                    mdoVar2 = mdoVar;
                                                                                    kgwVar2 = kgwVar;
                                                                                    kgzVar2 = kgzVar;
                                                                                    mesVar2 = mesVar;
                                                                                    bArrB = bArr;
                                                                                    ojcVarI = ojcVar;
                                                                                }
                                                                            } catch (IOException e4) {
                                                                                mdoVar = mdoVar3;
                                                                                if (pzl.c()) {
                                                                                    poyVarM = psl.m.m();
                                                                                    String packageName2 = mdoVar.a.getPackageName();
                                                                                    if (poyVarM.c) {
                                                                                        poyVarM.m();
                                                                                        poyVarM.c = false;
                                                                                    }
                                                                                    psl pslVar6 = (psl) poyVarM.b;
                                                                                    packageName2.getClass();
                                                                                    pslVar6.a |= 1;
                                                                                    pslVar6.b = packageName2;
                                                                                    int iA5 = mdt.c.a(mdoVar.a);
                                                                                    if (poyVarM.c) {
                                                                                        poyVarM.m();
                                                                                        poyVarM.c = false;
                                                                                    }
                                                                                    psl pslVar7 = (psl) poyVarM.b;
                                                                                    pslVar7.a |= 2;
                                                                                    pslVar7.c = iA5;
                                                                                    long jA2 = mdvVar.a();
                                                                                    if (poyVarM.c) {
                                                                                        poyVarM.m();
                                                                                        poyVarM.c = false;
                                                                                    }
                                                                                    psl pslVar8 = (psl) poyVarM.b;
                                                                                    int i9 = pslVar8.a | 4;
                                                                                    pslVar8.a = i9;
                                                                                    pslVar8.d = jA2;
                                                                                    int i10 = 8 | i9;
                                                                                    pslVar8.a = i10;
                                                                                    pslVar8.e = -2032180703L;
                                                                                    int length2 = bArr.length;
                                                                                    pslVar8.a = i10 | 16;
                                                                                    pslVar8.f = length2;
                                                                                    pslVar8.h = plk.ap(5);
                                                                                    pslVar8.a |= 64;
                                                                                    ((met) ((ojj) ojcVar).a).a((psl) poyVarM.j());
                                                                                    z = false;
                                                                                } else {
                                                                                    z = false;
                                                                                }
                                                                                if (!pzl.a.a().f()) {
                                                                                    khaVar = this;
                                                                                } else {
                                                                                    khaVar = this;
                                                                                }
                                                                                khe kheVar = (khe) khcVar.u();
                                                                                Parcel parcelA = kheVar.a();
                                                                                bmp.e(parcelA, kgzVar);
                                                                                bmp.c(parcelA, kgwVar);
                                                                                kheVar.A(1, parcelA);
                                                                                return;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } catch (IOException e5) {
                                                                mdoVar = mdoVar3;
                                                            }
                                                        } catch (IOException e6) {
                                                            ojcVar = ojcVarI;
                                                            mdoVar = mdoVar2;
                                                            bArr = bArrB;
                                                            if (pzl.c()) {
                                                                poyVarM = psl.m.m();
                                                                String packageName3 = mdoVar.a.getPackageName();
                                                                if (poyVarM.c) {
                                                                    poyVarM.m();
                                                                    poyVarM.c = false;
                                                                }
                                                                psl pslVar9 = (psl) poyVarM.b;
                                                                packageName3.getClass();
                                                                pslVar9.a |= 1;
                                                                pslVar9.b = packageName3;
                                                                int iA6 = mdt.c.a(mdoVar.a);
                                                                if (poyVarM.c) {
                                                                    poyVarM.m();
                                                                    poyVarM.c = false;
                                                                }
                                                                psl pslVar10 = (psl) poyVarM.b;
                                                                pslVar10.a |= 2;
                                                                pslVar10.c = iA6;
                                                                long jA3 = mdvVar.a();
                                                                if (poyVarM.c) {
                                                                    poyVarM.m();
                                                                    poyVarM.c = false;
                                                                }
                                                                psl pslVar11 = (psl) poyVarM.b;
                                                                int i11 = pslVar11.a | 4;
                                                                pslVar11.a = i11;
                                                                pslVar11.d = jA3;
                                                                int i12 = 8 | i11;
                                                                pslVar11.a = i12;
                                                                pslVar11.e = -2032180703L;
                                                                int length3 = bArr.length;
                                                                pslVar11.a = i12 | 16;
                                                                pslVar11.f = length3;
                                                                pslVar11.h = plk.ap(5);
                                                                pslVar11.a |= 64;
                                                                ((met) ((ojj) ojcVar).a).a((psl) poyVarM.j());
                                                                z = false;
                                                            } else {
                                                                z = false;
                                                            }
                                                            if (!pzl.a.a().f()) {
                                                                khaVar = this;
                                                            } else {
                                                                khaVar = this;
                                                            }
                                                            khe kheVar2 = (khe) khcVar.u();
                                                            Parcel parcelA2 = kheVar2.a();
                                                            bmp.e(parcelA2, kgzVar);
                                                            bmp.c(parcelA2, kgwVar);
                                                            kheVar2.A(1, parcelA2);
                                                            return;
                                                        }
                                                    } catch (IOException e7) {
                                                        ojcVar = ojcVarI;
                                                        mesVar = mesVar2;
                                                        mdoVar = mdoVar2;
                                                        bArr = bArrB;
                                                        if (pzl.c()) {
                                                            poyVarM = psl.m.m();
                                                            String packageName4 = mdoVar.a.getPackageName();
                                                            if (poyVarM.c) {
                                                                poyVarM.m();
                                                                poyVarM.c = false;
                                                            }
                                                            psl pslVar12 = (psl) poyVarM.b;
                                                            packageName4.getClass();
                                                            pslVar12.a |= 1;
                                                            pslVar12.b = packageName4;
                                                            int iA7 = mdt.c.a(mdoVar.a);
                                                            if (poyVarM.c) {
                                                                poyVarM.m();
                                                                poyVarM.c = false;
                                                            }
                                                            psl pslVar13 = (psl) poyVarM.b;
                                                            pslVar13.a |= 2;
                                                            pslVar13.c = iA7;
                                                            long jA4 = mdvVar.a();
                                                            if (poyVarM.c) {
                                                                poyVarM.m();
                                                                poyVarM.c = false;
                                                            }
                                                            psl pslVar14 = (psl) poyVarM.b;
                                                            int i13 = pslVar14.a | 4;
                                                            pslVar14.a = i13;
                                                            pslVar14.d = jA4;
                                                            int i14 = 8 | i13;
                                                            pslVar14.a = i14;
                                                            pslVar14.e = -2032180703L;
                                                            int length4 = bArr.length;
                                                            pslVar14.a = i14 | 16;
                                                            pslVar14.f = length4;
                                                            pslVar14.h = plk.ap(5);
                                                            pslVar14.a |= 64;
                                                            ((met) ((ojj) ojcVar).a).a((psl) poyVarM.j());
                                                            z = false;
                                                        } else {
                                                            z = false;
                                                        }
                                                        if (!pzl.a.a().f()) {
                                                            khaVar = this;
                                                        } else {
                                                            khaVar = this;
                                                        }
                                                        khe kheVar3 = (khe) khcVar.u();
                                                        Parcel parcelA3 = kheVar3.a();
                                                        bmp.e(parcelA3, kgzVar);
                                                        bmp.c(parcelA3, kgwVar);
                                                        kheVar3.A(1, parcelA3);
                                                        return;
                                                    }
                                                } catch (IOException e8) {
                                                    kgzVar = kgzVar2;
                                                }
                                            } catch (IOException e9) {
                                                kgzVar = kgzVar2;
                                                ojcVar = ojcVarI;
                                                kgwVar = kgwVar2;
                                                mesVar = mesVar2;
                                                mdoVar = mdoVar2;
                                                bArr = bArrB;
                                                if (pzl.c()) {
                                                    poyVarM = psl.m.m();
                                                    String packageName5 = mdoVar.a.getPackageName();
                                                    if (poyVarM.c) {
                                                        poyVarM.m();
                                                        poyVarM.c = false;
                                                    }
                                                    psl pslVar15 = (psl) poyVarM.b;
                                                    packageName5.getClass();
                                                    pslVar15.a |= 1;
                                                    pslVar15.b = packageName5;
                                                    int iA8 = mdt.c.a(mdoVar.a);
                                                    if (poyVarM.c) {
                                                        poyVarM.m();
                                                        poyVarM.c = false;
                                                    }
                                                    psl pslVar16 = (psl) poyVarM.b;
                                                    pslVar16.a |= 2;
                                                    pslVar16.c = iA8;
                                                    long jA5 = mdvVar.a();
                                                    if (poyVarM.c) {
                                                        poyVarM.m();
                                                        poyVarM.c = false;
                                                    }
                                                    psl pslVar17 = (psl) poyVarM.b;
                                                    int i15 = pslVar17.a | 4;
                                                    pslVar17.a = i15;
                                                    pslVar17.d = jA5;
                                                    int i16 = 8 | i15;
                                                    pslVar17.a = i16;
                                                    pslVar17.e = -2032180703L;
                                                    int length5 = bArr.length;
                                                    pslVar17.a = i16 | 16;
                                                    pslVar17.f = length5;
                                                    pslVar17.h = plk.ap(5);
                                                    pslVar17.a |= 64;
                                                    ((met) ((ojj) ojcVar).a).a((psl) poyVarM.j());
                                                    z = false;
                                                } else {
                                                    z = false;
                                                }
                                                if (!pzl.a.a().f()) {
                                                    khaVar = this;
                                                } else {
                                                    khaVar = this;
                                                }
                                                khe kheVar4 = (khe) khcVar.u();
                                                Parcel parcelA4 = kheVar4.a();
                                                bmp.e(parcelA4, kgzVar);
                                                bmp.c(parcelA4, kgwVar);
                                                kheVar4.A(1, parcelA4);
                                                return;
                                            }
                                        }
                                    } else {
                                        kgzVar = kgzVar2;
                                        kgpVar2 = kgpVar;
                                        kgwVar = kgwVar2;
                                        mesVar = mesVar2;
                                        z = false;
                                    }
                                } catch (IOException e10) {
                                    kgzVar = kgzVar2;
                                    ojcVar = ojcVarI;
                                    kgpVar2 = kgpVar;
                                }
                            } else {
                                kgzVar = kgzVar2;
                                kgpVar2 = kgpVar;
                                kgwVar = kgwVar2;
                                mesVar = mesVar2;
                                z = true;
                            }
                            if (!pzl.a.a().f() && !z) {
                                f(new Status(10, mesVar.toString()));
                                return;
                            }
                            khaVar = this;
                        } else {
                            kgzVar = kgzVar2;
                            kgpVar2 = kgpVar;
                            kgwVar = kgwVar2;
                        }
                        try {
                            khe kheVar5 = (khe) khcVar.u();
                            Parcel parcelA5 = kheVar5.a();
                            bmp.e(parcelA5, kgzVar);
                            bmp.c(parcelA5, kgwVar);
                            kheVar5.A(1, parcelA5);
                            return;
                        } catch (TransactionTooLargeException e11) {
                            Log.e("ClearcutLoggerApiImpl", "Log event caused a TransactionTooLargeException", e11);
                            kgv kgvVar = new kgv(kgpVar2.g, 31004, 1);
                            khb khbVar = khaVar.a;
                            final kgl kglVar = new kgl(Arrays.asList(kgvVar));
                            kli kliVarA2 = klj.a();
                            kliVarA2.a = new klb() { // from class: kgx
                                @Override // defpackage.klb
                                public final void a(Object obj, Object obj2) {
                                    kgl kglVar2 = kglVar;
                                    kgy kgyVar = new kgy((kvm) obj2);
                                    khe kheVar6 = (khe) ((khc) obj).u();
                                    Parcel parcelA6 = kheVar6.a();
                                    bmp.e(parcelA6, kgyVar);
                                    bmp.c(parcelA6, kglVar2);
                                    kheVar6.A(8, parcelA6);
                                }
                            };
                            kliVarA2.b = new khk[]{kgu.a};
                            kliVarA2.b();
                            khbVar.m(kliVarA2.a());
                            return;
                        }
                    } catch (RuntimeException e12) {
                        Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.MessageProducer ", e12);
                        khaVar.f(new Status(10, "MessageProducer"));
                        return;
                    }
                }
                pyl pylVar2 = (pyl) it3.next();
                String str3 = pylVar2.c;
                Context context4 = ((khf) kgqVar).f;
                if (mez.b(context4)) {
                    jLongValue = 0;
                } else if (khf.e != null) {
                    jLongValue = khf.e.longValue();
                } else if (context4 != null) {
                    if (khf.d == null) {
                        khf.d = Boolean.valueOf(koe.b(context4).e("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
                    }
                    if (khf.d.booleanValue()) {
                        ContentResolver contentResolver = context4.getContentResolver();
                        Object objC = kzv.c(contentResolver);
                        Long lValueOf2 = (Long) kzv.b(kzv.i, "android_id", 0L);
                        if (lValueOf2 != null) {
                            jLongValue2 = lValueOf2.longValue();
                        } else {
                            String strF = kzv.f(contentResolver, "android_id");
                            if (strF == null) {
                                jLongValue2 = 0;
                            } else {
                                try {
                                    jLongValue2 = Long.parseLong(strF);
                                    lValueOf2 = Long.valueOf(jLongValue2);
                                } catch (NumberFormatException e13) {
                                    jLongValue2 = 0;
                                }
                            }
                            kzv.e(objC, kzv.i, "android_id", lValueOf2);
                        }
                        khf.e = Long.valueOf(jLongValue2);
                    } else {
                        khf.e = 0L;
                    }
                    jLongValue = khf.e.longValue();
                } else {
                    jLongValue = 0;
                }
                if (str3 == null || str3.isEmpty()) {
                    jDG = mip.dG(ByteBuffer.allocate(8).putLong(jLongValue).array());
                } else {
                    byte[] bytes = str3.getBytes(khf.a);
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bytes.length + 8);
                    byteBufferAllocate.put(bytes);
                    byteBufferAllocate.putLong(jLongValue);
                    jDG = mip.dG(byteBufferAllocate.array());
                }
                long j2 = pylVar2.d;
                long j3 = pylVar2.e;
                if (j2 >= 0 && j3 > 0) {
                    if ((jDG >= 0 ? jDG % j3 : (((Long.MAX_VALUE % j3) + 1) + ((jDG & Long.MAX_VALUE) % j3)) % j3) >= j2) {
                        khaVar.j(Status.a);
                        return;
                    }
                }
            }
        } catch (RuntimeException e14) {
            Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.EventModifier ", e14);
            khaVar.f(new Status(10, "EventModifier"));
        }
    }
}
