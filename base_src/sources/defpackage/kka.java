package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kka implements Runnable {
    final /* synthetic */ kkb a;

    public kka(kkb kkbVar) {
        this.a = kkbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kie kieVar = this.a.a.b;
        kieVar.j(String.valueOf(kieVar.getClass().getName()).concat(" disconnecting because it was signed out."));
    }
}
