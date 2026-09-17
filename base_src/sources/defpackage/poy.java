package defpackage;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class poy extends pnl implements pqn {
    public final ppd a;
    public ppd b;
    public boolean c;

    public poy() {
        ccp ccpVar = ccp.c;
        throw null;
    }

    public poy(ppd ppdVar) {
        this.a = ppdVar;
        this.b = (ppd) ppdVar.G(4);
        this.c = false;
    }

    private static final void au(ppd ppdVar, ppd ppdVar2) {
        pqu.a.b(ppdVar).g(ppdVar, ppdVar2);
    }

    public final void A(int i) {
        if (this.c) {
            m();
            this.c = false;
        }
        psh pshVar = (psh) this.b;
        psh pshVar2 = psh.c;
        ppk ppkVar = pshVar.a;
        if (!ppkVar.c()) {
            pshVar.a = ppd.x(ppkVar);
        }
        pshVar.a.g(i - 1);
    }

    public final void B(psh pshVar) {
        if (this.c) {
            m();
            this.c = false;
        }
        psi psiVar = (psi) this.b;
        psi psiVar2 = psi.c;
        pshVar.getClass();
        ppm ppmVar = psiVar.b;
        if (!ppmVar.c()) {
            psiVar.b = ppd.B(ppmVar);
        }
        psiVar.b.add(pshVar);
    }

    public final void C(int i) {
        if (this.c) {
            m();
            this.c = false;
        }
        psi psiVar = (psi) this.b;
        psi psiVar2 = psi.c;
        ppk ppkVar = psiVar.a;
        if (!ppkVar.c()) {
            psiVar.a = ppd.x(ppkVar);
        }
        psiVar.a.g(i - 1);
    }

    public final void D(psh pshVar) {
        if (this.c) {
            m();
            this.c = false;
        }
        psj psjVar = (psj) this.b;
        psj psjVar2 = psj.c;
        pshVar.getClass();
        psjVar.b = pshVar;
        psjVar.a = 2;
    }

    public final void E(psi psiVar) {
        if (this.c) {
            m();
            this.c = false;
        }
        psj psjVar = (psj) this.b;
        psj psjVar2 = psj.c;
        psiVar.getClass();
        psjVar.b = psiVar;
        psjVar.a = 3;
    }

    public final void F(int i) {
        if (this.c) {
            m();
            this.c = false;
        }
        psj psjVar = (psj) this.b;
        psj psjVar2 = psj.c;
        psjVar.b = Integer.valueOf(i - 1);
        psjVar.a = 1;
    }

    public final void G(long j) {
        if (this.c) {
            m();
            this.c = false;
        }
        psl pslVar = (psl) this.b;
        psl pslVar2 = psl.m;
        pslVar.i();
        pslVar.k.d(j);
    }

    public final void H(psr psrVar) {
        if (this.c) {
            m();
            this.c = false;
        }
        pss pssVar = (pss) this.b;
        pss pssVar2 = pss.f;
        psrVar.getClass();
        ppm ppmVar = pssVar.b;
        if (!ppmVar.c()) {
            pssVar.b = ppd.B(ppmVar);
        }
        pssVar.b.add(psrVar);
    }

    public final void I(Iterable iterable) {
        if (this.c) {
            m();
            this.c = false;
        }
        qwy qwyVar = (qwy) this.b;
        qwy qwyVar2 = qwy.e;
        ppm ppmVar = qwyVar.b;
        if (!ppmVar.c()) {
            qwyVar.b = ppd.B(ppmVar);
        }
        pnl.e(iterable, qwyVar.b);
    }

    public final void J(Iterable iterable) {
        if (this.c) {
            m();
            this.c = false;
        }
        qwy qwyVar = (qwy) this.b;
        qwy qwyVar2 = qwy.e;
        ppm ppmVar = qwyVar.c;
        if (!ppmVar.c()) {
            qwyVar.c = ppd.B(ppmVar);
        }
        pnl.e(iterable, qwyVar.c);
    }

    public final qxc K(int i) {
        return (qxc) ((qxd) this.b).g.get(i);
    }

    public final qxc L(int i) {
        return (qxc) ((qxd) this.b).h.get(i);
    }

    public final qxc M(int i) {
        return (qxc) ((qxd) this.b).i.get(i);
    }

    public final qxc N(int i) {
        return (qxc) ((qxd) this.b).j.get(i);
    }

    public final qxc O(int i) {
        return (qxc) ((qxd) this.b).k.get(i);
    }

    public final qxc P(int i) {
        return (qxc) ((qxd) this.b).l.get(i);
    }

    public final qxc Q(int i) {
        return (qxc) ((qxd) this.b).n.get(i);
    }

    public final void R(Iterable iterable) {
        if (this.c) {
            m();
            this.c = false;
        }
        qxd qxdVar = (qxd) this.b;
        qxd qxdVar2 = qxd.an;
        qxdVar.M();
        pnl.e(iterable, qxdVar.l);
    }

    public final void S(Iterable iterable) {
        if (this.c) {
            m();
            this.c = false;
        }
        qxd qxdVar = (qxd) this.b;
        qxd qxdVar2 = qxd.an;
        qxdVar.N();
        pnl.e(iterable, qxdVar.n);
    }

    public final void T(Iterable iterable) {
        if (this.c) {
            m();
            this.c = false;
        }
        qxd qxdVar = (qxd) this.b;
        qxd qxdVar2 = qxd.an;
        ppm ppmVar = qxdVar.q;
        if (!ppmVar.c()) {
            qxdVar.q = ppd.B(ppmVar);
        }
        pnl.e(iterable, qxdVar.q);
    }

    public final void U(Iterable iterable) {
        if (this.c) {
            m();
            this.c = false;
        }
        qxd qxdVar = (qxd) this.b;
        qxd qxdVar2 = qxd.an;
        ppm ppmVar = qxdVar.p;
        if (!ppmVar.c()) {
            qxdVar.p = ppd.B(ppmVar);
        }
        pnl.e(iterable, qxdVar.p);
    }

    public final void V(Iterable iterable) {
        if (this.c) {
            m();
            this.c = false;
        }
        qxd qxdVar = (qxd) this.b;
        qxd qxdVar2 = qxd.an;
        qxdVar.L();
        pnl.e(iterable, qxdVar.k);
    }

    public final void W(Iterable iterable) {
        if (this.c) {
            m();
            this.c = false;
        }
        qxd qxdVar = (qxd) this.b;
        qxd qxdVar2 = qxd.an;
        qxdVar.K();
        pnl.e(iterable, qxdVar.j);
    }

    public final void X(Iterable iterable) {
        if (this.c) {
            m();
            this.c = false;
        }
        qxd qxdVar = (qxd) this.b;
        qxd qxdVar2 = qxd.an;
        qxdVar.i();
        pnl.e(iterable, qxdVar.g);
    }

    public final void Y(Iterable iterable) {
        if (this.c) {
            m();
            this.c = false;
        }
        qxd qxdVar = (qxd) this.b;
        qxd qxdVar2 = qxd.an;
        qxdVar.j();
        pnl.e(iterable, qxdVar.h);
    }

    public final void Z(Iterable iterable) {
        if (this.c) {
            m();
            this.c = false;
        }
        qxd qxdVar = (qxd) this.b;
        qxd qxdVar2 = qxd.an;
        qxdVar.J();
        pnl.e(iterable, qxdVar.i);
    }

    public final void aa(long j) {
        if (this.c) {
            m();
            this.c = false;
        }
        qxd qxdVar = (qxd) this.b;
        qxd qxdVar2 = qxd.an;
        qxdVar.b |= 65536;
        qxdVar.ai = j;
    }

    public final void ab(long j) {
        if (this.c) {
            m();
            this.c = false;
        }
        qxd qxdVar = (qxd) this.b;
        qxd qxdVar2 = qxd.an;
        qxdVar.b |= 1048576;
        qxdVar.am = j;
    }

    public final void ac(int i, qxc qxcVar) {
        if (this.c) {
            m();
            this.c = false;
        }
        qxd qxdVar = (qxd) this.b;
        qxd qxdVar2 = qxd.an;
        qxcVar.getClass();
        qxdVar.M();
        qxdVar.l.set(i, qxcVar);
    }

    public final void ad(qxc qxcVar) {
        if (this.c) {
            m();
            this.c = false;
        }
        qxd qxdVar = (qxd) this.b;
        qxd qxdVar2 = qxd.an;
        qxdVar.aj = qxcVar;
        qxdVar.b |= 131072;
    }

    public final void ae(int i, qxc qxcVar) {
        if (this.c) {
            m();
            this.c = false;
        }
        qxd qxdVar = (qxd) this.b;
        qxd qxdVar2 = qxd.an;
        qxcVar.getClass();
        qxdVar.N();
        qxdVar.n.set(i, qxcVar);
    }

    public final void af(int i, qxc qxcVar) {
        if (this.c) {
            m();
            this.c = false;
        }
        qxd qxdVar = (qxd) this.b;
        qxd qxdVar2 = qxd.an;
        qxcVar.getClass();
        qxdVar.L();
        qxdVar.k.set(i, qxcVar);
    }

    public final void ag(long j) {
        if (this.c) {
            m();
            this.c = false;
        }
        qxd qxdVar = (qxd) this.b;
        qxd qxdVar2 = qxd.an;
        qxdVar.b |= 524288;
        qxdVar.al = j;
    }

    public final void ah(long j) {
        if (this.c) {
            m();
            this.c = false;
        }
        qxd qxdVar = (qxd) this.b;
        qxd qxdVar2 = qxd.an;
        qxdVar.b |= 262144;
        qxdVar.ak = j;
    }

    public final void ai(int i, qxc qxcVar) {
        if (this.c) {
            m();
            this.c = false;
        }
        qxd qxdVar = (qxd) this.b;
        qxd qxdVar2 = qxd.an;
        qxcVar.getClass();
        qxdVar.K();
        qxdVar.j.set(i, qxcVar);
    }

    public final void aj(int i, qxc qxcVar) {
        if (this.c) {
            m();
            this.c = false;
        }
        qxd qxdVar = (qxd) this.b;
        qxd qxdVar2 = qxd.an;
        qxcVar.getClass();
        qxdVar.i();
        qxdVar.g.set(i, qxcVar);
    }

    public final void ak(int i, qxc qxcVar) {
        if (this.c) {
            m();
            this.c = false;
        }
        qxd qxdVar = (qxd) this.b;
        qxd qxdVar2 = qxd.an;
        qxcVar.getClass();
        qxdVar.j();
        qxdVar.h.set(i, qxcVar);
    }

    public final void al(int i, qxc qxcVar) {
        if (this.c) {
            m();
            this.c = false;
        }
        qxd qxdVar = (qxd) this.b;
        qxd qxdVar2 = qxd.an;
        qxcVar.getClass();
        qxdVar.J();
        qxdVar.i.set(i, qxcVar);
    }

    public final void am(int i) {
        if (this.c) {
            m();
            this.c = false;
        }
        qyg qygVar = (qyg) this.b;
        qyg qygVar2 = qyg.c;
        ppk ppkVar = qygVar.b;
        if (!ppkVar.c()) {
            qygVar.b = ppd.x(ppkVar);
        }
        qygVar.b.g(i);
    }

    public final void an(int i) {
        if (this.c) {
            m();
            this.c = false;
        }
        qyg qygVar = (qyg) this.b;
        qyg qygVar2 = qyg.c;
        ppk ppkVar = qygVar.a;
        if (!ppkVar.c()) {
            qygVar.a = ppd.x(ppkVar);
        }
        qygVar.a.g(i);
    }

    public final void ao(poc pocVar) {
        if (this.c) {
            m();
            this.c = false;
        }
        qyo qyoVar = (qyo) this.b;
        qyo qyoVar2 = qyo.b;
        pocVar.getClass();
        ppm ppmVar = qyoVar.a;
        if (!ppmVar.c()) {
            qyoVar.a = ppd.B(ppmVar);
        }
        qyoVar.a.add(pocVar);
    }

    public final void ap(String str, qyq qyqVar) {
        qyqVar.getClass();
        if (this.c) {
            m();
            this.c = false;
        }
        qys qysVar = (qys) this.b;
        qys qysVar2 = qys.b;
        pqh pqhVar = qysVar.a;
        if (!pqhVar.b) {
            qysVar.a = pqhVar.a();
        }
        qysVar.a.put(str, qyqVar);
    }

    public final void aq(long j) {
        if (this.c) {
            m();
            this.c = false;
        }
        qyu qyuVar = (qyu) this.b;
        qyu qyuVar2 = qyu.b;
        ppl pplVar = qyuVar.a;
        if (!pplVar.c()) {
            qyuVar.a = ppd.z(pplVar);
        }
        qyuVar.a.d(j);
    }

    public final void ar(Map map) {
        if (this.c) {
            m();
            this.c = false;
        }
        qyw qywVar = (qyw) this.b;
        qyw qywVar2 = qyw.e;
        pqh pqhVar = qywVar.c;
        if (!pqhVar.b) {
            qywVar.c = pqhVar.a();
        }
        qywVar.c.putAll(map);
    }

    public final void as(poy poyVar) {
        if (this.c) {
            m();
            this.c = false;
        }
        nva nvaVar = (nva) this.b;
        nuy nuyVar = (nuy) poyVar.j();
        nva nvaVar2 = nva.b;
        nuyVar.getClass();
        ppm ppmVar = nvaVar.a;
        if (!ppmVar.c()) {
            nvaVar.a = ppd.B(ppmVar);
        }
        nvaVar.a.add(nuyVar);
    }

    public final void at(poy poyVar) {
        if (this.c) {
            m();
            this.c = false;
        }
        nvz nvzVar = (nvz) this.b;
        nvw nvwVar = (nvw) poyVar.j();
        nvz nvzVar2 = nvz.k;
        nvwVar.getClass();
        ppm ppmVar = nvzVar.e;
        if (!ppmVar.c()) {
            nvzVar.e = ppd.B(ppmVar);
        }
        nvzVar.e.add(nvwVar);
    }

    @Override // defpackage.pnl
    protected final /* synthetic */ pnl b(pnm pnmVar) {
        o((ppd) pnmVar);
        return this;
    }

    @Override // defpackage.pnl
    public final /* bridge */ /* synthetic */ pnl f(byte[] bArr, int i) throws ppp {
        p(bArr, i, pos.a());
        return this;
    }

    @Override // defpackage.pnl
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final poy clone() {
        poy poyVar = (poy) this.a.G(5);
        poyVar.o(k());
        return poyVar;
    }

    @Override // defpackage.pql
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final ppd j() {
        ppd ppdVarK = k();
        if (ppdVarK.n()) {
            return ppdVarK;
        }
        throw new prm();
    }

    @Override // defpackage.pql
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public ppd k() {
        if (this.c) {
            return this.b;
        }
        ppd ppdVar = this.b;
        pqu.a.b(ppdVar).f(ppdVar);
        this.c = true;
        return this.b;
    }

    @Override // defpackage.pqn
    public final /* synthetic */ pqm l() {
        return this.a;
    }

    public void m() {
        ppd ppdVar = (ppd) this.b.G(4);
        au(ppdVar, this.b);
        this.b = ppdVar;
    }

    @Override // defpackage.pqn
    public final boolean n() {
        throw null;
    }

    public final void o(ppd ppdVar) {
        if (this.c) {
            m();
            this.c = false;
        }
        au(this.b, ppdVar);
    }

    public final void p(byte[] bArr, int i, pos posVar) throws ppp {
        if (this.c) {
            m();
            this.c = false;
        }
        try {
            pqu.a.b(this.b).i(this.b, bArr, 0, i, new pnr(posVar));
        } catch (IOException e) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e);
        } catch (IndexOutOfBoundsException e2) {
            throw ppp.i();
        } catch (ppp e3) {
            throw e3;
        }
    }

    public final void q(String str) {
        if (this.c) {
            m();
            this.c = false;
        }
        nfb nfbVar = (nfb) this.b;
        nfb nfbVar2 = nfb.d;
        str.getClass();
        ppm ppmVar = nfbVar.b;
        if (!ppmVar.c()) {
            nfbVar.b = ppd.B(ppmVar);
        }
        nfbVar.b.add(str);
    }

    public final void r(String str, nfb nfbVar) {
        str.getClass();
        nfbVar.getClass();
        if (this.c) {
            m();
            this.c = false;
        }
        nff nffVar = (nff) this.b;
        nff nffVar2 = nff.b;
        nffVar.b().put(str, nfbVar);
    }

    public final void s(Iterable iterable) {
        if (this.c) {
            m();
            this.c = false;
        }
        nuy nuyVar = (nuy) this.b;
        nuy nuyVar2 = nuy.e;
        ppm ppmVar = nuyVar.c;
        if (!ppmVar.c()) {
            nuyVar.c = ppd.B(ppmVar);
        }
        pnl.e(iterable, nuyVar.c);
    }

    public final void t(String str) {
        if (this.c) {
            m();
            this.c = false;
        }
        nuy nuyVar = (nuy) this.b;
        nuy nuyVar2 = nuy.e;
        ppm ppmVar = nuyVar.b;
        if (!ppmVar.c()) {
            nuyVar.b = ppd.B(ppmVar);
        }
        nuyVar.b.add(str);
    }

    public final void u(nvp nvpVar) {
        if (this.c) {
            m();
            this.c = false;
        }
        nvq nvqVar = (nvq) this.b;
        nvq nvqVar2 = nvq.b;
        nvpVar.getClass();
        ppm ppmVar = nvqVar.a;
        if (!ppmVar.c()) {
            nvqVar.a = ppd.B(ppmVar);
        }
        nvqVar.a.add(nvpVar);
    }

    public final void v(Iterable iterable) {
        if (this.c) {
            m();
            this.c = false;
        }
        nvp nvpVar = (nvp) this.b;
        nvp nvpVar2 = nvp.e;
        ppm ppmVar = nvpVar.c;
        if (!ppmVar.c()) {
            nvpVar.c = ppd.B(ppmVar);
        }
        pnl.e(iterable, nvpVar.c);
    }

    public final void w(int i) {
        if (this.c) {
            m();
            this.c = false;
        }
        nvt nvtVar = (nvt) this.b;
        nvt nvtVar2 = nvt.d;
        ppk ppkVar = nvtVar.b;
        if (!ppkVar.c()) {
            nvtVar.b = ppd.x(ppkVar);
        }
        nvtVar.b.g(i - 1);
    }

    public final void x(float f) {
        if (this.c) {
            m();
            this.c = false;
        }
        pbg pbgVar = (pbg) this.b;
        pbg pbgVar2 = pbg.i;
        ppj ppjVar = pbgVar.d;
        if (!ppjVar.c()) {
            pbgVar.d = ppd.v(ppjVar);
        }
        pbgVar.d.g(f);
    }

    public final void y(float f) {
        if (this.c) {
            m();
            this.c = false;
        }
        pbg pbgVar = (pbg) this.b;
        pbg pbgVar2 = pbg.i;
        ppj ppjVar = pbgVar.c;
        if (!ppjVar.c()) {
            pbgVar.c = ppd.v(ppjVar);
        }
        pbgVar.c.g(f);
    }

    public final void z(psi psiVar) {
        if (this.c) {
            m();
            this.c = false;
        }
        psh pshVar = (psh) this.b;
        psh pshVar2 = psh.c;
        psiVar.getClass();
        ppm ppmVar = pshVar.b;
        if (!ppmVar.c()) {
            pshVar.b = ppd.B(ppmVar);
        }
        pshVar.b.add(psiVar);
    }
}
