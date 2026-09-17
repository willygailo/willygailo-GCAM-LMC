package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class jhs extends BaseAdapter {
    public final List a;
    protected int b;
    protected boolean c;
    private jhq d;
    private int e;
    private int f;
    private boolean g;

    public jhs() {
        this.a = new ArrayList();
        this.b = -1;
        this.e = -1;
        this.f = -1;
        this.g = true;
    }

    public jhs(Context context, ddf ddfVar) {
        this();
        this.c = ddfVar.k(ddl.ay);
        List list = this.a;
        cuv cuvVar = cuv.STANDARD;
        String string = context.getString(R.string.stabilization_title_enhanced);
        String string2 = context.getString(R.string.stabilization_description_enhanced);
        list.add(new jhp(cuvVar, string, R.drawable.quantum_gm_ic_stabilization_white_24, string2, string2));
        if (ddfVar.k(dcu.T)) {
            List list2 = this.a;
            cuv cuvVar2 = cuv.LOCKED;
            String string3 = context.getString(R.string.stabilization_title_locking);
            String string4 = context.getString(R.string.stabilization_description_locking);
            list2.add(new jhp(cuvVar2, string3, R.drawable.quantum_gm_ic_stabilization_lock_white_24, string4, string4));
        }
        if (ddfVar.k(dcu.U)) {
            List list3 = this.a;
            cuv cuvVar3 = cuv.ACTIVE;
            String string5 = context.getString(R.string.stabilization_title_action);
            String string6 = context.getString(R.string.stabilization_description_action);
            list3.add(new jhp(cuvVar3, string5, R.drawable.quantum_gm_ic_stabilization_action_white_24, string6, string6));
        }
        if (ddfVar.k(dcu.V)) {
            List list4 = this.a;
            cuv cuvVar4 = cuv.CINEMATIC;
            String string7 = context.getString(R.string.stabilization_title_panning);
            String string8 = context.getString(R.string.stabilization_description_panning);
            list4.add(new jhp(cuvVar4, string7, R.drawable.quantum_gm_ic_stabilization_pan_white_24, string8, string8));
        }
    }

    public jhs(Context context, ddf ddfVar, byte[] bArr) {
        this();
        this.c = ddfVar.k(ddl.ay);
        List list = this.a;
        hss hssVar = hss.MEDIA_STORE;
        String string = context.getString(R.string.default_title);
        String string2 = context.getString(R.string.default_desc);
        list.add(new jhp(hssVar, string, R.drawable.normal_mode_thumb, string2, string2));
        this.a.add(new jhp(hss.MARS_STORE, context.getString(R.string.mars_title), R.drawable.quantum_gm_ic_lock_vd_theme_24, context.getString(R.string.mars_desc), context.getString(R.string.mars_not_available_reason_account)));
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final jhp getItem(int i) {
        return (jhp) this.a.get(i);
    }

    public final jhp b() {
        return (jhp) this.a.get(this.b);
    }

    public final void c(jhq jhqVar, boolean z) {
        this.d = jhqVar;
        this.g = z;
    }

    final void d(int i) {
        if (getItem(i).f || !this.g) {
            this.b = i;
            jhq jhqVar = this.d;
            if (jhqVar != null) {
                jhqVar.a(b());
            }
            lar.a();
            notifyDataSetChanged();
        }
    }

    public final void e(Object obj) {
        ListIterator listIterator = this.a.listIterator();
        while (listIterator.hasNext()) {
            jhp jhpVar = (jhp) listIterator.next();
            jhpVar.getClass();
            if (obj.equals(jhpVar.a)) {
                d(listIterator.previousIndex());
                return;
            }
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.a.size();
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        jhr jhrVar;
        Context context = viewGroup.getContext();
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item, (ViewGroup) null);
            jhrVar = new jhr(view, this.c);
            view.setTag(jhrVar);
        } else {
            jhrVar = (jhr) view.getTag();
        }
        jhp item = getItem(i);
        if (jhrVar != null) {
            if (jhrVar.a != null) {
                if (this.c) {
                    if (this.e == -1) {
                        this.e = jhrVar.c.getCurrentTextColor();
                    }
                    if (this.f == -1) {
                        this.f = jhrVar.d.getCurrentTextColor();
                    }
                }
                if (this.b == i) {
                    GradientDrawable gradientDrawable = (GradientDrawable) aar.a(context, R.drawable.selected_item_background);
                    gradientDrawable.getClass();
                    if (this.c) {
                        gradientDrawable.setCornerRadius(context.getResources().getDimensionPixelSize(R.dimen.menu_selected_item_radius));
                        gradientDrawable.setTint(obr.e(viewGroup, R.attr.colorPrimaryContainer));
                        int iE = obr.e(viewGroup, R.attr.colorOnPrimaryContainer);
                        jhrVar.e.setColorFilter(iE);
                        jhrVar.c.setTextColor(iE);
                        jhrVar.d.setTextColor(iE);
                    } else {
                        gradientDrawable.setCornerRadius(context.getResources().getDimensionPixelSize(R.dimen.menu_selected_item_radius_legacy));
                        gradientDrawable.setTint(context.getColor(R.color.selected_item_bg_color_legacy));
                    }
                    jhrVar.a.setBackground(gradientDrawable);
                } else {
                    jhrVar.a.setBackgroundColor(0);
                    if (this.c) {
                        jhrVar.e.setColorFilter(this.e);
                        jhrVar.c.setTextColor(this.e);
                        jhrVar.d.setTextColor(this.f);
                    }
                }
            }
            jhrVar.e.setImageResource(item.c);
            ImageView imageView = jhrVar.f;
            if (imageView != null) {
                imageView.setImageResource(item.c);
            }
            jhrVar.c.setText(item.b);
            TextView textView = jhrVar.d;
            if (textView != null) {
                textView.setText(item.f ? item.d : item.e);
            }
            if (item.f) {
                jhrVar.c.setAlpha(1.0f);
                jhrVar.d.setAlpha(0.8f);
                jhrVar.e.setAlpha(1.0f);
            } else {
                jhrVar.c.setAlpha(0.3f);
                jhrVar.d.setAlpha(0.3f);
                jhrVar.e.setAlpha(0.3f);
            }
        }
        return view;
    }
}
