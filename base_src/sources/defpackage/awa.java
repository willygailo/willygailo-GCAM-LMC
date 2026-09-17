package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class awa implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ awb b;

    public awa(awb awbVar, String str) {
        this.b = awbVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        avw avwVar = this.b.b;
        String str = this.a;
        btp btpVar = (btp) avwVar;
        avw avwVar2 = btpVar.c;
        if (avwVar2 != null) {
            ((oug) ((oug) eur.a.c()).G((char) 1532)).r("Camera reconnection failure:%s", str);
            ((eur) avwVar2).d.g();
        }
        btpVar.k();
    }
}
