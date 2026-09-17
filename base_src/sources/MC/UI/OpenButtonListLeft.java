package MC.UI;

import MC.UI.Button.AF;
import MC.UI.Button.AWB;
import MC.UI.Button.EXP;
import MC.UI.Button.EXPSlide;
import MC.UI.Button.JAWB;
import MC.UI.Button.TF;
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
public class OpenButtonListLeft extends LinearLayout implements View.OnClickListener {
    ArrayList<View> OpenButtonListHolder;
    OvershootInterpolator interpolator;
    Boolean isMenuOpen;
    int marginw;
    int sizew;
    int sizewx;
    int translationY;

    public OpenButtonListLeft(Context context) {
        super(context);
        this.interpolator = new OvershootInterpolator();
        this.isMenuOpen = false;
        this.translationY = 100;
        this.sizew = (int) TypedValue.applyDimension(1, 25.0f, getResources().getDisplayMetrics());
        this.sizewx = (int) TypedValue.applyDimension(1, 80.0f, getResources().getDisplayMetrics());
        this.marginw = (int) TypedValue.applyDimension(1, 12.0f, getResources().getDisplayMetrics());
        setOrientation(0);
        this.OpenButtonListHolder = new ArrayList<>();
        initFabMenu();
    }

    public OpenButtonListLeft(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.interpolator = new OvershootInterpolator();
        this.isMenuOpen = false;
        this.translationY = 100;
        this.sizew = (int) TypedValue.applyDimension(1, 25.0f, getResources().getDisplayMetrics());
        this.sizewx = (int) TypedValue.applyDimension(1, 80.0f, getResources().getDisplayMetrics());
        this.marginw = (int) TypedValue.applyDimension(1, 12.0f, getResources().getDisplayMetrics());
        setOrientation(0);
        this.OpenButtonListHolder = new ArrayList<>();
        initFabMenu();
    }

    private void initFabMenu() {
        this.OpenButtonListHolder.add(new JAWB(getContext()));
        this.OpenButtonListHolder.add(new AWB(getContext()));
        this.OpenButtonListHolder.add(new EXP(getContext()));
        this.OpenButtonListHolder.add(new TF(getContext()));
        this.OpenButtonListHolder.add(new AF(getContext()));
        this.OpenButtonListHolder.add(new EXPSlide(getContext()));
        this.isMenuOpen = Boolean.valueOf(Utils.staticMenuValueBB(OpenButtonListExtenderLeft.prefString));
        for (int i = 0; i < this.OpenButtonListHolder.size(); i++) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.sizew, this.sizew);
            layoutParams.rightMargin = this.marginw;
            if (i == 0) {
                int i2 = this.sizew;
            }
            layoutParams.resolveLayoutDirection(83);
            this.OpenButtonListHolder.get(i).setLayoutParams(layoutParams);
            this.OpenButtonListHolder.get(i).setClickable(true);
            if (this.isMenuOpen.booleanValue()) {
                this.OpenButtonListHolder.get(i).setTranslationX(0.0f);
                this.OpenButtonListHolder.get(i).setAlpha(1.0f);
                this.OpenButtonListHolder.get(i).setEnabled(true);
            } else {
                this.OpenButtonListHolder.get(i).setTranslationX(this.sizewx);
                this.OpenButtonListHolder.get(i).setAlpha(0.0f);
                this.OpenButtonListHolder.get(i).setEnabled(false);
            }
            addView(this.OpenButtonListHolder.get(i));
        }
        OpenButtonListExtenderLeft openButtonListExtenderLeft = new OpenButtonListExtenderLeft(getContext());
        openButtonListExtenderLeft.setClickable(true);
        openButtonListExtenderLeft.setOnClickListener(this);
        addView(openButtonListExtenderLeft);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view instanceof OpenButtonListExtenderLeft) {
            ((OpenButtonListExtenderLeft) view).UpdateUi(getContext());
            this.isMenuOpen = Boolean.valueOf(OpenButtonListExtenderLeft.SelState);
            for (int i = 0; i < this.OpenButtonListHolder.size(); i++) {
                View view2 = this.OpenButtonListHolder.get(i);
                if (this.isMenuOpen.booleanValue()) {
                    view2.animate().alpha(1.0f).translationX(0.0f).setInterpolator(this.interpolator).setDuration(1000L).setListener(new AnimatorListenerAdapter() { // from class: MC.UI.OpenButtonListLeft.1
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                        }
                    }).start();
                    view2.setEnabled(true);
                    view2.setClickable(true);
                } else {
                    view2.animate().alpha(0.0f).translationX(this.sizewx).setInterpolator(this.interpolator).setDuration(1000L).setListener(new AnimatorListenerAdapter() { // from class: MC.UI.OpenButtonListLeft.2
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
