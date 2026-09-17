package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class lts {
    public final opj a;
    public final Map b;
    public final /* synthetic */ ltt c;

    public lts(ltt lttVar, opj opjVar, Map map) {
        this.c = lttVar;
        this.a = opjVar;
        this.b = map;
    }

    final void a(int i) {
        oti otiVarListIterator = this.a.entrySet().listIterator();
        while (otiVarListIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) otiVarListIterator.next();
            ((mip) entry.getValue()).m(((Long) entry.getKey()).longValue(), i);
        }
    }

    public final void b(lzq lzqVar, lux luxVar) {
        Long lB = ltt.b(lzqVar);
        ljf ljfVar = this.c.a;
        String strValueOf = String.valueOf(lB);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 16);
        sb.append("onCaptureFailed_");
        sb.append(strValueOf);
        ljfVar.e(sb.toString());
        mip mipVar = (mip) this.a.get(lB);
        mipVar.getClass();
        mipVar.fw(luxVar);
        synchronized (this.c) {
            ltt lttVar = this.c;
            if (!lttVar.f) {
                lttVar.h(lB.longValue());
            }
        }
        this.c.a.f();
    }
}
