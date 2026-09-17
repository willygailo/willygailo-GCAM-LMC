package defpackage;

import android.R;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ahe extends pu implements agl {
    public List d;
    private final PreferenceGroup e;
    private List f;
    private final List g;
    private final Runnable i = new ahb(this);
    private final Handler h = new Handler();

    public ahe(PreferenceGroup preferenceGroup) {
        this.e = preferenceGroup;
        preferenceGroup.C = this;
        this.f = new ArrayList();
        this.d = new ArrayList();
        this.g = new ArrayList();
        if (preferenceGroup instanceof PreferenceScreen) {
            g(((PreferenceScreen) preferenceGroup).e);
        } else {
            g(true);
        }
        k();
    }

    private final List l(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iK = preferenceGroup.k();
        int i = 0;
        for (int i2 = 0; i2 < iK; i2++) {
            Preference preferenceO = preferenceGroup.o(i2);
            if (preferenceO.y) {
                if (!n(preferenceGroup) || i < preferenceGroup.d) {
                    arrayList.add(preferenceO);
                } else {
                    arrayList2.add(preferenceO);
                }
                if (preferenceO instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceO;
                    if (!preferenceGroup2.ae()) {
                        continue;
                    } else {
                        if (n(preferenceGroup) && n(preferenceGroup2)) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        for (Preference preference : l(preferenceGroup2)) {
                            if (!n(preferenceGroup) || i < preferenceGroup.d) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i++;
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        if (n(preferenceGroup) && i > preferenceGroup.d) {
            agb agbVar = new agb(preferenceGroup.j, arrayList2, preferenceGroup.fp());
            agbVar.o = new ahc(this, preferenceGroup);
            arrayList.add(agbVar);
        }
        return arrayList;
    }

    private final void m(List list, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.b);
        }
        int iK = preferenceGroup.k();
        for (int i = 0; i < iK; i++) {
            Preference preferenceO = preferenceGroup.o(i);
            list.add(preferenceO);
            ahd ahdVar = new ahd(preferenceO);
            if (!this.g.contains(ahdVar)) {
                this.g.add(ahdVar);
            }
            if (preferenceO instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceO;
                if (preferenceGroup2.ae()) {
                    m(list, preferenceGroup2);
                }
            }
            preferenceO.C = this;
        }
    }

    private static final boolean n(PreferenceGroup preferenceGroup) {
        return preferenceGroup.d != Integer.MAX_VALUE;
    }

    @Override // defpackage.pu
    public final int a() {
        return this.d.size();
    }

    @Override // defpackage.pu
    public final int b(int i) {
        ahd ahdVar = new ahd(j(i));
        int iIndexOf = this.g.indexOf(ahdVar);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        int size = this.g.size();
        this.g.add(ahdVar);
        return size;
    }

    @Override // defpackage.pu
    public final long c(int i) {
        if (this.b) {
            return j(i).fp();
        }
        return -1L;
    }

    @Override // defpackage.pu
    public final /* bridge */ /* synthetic */ qs d(ViewGroup viewGroup, int i) {
        ahd ahdVar = (ahd) this.g.get(i);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        TypedArray typedArrayObtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, ahn.a);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = jr.b(viewGroup.getContext(), R.drawable.list_selector_background);
        }
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = layoutInflaterFrom.inflate(ahdVar.a, viewGroup, false);
        if (viewInflate.getBackground() == null) {
            gl.G(viewInflate, drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.widget_frame);
        if (viewGroup2 != null) {
            int i2 = ahdVar.b;
            if (i2 != 0) {
                layoutInflaterFrom.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new ahm(viewInflate);
    }

    @Override // defpackage.pu
    public final /* bridge */ /* synthetic */ void e(qs qsVar, int i) {
        ahm ahmVar = (ahm) qsVar;
        Preference preferenceJ = j(i);
        Drawable background = ahmVar.a.getBackground();
        Drawable drawable = ahmVar.s;
        if (background != drawable) {
            gl.G(ahmVar.a, drawable);
        }
        TextView textView = (TextView) ahmVar.B(R.id.title);
        if (textView != null && ahmVar.t != null && !textView.getTextColors().equals(ahmVar.t)) {
            textView.setTextColor(ahmVar.t);
        }
        preferenceJ.a(ahmVar);
    }

    @Override // defpackage.agl
    public final void f() {
        this.h.removeCallbacks(this.i);
        this.h.post(this.i);
    }

    public final Preference j(int i) {
        if (i < 0 || i >= a()) {
            return null;
        }
        return (Preference) this.d.get(i);
    }

    final void k() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((Preference) it.next()).C = null;
        }
        ArrayList arrayList = new ArrayList(this.f.size());
        this.f = arrayList;
        m(arrayList, this.e);
        this.d = l(this.e);
        ahj ahjVar = this.e.k;
        this.a.a();
        for (Preference preference : this.f) {
        }
    }
}
