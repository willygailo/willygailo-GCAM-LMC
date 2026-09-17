package com.google.android.libraries.material.speeddial;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import defpackage.aae;
import defpackage.aah;
import defpackage.mir;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class FloatingSpeedDialView$Behavior extends aae {
    public FloatingSpeedDialView$Behavior() {
    }

    public FloatingSpeedDialView$Behavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.aae
    public final /* bridge */ /* synthetic */ boolean e(CoordinatorLayout coordinatorLayout, View view, int i) {
        mir mirVar = (mir) view;
        coordinatorLayout.l(mirVar, i);
        int i2 = ((aah) mirVar.getLayoutParams()).f;
        FloatingActionButton floatingActionButton = null;
        if (i2 != -1) {
            List listH = coordinatorLayout.h(mirVar);
            int size = listH.size();
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = (View) listH.get(i3);
                if (view2.getId() == i2 && (view2 instanceof FloatingActionButton)) {
                    floatingActionButton = (FloatingActionButton) view2;
                    break;
                }
            }
        }
        if (floatingActionButton == null) {
            return true;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(((aah) mirVar.getLayoutParams()).d, i) & 7;
        int width = floatingActionButton.getWidth();
        int i4 = mirVar.a;
        int i5 = width / 2;
        if (absoluteGravity == 5) {
            mirVar.setTranslationX(-i5);
            return true;
        }
        if (absoluteGravity != 3) {
            return true;
        }
        mirVar.setTranslationX(i5);
        return true;
    }
}
