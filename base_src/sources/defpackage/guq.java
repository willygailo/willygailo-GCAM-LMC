package defpackage;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class guq extends ConstraintLayout {
    public final ArrayList d;
    public final Map e;
    public final Map f;
    public final TextView g;
    public final TextView h;
    public final LinearLayout i;
    public final ImageView j;
    public final gtk k;
    public final boolean l;
    public final Context m;
    public gtv n;
    public final gtw o;
    public final gtp p;
    public final gtb q;

    public guq(Context context, gtk gtkVar, gtv gtvVar, gtw gtwVar, gtp gtpVar, gtb gtbVar, ddf ddfVar) {
        super(context);
        this.k = gtkVar;
        this.n = gtvVar;
        this.m = context;
        this.o = gtwVar;
        this.p = gtpVar;
        this.q = gtbVar;
        this.l = ddfVar.k(ddl.ay);
        this.d = new ArrayList();
        this.e = new HashMap();
        this.f = new HashMap();
        TextView textView = new TextView(context);
        this.g = textView;
        textView.setId(View.generateViewId());
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setId(View.generateViewId());
        this.i = new LinearLayout(context);
        ImageView imageView = new ImageView(context);
        this.j = imageView;
        imageView.setId(View.generateViewId());
    }

    public final void d(gtv gtvVar) {
        this.n = gtvVar;
        if (isEnabled()) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                ImageButton imageButton = (ImageButton) ((FrameLayout) arrayList.get(i2)).getChildAt(0);
                if (this.e.get(gtvVar) == imageButton) {
                    e(imageButton);
                } else {
                    f(imageButton);
                }
            }
            oom oomVar = this.k.d;
            int size2 = oomVar.size();
            while (i < size2) {
                gtl gtlVar = (gtl) oomVar.get(i);
                i++;
                if (gtlVar.a == gtvVar) {
                    this.h.setText(gtlVar.b(getResources()));
                    String strA = gtlVar.a(getResources());
                    this.h.setContentDescription(strA);
                    this.h.announceForAccessibility(strA);
                    return;
                }
            }
        }
    }

    public final void e(ImageButton imageButton) {
        if (this.l) {
            imageButton.setSelected(true);
        } else {
            imageButton.setBackground(this.m.getDrawable(R.drawable.options_menu_button_selected_inset));
        }
    }

    public final void f(ImageButton imageButton) {
        if (this.l) {
            imageButton.setSelected(false);
        } else {
            imageButton.setBackground(this.m.getDrawable(R.drawable.options_menu_button_unselected_inset));
        }
    }
}
