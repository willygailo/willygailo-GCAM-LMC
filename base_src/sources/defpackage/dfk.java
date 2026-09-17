package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.GoogleCameraEngR18F1.R;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import j$.time.format.FormatStyle;

/* JADX INFO: loaded from: classes.dex */
public abstract class dfk implements bty {
    public static final ouj a = ouj.h("com/google/android/apps/camera/data/FilmstripItemBase");
    protected static final DateTimeFormatter b = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withZone(ZoneId.systemDefault());
    public final Context c;
    protected final dfl d;
    public btz e;
    protected fmh f;
    protected lig g;
    private final hss h;

    protected dfk(Context context, dfl dflVar, btz btzVar, hss hssVar) {
        this.c = context;
        dflVar.getClass();
        this.d = dflVar;
        btzVar.getClass();
        this.e = btzVar;
        this.h = hssVar;
        this.f = fmh.a;
        this.g = dflVar.a;
    }

    public static dfj k(View view) {
        Object tag = view.getTag(R.id.mediadata_tag_target);
        if (tag instanceof dfj) {
            return (dfj) tag;
        }
        return null;
    }

    protected static final azp n(btz btzVar) {
        btzVar.i();
        return new bln(btzVar.i(), btzVar.h().getEpochSecond(), btzVar.a());
    }

    @Override // defpackage.bty
    public final btz a() {
        return this.e;
    }

    @Override // defpackage.bty
    public final fmh c() {
        return this.f;
    }

    @Override // defpackage.bty
    public final hss d() {
        return this.h;
    }

    @Override // defpackage.bty
    public final void f(btz btzVar) {
        this.e = btzVar;
    }

    @Override // defpackage.bty
    public final void g(fmh fmhVar) {
        this.f = fmhVar;
    }

    @Override // defpackage.bty
    public final void h(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            ((oug) ((oug) a.c()).G((char) 740)).o("Suggested size was set to a zero area value!");
        } else {
            this.g = new lig(i, i2);
        }
    }

    final View j(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(this.c).inflate(R.layout.filmstrip_view, viewGroup, false);
        viewInflate.setTag(R.id.mediadata_tag_target, new dfj((ImageView) viewInflate.findViewById(R.id.content_view), (ImageView) viewInflate.findViewById(R.id.play_button), (ImageView) viewInflate.findViewById(R.id.photo_sphere_center_badge)));
        return viewInflate;
    }

    public final void l(View view) {
        dfj dfjVarK = k(view);
        if (dfjVarK == null) {
            ((oug) ((oug) a.c()).G((char) 739)).o("renderThumbnail was called with an invalid view!");
        } else {
            m(dfjVarK);
        }
    }

    protected abstract void m(dfj dfjVar);
}
