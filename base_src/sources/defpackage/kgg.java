package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* JADX INFO: loaded from: classes2.dex */
public final class kgg extends bmo implements IInterface {
    private final Context a;

    public kgg() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    public kgg(Context context) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
        this.a = context;
    }

    private final void b() {
        if (mip.cl(this.a, Binder.getCallingUid())) {
            return;
        }
        int callingUid = Binder.getCallingUid();
        StringBuilder sb = new StringBuilder(52);
        sb.append("Calling UID ");
        sb.append(callingUid);
        sb.append(" is not Google Play services.");
        throw new SecurityException(sb.toString());
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
    @Override // defpackage.bmo
    protected final boolean x(int i, Parcel parcel, Parcel parcel2) {
        kip kipVarA;
        switch (i) {
            case 1:
                b();
                kgk kgkVarC = kgk.c(this.a);
                GoogleSignInAccount googleSignInAccountA = kgkVarC.a();
                GoogleSignInOptions googleSignInOptionsB = GoogleSignInOptions.f;
                if (googleSignInAccountA != null) {
                    googleSignInOptionsB = kgkVarC.b();
                }
                kfq kfqVarDH = mip.dH(this.a, googleSignInOptionsB);
                if (googleSignInAccountA == null) {
                    kfqVarDH.a();
                    return true;
                }
                kim kimVar = kfqVarDH.j;
                Context context = kfqVarDH.c;
                int iB = kfqVarDH.b();
                kgd.a.b("Revoking access");
                String strD = kgk.c(context).d("refreshToken");
                kgd.a(context);
                if (iB == 3) {
                    kipVarA = kft.a(strD);
                } else {
                    kgb kgbVar = new kgb(kimVar);
                    kimVar.c(kgbVar);
                    kipVarA = kgbVar;
                }
                mip.dw(kipVarA);
                return true;
            case 2:
                b();
                kgf.c(this.a).d();
                return true;
            default:
                return false;
        }
    }
}
