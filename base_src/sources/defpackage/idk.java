package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.widget.Toast;
import androidx.preference.PreferenceScreen;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.ui.preference.MaterialManagedSwitchPreference;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Function;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class idk {
    public final Context a;
    public final hub b;
    public final huf c;
    public final hug d;
    public final idt e;
    public final fjs f;
    public final ooh g = oom.e();
    public final Map h = new HashMap();
    public final Map i = new HashMap();
    public final PackageManager j;
    public oom k;
    public PreferenceScreen l;
    public Toast m;

    public idk(Context context, hub hubVar, huf hufVar, hug hugVar, idt idtVar, fjs fjsVar) {
        this.a = context;
        this.b = hubVar;
        this.c = hufVar;
        this.d = hugVar;
        this.e = idtVar;
        this.f = fjsVar;
        this.j = context.getPackageManager();
    }

    public final int a() {
        oom oomVarF = this.g.f();
        int i = ((orr) oomVarF).c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (this.b.m(((MaterialManagedSwitchPreference) oomVarF.get(i3)).t)) {
                i2++;
            }
        }
        return i2;
    }

    public final oom b(List list, List list2) {
        ooh oohVarE = oom.e();
        oohVarE.h(list);
        oohVarE.h(list2);
        return oom.j((ArrayList) Collection.EL.stream(oohVarE.f()).filter(new idg(new ConcurrentHashMap(), icd.d, 0)).map(new Function() { // from class: idf
            @Override // j$.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                return Function.CC.$default$andThen(this, function);
            }

            @Override // j$.util.function.Function
            public final Object apply(Object obj) {
                ResolveInfo resolveInfo = (ResolveInfo) obj;
                return ojd.a(resolveInfo.activityInfo.applicationInfo.loadLabel(this.a.j).toString(), resolveInfo);
            }

            @Override // j$.util.function.Function
            public final /* synthetic */ Function compose(Function function) {
                return Function.CC.$default$compose(this, function);
            }
        }).sorted(Comparator$CC.comparing(icd.e)).map(icd.f).collect(Collectors.toCollection(idh.a)));
    }

    public final String c(boolean z) {
        return this.a.getResources().getString(true != z ? R.string.social_share_off : R.string.social_share_on);
    }

    public final void d(MaterialManagedSwitchPreference materialManagedSwitchPreference, boolean z) {
        materialManagedSwitchPreference.k(z);
        this.b.l(materialManagedSwitchPreference.t, z);
    }

    public final void e(boolean z) {
        MaterialManagedSwitchPreference materialManagedSwitchPreference = (MaterialManagedSwitchPreference) this.l.l(htu.z.a);
        if (materialManagedSwitchPreference != null) {
            materialManagedSwitchPreference.k(z);
            materialManagedSwitchPreference.R(c(z));
            materialManagedSwitchPreference.h = Integer.valueOf(ohh.X(this.a, R.attr.colorPrimary, -16777216));
        }
        this.d.e(htu.z, Boolean.valueOf(z));
        this.d.e(htu.C, true);
    }

    public final void f() {
        int iA = a();
        String strA = mip.ey(R.plurals.social_apps_selected, iA, Integer.valueOf(iA)).a(this.a.getResources());
        MaterialManagedSwitchPreference materialManagedSwitchPreference = (MaterialManagedSwitchPreference) this.l.l(htu.z.a);
        if (materialManagedSwitchPreference != null) {
            Integer numValueOf = Integer.valueOf(ohh.X(this.a, R.attr.colorOnPrimary, -1));
            materialManagedSwitchPreference.I = strA;
            materialManagedSwitchPreference.F = numValueOf;
        }
    }
}
