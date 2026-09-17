package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class hhv implements Runnable {
    final /* synthetic */ hih a;
    final /* synthetic */ hia b;

    public hhv(hia hiaVar, hih hihVar) {
        this.b = hiaVar;
        this.a = hihVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hii hiiVar = this.b.k;
        hih hihVar = this.a;
        synchronized (hiiVar.a) {
            if (hiiVar.a.contains(hihVar)) {
                hiiVar.a.remove(hihVar);
                hiiVar.b.remove(hihVar);
                hiiVar.a.size();
            } else {
                hiiVar.a.size();
            }
        }
    }
}
