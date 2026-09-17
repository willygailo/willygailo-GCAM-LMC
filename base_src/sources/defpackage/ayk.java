package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ayk extends bko implements Cloneable {
    private ayk A;
    private ayk B;
    private boolean C = true;
    private boolean D;
    private boolean E;
    private final Context t;
    private final ayn u;
    private final Class v;
    private final aya w;
    private ayo x;
    private Object y;
    private List z;

    static {
    }

    protected ayk(axv axvVar, ayn aynVar, Class cls, Context context) {
        this.u = aynVar;
        this.v = cls;
        this.t = context;
        aya ayaVar = aynVar.a.b;
        ayo ayoVar = (ayo) ayaVar.e.get(cls);
        if (ayoVar == null) {
            for (Map.Entry entry : ayaVar.e.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    ayoVar = (ayo) entry.getValue();
                }
            }
        }
        this.x = ayoVar == null ? aya.a : ayoVar;
        this.w = axvVar.b;
        Iterator it = aynVar.d.iterator();
        while (it.hasNext()) {
            a((bkw) it.next());
        }
        g(aynVar.e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final bks N(Object obj, blh blhVar, bkw bkwVar, bku bkuVar, ayo ayoVar, ayc aycVar, int i, int i2, bko bkoVar, Executor executor) {
        bkp bkpVar;
        bku bkpVar2;
        bks bksVarO;
        int i3;
        int i4;
        ayc aycVar2;
        ayc aycVar3;
        int i5;
        int i6;
        if (this.B != null) {
            bkpVar2 = new bkp(obj, bkuVar);
            bkpVar = bkpVar2;
        } else {
            bkpVar = 0;
            bkpVar2 = bkuVar;
        }
        ayk aykVar = this.A;
        if (aykVar == null) {
            bksVarO = O(obj, blhVar, bkwVar, bkoVar, bkpVar2, ayoVar, aycVar, i, i2, executor);
        } else {
            if (this.E) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            ayo ayoVar2 = true == aykVar.C ? ayoVar : aykVar.x;
            if (super.C(8)) {
                aycVar3 = this.A.c;
            } else {
                switch (ayj.b[aycVar.ordinal()]) {
                    case 1:
                        aycVar2 = ayc.NORMAL;
                        break;
                    case 2:
                        aycVar2 = ayc.HIGH;
                        break;
                    case 3:
                    case 4:
                        aycVar2 = ayc.IMMEDIATE;
                        break;
                    default:
                        String strValueOf = String.valueOf(this.c);
                        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 18);
                        sb.append("unknown priority: ");
                        sb.append(strValueOf);
                        throw new IllegalArgumentException(sb.toString());
                }
                aycVar3 = aycVar2;
            }
            ayk aykVar2 = this.A;
            int i7 = aykVar2.i;
            int i8 = aykVar2.h;
            if (!bmf.o(i, i2) || this.A.D()) {
                i5 = i8;
                i6 = i7;
            } else {
                i6 = bkoVar.i;
                i5 = bkoVar.h;
            }
            bla blaVar = new bla(obj, bkpVar2);
            bks bksVarO2 = O(obj, blhVar, bkwVar, bkoVar, blaVar, ayoVar, aycVar, i, i2, executor);
            this.E = true;
            ayk aykVar3 = this.A;
            bks bksVarN = aykVar3.N(obj, blhVar, bkwVar, blaVar, ayoVar2, aycVar3, i6, i5, aykVar3, executor);
            this.E = false;
            blaVar.a = bksVarO2;
            blaVar.b = bksVarN;
            bksVarO = blaVar;
        }
        if (bkpVar == 0) {
            return bksVarO;
        }
        ayk aykVar4 = this.B;
        int i9 = aykVar4.i;
        int i10 = aykVar4.h;
        if (!bmf.o(i, i2) || this.B.D()) {
            i3 = i10;
            i4 = i9;
        } else {
            i4 = bkoVar.i;
            i3 = bkoVar.h;
        }
        ayk aykVar5 = this.B;
        bks bksVarN2 = aykVar5.N(obj, blhVar, bkwVar, bkpVar, aykVar5.x, aykVar5.c, i4, i3, aykVar5, executor);
        bkpVar.a = bksVarO;
        bkpVar.b = bksVarN2;
        return bkpVar;
    }

    private final bks O(Object obj, blh blhVar, bkw bkwVar, bko bkoVar, bku bkuVar, ayo ayoVar, ayc aycVar, int i, int i2, Executor executor) {
        Context context = this.t;
        aya ayaVar = this.w;
        Object obj2 = this.y;
        Class cls = this.v;
        List list = this.z;
        bby bbyVar = ayaVar.f;
        aae aaeVar = ayoVar.a;
        return new bkz(context, ayaVar, obj, obj2, cls, bkoVar, i, i2, aycVar, blhVar, bkwVar, list, bkuVar, bbyVar, executor);
    }

    private final void P(blh blhVar, bkw bkwVar, bko bkoVar, Executor executor) {
        aae.s(blhVar);
        if (!this.D) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        bks bksVarN = N(new Object(), blhVar, bkwVar, null, this.x, bkoVar.c, bkoVar.i, bkoVar.h, bkoVar, executor);
        bks bksVarC = blhVar.c();
        if (!bksVarN.m(bksVarC) || (!bkoVar.g && bksVarC.l())) {
            this.u.f(blhVar);
            blhVar.k(bksVarN);
            this.u.m(blhVar, bksVarN);
        } else {
            aae.s(bksVarC);
            if (bksVarC.n()) {
                return;
            }
            bksVarC.b();
        }
    }

    public final ayk a(bkw bkwVar) {
        if (this.p) {
            return clone().a(bkwVar);
        }
        if (bkwVar != null) {
            if (this.z == null) {
                this.z = new ArrayList();
            }
            this.z.add(bkwVar);
        }
        L();
        return this;
    }

    @Override // defpackage.bko
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ayk g(bko bkoVar) {
        aae.s(bkoVar);
        return (ayk) super.g(bkoVar);
    }

    @Override // defpackage.bko
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final ayk h() {
        ayk aykVar = (ayk) super.h();
        aykVar.x = aykVar.x.clone();
        List list = aykVar.z;
        if (list != null) {
            aykVar.z = new ArrayList(list);
        }
        ayk aykVar2 = aykVar.A;
        if (aykVar2 != null) {
            aykVar.A = aykVar2.clone();
        }
        ayk aykVar3 = aykVar.B;
        if (aykVar3 != null) {
            aykVar.B = aykVar3.clone();
        }
        return aykVar;
    }

    public final ayk d(Drawable drawable) {
        return e(drawable).g(bkx.c(bbr.a));
    }

    public final ayk e(Object obj) {
        if (this.p) {
            return clone().e(obj);
        }
        this.y = obj;
        this.D = true;
        L();
        return this;
    }

    public final ayk f(ayk aykVar) {
        if (this.p) {
            return clone().f(aykVar);
        }
        this.A = aykVar;
        L();
        return this;
    }

    public final bkr i() {
        bkv bkvVar = new bkv();
        P(bkvVar, bkvVar, this, blw.b);
        return bkvVar;
    }

    public final blk j(ImageView imageView) {
        bko bkoVarS;
        blk bleVar;
        bmf.i();
        aae.s(imageView);
        if (!super.C(2048) && this.l && imageView.getScaleType() != null) {
            switch (ayj.a[imageView.getScaleType().ordinal()]) {
                case 1:
                    bkoVarS = clone().s(bhb.c, new bgp());
                    break;
                case 2:
                    bkoVarS = clone().q();
                    break;
                case 3:
                case 4:
                case 5:
                    bkoVarS = super.r(bhb.a, new bhj());
                    break;
                case 6:
                    bkoVarS = clone().q();
                    break;
                default:
                    bkoVarS = this;
                    break;
            }
        } else {
            bkoVarS = this;
        }
        Class cls = this.v;
        if (Bitmap.class.equals(cls)) {
            bleVar = new blc(imageView);
        } else {
            if (!Drawable.class.isAssignableFrom(cls)) {
                String strValueOf = String.valueOf(cls);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 64);
                sb.append("Unhandled class: ");
                sb.append(strValueOf);
                sb.append(", try .as*(Class).transcode(ResourceTranscoder)");
                throw new IllegalArgumentException(sb.toString());
            }
            bleVar = new ble(imageView);
        }
        P(bleVar, null, bkoVarS, blw.a);
        return bleVar;
    }

    public final void k(blh blhVar) {
        P(blhVar, null, this, blw.a);
    }
}
