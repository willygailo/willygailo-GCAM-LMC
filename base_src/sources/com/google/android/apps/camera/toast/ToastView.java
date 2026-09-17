package com.google.android.apps.camera.toast;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.toast.ToastView;
import defpackage.isd;
import defpackage.isi;
import defpackage.isk;
import defpackage.ouj;
import j$.time.Duration;

/* JADX INFO: loaded from: classes.dex */
public class ToastView extends FrameLayout {
    public static final Duration d = Duration.ofMillis(300);
    public static final Duration e = Duration.ofMillis(300);
    public static final ouj f = ouj.h("com/google/android/apps/camera/toast/ToastView");
    private View a;
    public float g;
    public long h;
    public Runnable i;
    public Runnable j;
    public Runnable k;
    public Runnable l;
    public PopupWindow m;
    public View n;

    public ToastView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = isd.e;
        this.j = isd.f;
        this.k = isd.g;
        this.l = isd.h;
    }

    public static ToastView e(isi isiVar) {
        ViewGroup viewGroup = isiVar.a;
        View.inflate(viewGroup.getContext(), R.layout.toast_view_layout, viewGroup);
        ToastView toastView = (ToastView) viewGroup.findViewById(R.id.toast_view_layout);
        toastView.b(isiVar);
        return toastView;
    }

    public void b(isi isiVar) {
        TextView textView = (TextView) findViewById(R.id.toast_text_view);
        if (textView != null) {
            textView.setText(isiVar.b);
        }
        TextView textView2 = (TextView) findViewById(R.id.toast_learn_more_text_view);
        if (textView2 != null) {
            textView2.setText(isiVar.c);
        }
        this.h = (((long) isiVar.a()) - e.toMillis()) - d.toMillis();
        this.i = new isk(this, 0);
        f(isiVar);
        d();
        this.j = isiVar.d;
        this.k = isiVar.f;
        this.l = isiVar.e;
        View viewFindViewById = findViewById(R.id.toast_inner_layout);
        this.a = viewFindViewById;
        if (viewFindViewById != null) {
            int paddingBottom = viewFindViewById.getPaddingBottom();
            this.g = TypedValue.applyDimension(0, paddingBottom + paddingBottom, getResources().getDisplayMetrics());
        }
    }

    public void c() {
        this.a.setOnClickListener(new View.OnClickListener() { // from class: isj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToastView toastView = this.a;
                toastView.l.run();
                toastView.j.run();
                toastView.k.run();
            }
        });
    }

    public final PopupWindow d() {
        PopupWindow popupWindow = new PopupWindow(new View(getContext()), 1, 1);
        this.m = popupWindow;
        popupWindow.setClippingEnabled(false);
        this.m.setOutsideTouchable(true);
        return this.m;
    }

    public final void f(isi isiVar) {
        this.n = isiVar.a;
    }

    public final void g() {
        animate().alpha(1.0f).setDuration(d.toMillis()).withEndAction(new isk(this, 1)).translationYBy(-this.g).start();
    }
}
