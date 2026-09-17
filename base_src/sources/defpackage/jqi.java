package defpackage;

import android.content.Context;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.optionsbar.common.LinearMinibarImpl;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuContainer;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jqi implements jqn {
    public final lar a;
    public final ojc b;
    public final fnu c;
    public final lda d;
    public final lda e;
    public final dom f;
    public final lco g;
    public final gtg h;
    public final cvo i;
    public final pyn j;
    public final ddf k;
    public final lco l;
    public final lco m;
    public final eam n;
    public final imf o;
    public final bqg p;
    private final qkg q;
    private final BottomBarController r;
    private final pyn s;
    private final dlt t;
    private final lap u;
    private final jbe v;

    public jqi(qkg qkgVar, bqg bqgVar, lar larVar, lda ldaVar, lda ldaVar2, dom domVar, lco lcoVar, jbe jbeVar, ojc ojcVar, fnu fnuVar, BottomBarController bottomBarController, gtg gtgVar, cvo cvoVar, pyn pynVar, pyn pynVar2, eam eamVar, ddf ddfVar, dlt dltVar, huf hufVar, imf imfVar) {
        this.q = qkgVar;
        this.p = bqgVar;
        this.u = bqgVar.i();
        this.a = larVar;
        this.v = jbeVar;
        this.b = ojcVar;
        this.c = fnuVar;
        this.d = ldaVar;
        this.f = domVar;
        this.g = lcoVar;
        this.e = ldaVar2;
        this.r = bottomBarController;
        this.h = gtgVar;
        this.i = cvoVar;
        this.j = pynVar;
        this.s = pynVar2;
        this.k = ddfVar;
        this.t = dltVar;
        this.l = hufVar.a(htu.i);
        this.m = hufVar.a(htu.j);
        this.n = eamVar;
        this.o = imfVar;
    }

    /* JADX WARN: Type inference failed for: r2v91, types: [gtt, java.lang.Object] */
    @Override // defpackage.jqn
    public final void a() {
        obr.aQ(lar.d());
        OptionsMenuContainer optionsMenuContainer = ((jnw) this.q).get().h;
        final gtg gtgVar = this.h;
        obr.aQ(lar.d());
        gtgVar.d.e("OptionsBarCtrl#wire");
        gtgVar.aT = optionsMenuContainer.n();
        gtgVar.aT.k = gtgVar;
        final int i = 1;
        final int i2 = 0;
        if (gtgVar.e.k(ddv.d)) {
            OptionsMenuView optionsMenuView = gtgVar.aT;
            optionsMenuView.g = true;
            LinearLayout linearLayout = optionsMenuView.l;
            linearLayout.getClass();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 0, 0);
            optionsMenuView.l.setLayoutParams(marginLayoutParams);
        }
        gtgVar.aV = optionsMenuContainer;
        gtgVar.aV.p(new gte(gtgVar, optionsMenuContainer));
        gtgVar.aV.t = gtgVar.j;
        gtgVar.aU = optionsMenuContainer.d();
        int i3 = 8;
        if (gtgVar.bf.g()) {
            View viewA = optionsMenuContainer.a();
            final gts gtsVar = (gts) gtgVar.bf.c();
            gtsVar.b = (LinearMinibarImpl) viewA;
            gtsVar.b.setOnClickListener(new View.OnClickListener() { // from class: gtq
                /* JADX WARN: Type inference failed for: r0v1, types: [gtt, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r2v3, types: [gtt, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r2v5, types: [gtt, java.lang.Object] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    gts gtsVar2 = gtsVar;
                    if (gtsVar2.a.get().F()) {
                        gtsVar2.a.get().g();
                    } else {
                        gtsVar2.a.get().n();
                    }
                }
            });
            gtsVar.a.get().f(gtsVar);
            gtgVar.x(false);
        } else {
            optionsMenuContainer.b().setVisibility(8);
        }
        final Context context = optionsMenuContainer.getContext();
        if (gtgVar.e.k(ddv.d)) {
            View viewE = gtgVar.aV.e();
            viewE.setOnClickListener(new gss(gtgVar, i2));
            viewE.setOnLongClickListener(new View.OnLongClickListener() { // from class: gst
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    String string;
                    Context context2 = context;
                    long jB = hwv.b(context2);
                    if (jB == -1) {
                        return false;
                    }
                    if (jB != hwv.a(context2, 2097152)) {
                        StringBuilder sb = new StringBuilder(27);
                        sb.append("<b>");
                        sb.append(jB);
                        sb.append("</b>");
                        string = sb.toString();
                    } else {
                        string = Long.toString(jB);
                    }
                    Toast.makeText(context2, Html.fromHtml(context2.getString(R.string.camera_hal_version_message, string), 63), 1).show();
                    return true;
                }
            });
        } else {
            gtgVar.aW = new ImageButton(context, null, 0, R.style.options_bar_rightside_option);
            gtgVar.aW.setImageResource(R.drawable.quantum_gm_ic_settings_white_24);
            gtgVar.aW.setContentDescription(context.getResources().getString(R.string.settings_open_desc));
            gtgVar.aW.setOnClickListener(new gss(gtgVar, i));
        }
        jgv jgvVar = new jgv();
        jgvVar.f = context;
        jgvVar.h = gtgVar.e.k(ddl.ay);
        boolean zK = gtgVar.e.k(dcu.r);
        optionsMenuContainer.y = zK;
        if (zK) {
            jgvVar.a = false;
            jgvVar.b = 5000;
            jgvVar.e = optionsMenuContainer.k.getResources().getString(R.string.external_wired_mic_connected);
            optionsMenuContainer.v = jgvVar.a();
            jgvVar.a = false;
            jgvVar.b = 5000;
            jgvVar.e = optionsMenuContainer.k.getResources().getString(R.string.external_wired_mic_disconnected);
            optionsMenuContainer.w = jgvVar.a();
        } else {
            jgvVar.a = true;
            jgvVar.e = optionsMenuContainer.k.getResources().getString(R.string.external_mic_portrait);
            optionsMenuContainer.v = jgvVar.a();
        }
        gtgVar.bj.c(gtgVar.b.a(new gsr(gtgVar, 4), pgr.INSTANCE));
        final int i4 = 2;
        gtgVar.bj.c(lcv.b(lcv.j(gtgVar.v, eto.o), lcv.j(gtgVar.x, eto.p)).a(new lij() { // from class: gsv
            @Override // defpackage.lij
            public final void fB(Object obj) {
                gtg gtgVar2 = gtgVar;
                if (!gtgVar2.ax) {
                    boolean z = false;
                    if (!gtgVar2.e.k(dcu.r)) {
                        gtgVar2.aV.y(gtgVar2.aY, ((Boolean) gtgVar2.v.fA()).booleanValue(), false);
                    } else {
                        if (!gtgVar2.H()) {
                            return;
                        }
                        boolean z2 = ((hth) gtgVar2.u.fA()).equals(hth.EXT_WIRED) && gtgVar2.ap && !((Boolean) gtgVar2.v.fA()).booleanValue();
                        if (((hth) gtgVar2.u.fA()).equals(hth.EXT_BLUETOOTH) && gtgVar2.aq && ((String) gtgVar2.x.fA()).isEmpty()) {
                            z = true;
                        }
                        if (z2 || z) {
                            ((oug) ((oug) gtg.a.c()).G((char) 2128)).r("Disconnected. Reset to phone mic from %s", gtgVar2.u.fA());
                            gtgVar2.u.fB(hth.PHONE);
                            OptionsMenuContainer optionsMenuContainer2 = gtgVar2.aV;
                            elw elwVar = gtgVar2.aY;
                            synchronized (optionsMenuContainer2) {
                                try {
                                    if (elwVar != null) {
                                        if (optionsMenuContainer2.x == null) {
                                            optionsMenuContainer2.x = elwVar;
                                        }
                                        if (optionsMenuContainer2.w != null) {
                                            optionsMenuContainer2.v(elwVar);
                                            jgu jguVar = optionsMenuContainer2.w;
                                            if (jguVar != null) {
                                                if (z2) {
                                                    jguVar.s(optionsMenuContainer2.k.getResources().getString(R.string.external_wired_mic_disconnected));
                                                } else {
                                                    jguVar.s(optionsMenuContainer2.k.getResources().getString(R.string.external_bluetooth_mic_disconnected));
                                                }
                                            }
                                            jgu jguVar2 = optionsMenuContainer2.w;
                                            jguVar2.getClass();
                                            elwVar.d(jguVar2);
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        } else {
                            gtgVar2.aV.y(gtgVar2.aY, ((Boolean) gtgVar2.v.fA()).booleanValue(), !((String) gtgVar2.x.fA()).isEmpty());
                        }
                        gtgVar2.ap = ((Boolean) gtgVar2.v.fA()).booleanValue();
                        gtgVar2.aq = !((String) gtgVar2.x.fA()).isEmpty();
                    }
                } else if (((hth) gtgVar2.u.fA()).equals(hth.EXT_BLUETOOTH) && gtgVar2.aq && ((String) gtgVar2.x.fA()).isEmpty()) {
                    ((oug) ((oug) gtg.a.c()).G((char) 2129)).o("Bluetooth is disconnected during recording. Reset to phone mic");
                    gtgVar2.u.fB(hth.PHONE);
                }
                gtgVar2.p(true);
            }
        }, gtgVar.c));
        gtgVar.bj.c(gtgVar.w.a(new gsr(gtgVar, 16), gtgVar.c));
        gtgVar.bj.c(gtgVar.al.a(new gsr(gtgVar, 6), pgr.INSTANCE));
        gtgVar.bj.c(gtgVar.o.a(new gsr(gtgVar, 7), pgr.INSTANCE));
        gtgVar.bj.c(gtgVar.an.a(new gsr(gtgVar, i3), pgr.INSTANCE));
        gtgVar.bj.c(gtgVar.am.a(new gsr(gtgVar, 9), pgr.INSTANCE));
        gtgVar.bj.c(gtgVar.F.a(new gsr(gtgVar, 18), pgr.INSTANCE));
        gtgVar.bj.c(gtgVar.G.a(new lij() { // from class: gsu
            @Override // defpackage.lij
            public final void fB(Object obj) {
                switch (i4) {
                    case 0:
                        gtgVar.w();
                        break;
                    case 1:
                        gtgVar.w();
                        break;
                    default:
                        gtg gtgVar2 = gtgVar;
                        String str = (String) obj;
                        if (str != null) {
                            gtgVar2.I(hls.h(((Integer) ((lce) gtgVar2.F).d).intValue()), lwd.BACK, str);
                            gtgVar2.I(hls.h(((Integer) ((lce) gtgVar2.F).d).intValue()), lwd.FRONT, str);
                        }
                        break;
                }
            }
        }, pgr.INSTANCE));
        int i5 = 3;
        gtgVar.bj.c(gtgVar.L.a(new gsr(gtgVar, i5), pgr.INSTANCE));
        if (gtgVar.bf.g()) {
            gtgVar.bj.c(gtgVar.p.a(new gsr(gtgVar, 19), gtgVar.c));
            gtgVar.bj.c(gtgVar.r.a(new gsr(gtgVar, 20), gtgVar.c));
            gtgVar.bj.c(gtgVar.u.a(new gsr(gtgVar, i2), gtgVar.c));
        }
        gtgVar.bj.c(gtgVar.f.b().a(new gsr(gtgVar, 11), gtgVar.c));
        gtgVar.bj.c(gtgVar.ao.a(new gsr(gtgVar, 12), gtgVar.c));
        gtgVar.bj.c(gtgVar.p.a(new lij() { // from class: gsu
            @Override // defpackage.lij
            public final void fB(Object obj) {
                switch (i) {
                    case 0:
                        gtgVar.w();
                        break;
                    case 1:
                        gtgVar.w();
                        break;
                    default:
                        gtg gtgVar2 = gtgVar;
                        String str = (String) obj;
                        if (str != null) {
                            gtgVar2.I(hls.h(((Integer) ((lce) gtgVar2.F).d).intValue()), lwd.BACK, str);
                            gtgVar2.I(hls.h(((Integer) ((lce) gtgVar2.F).d).intValue()), lwd.FRONT, str);
                        }
                        break;
                }
            }
        }, gtgVar.c));
        gtgVar.bj.c(gtgVar.q.a(new lij() { // from class: gsu
            @Override // defpackage.lij
            public final void fB(Object obj) {
                switch (i2) {
                    case 0:
                        gtgVar.w();
                        break;
                    case 1:
                        gtgVar.w();
                        break;
                    default:
                        gtg gtgVar2 = gtgVar;
                        String str = (String) obj;
                        if (str != null) {
                            gtgVar2.I(hls.h(((Integer) ((lce) gtgVar2.F).d).intValue()), lwd.BACK, str);
                            gtgVar2.I(hls.h(((Integer) ((lce) gtgVar2.F).d).intValue()), lwd.FRONT, str);
                        }
                        break;
                }
            }
        }, gtgVar.c));
        gtgVar.bj.c(gtgVar.m.a(new gsr(gtgVar, i), gtgVar.c));
        gtgVar.bj.c(gtgVar.H.a(new gsr(gtgVar, 13), gtgVar.c));
        gtgVar.bj.c(gtgVar.O.a().a(new gsr(gtgVar, 14), gtgVar.c));
        gtgVar.bj.c(gtgVar.P.a().a(new gsr(gtgVar, 15), gtgVar.c));
        gtgVar.bj.c(gtgVar.b.a(new gsr(gtgVar, 5), gtgVar.c));
        gtgVar.bj.c(gtgVar.I.a(new gsr(gtgVar, 17), gtgVar.c));
        gtgVar.bj.c(gtgVar.l.a(new gsr(gtgVar, i4), pgr.INSTANCE));
        gtgVar.m(gtgVar.l, gtgVar.aA, gtgVar.R);
        gtgVar.m(gtgVar.l, gtgVar.aA, gtgVar.Q);
        gtgVar.m(gtgVar.m, gtgVar.aB, gtgVar.S);
        gtgVar.m(gtgVar.n, gtgVar.aC, gtgVar.T);
        gtgVar.m(gtgVar.p, gtgVar.aD, gtgVar.U);
        gtgVar.m(gtgVar.q, gtgVar.aD, gtgVar.V);
        gtgVar.m(gtgVar.r, gtgVar.aP, gtgVar.W);
        gtgVar.m(gtgVar.s, gtgVar.aP, gtgVar.X);
        gtgVar.m(gtgVar.t, gtgVar.aP, gtgVar.Y);
        gtgVar.m(gtgVar.u, gtgVar.aH, gtgVar.ak);
        gtgVar.m(gtgVar.y, gtgVar.aL, gtgVar.Z);
        gtgVar.m(gtgVar.z, gtgVar.aI, gtgVar.aa);
        gtgVar.m(gtgVar.A, gtgVar.aJ, gtgVar.ab);
        gtgVar.m(gtgVar.B, gtgVar.aK, gtgVar.ac);
        gtgVar.m(gtgVar.C, gtgVar.aK, gtgVar.ad);
        gtgVar.m(gtgVar.E, gtgVar.aQ, gtgVar.ae);
        gtgVar.m(gtgVar.D, gtgVar.aM, gtgVar.ah);
        gtgVar.m(gtgVar.F, gtgVar.aN, gtgVar.af);
        gtgVar.m(gtgVar.L, gtgVar.aF, gtgVar.as);
        gtgVar.m(gtgVar.M, gtgVar.aG, gtgVar.ag);
        gtgVar.m(gtgVar.N, gtgVar.aO, gtgVar.ai);
        for (gto gtoVar : gtgVar.bh.keySet()) {
            gtgVar.m(gtoVar.f(), gtgVar.bi, (gtk) gtgVar.bh.get(gtoVar));
            gtgVar.aT.g((gtk) gtgVar.bh.get(gtoVar), gtoVar.e());
        }
        gtgVar.d.f();
        ojc ojcVarE = this.i.e();
        if (ojcVarE.g()) {
            this.h.J((ghx) ojcVarE.c());
        } else {
            dlt dltVar = this.t;
            String strName = this.i.d().name();
            StringBuilder sb = new StringBuilder(String.valueOf(strName).length() + 18);
            sb.append("No ");
            sb.append(strName);
            sb.append(" camera present");
            dltVar.e(new dlr(sb.toString(), lju.CAMERAS_NOT_ENUMERATED, this.i.d()));
        }
        optionsMenuContainer.setVisibility(0);
        ((jnw) this.q).get().c.u(new jqh(this));
        this.h.f(new jqg(this));
        this.r.addListener(new jqd(this));
        if (this.b.g()) {
            this.u.c(this.d.a(new lij(this) { // from class: jqa
                public final /* synthetic */ jqi a;

                {
                    this.a = this;
                }

                @Override // defpackage.lij
                public final void fB(Object obj) {
                    int i6;
                    String str;
                    switch (i2) {
                        case 0:
                            fox foxVar = (fox) this.a.b.c();
                            switch (hls.d(((Integer) obj).intValue()) - 1) {
                                case 0:
                                    i6 = 1;
                                    break;
                                case 1:
                                    i6 = 2;
                                    break;
                                default:
                                    i6 = 3;
                                    break;
                            }
                            foxVar.b = i6;
                            boolean zA = foxVar.a();
                            foxVar.a.g(zA);
                            if (zA) {
                                switch (i6 - 1) {
                                    case 1:
                                        foxVar.a.i(1);
                                        return;
                                    case 2:
                                        foxVar.a.i(2);
                                        return;
                                    default:
                                        switch (i6) {
                                            case 1:
                                                str = "MICROVIDEO_MODE_OFF";
                                                break;
                                            case 2:
                                                str = "MICROVIDEO_MODE_AUTO";
                                                break;
                                            default:
                                                str = "MICROVIDEO_MODE_ON";
                                                break;
                                        }
                                        StringBuilder sb2 = new StringBuilder(str.length() + 33);
                                        sb2.append("Unknown enabled microvideo mode: ");
                                        sb2.append(str);
                                        throw new RuntimeException(sb2.toString());
                                }
                            }
                            return;
                        default:
                            jqi jqiVar = this.a;
                            hti htiVar = (hti) obj;
                            if (jqiVar.p.f()) {
                                return;
                            }
                            if (htiVar == hti.AUTO) {
                                if (((bzg) jqiVar.j.get()).f()) {
                                    return;
                                }
                                bzg bzgVar = (bzg) jqiVar.j.get();
                                obr.aT(bzgVar.a.d == bzp.DISABLED, "Cannot transition to IDLE from %s", bzgVar.a.d);
                                bzgVar.d(bzp.IDLE);
                                if (jqiVar.h.F()) {
                                    return;
                                }
                                ((bzg) jqiVar.j.get()).c();
                                return;
                            }
                            if (((bzg) jqiVar.j.get()).f()) {
                                bzg bzgVar2 = (bzg) jqiVar.j.get();
                                obr.aT(bzgVar2.a.d == bzp.IDLE, "Cannot transition to DISABLED from %s", bzgVar2.a.d);
                                bzgVar2.d(bzp.DISABLED);
                                if (jqiVar.h.F()) {
                                    return;
                                }
                                ((bzg) jqiVar.j.get()).a();
                                return;
                            }
                            return;
                    }
                }
            }, this.a));
        }
        jbe jbeVar = this.v;
        jqc jqcVar = new jqc(this, i);
        jqc jqcVar2 = new jqc(this, i5);
        synchronized (jbeVar.a) {
            jbeVar.b = jqcVar;
            jbeVar.c = jqcVar2;
        }
        if (this.k.k(ddl.aP)) {
            this.u.c(this.e.a(new lij(this) { // from class: jqa
                public final /* synthetic */ jqi a;

                {
                    this.a = this;
                }

                @Override // defpackage.lij
                public final void fB(Object obj) {
                    int i6;
                    String str;
                    switch (i) {
                        case 0:
                            fox foxVar = (fox) this.a.b.c();
                            switch (hls.d(((Integer) obj).intValue()) - 1) {
                                case 0:
                                    i6 = 1;
                                    break;
                                case 1:
                                    i6 = 2;
                                    break;
                                default:
                                    i6 = 3;
                                    break;
                            }
                            foxVar.b = i6;
                            boolean zA = foxVar.a();
                            foxVar.a.g(zA);
                            if (zA) {
                                switch (i6 - 1) {
                                    case 1:
                                        foxVar.a.i(1);
                                        return;
                                    case 2:
                                        foxVar.a.i(2);
                                        return;
                                    default:
                                        switch (i6) {
                                            case 1:
                                                str = "MICROVIDEO_MODE_OFF";
                                                break;
                                            case 2:
                                                str = "MICROVIDEO_MODE_AUTO";
                                                break;
                                            default:
                                                str = "MICROVIDEO_MODE_ON";
                                                break;
                                        }
                                        StringBuilder sb2 = new StringBuilder(str.length() + 33);
                                        sb2.append("Unknown enabled microvideo mode: ");
                                        sb2.append(str);
                                        throw new RuntimeException(sb2.toString());
                                }
                            }
                            return;
                        default:
                            jqi jqiVar = this.a;
                            hti htiVar = (hti) obj;
                            if (jqiVar.p.f()) {
                                return;
                            }
                            if (htiVar == hti.AUTO) {
                                if (((bzg) jqiVar.j.get()).f()) {
                                    return;
                                }
                                bzg bzgVar = (bzg) jqiVar.j.get();
                                obr.aT(bzgVar.a.d == bzp.DISABLED, "Cannot transition to IDLE from %s", bzgVar.a.d);
                                bzgVar.d(bzp.IDLE);
                                if (jqiVar.h.F()) {
                                    return;
                                }
                                ((bzg) jqiVar.j.get()).c();
                                return;
                            }
                            if (((bzg) jqiVar.j.get()).f()) {
                                bzg bzgVar2 = (bzg) jqiVar.j.get();
                                obr.aT(bzgVar2.a.d == bzp.IDLE, "Cannot transition to DISABLED from %s", bzgVar2.a.d);
                                bzgVar2.d(bzp.DISABLED);
                                if (jqiVar.h.F()) {
                                    return;
                                }
                                ((bzg) jqiVar.j.get()).a();
                                return;
                            }
                            return;
                    }
                }
            }, this.a));
            this.u.c(((jlb) this.s.get()).d(new jqf(this)));
        }
        ((jnw) this.q).get().c.e(this.h);
        View view = (View) ((jnw) this.q).get().k.c(R.id.uncovered_preview_layout);
        view.setFocusable(true);
        this.h.f(new jqe(view));
    }
}
