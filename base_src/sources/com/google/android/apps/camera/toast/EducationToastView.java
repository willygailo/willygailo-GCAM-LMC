package com.google.android.apps.camera.toast;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.Space;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.toast.EducationToastView;
import defpackage.isd;
import defpackage.isi;

/* JADX INFO: loaded from: classes2.dex */
public class EducationToastView extends ToastView {
    public static final /* synthetic */ int c = 0;
    public Runnable a;
    public Runnable b;
    private PopupWindow o;

    public EducationToastView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = isd.b;
        this.b = isd.a;
    }

    public static EducationToastView a(isi isiVar) {
        ViewGroup viewGroup = isiVar.a;
        View.inflate(viewGroup.getContext(), R.layout.education_toast_view_layout, viewGroup);
        EducationToastView educationToastView = (EducationToastView) viewGroup.findViewById(R.id.edu_toast_layout);
        educationToastView.b(isiVar);
        return educationToastView;
    }

    @Override // com.google.android.apps.camera.toast.ToastView
    public final void b(isi isiVar) {
        final ImageView imageView = (ImageView) findViewById(R.id.edu_toast_icon);
        imageView.setImageResource(R.drawable.ic_swipe_down_option);
        imageView.setVisibility(0);
        ((Space) findViewById(R.id.edu_toast_icon_space)).setVisibility(8);
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: isb
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                ImageView imageView2 = imageView;
                int i9 = EducationToastView.c;
                switch (jrz.a(((View) view.getParent()).getDisplay(), view.getContext())) {
                    case PORTRAIT:
                        imageView2.setImageResource(R.drawable.ic_swipe_down_option);
                        break;
                    case LANDSCAPE:
                        imageView2.setImageResource(R.drawable.ic_swipe_right_option);
                        break;
                    case REVERSE_LANDSCAPE:
                        imageView2.setImageResource(R.drawable.ic_swipe_left_option);
                        break;
                    default:
                        imageView2.setImageResource(R.drawable.ic_swipe_down_option);
                        break;
                }
            }
        });
        f(isiVar);
        this.o = d();
        this.a = isiVar.e;
        this.b = isiVar.f;
    }

    @Override // com.google.android.apps.camera.toast.ToastView
    public final void c() {
        this.o.setTouchInterceptor(new View.OnTouchListener() { // from class: isc
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                EducationToastView educationToastView = this.a;
                educationToastView.a.run();
                educationToastView.b.run();
                return false;
            }
        });
    }
}
