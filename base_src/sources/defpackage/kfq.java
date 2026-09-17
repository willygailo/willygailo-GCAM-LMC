package defpackage;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public final class kfq extends kij {
    public static final kng b = new kng(1);
    static int a = 1;

    public kfq(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, kfp.a, googleSignInOptions, new mip(), null, null, null, null);
    }

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
    public final kvk a() {
        kip kipVar;
        kim kimVar = this.j;
        Context context = this.c;
        int iB = b();
        kgd.a.b("Signing out");
        kgd.a(context);
        if (iB == 3) {
            Status status = Status.a;
            klf klfVar = new klf(kimVar);
            klfVar.j(status);
            kipVar = klfVar;
        } else {
            kfz kfzVar = new kfz(kimVar);
            kimVar.c(kfzVar);
            kipVar = kfzVar;
        }
        return mip.dw(kipVar);
    }

    public final synchronized int b() {
        if (a == 1) {
            Context context = this.c;
            khm khmVar = khm.a;
            int iF = khmVar.f(context, 12451000);
            if (iF == 0) {
                a = 4;
            } else if (khmVar.g(context, iF, null) != null || kor.a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                a = 2;
            } else {
                a = 3;
            }
        }
        return a;
    }
}
