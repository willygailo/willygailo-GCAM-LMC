package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final class mqf implements Callable {
    final /* synthetic */ mpi a;
    final /* synthetic */ mor b;
    final /* synthetic */ mme c;

    public mqf(mpi mpiVar, mor morVar, mme mmeVar) {
        this.a = mpiVar;
        this.b = morVar;
        this.c = mmeVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return new mrb(this.a.d(), mrb.b(), 36197, this.b);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 23);
        sb.append("createExternalTexture(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }
}
