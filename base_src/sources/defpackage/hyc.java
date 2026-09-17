package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hyc {
    public final /* synthetic */ pht a;

    public final void a(final iat iatVar, final iav iavVar) {
        mip.ca(this.a, new lht() { // from class: hyd
            @Override // defpackage.lht
            public final void a(Object obj) {
                final iat iatVar2 = iatVar;
                final iav iavVar2 = iavVar;
                final hza hzaVar = (hza) obj;
                obr.ao(hzaVar);
                lar larVar = hzaVar.b;
                if (iavVar2.h.g()) {
                    larVar = (lar) iavVar2.h.c();
                }
                hzaVar.o.d(new Runnable() { // from class: hyk
                    @Override // java.lang.Runnable
                    public final void run() {
                        hza hzaVar2 = hzaVar;
                        iat iatVar3 = iatVar2;
                        iav iavVar3 = iavVar2;
                        if (hzaVar2.i.containsKey(iatVar3)) {
                            ((oug) ((oug) hza.a.b()).G((char) 2731)).r("Trying to add previously added Smarts Processor %s", iatVar3);
                            return;
                        }
                        final hzu hzuVar = new hzu(iatVar3, iavVar3);
                        hzaVar2.i.put(iatVar3, hzuVar);
                        ljf ljfVar = hzaVar2.j;
                        String strValueOf = String.valueOf(iavVar3.a);
                        ljfVar.e(strValueOf.length() != 0 ? "smartsProcessor#init-".concat(strValueOf) : new String("smartsProcessor#init-"));
                        hzuVar.c = new hzs(hzuVar, new hzy(hzaVar2.l, iavVar3, iatVar3));
                        hzuVar.a.b(hzuVar.c);
                        hzuVar.d = true;
                        hzuVar.f.c(hzuVar.b.f.a(new lij() { // from class: hzr
                            @Override // defpackage.lij
                            public final void fB(Object obj2) {
                                hzuVar.b(hzt.EXTERNAL_TOGGLE, !((Boolean) obj2).booleanValue());
                            }
                        }, mip.bS()));
                        hzaVar2.j.f();
                        hzuVar.d(hzaVar2.p);
                        hzuVar.e(hzaVar2.q);
                        hzuVar.f(hzaVar2.s);
                        hzuVar.c(hzaVar2.u);
                        hzuVar.g(hza.k((hti) hzaVar2.f.fA()));
                        hzuVar.h(((Boolean) hzaVar2.g.fA()).booleanValue());
                        lvp lvpVar = hzaVar2.r;
                        if (lvpVar != null) {
                            hzuVar.a(lvpVar);
                        }
                    }
                }, larVar);
            }
        }, pgr.INSTANCE);
    }
}
