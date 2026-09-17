package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.material.tabs.TabLayout;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class iux {
    protected final ddf f;
    public final ius g;
    protected final Context h;
    public iuv i;

    protected iux(ddf ddfVar, Context context, ius iusVar) {
        this.f = ddfVar;
        this.h = context;
        this.g = iusVar;
    }

    protected final View e() {
        return View.inflate(this.h, true != this.f.k(ddl.ay) ? R.layout.submode_bottom_sheet_legacy : R.layout.submode_bottom_sheet, null);
    }

    protected final ViewPager2 f(View view, List list, int i, oct octVar, odd oddVar) {
        Context context = this.h;
        ViewPager2 viewPager2 = (ViewPager2) view.findViewById(R.id.viewpager2);
        iuv iuvVar = new iuv(list, i, this.f.k(ddl.ay));
        viewPager2.getClass();
        pu puVar = viewPager2.f.l;
        viewPager2.k.h(puVar);
        if (puVar != null) {
            puVar.i(viewPager2.j);
        }
        viewPager2.f.U(iuvVar);
        viewPager2.c = 0;
        viewPager2.c();
        viewPager2.k.g(iuvVar);
        iuvVar.h(viewPager2.j);
        this.i = iuvVar;
        for (int i2 = 0; i2 < viewPager2.getChildCount(); i2++) {
            View childAt = viewPager2.getChildAt(i2);
            if (childAt instanceof RecyclerView) {
                ((RecyclerView) childAt).setNestedScrollingEnabled(false);
                break;
            }
        }
        if (i > 1) {
            viewPager2.h = false;
            viewPager2.k.q();
        }
        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tablayout);
        tabLayout.getClass();
        if (this.f.k(ddl.ay)) {
            ((GradientDrawable) tabLayout.getBackground()).setTint(mip.aH(R.dimen.gm_sys_elevation_level2, context));
        }
        if (octVar != null) {
            tabLayout.e(octVar);
        }
        odg odgVar = new odg(tabLayout, viewPager2, oddVar);
        if (odgVar.d) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        odgVar.c = odgVar.b.b();
        if (odgVar.c == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        odgVar.d = true;
        odgVar.e = new ode(odgVar.a);
        ViewPager2 viewPager3 = odgVar.b;
        viewPager3.b.s(odgVar.e);
        odgVar.f = new odf(odgVar.b);
        odgVar.a.e(odgVar.f);
        odgVar.g = new odc(odgVar);
        odgVar.c.h(odgVar.g);
        odgVar.a();
        odgVar.a.l(odgVar.b.c);
        return viewPager2;
    }

    public final void g(int i, View view, Context context, epp eppVar) {
        this.g.h(i, -1, view, new DialogInterface.OnDismissListener() { // from class: iuw
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.a.i = null;
            }
        }, context, eppVar);
    }
}
