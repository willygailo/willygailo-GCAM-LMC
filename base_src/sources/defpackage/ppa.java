package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ppa extends poy implements pqn {
    public ppa() {
        kcj kcjVar = kcj.c;
        throw null;
    }

    public ppa(ppb ppbVar) {
        super(ppbVar);
    }

    @Override // defpackage.poy, defpackage.pql
    /* JADX INFO: renamed from: au, reason: merged with bridge method [inline-methods] */
    public final ppb k() {
        if (this.c) {
            return (ppb) this.b;
        }
        ((ppb) this.b).h.e();
        return (ppb) super.k();
    }

    public final void av(poq poqVar, Object obj) {
        Map map = ppd.aE;
        if (poqVar.a != this.a) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
        if (this.c) {
            m();
            this.c = false;
        }
        pou pouVarClone = ((ppb) this.b).h;
        if (pouVarClone.c) {
            pouVarClone = pouVarClone.clone();
            ((ppb) this.b).h = pouVarClone;
        }
        ppc ppcVar = poqVar.d;
        if (ppcVar.a() == prz.ENUM) {
            obj = Integer.valueOf(((ppg) obj).a());
        }
        pouVarClone.l(ppcVar, obj);
    }

    @Override // defpackage.poy
    public final void m() {
        super.m();
        ppb ppbVar = (ppb) this.b;
        ppbVar.h = ppbVar.h.clone();
    }
}
