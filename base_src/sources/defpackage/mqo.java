package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mqo {
    public static final float[] a = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
    public static final float[] b = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};

    public static mri a(final mpi mpiVar) {
        return (mri) mpiVar.g(String.valueOf(mqo.class.getName()).concat("_texcoords"), new ojz() { // from class: mqn
            @Override // defpackage.ojz
            public final Object a() {
                mpi mpiVar2 = mpiVar;
                float[] fArr = mqo.a;
                return mwp.g(mri.e(mpiVar2, mrj.a(mqo.a), mrj.a(mqo.b)));
            }
        }).c();
    }
}
