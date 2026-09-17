package defpackage;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class iva extends qs {
    public static final /* synthetic */ int z = 0;
    public final TextView s;
    public final TextView t;
    public final View[] u;
    public final View v;
    public final HorizontalScrollView w;
    public final boolean x;
    public iuu y;

    public iva(View view, View[] viewArr, boolean z2) {
        super(view);
        this.s = (TextView) this.a.findViewById(R.id.title);
        this.t = (TextView) this.a.findViewById(R.id.subtitle);
        this.u = viewArr;
        this.v = this.a.findViewById(R.id.beta_label);
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.a.findViewById(R.id.example_images_scroll_view);
        this.w = horizontalScrollView;
        this.x = z2;
        if (viewArr.length == 1) {
            horizontalScrollView.setOnTouchListener(guf.c);
        }
    }
}
