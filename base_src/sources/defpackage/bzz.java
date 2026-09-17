package defpackage;

import android.animation.AnimatorSet;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bzz implements Runnable {
    public final /* synthetic */ caa a;
    private final /* synthetic */ int b;

    public /* synthetic */ bzz(caa caaVar, int i) {
        this.b = i;
        this.a = caaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                caa caaVar = this.a;
                final cac cacVar = caaVar.c;
                final int i = 0;
                cacVar.animate().withStartAction(new Runnable() { // from class: cab
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                cac cacVar2 = cacVar;
                                cacVar2.setAlpha(0.0f);
                                cacVar2.setVisibility(0);
                                break;
                            default:
                                cacVar.setVisibility(8);
                                break;
                        }
                    }
                }).alpha(1.0f).setDuration(cacVar.getResources().getInteger(R.integer.autotimer_tutorial_background_anim_duration)).start();
                bzy bzyVar = caaVar.d;
                AnimatorSet animatorSetClone = bzyVar.c.clone();
                animatorSetClone.setTarget(bzyVar.a);
                AnimatorSet animatorSetClone2 = bzyVar.c.clone();
                animatorSetClone2.setTarget(bzyVar.b);
                AnimatorSet animatorSet = bzyVar.g;
                if (animatorSet != null) {
                    obr.ao(animatorSet);
                    animatorSet.end();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.play(animatorSetClone).after(bzyVar.getResources().getInteger(R.integer.autotimer_tutorial_text_title_delay));
                animatorSet2.play(animatorSetClone2).after(bzyVar.getResources().getInteger(R.integer.autotimer_tutorial_text_body_delay));
                animatorSet2.addListener(new bzw(bzyVar));
                animatorSet2.setInterpolator(bzyVar.f);
                animatorSet2.start();
                bzyVar.g = animatorSet2;
                break;
            default:
                caa caaVar2 = this.a;
                final cac cacVar2 = caaVar2.c;
                final int i2 = 1;
                cacVar2.animate().alpha(0.0f).withEndAction(new Runnable() { // from class: cab
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                cac cacVar3 = cacVar2;
                                cacVar3.setAlpha(0.0f);
                                cacVar3.setVisibility(0);
                                break;
                            default:
                                cacVar2.setVisibility(8);
                                break;
                        }
                    }
                }).setDuration(cacVar2.getResources().getInteger(R.integer.autotimer_tutorial_background_anim_duration)).start();
                bzy bzyVar2 = caaVar2.d;
                if (bzyVar2.getVisibility() != 8) {
                    AnimatorSet animatorSetClone3 = bzyVar2.d.clone();
                    animatorSetClone3.setTarget(bzyVar2.a);
                    AnimatorSet animatorSetClone4 = bzyVar2.d.clone();
                    animatorSetClone4.setTarget(bzyVar2.b);
                    AnimatorSet animatorSet3 = bzyVar2.g;
                    if (animatorSet3 != null) {
                        obr.ao(animatorSet3);
                        animatorSet3.end();
                    }
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    animatorSet4.setInterpolator(bzyVar2.e);
                    animatorSet4.play(animatorSetClone3).after(bzyVar2.getResources().getInteger(R.integer.autotimer_tutorial_text_body_delay));
                    animatorSet4.play(animatorSetClone4).after(bzyVar2.getResources().getInteger(R.integer.autotimer_tutorial_text_title_delay));
                    animatorSet4.addListener(new bzx(bzyVar2));
                    animatorSet4.start();
                    bzyVar2.g = animatorSet4;
                    break;
                }
                break;
        }
    }
}
