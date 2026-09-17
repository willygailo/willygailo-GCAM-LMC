package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.smarts.SmartsChipView;
import com.google.android.apps.camera.smarts.SmartsUiGleamingView;
import com.google.android.apps.camera.uiutils.ReplaceableView;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class hcv implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;
    private final qkg f;
    private final qkg g;
    private final qkg h;
    private final /* synthetic */ int i;

    public hcv(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, int i) {
        this.i = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
        this.f = qkgVar6;
        this.g = qkgVar7;
        this.h = qkgVar8;
    }

    public hcv(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, int i, byte[] bArr) {
        this.i = i;
        this.h = qkgVar;
        this.e = qkgVar2;
        this.c = qkgVar3;
        this.f = qkgVar4;
        this.d = qkgVar5;
        this.a = qkgVar6;
        this.g = qkgVar7;
        this.b = qkgVar8;
    }

    public hcv(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, int i, char[] cArr) {
        this.i = i;
        this.f = qkgVar;
        this.b = qkgVar2;
        this.d = qkgVar3;
        this.e = qkgVar4;
        this.g = qkgVar5;
        this.c = qkgVar6;
        this.a = qkgVar7;
        this.h = qkgVar8;
    }

    public hcv(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, int i, float[] fArr) {
        this.i = i;
        this.g = qkgVar;
        this.e = qkgVar2;
        this.b = qkgVar3;
        this.a = qkgVar4;
        this.h = qkgVar5;
        this.c = qkgVar6;
        this.d = qkgVar7;
        this.f = qkgVar8;
    }

    public hcv(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, int i, int[] iArr) {
        this.i = i;
        this.c = qkgVar;
        this.g = qkgVar2;
        this.h = qkgVar3;
        this.f = qkgVar4;
        this.e = qkgVar5;
        this.b = qkgVar6;
        this.d = qkgVar7;
        this.a = qkgVar8;
    }

    public hcv(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, int i, short[] sArr) {
        this.i = i;
        this.f = qkgVar;
        this.b = qkgVar2;
        this.d = qkgVar3;
        this.e = qkgVar4;
        this.g = qkgVar5;
        this.c = qkgVar6;
        this.h = qkgVar7;
        this.a = qkgVar8;
    }

    public hcv(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, int i, boolean[] zArr) {
        this.i = i;
        this.b = qkgVar;
        this.c = qkgVar2;
        this.a = qkgVar3;
        this.g = qkgVar4;
        this.d = qkgVar5;
        this.e = qkgVar6;
        this.f = qkgVar7;
        this.h = qkgVar8;
    }

    public hcv(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, int i, byte[][] bArr) {
        this.i = i;
        this.h = qkgVar;
        this.g = qkgVar2;
        this.c = qkgVar3;
        this.b = qkgVar4;
        this.a = qkgVar5;
        this.e = qkgVar6;
        this.d = qkgVar7;
        this.f = qkgVar8;
    }

    public hcv(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, int i, char[][] cArr) {
        this.i = i;
        this.c = qkgVar;
        this.g = qkgVar2;
        this.b = qkgVar3;
        this.e = qkgVar4;
        this.a = qkgVar5;
        this.h = qkgVar6;
        this.d = qkgVar7;
        this.f = qkgVar8;
    }

    public hcv(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, int i, float[][] fArr) {
        this.i = i;
        this.h = qkgVar;
        this.g = qkgVar2;
        this.a = qkgVar3;
        this.f = qkgVar4;
        this.e = qkgVar5;
        this.b = qkgVar6;
        this.d = qkgVar7;
        this.c = qkgVar8;
    }

    public hcv(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, int i, int[][] iArr) {
        this.i = i;
        this.g = qkgVar;
        this.f = qkgVar2;
        this.e = qkgVar3;
        this.b = qkgVar4;
        this.c = qkgVar5;
        this.d = qkgVar6;
        this.h = qkgVar7;
        this.a = qkgVar8;
    }

    public hcv(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, int i, short[][] sArr) {
        this.i = i;
        this.f = qkgVar;
        this.h = qkgVar2;
        this.a = qkgVar3;
        this.g = qkgVar4;
        this.c = qkgVar5;
        this.b = qkgVar6;
        this.e = qkgVar7;
        this.d = qkgVar8;
    }

    public hcv(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, int i, boolean[][] zArr) {
        this.i = i;
        this.h = qkgVar;
        this.g = qkgVar2;
        this.f = qkgVar3;
        this.e = qkgVar4;
        this.d = qkgVar5;
        this.b = qkgVar6;
        this.c = qkgVar7;
        this.a = qkgVar8;
    }

    public hcv(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, int i, byte[][][] bArr) {
        this.i = i;
        this.h = qkgVar;
        this.a = qkgVar2;
        this.f = qkgVar3;
        this.d = qkgVar4;
        this.b = qkgVar5;
        this.c = qkgVar6;
        this.g = qkgVar7;
        this.e = qkgVar8;
    }

    public hcv(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, int i, char[][][] cArr) {
        this.i = i;
        this.g = qkgVar;
        this.d = qkgVar2;
        this.a = qkgVar3;
        this.f = qkgVar4;
        this.h = qkgVar5;
        this.c = qkgVar6;
        this.b = qkgVar7;
        this.e = qkgVar8;
    }

    public hcv(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, int i, int[][][] iArr) {
        this.i = i;
        this.g = qkgVar;
        this.c = qkgVar2;
        this.d = qkgVar3;
        this.h = qkgVar4;
        this.a = qkgVar5;
        this.b = qkgVar6;
        this.e = qkgVar7;
        this.f = qkgVar8;
    }

    public hcv(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, int i, short[][][] sArr) {
        this.i = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.h = qkgVar3;
        this.e = qkgVar4;
        this.g = qkgVar5;
        this.d = qkgVar6;
        this.c = qkgVar7;
        this.f = qkgVar8;
    }

    public static hcv a(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8) {
        return new hcv(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, qkgVar8, 0);
    }

    public static ilo b(lda ldaVar, lda ldaVar2, lda ldaVar3, lda ldaVar4, hur hurVar, huq huqVar, huf hufVar, hug hugVar) {
        return new ilo(ldaVar, ldaVar2, ldaVar3, ldaVar4, hurVar, huqVar, hufVar, hugVar);
    }

    public static hcv c(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8) {
        return new hcv(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, qkgVar8, 1, (byte[]) null);
    }

    public static hcv d(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8) {
        return new hcv(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, qkgVar8, 2, (char[]) null);
    }

    public static hcv e(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8) {
        return new hcv(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, qkgVar8, 3, (short[]) null);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        ojc ojcVar;
        switch (this.i) {
            case 0:
                lnc lncVar = (lnc) this.a.get();
                Map map = (Map) this.b.get();
                ojc ojcVar2 = (ojc) this.c.get();
                qkg qkgVar = this.d;
                qkg qkgVar2 = this.e;
                ddf ddfVar = (ddf) this.f.get();
                qkg qkgVar3 = this.g;
                jrl jrlVar = ((giv) this.h).get();
                obr.aQ(map.containsKey(hdr.RAW_WIDE));
                EnumMap enumMap = new EnumMap(hdr.class);
                for (hdr hdrVar : map.keySet()) {
                    opc opcVarD = ope.D();
                    lnx lnxVar = (lnx) map.get(hdrVar);
                    lnxVar.getClass();
                    opcVarD.d(lnxVar);
                    if (hdrVar.equals(hdr.RAW_WIDE) && map.containsKey(hdr.RAW_ULTRAWIDE) && ddfVar.k(ddm.ap) && jrlVar.equals(jrl.PHOTO)) {
                        lnx lnxVar2 = (lnx) map.get(hdr.RAW_ULTRAWIDE);
                        lnxVar2.getClass();
                        opcVarD.d(lnxVar2);
                    }
                    ope opeVarF = opcVarD.f();
                    ojc ojcVar3 = hdrVar == hdr.RAW_WIDE ? (ojc) qkgVar.get() : oih.a;
                    if (ddfVar.k(ddm.am) || ((hvj) qkgVar3.get()).b()) {
                        ojcVar = ojcVar2;
                    } else {
                        fvq.r(jrlVar, ddfVar);
                        ojcVar = oih.a;
                    }
                    lqd lqdVar = (lqd) fvq.q(lncVar, opeVarF, ojcVar, ojcVar3, oih.a, qkgVar2).f();
                    lqdVar.getClass();
                    enumMap.put(hdrVar, lqdVar);
                    lncVar = lncVar;
                }
                return enumMap;
            case 1:
                lvp lvpVar = ((gjp) this.h).get();
                Set set = ((pyw) this.e).get();
                Set set2 = ((pyw) this.c).get();
                gvm gvmVar = (gvm) this.f.get();
                lnt lntVar = (lnt) this.d.get();
                lnt lntVar2 = (lnt) this.a.get();
                dkg dkgVar = (dkg) this.g.get();
                ope opeVar = (ope) this.b.get();
                lne lneVarA = lnf.a();
                lneVarA.f(lvpVar.i());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    lneVarA.d((lnz) it.next());
                }
                if (!set2.isEmpty()) {
                    lneVarA.c(set2);
                }
                lneVarA.k(gvmVar);
                lneVarA.e(dkgVar);
                lneVarA.j(lntVar);
                lneVarA.i(lntVar2);
                lneVarA.h(opeVar);
                return lneVarA.a();
            case 2:
                return new hef((hcg) this.f.get(), ((dzw) this.b).get(), (ojc) this.d.get(), pyr.a(this.e), (Executor) this.g.get(), (nvb) this.c.get(), (heu) this.a.get(), (eeu) this.h.get(), null, null);
            case 3:
                hcg hcgVar = (hcg) this.f.get();
                nvb nvbVar = (nvb) this.b.get();
                hoh hohVar = ((hoi) this.d).get();
                ghx ghxVar = ((gjo) this.e).get();
                Executor executor = (Executor) this.g.get();
                ljf ljfVar = (ljf) this.c.get();
                return new hel(hcgVar, nvbVar, hohVar, ghxVar, executor, ljfVar, (ddf) this.a.get(), null, null);
            case 4:
                return new hwm(((enb) this.c).get(), (ddf) this.g.get(), (lzh) this.h.get(), (huf) this.f.get(), (hug) this.e.get(), (hwp) this.b.get(), this.d, ((jtn) this.a).get());
            case 5:
                final lar larVar = (lar) this.b.get();
                final pyn pynVarA = pyr.a(this.c);
                final pyn pynVarA2 = pyr.a(this.a);
                final pih pihVar = (pih) this.g.get();
                final pyn pynVarA3 = pyr.a(this.d);
                final pih pihVar2 = (pih) this.e.get();
                gxm gxmVar = ((djc) this.f).get();
                final bqg bqgVar = ((etg) this.h).get();
                gxmVar.f();
                return ope.H(new iho() { // from class: hxc
                    @Override // java.lang.Runnable
                    public final void run() {
                        pih pihVar3 = pihVar2;
                        pyn pynVar = pynVarA3;
                        pyn pynVar2 = pynVarA2;
                        pih pihVar4 = pihVar;
                        bqg bqgVar2 = bqgVar;
                        pyn pynVar3 = pynVarA;
                        lar larVar2 = larVar;
                        pihVar3.o((hzo) pynVar.get());
                        pihVar4.o((hza) pynVar2.get());
                        lap lapVarI = bqgVar2.i();
                        final iac iacVar = (iac) pynVar3.get();
                        iacVar.getClass();
                        lapVarI.c(new eqc(plk.Y(new Runnable() { // from class: hxd
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r4v1, types: [hxi, iao] */
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
                            @Override // java.lang.Runnable
                            public final void run() {
                                iac iacVar2 = iacVar;
                                lar.a();
                                iacVar2.h.e("SmartUiWirer#wire");
                                ReplaceableView replaceableView = (ReplaceableView) iacVar2.d.c(R.id.smarts_ui_replaceableview);
                                Object objC = iacVar2.d.c(R.id.smarts_ui_overlay);
                                Object objC2 = iacVar2.d.c(R.id.smarts_preview_overlay);
                                ?? r4 = iacVar2.a;
                                Context context = iacVar2.c;
                                gvb gvbVar = iacVar2.f;
                                elw elwVar = iacVar2.i;
                                lar.a();
                                final hza hzaVar = (hza) r4;
                                hzaVar.z = gvbVar;
                                hzaVar.x = (View) objC;
                                hzaVar.y = (View) objC2;
                                hzaVar.y.addOnLayoutChangeListener(new hyu(hzaVar));
                                try {
                                    hzz hzzVar = ((hza) r4).l;
                                    View viewInflate = LayoutInflater.from(replaceableView.getContext()).inflate(R.layout.smarts_layout, (ViewGroup) replaceableView.getParent(), false);
                                    replaceableView.a(viewInflate);
                                    FrameLayout frameLayout = (FrameLayout) viewInflate;
                                    hzzVar.a = (SmartsChipView) frameLayout.findViewById(R.id.smarts_notification_area);
                                    hzzVar.b = (SmartsUiGleamingView) frameLayout.findViewById(R.id.gleaming_view);
                                    hzzVar.c = gvbVar;
                                    hzzVar.d = elwVar;
                                    hzzVar.e = new HashMap();
                                    hzaVar.o.o(true);
                                    final hyz hyzVar = new hyz(hzaVar);
                                    hzaVar.d.a(hyzVar);
                                    hzaVar.n.c(new lie() { // from class: hye
                                        @Override // defpackage.lie, java.lang.AutoCloseable
                                        public final void close() {
                                            hza hzaVar2 = hzaVar;
                                            hzaVar2.d.i(hyzVar);
                                        }
                                    });
                                    hzaVar.n.c(hzaVar.k.a(r4));
                                    hzaVar.n.c(hzaVar.h.a(new hyg(hzaVar, 0), mip.bS()));
                                    hzo hzoVar = iacVar2.b;
                                    cvo cvoVar = iacVar2.e;
                                    final jng jngVar = iacVar2.g;
                                    lar.a();
                                    jngVar.getClass();
                                    hzoVar.i = new Callable() { // from class: hzk
                                        @Override // java.util.concurrent.Callable
                                        public final Object call() {
                                            return jngVar.c();
                                        }
                                    };
                                    hzoVar.h = cvoVar;
                                    hzoVar.l = true;
                                    iacVar2.h.g("addObserver");
                                    iacVar2.h.f();
                                } catch (Throwable th) {
                                    hzaVar.o.o(true);
                                    throw th;
                                }
                            }
                        }, larVar2), 2));
                    }
                });
            case 6:
                gxm gxmVar2 = ((djc) this.g).get();
                final lap lapVar = (lap) this.e.get();
                Object obj = this.b.get();
                final lnc lncVar2 = (lnc) this.a.get();
                final ojc ojcVar4 = (ojc) this.h.get();
                final qkg qkgVar4 = this.c;
                final gaz gazVar = (gaz) this.d.get();
                final hcg hcgVar2 = (hcg) this.f.get();
                final hxj hxjVar = (hxj) obj;
                gxmVar2.f();
                Object objH = ojcVar4.g() ? ope.H(aas.d(new Runnable() { // from class: hxp
                    @Override // java.lang.Runnable
                    public final void run() {
                        lnc lncVar3 = lncVar2;
                        final ojc ojcVar5 = ojcVar4;
                        final hxj hxjVar2 = hxjVar;
                        lap lapVar2 = lapVar;
                        qkg qkgVar5 = qkgVar4;
                        hcg hcgVar3 = hcgVar2;
                        gaz gazVar2 = gazVar;
                        lmv lmvVarR = lncVar3.r(lncVar3.s((lnx) ojcVar5.c()), 3);
                        lmvVarR.k(new lmu() { // from class: hxo
                            @Override // defpackage.lmu
                            public final void a(lrr lrrVar) {
                                hxjVar2.h(lrrVar, (lnx) ojcVar5.c());
                            }
                        });
                        lapVar2.c(lmvVarR);
                        lapVar2.c(new lie() { // from class: hxn
                            @Override // defpackage.lie, java.lang.AutoCloseable
                            public final void close() {
                                hxj hxjVar3 = hxjVar2;
                                hxjVar3.g(oih.a);
                                hxjVar3.f(oih.a);
                            }
                        });
                        hxjVar2.f(ojc.i(new hxq(qkgVar5, hcgVar3)));
                        hxjVar2.g(ojc.i(gazVar2));
                    }
                }, "pcksmarts")) : orx.a;
                qmd.ae(objH);
                return objH;
            case 7:
                ((emd) this.h).get();
                return new hzo((Executor) this.g.get(), (fjs) this.c.get(), (hzz) this.b.get(), (huq) this.a.get(), (jcw) this.e.get(), (fvv) this.d.get(), (jty) this.f.get(), null);
            case 8:
                return new ibe(this.c, this.g, (icf) this.b.get(), (lar) this.e.get(), (Handler) this.a.get(), ((eme) this.h).get(), ((dto) this.d).get(), (eam) this.f.get());
            case 9:
                return b((lda) this.f.get(), (lda) this.h.get(), (lda) this.a.get(), (lda) this.g.get(), (hur) this.c.get(), (huq) this.b.get(), (huf) this.e.get(), (hug) this.d.get());
            case 10:
                return new ilq(((emd) this.g).get(), (lda) this.f.get(), (hnx) this.e.get(), ((ilh) this.b).get(), (fjs) this.c.get(), (lar) this.d.get(), ((etj) this.h).get(), (ddf) this.a.get());
            case 11:
                return new ink((khx) this.h.get(), (cvo) this.g.get(), (lzi) this.f.get(), this.e, (ddf) this.d.get(), ((cpk) this.b).get(), (cpp) this.c.get(), gfp.e(), (lda) this.a.get(), null, null, null);
            case 12:
                return new iud(((etg) this.h).get(), ((bpm) this.g).get(), ((emd) this.a).get(), (dmh) this.f.get(), (ddf) this.e.get(), ((hlj) this.b).a(), (lar) this.d.get(), (jhh) this.c.get());
            case 13:
                bqg bqgVar2 = ((etg) this.h).get();
                ius iusVar = (ius) this.a.get();
                cvo cvoVar = (cvo) this.f.get();
                lar larVar2 = (lar) this.d.get();
                ojc ojcVarA = ((hlj) this.b).a();
                ojc ojcVarA2 = ((cjc) this.c).a();
                lda ldaVar = (lda) this.g.get();
                lda ldaVar2 = (lda) this.e.get();
                lap lapVarI = bqgVar2.i();
                jzf jzfVar = new jzf(bqgVar2, iusVar, cvoVar, larVar2, ojcVarA, ojcVarA2, ldaVar, ldaVar2);
                lapVarI.c(jzfVar);
                return jzfVar;
            case 14:
                return new llp(((lkl) this.g).get(), dkb.a, (lld) this.d.get(), (Executor) this.a.get(), (llt) this.f.get(), (ljp) this.h.get(), (ljf) this.c.get(), ((liq) this.b).get(), ((cxd) this.e).get(), null);
            case 15:
                return new nai(((mxn) this.b).get(), ((emp) this.a).a(), (mwe) this.h.get(), (phw) this.e.get(), pyr.a(this.g), pyr.a(this.d), this.c, (Executor) this.f.get());
            default:
                qqf qqfVar = (qqf) this.g.get();
                nou nouVar = (nou) this.c.get();
                nql nqlVar = (nql) this.d.get();
                mdf mdfVar = (mdf) this.h.get();
                nrm nrmVar = (nrm) this.a.get();
                ((nsw) this.b).get();
                return new ohh(qqfVar, nouVar, nqlVar, mdfVar, nrmVar, (nrk) this.e.get(), (qbt) this.f.get());
        }
    }
}
