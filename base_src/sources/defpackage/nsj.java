package defpackage;

import com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250Worker;

/* JADX INFO: loaded from: classes2.dex */
@qlw(b = "com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250Worker$uploadAllValidResources$2", c = "F250Worker.kt", d = "invokeSuspend", e = {161, 162})
public final class nsj extends qmb implements qmy {
    int a;
    final /* synthetic */ F250Worker b;
    final /* synthetic */ nrl c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nsj(F250Worker f250Worker, nrl nrlVar, qlh qlhVar) {
        super(2, qlhVar);
        this.b = f250Worker;
        this.c = nrlVar;
    }

    @Override // defpackage.qls
    public final qlh create(Object obj, qlh qlhVar) {
        nsj nsjVar = new nsj(this.b, this.c, qlhVar);
        nsjVar.d = obj;
        return nsjVar;
    }

    @Override // defpackage.qmy
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((nsj) create((qts) obj, (qlh) obj2)).invokeSuspend(qks.a);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    /* JADX WARN: Code duplicated, block: B:9:0x003e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0052 -> B:7:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.qls
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            qlp r0 = defpackage.qlp.COROUTINE_SUSPENDED
            int r1 = r8.a
            switch(r1) {
                case 0: goto L1b;
                case 1: goto L10;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r8.d
            qts r1 = (defpackage.qts) r1
            defpackage.qmd.M(r9)
            r9 = r8
            goto L25
        L10:
            java.lang.Object r1 = r8.d
            qts r1 = (defpackage.qts) r1
            defpackage.qmd.M(r9)
            r2 = r1
            r1 = r0
            r0 = r8
            goto L43
        L1b:
            defpackage.qmd.M(r9)
            java.lang.Object r9 = r8.d
            qts r9 = (defpackage.qts) r9
            r1 = r9
            r9 = r8
            goto L25
        L25:
            com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250Worker r2 = r9.b
            nou r2 = r2.h
            nrl r3 = r9.c
            r9.d = r1
            r4 = 1
            r9.a = r4
            nrm r4 = r2.b
            nos r5 = new nos
            r6 = 0
            r5.<init>(r2, r6)
            java.lang.Object r2 = defpackage.ohh.ae(r4, r3, r5, r9)
            if (r2 == r0) goto L5a
            r7 = r0
            r0 = r9
            r9 = r2
            r2 = r1
            r1 = r7
        L43:
            nqi r9 = (defpackage.nqi) r9
            if (r9 == 0) goto L57
            r0.d = r2
            r3 = 2
            r0.a = r3
            java.lang.Object r9 = r2.emit(r9, r0)
            if (r9 == r1) goto L56
            r9 = r0
            r0 = r1
            r1 = r2
            goto L25
        L56:
            return r1
        L57:
            qks r9 = defpackage.qks.a
            return r9
        L5a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nsj.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
