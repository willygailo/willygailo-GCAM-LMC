package com.google.android.apps.camera.bottombar;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.Fix.Pref;
import com.Helper;
import com.longtap.exposure.Cswitch;

/* JADX INFO: loaded from: classes.dex */
public class CameraSwitchButton extends ScalableButton {
    public Context app_context;
    private Animatable buttonAnimatable;
    private boolean clickEnabled;
    private View.OnClickListener onClickListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraSwitchButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.app_context = context;
        this.clickEnabled = true;
        initialize();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002e  */
    private void initialize() {
        this.buttonAnimatable = (Animatable) getDrawable();
        super.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.apps.camera.bottombar.CameraSwitchButton$$ExternalSyntheticLambda0
            /* JADX WARN: Code duplicated, block: B:11:0x0035  */
            /* JADX WARN: Code duplicated, block: B:12:0x0040  */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws InterruptedException {
                if (Pref.MenuValue("pref_disable_front_lib_key") == 0) {
                    if (Pref.MenuValue("pref_front_active_values_key") != 0) {
                        Pref.setMenuValue("pref_front_active_values_key", Integer.toString(0));
                        if (Pref.MenuValue("pref_disable_front_lib_key") != 0) {
                            Pref.setMenuValue("pref_frontcam_value_restart_key", Integer.toString(1));
                        } else {
                            Pref.setMenuValue("pref_frontcam_value_restart_key", Integer.toString(0));
                        }
                    } else {
                        Pref.setMenuValue("pref_front_active_values_key", Integer.toString(1));
                        if (Pref.MenuValue("pref_disable_front_lib_key") != 0) {
                            Pref.setMenuValue("pref_frontcam_value_restart_key", Integer.toString(0));
                        } else {
                            Pref.setMenuValue("pref_frontcam_value_restart_key", Integer.toString(1));
                        }
                    }
                }
                if (Pref.MenuValue("pref_disable_front_lib_key") != 0) {
                    this.f$0.m19xe6907538(view);
                } else {
                    Helper.GetRestartMethodFront();
                }
            }
        });
        int iMenuValue = Pref.MenuValue("pref_switch_key");
        if (iMenuValue == 0) {
            Cswitch.setLongClickListener(this, this.app_context);
        } else if (iMenuValue == 1) {
            com.longtap.exptap.Cswitch.setLongClickListener(this, this.app_context);
        } else if (iMenuValue == 2) {
            com.longtap.upscale.Cswitch.setLongClickListener(this, this.app_context);
        } else if (iMenuValue == 3) {
            com.longtap.framehdr.Cswitch.setLongClickListener(this, this.app_context);
        } else if (iMenuValue == 4) {
            com.longtap.framezsl.Cswitch.setLongClickListener(this, this.app_context);
        } else if (iMenuValue == 5) {
            com.longtap.colort.Cswitch.setLongClickListener(this, this.app_context);
        } else if (iMenuValue == 6) {
            com.longtap.aftime.Cswitch.setLongClickListener(this, this.app_context);
        } else if (iMenuValue != 7) {
            Cswitch.setLongClickListener(this, this.app_context);
        } else {
            com.longtap.page.Cswitch.setLongClickListener(this);
        }
        setFocusable(false);
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            Drawable drawableMutate = background.getConstantState().newDrawable().mutate();
            ((RippleDrawable) drawableMutate).setRadius(getResources().getDimensionPixelSize(R.dimen.camera_switch_button_ripple_diameter) / 2);
            setBackground(drawableMutate);
        }
    }

    /* JADX INFO: renamed from: lambda$initialize$0$com-google-android-apps-camera-bottombar-CameraSwitchButton, reason: not valid java name */
    public /* synthetic */ void m19xe6907538(View view) {
        if (this.clickEnabled) {
            View.OnClickListener onClickListener = this.onClickListener;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            this.buttonAnimatable.start();
        }
    }

    public void setFrontFacing(boolean z) {
        setEnabled(false);
        setContentDescription(z ? getResources().getString(R.string.camera_id_front_desc) : getResources().getString(R.string.camera_id_back_desc));
        setEnabled(true);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }
}
