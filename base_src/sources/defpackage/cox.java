package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cox {
    private final qkg a;
    private final cou b;

    public cox(qkg qkgVar, cou couVar) {
        this.a = qkgVar;
        this.b = couVar;
    }

    public final cot a(com comVar) {
        evn evnVar = ((eva) this.a).get();
        evnVar.b = this.b;
        evnVar.c = comVar;
        qmd.ad(evnVar.b, cou.class);
        qmd.ad(evnVar.c, com.class);
        return new evo(evnVar.a, evnVar.c, evnVar.b);
    }
}
