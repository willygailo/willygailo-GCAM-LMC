package defpackage;

import android.util.LruCache;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class mdt implements mds {
    public static final int a = d.c(pnq.class.getName());
    public static final Map b;
    public static final meq c;
    public final LruCache d = new mdx();
    public final LruCache e = new LruCache(100);
    public final mep f;

    static {
        oon oonVar = new oon();
        oonVar.e(0, "WIRETYPE_VARINT");
        oonVar.e(1, "WIRETYPE_FIXED64");
        oonVar.e(2, "WIRETYPE_LENGTH_DELIMITED");
        oonVar.e(3, "WIRETYPE_START_GROUP");
        oonVar.e(4, "WIRETYPE_END_GROUP");
        oonVar.e(5, "WIRETYPE_FIXED32");
        oonVar.c();
        b = new HashMap();
        c = new meq();
    }

    public mdt(mep mepVar) {
        this.f = mepVar;
    }

    public static boolean a(qyx qyxVar) {
        return (qyxVar == null || qyxVar.b.size() == 0) ? false : true;
    }

    public static boolean b(int i, int i2) {
        return i == a && i2 == 2;
    }

    public static boolean c(mdo mdoVar, qyx qyxVar, mew mewVar, ojc ojcVar) {
        mec melVar;
        int iB;
        int i = 0;
        while (true) {
            int i2 = 1;
            if (qyxVar == null || i >= qyxVar.b.size()) {
                break;
            }
            int iA = psk.a(qyxVar.b.d(i));
            if (iA == 0) {
                iA = 1;
            }
            psj psjVarG = d.g(iA);
            if (psjVarG.a == 1) {
                mee meeVar = mee.a;
                if (psjVarG.a == 1 && (iB = psg.b(((Integer) psjVarG.b).intValue())) != 0) {
                    i2 = iB;
                }
                melVar = meeVar.a(i2, mdoVar);
            } else {
                melVar = new mel(mee.a, psjVarG, mdoVar);
            }
            if (!melVar.a()) {
                if (pzl.c()) {
                    poy poyVarB = mewVar.b(3);
                    if (poyVarB.c) {
                        poyVarB.m();
                        poyVarB.c = false;
                    }
                    psl pslVar = (psl) poyVarB.b;
                    psl pslVar2 = psl.m;
                    pslVar.i = iA - 1;
                    pslVar.a |= 128;
                    psj psjVarG2 = d.g(iA);
                    if (poyVarB.c) {
                        poyVarB.m();
                        poyVarB.c = false;
                    }
                    psl pslVar3 = (psl) poyVarB.b;
                    psjVarG2.getClass();
                    pslVar3.j = psjVarG2;
                    pslVar3.a |= 512;
                    if (ojcVar.g()) {
                        poyVarB.G(((Integer) ojcVar.c()).intValue());
                    }
                    mewVar.a(poyVarB);
                }
                return false;
            }
            i++;
        }
        return true;
    }

    public static qyx d(qyw qywVar) {
        return (qyx) Collections.unmodifiableMap(qywVar.c).get(-2032180703);
    }

    public static qyx e(qza qzaVar) {
        return (qyx) Collections.unmodifiableMap(qzaVar.a).get(-2032180703);
    }
}
