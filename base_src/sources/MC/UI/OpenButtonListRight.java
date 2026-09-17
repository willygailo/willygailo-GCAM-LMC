package MC.UI;

import MC.UI.Button.HDRNet;
import MC.UI.Button.LDR;
import MC.UI.Button.Leica;
import MC.UI.Button.PAT;
import MC.UI.Button.PRO;
import MC.UI.Button.Upscale;
import MC.Utils;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class OpenButtonListRight extends LinearLayout implements View.OnClickListener {
    ArrayList<View> OpenButtonListHolder;
    OvershootInterpolator interpolator;
    Boolean isMenuOpen;
    int marginw;
    int sizew;
    int sizewx;
    int translationY;

    public OpenButtonListRight(Context context) {
        super(context);
        this.interpolator = new OvershootInterpolator();
        this.isMenuOpen = false;
        this.translationY = 100;
        this.sizew = (int) TypedValue.applyDimension(1, 33.0f, getResources().getDisplayMetrics());
        this.sizewx = (int) TypedValue.applyDimension(1, 80.0f, getResources().getDisplayMetrics());
        this.marginw = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        setOrientation(1);
        this.OpenButtonListHolder = new ArrayList<>();
        initFabMenu();
    }

    public OpenButtonListRight(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.interpolator = new OvershootInterpolator();
        this.isMenuOpen = false;
        this.translationY = 100;
        this.sizew = (int) TypedValue.applyDimension(1, 33.0f, getResources().getDisplayMetrics());
        this.sizewx = (int) TypedValue.applyDimension(1, 80.0f, getResources().getDisplayMetrics());
        this.marginw = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        setOrientation(1);
        this.OpenButtonListHolder = new ArrayList<>();
        initFabMenu();
    }

    private void initFabMenu() {
        this.OpenButtonListHolder.add(new Leica(getContext()));
        this.OpenButtonListHolder.add(new HDRNet(getContext()));
        this.OpenButtonListHolder.add(new PRO(getContext()));
        this.OpenButtonListHolder.add(new LDR(getContext()));
        this.OpenButtonListHolder.add(new Upscale(getContext()));
        this.OpenButtonListHolder.add(new PAT(getContext()));
        this.isMenuOpen = Boolean.valueOf(Utils.staticMenuValueBB(OpenButtonListExtenderRight.prefString));
        for (int i = 0; i < this.OpenButtonListHolder.size(); i++) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.sizew, this.sizew);
            layoutParams.bottomMargin = this.marginw;
            if (i == 0) {
                layoutParams.topMargin = this.sizew;
            }
            layoutParams.resolveLayoutDirection(83);
            this.OpenButtonListHolder.get(i).setLayoutParams(layoutParams);
            this.OpenButtonListHolder.get(i).setClickable(true);
            if (this.isMenuOpen.booleanValue()) {
                this.OpenButtonListHolder.get(i).setTranslationY(0.0f);
                this.OpenButtonListHolder.get(i).setAlpha(1.0f);
                this.OpenButtonListHolder.get(i).setEnabled(true);
            } else {
                this.OpenButtonListHolder.get(i).setTranslationY(this.sizewx);
                this.OpenButtonListHolder.get(i).setAlpha(0.0f);
                this.OpenButtonListHolder.get(i).setEnabled(false);
            }
            addView(this.OpenButtonListHolder.get(i));
        }
        OpenButtonListExtenderRight openButtonListExtenderRight = new OpenButtonListExtenderRight(getContext());
        openButtonListExtenderRight.setClickable(true);
        openButtonListExtenderRight.setOnClickListener(this);
        addView(openButtonListExtenderRight);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view instanceof OpenButtonListExtenderRight) {
            ((OpenButtonListExtenderRight) view).UpdateUi(getContext());
            this.isMenuOpen = Boolean.valueOf(OpenButtonListExtenderRight.SelState);
            for (int i = 0; i < this.OpenButtonListHolder.size(); i++) {
                View view2 = this.OpenButtonListHolder.get(i);
                if (this.isMenuOpen.booleanValue()) {
                    view2.animate().alpha(1.0f).translationY(0.0f).setInterpolator(this.interpolator).setDuration(1000L).setListener(new AnimatorListenerAdapter() { // from class: MC.UI.OpenButtonListRight.1
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                        }
                    }).start();
                    view2.setEnabled(true);
                    view2.setClickable(true);
                } else {
                    view2.animate().alpha(0.0f).translationY(this.sizewx).setInterpolator(this.interpolator).setDuration(1000L).setListener(new AnimatorListenerAdapter() { // from class: MC.UI.OpenButtonListRight.2
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                        }
                    }).start();
                    view2.setEnabled(false);
                    view2.setClickable(false);
                }
            }
            view.setRotation(0.0f);
            view.animate().setInterpolator(this.interpolator).rotation(360.0f).setDuration(1000L).start();
        }
    }
}
