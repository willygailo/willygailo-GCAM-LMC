package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class mpa extends mpo {
    protected mpa(mpi mpiVar, mnb mnbVar) {
        super(mpiVar, mnbVar);
    }

    public static mpa b(mpi mpiVar, int i, ByteBuffer byteBuffer) {
        return new mpa(mpiVar, mpo.d(mpiVar, new moz(mpiVar, i, byteBuffer)));
    }

    public final String toString() {
        String string = ((mqp) f()).toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 10);
        sb.append("GLBuffer{");
        sb.append(string);
        sb.append('}');
        return sb.toString();
    }
}
