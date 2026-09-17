package defpackage;

import com.google.android.libraries.oliveoil.gl.EGLImage;

/* JADX INFO: loaded from: classes2.dex */
public final class mqg extends mpo {
    private mqg(mpi mpiVar, mnb mnbVar) {
        super(mpiVar, mnbVar);
    }

    public static mqg b(mpi mpiVar, final EGLImage eGLImage) {
        mme mmeVarB = eGLImage.b();
        final mqg mqgVar = new mqg(mpiVar, mpo.d(mpiVar, new mqf(mpiVar, new mor(mmeVarB), mmeVarB)));
        mqgVar.e(new mqj() { // from class: moy
            @Override // defpackage.mqj
            public final String a() {
                String strValueOf = String.valueOf(this.a.g());
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 22);
                sb.append("attachImageToTexture(");
                sb.append(strValueOf);
                sb.append(")");
                return sb.toString();
            }
        }, new mlu() { // from class: mox
            @Override // defpackage.mlu
            public final Object a(Object obj) {
                EGLImage eGLImage2 = eGLImage;
                ((mrb) obj).d();
                EGLImage.attachToTexture(eGLImage2.a);
                return mlt.a;
            }
        }).h(mmg.a);
        return mqgVar;
    }

    public final moq g() {
        return ((mrb) f()).f;
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        int iHashCode = hashCode();
        String strValueOf = String.valueOf(g());
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 21 + String.valueOf(strValueOf).length());
        sb.append(simpleName);
        sb.append("@");
        sb.append(iHashCode);
        sb.append("[layout=");
        sb.append(strValueOf);
        sb.append("]");
        return sb.toString();
    }
}
