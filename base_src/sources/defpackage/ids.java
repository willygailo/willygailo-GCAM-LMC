package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.preference.PreferenceScreen;
import android.widget.Toast;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.ui.preference.ManagedSwitchPreference;
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
public final class ids {
    public final Context a;
    public final hub b;
    public final huf c;
    public final hug d;
    public final idt e;
    public final fjs f;
    public final ddf g;
    public final ooh h;
    public final Map i;
    public final Map j;
    public final PackageManager k;
    public oom l;
    public PreferenceScreen m;
    public Toast n;

    public ids(Context context, hub hubVar, huf hufVar, hug hugVar, idt idtVar, fjs fjsVar, ddf ddfVar) {
        if (ddfVar.k(ddl.ay)) {
            this.a = context;
        } else {
            this.a = new us(context, 2132083307);
        }
        this.b = hubVar;
        this.c = hufVar;
        this.d = hugVar;
        this.e = idtVar;
        this.f = fjsVar;
        this.g = ddfVar;
        this.h = oom.e();
        this.i = new HashMap();
        this.j = new HashMap();
        this.k = context.getPackageManager();
    }

    public final int a() {
        oom oomVarF = this.h.f();
        int i = ((orr) oomVarF).c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (this.b.m(((ManagedSwitchPreference) oomVarF.get(i3)).getKey())) {
                i2++;
            }
        }
        return i2;
    }

    public final int b(boolean z) {
        if (this.g.k(ddl.ay)) {
            return ohh.X(this.a, R.attr.colorPrimary, -16777216);
        }
        return this.a.getResources().getColor(true != z ? R.color.settings_switch_button_background_disable : R.color.camera_google_blue_600, null);
    }

    public final oom c(List list, List list2) {
        ooh oohVarE = oom.e();
        oohVarE.h(list);
        oohVarE.h(list2);
        return oom.j((ArrayList) Collection.EL.stream(oohVarE.f()).filter(new idg(new ConcurrentHashMap(), icd.g, 2)).map(new Function() { // from class: idq
            @Override // j$.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                return Function.CC.$default$andThen(this, function);
            }

            @Override // j$.util.function.Function
            public final Object apply(Object obj) {
                ResolveInfo resolveInfo = (ResolveInfo) obj;
                return ojd.a(resolveInfo.activityInfo.applicationInfo.loadLabel(this.a.k).toString(), resolveInfo);
            }

            @Override // j$.util.function.Function
            public final /* synthetic */ Function compose(Function function) {
                return Function.CC.$default$compose(this, function);
            }
        }).sorted(Comparator$CC.comparing(icd.h)).map(icd.i).collect(Collectors.toCollection(idh.c)));
    }

    public final String d(boolean z) {
        return this.a.getResources().getString(true != z ? R.string.social_share_off : R.string.social_share_on);
    }

    public final void e(ManagedSwitchPreference managedSwitchPreference, boolean z) {
        managedSwitchPreference.setChecked(z);
        this.b.l(managedSwitchPreference.getKey(), z);
    }

    public final void f(boolean z) {
        ManagedSwitchPreference managedSwitchPreference = (ManagedSwitchPreference) this.m.findPreference(htu.z.a);
        managedSwitchPreference.setChecked(z);
        managedSwitchPreference.setTitle(d(z));
        managedSwitchPreference.f = Integer.valueOf(b(z));
        this.d.e(htu.z, Boolean.valueOf(z));
        this.d.e(htu.C, true);
    }

    public final void g() {
        int iA = a();
        String strA = mip.ey(R.plurals.social_apps_selected, iA, Integer.valueOf(iA)).a(this.a.getResources());
        ManagedSwitchPreference managedSwitchPreference = (ManagedSwitchPreference) this.m.findPreference(htu.z.a);
        Integer numValueOf = Integer.valueOf(this.g.k(ddl.ay) ? ohh.X(this.a, R.attr.colorOnPrimary, -1) : -1);
        managedSwitchPreference.k = strA;
        managedSwitchPreference.h = numValueOf;
    }
}
