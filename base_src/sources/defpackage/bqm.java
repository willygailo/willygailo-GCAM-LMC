package defpackage;

import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class bqm {
    public final lvx a;
    public final Object b = new Object();
    public pih c;
    private final dkl d;
    private final Executor e;

    public bqm(dkl dklVar, lvx lvxVar, Executor executor) {
        this.d = dklVar;
        this.a = lvxVar;
        this.e = executor;
    }

    public final pht a() {
        boolean z;
        pih pihVar;
        synchronized (this.b) {
            if (this.c == null) {
                this.c = pih.f();
                z = true;
            } else {
                z = false;
            }
            pihVar = this.c;
        }
        if (z) {
            final pht phtVarB = this.d.b();
            plk.P(phtVarB).c(new Runnable() { // from class: bqk
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v10 */
                /* JADX WARN: Type inference failed for: r1v11 */
                /* JADX WARN: Type inference failed for: r1v3, types: [dkk] */
                /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r1v5 */
                /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
                /* JADX WARN: Type inference failed for: r1v7 */
                /* JADX WARN: Type inference failed for: r1v8 */
                /* JADX WARN: Type inference failed for: r1v9 */
                /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, pih] */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // java.lang.Runnable
                public final void run() {
                    ?? r3;
                    bqm bqmVar = this.a;
                    try {
                        ?? dkkVar = (dkk) phtVarB.get();
                        if (dkkVar.a) {
                            dkkVar = 0;
                            try {
                                bqmVar.a.a();
                                List listB = bqmVar.a.b();
                                if (listB.isEmpty()) {
                                    dkkVar = new dkk(true);
                                } else {
                                    List list = (List) Collection.EL.stream(listB).map(cgw.b).filter(bql.b).collect(Collectors.toList());
                                    if (list.isEmpty()) {
                                        dkkVar = new dkk(true);
                                    } else {
                                        dkk dkkVar2 = new dkk(false);
                                        dkkVar2.b = (lju) list.get(0);
                                        dkkVar = dkkVar2;
                                    }
                                }
                            } catch (lvv | lvy | lvz e) {
                                lju ljuVarA = lju.CAMERA_ERROR_CODE_UNKNOWN;
                                if (e instanceof lvz) {
                                    ljuVarA = lju.CAMERAS_NOT_ENUMERATED;
                                }
                                if (e instanceof lvv) {
                                    List list2 = ((lvv) e).a;
                                    if (list2 != null && Collection.EL.stream(list2).anyMatch(bql.a)) {
                                        ljuVarA = lju.CAMERAS_NOT_ENUMERATED;
                                    }
                                } else if (e instanceof lvy) {
                                    ljuVarA = lju.a(((lvy) e).a);
                                }
                                dkk dkkVar3 = new dkk(dkkVar);
                                dkkVar3.b = ljuVarA;
                                dkkVar3.c = e;
                                dkkVar = dkkVar3;
                            }
                        }
                        synchronized (bqmVar.b) {
                            r3 = bqmVar.c;
                            bqmVar.c = null;
                        }
                        r3.getClass();
                        r3.o(dkkVar);
                    } catch (InterruptedException | ExecutionException e2) {
                        throw new okf(e2);
                    }
                }
            }, this.e);
        }
        return pihVar;
    }
}
