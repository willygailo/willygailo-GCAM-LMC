package defpackage;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.VectorDrawable;
import android.widget.ImageButton;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.optionsbar.common.LinearMinibarImpl;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuContainer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jqc implements Runnable {
    public final /* synthetic */ jqi a;
    private final /* synthetic */ int b;

    public /* synthetic */ jqc(jqi jqiVar, int i) {
        this.b = i;
        this.a = jqiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pht phtVarO;
        int i = 2;
        int i2 = 0;
        switch (this.b) {
            case 0:
                jqi jqiVar = this.a;
                gtg gtgVar = jqiVar.h;
                if (gtgVar.bf.g()) {
                    ((gts) gtgVar.bf.c()).h(htf.OFF);
                } else {
                    gtgVar.aV.i().setVisibility(8);
                }
                gtg gtgVar2 = jqiVar.h;
                if (!gtgVar2.e.k(ddv.e)) {
                    OptionsMenuContainer optionsMenuContainer = gtgVar2.aV;
                    optionsMenuContainer.j().setVisibility(8);
                    optionsMenuContainer.k().setVisibility(0);
                    optionsMenuContainer.h().setVisibility(0);
                }
                break;
            case 1:
                final jqi jqiVar2 = this.a;
                jqiVar2.a.c(new Runnable() { // from class: jqb
                    /* JADX WARN: Code duplicated, block: B:20:0x0085  */
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z;
                        jqi jqiVar3 = jqiVar2;
                        if (jqiVar3.c.h()) {
                            ddf ddfVar = jqiVar3.k;
                            ddi ddiVar = ddr.a;
                            ddfVar.c();
                            if (hls.d(((Integer) jqiVar3.d.fA()).intValue()) == 1 || ((jqiVar3.i.d() == lwd.FRONT && ((String) ((lce) jqiVar3.m).d).equals(gqt.ON.d)) || ((jqiVar3.i.d() == lwd.BACK && ((String) ((lce) jqiVar3.l).d).equals(gqt.ON.d)) || ((Boolean) jqiVar3.n.a().fA()).booleanValue() || ((Boolean) jqiVar3.o.a().fA()).booleanValue()))) {
                                z = false;
                            } else {
                                z = true;
                            }
                        } else {
                            z = false;
                        }
                        htf htfVar = (htf) jqiVar3.g.fA();
                        boolean z2 = jqiVar3.f.fA().booleanValue() && jqiVar3.k.k(dda.e) && htfVar != htf.OFF;
                        if (z || z2) {
                            gtg gtgVar3 = jqiVar3.h;
                            if (!gtgVar3.e.k(ddv.e)) {
                                OptionsMenuContainer optionsMenuContainer2 = gtgVar3.aV;
                                optionsMenuContainer2.h().setVisibility(8);
                                optionsMenuContainer2.k().setVisibility(8);
                                optionsMenuContainer2.j().setVisibility(0);
                            }
                        }
                        if (z) {
                            gtg gtgVar4 = jqiVar3.h;
                            if (gtgVar4.bf.g()) {
                                int iIntValue = ((Integer) gtgVar4.y.fA()).intValue();
                                gts gtsVar = (gts) gtgVar4.bf.c();
                                gtsVar.e();
                                LinearMinibarImpl linearMinibarImpl = gtsVar.b;
                                if (iIntValue == 1) {
                                    linearMinibarImpl.g().setVisibility(0);
                                    linearMinibarImpl.c().setVisibility(8);
                                } else {
                                    linearMinibarImpl.c().setVisibility(0);
                                    linearMinibarImpl.g().setVisibility(8);
                                }
                            } else {
                                OptionsMenuContainer optionsMenuContainer3 = gtgVar4.aV;
                                ImageButton imageButton = optionsMenuContainer3.p;
                                VectorDrawable vectorDrawable = optionsMenuContainer3.r;
                                AnimatedVectorDrawable animatedVectorDrawable = optionsMenuContainer3.q;
                                if (imageButton != null && vectorDrawable != null && animatedVectorDrawable != null) {
                                    animatedVectorDrawable.reset();
                                    animatedVectorDrawable.start();
                                    if (optionsMenuContainer3.s) {
                                        optionsMenuContainer3.o.cancel();
                                    } else {
                                        if (optionsMenuContainer3.o.isRunning()) {
                                            optionsMenuContainer3.o.cancel();
                                        }
                                        optionsMenuContainer3.n.setTarget(vectorDrawable);
                                        optionsMenuContainer3.n.start();
                                    }
                                    optionsMenuContainer3.s = true;
                                }
                            }
                        }
                        if (z2) {
                            gtg gtgVar5 = jqiVar3.h;
                            if (gtgVar5.bf.g()) {
                                ((gts) gtgVar5.bf.c()).h(htfVar);
                                return;
                            }
                            OptionsMenuContainer optionsMenuContainer4 = gtgVar5.aV;
                            htf htfVar2 = htf.OFF;
                            jrz jrzVar = jrz.PORTRAIT;
                            switch (htfVar.ordinal()) {
                                case 1:
                                    optionsMenuContainer4.i().setImageResource(R.drawable.ic_faceretouch_on_light);
                                    break;
                                case 2:
                                    optionsMenuContainer4.i().setImageResource(R.drawable.ic_faceretouch_on_strong);
                                    break;
                                default:
                                    ((oug) ((oug) OptionsMenuContainer.a.b()).G((char) 2150)).o("Unknown retouching level");
                                    break;
                            }
                            optionsMenuContainer4.i().setRotation(mip.eq(optionsMenuContainer4.b));
                            optionsMenuContainer4.i().setVisibility(0);
                        }
                    }
                });
                break;
            case 2:
                jqi jqiVar3 = this.a;
                gtg gtgVar3 = jqiVar3.h;
                if (gtgVar3.bf.g()) {
                    gts gtsVar = (gts) gtgVar3.bf.c();
                    LinearMinibarImpl linearMinibarImpl = gtsVar.b;
                    linearMinibarImpl.c().setVisibility(8);
                    linearMinibarImpl.g().setVisibility(8);
                    gtsVar.f();
                    pih pihVarF = pih.f();
                    gtgVar3.aV.postDelayed(new eqo(pihVarF, 2), gtgVar3.aV.getResources().getInteger(R.integer.motion_animation_duration));
                    phtVarO = pihVarF;
                } else {
                    phtVarO = gtgVar3.aV.o();
                }
                phtVarO.d(new jqc(jqiVar3, i2), pgr.INSTANCE);
                break;
            default:
                jqi jqiVar4 = this.a;
                jqiVar4.a.c(new jqc(jqiVar4, i));
                break;
        }
    }
}
