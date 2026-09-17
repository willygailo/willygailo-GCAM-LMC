package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class npd implements noy {
    public final aii a;
    public final ahz b;

    public npd(aii aiiVar) {
        this.a = aiiVar;
        new noz(aiiVar);
        this.b = new npa(aiiVar);
    }

    @Override // defpackage.noy
    public final qbu a(npe npeVar) {
        return qbu.j(new npb(this, npeVar));
    }

    @Override // defpackage.noy
    public final qbu b(Iterable iterable) {
        return qbu.j(new npc(this, iterable));
    }
}
