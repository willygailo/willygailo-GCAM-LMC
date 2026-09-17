package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lkp implements lkq {
    private final lvq a;
    private final List b;
    private int c;

    public lkp(lvq lvqVar) {
        this.a = lvqVar;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        try {
            arrayList.addAll(lvqVar.g());
        } catch (lvv e) {
        } catch (lvy e2) {
        } catch (lvz e3) {
        }
        this.c = 0;
    }

    @Override // defpackage.lkq
    public final lvp a() {
        if (this.c == this.b.size()) {
            return null;
        }
        lvq lvqVar = this.a;
        List list = this.b;
        int i = this.c;
        this.c = i + 1;
        return lvqVar.a((lvs) list.get(i));
    }

    @Override // defpackage.lkq
    public final void b() {
        this.c = 0;
    }
}
