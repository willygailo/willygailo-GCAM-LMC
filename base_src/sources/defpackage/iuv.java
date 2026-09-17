package defpackage;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.ui.eduimageview.EduImageView;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class iuv extends pu {
    public int d;
    private final List e;
    private final boolean f;
    private final int g;

    public iuv(List list, int i, boolean z) {
        this.e = list;
        this.g = i;
        this.f = z;
    }

    @Override // defpackage.pu
    public final int a() {
        return this.e.size();
    }

    @Override // defpackage.pu
    public final /* bridge */ /* synthetic */ qs d(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(true != this.f ? R.layout.page_legacy : R.layout.page, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.example_images_view);
        int i2 = this.g;
        FrameLayout[] frameLayoutArr = new FrameLayout[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            frameLayoutArr[i3] = new FrameLayout(viewGroup.getContext());
            View.inflate(viewGroup.getContext(), true != this.f ? R.layout.image_page_legacy : R.layout.image_page, frameLayoutArr[i3]);
            linearLayout.addView(frameLayoutArr[i3]);
            frameLayoutArr[i3].setVisibility(8);
        }
        return new iva(viewInflate, frameLayoutArr, this.f);
    }

    @Override // defpackage.pu
    public final /* bridge */ /* synthetic */ void e(qs qsVar, int i) {
        iva ivaVar = (iva) qsVar;
        iuu iuuVar = (iuu) this.e.get(i);
        ivaVar.s.setText(iuuVar.a);
        ivaVar.t.setText(iuuVar.b);
        ivaVar.v.setVisibility(true != iuuVar.g ? 4 : 0);
        for (View view : ivaVar.u) {
            TextView textView = (TextView) view.findViewById(R.id.caption_after_effect);
            TextView textView2 = (TextView) view.findViewById(R.id.caption_before_effect);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.linearlayout_caption);
            textView.setText(iuuVar.a);
            textView2.setText(iuuVar.f);
            view.setVisibility(0);
            linearLayout.setVisibility(4);
        }
        ivaVar.y = iuuVar;
    }

    @Override // defpackage.pu
    public final /* bridge */ /* synthetic */ void o(qs qsVar) {
        final iva ivaVar = (iva) qsVar;
        iuu iuuVar = ivaVar.y;
        iuuVar.getClass();
        int i = 0;
        for (View view : ivaVar.u) {
            EduImageView eduImageView = (EduImageView) view.findViewById(R.id.gif_sxs);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.linearlayout_caption);
            if (((msq) iuuVar.c.get(i)).b.g()) {
                eduImageView.d((String) ((msq) iuuVar.c.get(i)).b.c(), iuuVar.d, new iuz(ivaVar, linearLayout, eduImageView));
                i++;
            } else if (((msq) iuuVar.c.get(i)).a.g()) {
                int i2 = i + 1;
                Drawable drawable = (Drawable) ((msq) iuuVar.c.get(i)).a.c();
                String str = iuuVar.e;
                eduImageView.a.setImageDrawable(drawable);
                eduImageView.a.setContentDescription(str);
                eduImageView.a.setScaleType(ImageView.ScaleType.CENTER_CROP);
                i = i2;
            }
        }
        final iut iutVar = new iut(this);
        ivaVar.w.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: iuy
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view2, int i3, int i4, int i5, int i6) {
                iva ivaVar2 = ivaVar;
                iut iutVar2 = iutVar;
                int width = ivaVar2.w.getChildAt(0).getWidth();
                int width2 = ivaVar2.w.getWidth();
                int scrollX = ivaVar2.w.getScrollX();
                iuv iuvVar = iutVar2.a;
                iuvVar.d = Math.max(iuvVar.d, (int) ((scrollX / (width - width2)) * 100.0f));
            }
        });
    }
}
