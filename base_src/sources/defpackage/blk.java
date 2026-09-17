package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class blk extends blb {
    protected final View a;
    public final blj b;

    public blk(View view) {
        aae.s(view);
        this.a = view;
        this.b = new blj(view);
    }

    @Override // defpackage.blb, defpackage.blh
    public final bks c() {
        Object tag = this.a.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof bks) {
            return (bks) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // defpackage.blh
    public final void d(blg blgVar) {
        blj bljVar = this.b;
        int iB = bljVar.b();
        int iA = bljVar.a();
        if (blj.d(iB, iA)) {
            blgVar.g(iB, iA);
            return;
        }
        if (!bljVar.c.contains(blgVar)) {
            bljVar.c.add(blgVar);
        }
        if (bljVar.d == null) {
            ViewTreeObserver viewTreeObserver = bljVar.b.getViewTreeObserver();
            bljVar.d = new bli(bljVar);
            viewTreeObserver.addOnPreDrawListener(bljVar.d);
        }
    }

    @Override // defpackage.blh
    public final void j(blg blgVar) {
        this.b.c.remove(blgVar);
    }

    @Override // defpackage.blb, defpackage.blh
    public final void k(bks bksVar) {
        this.a.setTag(R.id.glide_custom_view_target_tag, bksVar);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 12);
        sb.append("Target for: ");
        sb.append(strValueOf);
        return sb.toString();
    }
}
