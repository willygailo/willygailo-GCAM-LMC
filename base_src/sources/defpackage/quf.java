package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class quf implements qts {
    final /* synthetic */ qrg a;
    final /* synthetic */ qwm b;
    final /* synthetic */ qur c;
    final /* synthetic */ qte d;

    public quf(qrg qrgVar, qwm qwmVar, qte qteVar, qur qurVar) {
        this.a = qrgVar;
        this.b = qwmVar;
        this.d = qteVar;
        this.c = qurVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [qux] */
    /* JADX WARN: Type inference failed for: r12v2, types: [qvr] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [qtr] */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // defpackage.qts
    public final Object emit(Object obj, qlh qlhVar) {
        que queVar;
        ?? r12;
        qtr qtrVar;
        Object obj2;
        Object obj3;
        ?? r3;
        if (qlhVar instanceof que) {
            queVar = (que) qlhVar;
            int i = queVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                queVar.b = i - Integer.MIN_VALUE;
            } else {
                queVar = new que(this, qlhVar);
            }
        } else {
            queVar = new que(this, qlhVar);
        }
        Object obj4 = queVar.a;
        qlp qlpVar = qlp.COROUTINE_SUSPENDED;
        switch (queVar.b) {
            case 0:
                qmd.M(obj4);
                qtr qtrVar2 = (qtr) obj;
                qrg qrgVar = this.a;
                if (qrgVar != null) {
                    qnt.o(qrgVar);
                }
                qwm qwmVar = this.b;
                queVar.d = this;
                queVar.e = qtrVar2;
                queVar.b = 1;
                qwo qwoVar = (qwo) qwmVar;
                if (qwoVar.c.b() > 0) {
                    obj2 = qks.a;
                    qtrVar = qtrVar2;
                } else {
                    qpo qpoVarJ = qmd.j(qmd.c(queVar));
                    while (true) {
                        qux quxVar = (qux) qwoVar.a.a;
                        long jB = qwoVar.b.b();
                        qpe qpeVar = qwoVar.a;
                        long j = jB / ((long) qwp.f);
                        while (true) {
                            r12 = quxVar;
                            while (true) {
                                if (r12.b < j || r12.g()) {
                                    Object objA = r12.a();
                                    if (objA == quw.a) {
                                        r12 = quw.a;
                                    } else {
                                        qtrVar2 = qtrVar2;
                                        quxVar = quxVar;
                                        qux quxVar2 = (qux) objA;
                                        if (quxVar2 != null) {
                                            r12 = quxVar2;
                                        } else {
                                            qux quxVarA = qwp.a(r12.b + 1, r12);
                                            if (r12.e(quxVarA)) {
                                                if (r12.g()) {
                                                    r12.c();
                                                }
                                                r12 = quxVarA;
                                            }
                                        }
                                    }
                                }
                            }
                            if (qvp.a(r12)) {
                                qtrVar = qtrVar2;
                            } else {
                                qux quxVarB = qvp.b(r12);
                                while (true) {
                                    qux quxVar3 = (qux) qpeVar.a;
                                    qux quxVar4 = quxVar;
                                    qtrVar = qtrVar2;
                                    if (quxVar3.b < quxVarB.b) {
                                        if (!quxVarB.h()) {
                                            quxVar = quxVar4;
                                            qtrVar2 = qtrVar;
                                        } else if (!qpeVar.c(quxVar3, quxVarB)) {
                                            if (quxVarB.f()) {
                                                quxVarB.c();
                                            }
                                            quxVar = quxVar4;
                                            qtrVar2 = qtrVar;
                                        } else if (quxVar3.f()) {
                                            quxVar3.c();
                                        }
                                    }
                                }
                            }
                        }
                        qux quxVarB2 = qvp.b(r12);
                        int i2 = (int) (jB % ((long) qwp.f));
                        if (quxVarB2.d.a(i2).c(null, qpoVarJ)) {
                            qpoVarJ.a(new qwl(quxVarB2, i2));
                        } else {
                            if (quxVarB2.d.a(i2).c(qwp.b, qwp.c)) {
                                qpoVarJ.b(qks.a, qwoVar.d);
                            } else {
                                boolean z = qql.a;
                                if (qwoVar.c.b() > 0) {
                                    qpoVarJ.b(qks.a, qwoVar.d);
                                } else {
                                    qtrVar2 = qtrVar;
                                }
                            }
                        }
                    }
                    Object objG = qpoVarJ.g();
                    if (objG != qlp.COROUTINE_SUSPENDED) {
                        objG = qks.a;
                    }
                    obj2 = objG;
                    if (obj2 != qlp.COROUTINE_SUSPENDED) {
                        obj2 = qks.a;
                    }
                }
                if (obj2 == qlpVar) {
                    return qlpVar;
                }
                obj3 = this;
                r3 = qtrVar;
                break;
                break;
            case 1:
                Object obj5 = queVar.e;
                obj3 = queVar.d;
                qmd.M(obj4);
                r3 = obj5;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        quf qufVar = (quf) obj3;
        qmd.l(qufVar.d, null, new qug(r3, qufVar.c, qufVar.b, null), 3);
        return qks.a;
    }
}
