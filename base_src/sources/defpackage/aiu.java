package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class aiu implements qbo {
    final /* synthetic */ String[] a;
    final /* synthetic */ aii b;

    public aiu(String[] strArr, aii aiiVar) {
        this.a = strArr;
        this.b = aiiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qbo
    public final void a(qbn qbnVar) {
        aie aieVar;
        boolean z;
        aid aidVar = new aid(this.a, qbnVar);
        aif aifVar = this.b.d;
        String[] strArr = aidVar.a;
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (aifVar.c.containsKey(lowerCase)) {
                hashSet.addAll((Collection) aifVar.c.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        String[] strArr2 = (String[]) hashSet.toArray(new String[hashSet.size()]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Integer num = (Integer) aifVar.a.get(strArr2[i].toLowerCase(Locale.US));
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + strArr2[i]);
            }
            iArr[i] = num.intValue();
        }
        aie aieVar2 = new aie(aidVar, iArr, strArr2);
        synchronized (aifVar.h) {
            aieVar = (aie) aifVar.h.f(aidVar, aieVar2);
        }
        if (aieVar == null) {
            aic aicVar = aifVar.g;
            synchronized (aicVar) {
                z = false;
                for (int i2 = 0; i2 < length; i2++) {
                    int i3 = iArr[i2];
                    long[] jArr = aicVar.a;
                    long j = jArr[i3];
                    jArr[i3] = 1 + j;
                    if (j == 0) {
                        aicVar.d = true;
                        z = true;
                    }
                }
            }
            if (z) {
                aifVar.a();
            }
        }
        qcr.i((AtomicReference) qbnVar, new qbx(new ait(this, aidVar)));
        qbnVar.c(aiw.a);
    }
}
