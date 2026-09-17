package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.preference.ListPreference;
import android.preference.SwitchPreference;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.ui.preference.ManagedSwitchPreference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class fce {
    public final djh a;
    public final ids b;
    public final gqy c;
    public final Set d;
    public final ilk e;
    public final pyn g;
    public final ojc h;
    public final ojc i;
    public final fjs j;
    public final lda k;
    public final hub l;
    public final dwd p;
    private final ddf q;
    private final lar r;
    private final Set s;
    private final Set t;
    private final hug u;
    private final lda v;
    private final lda w;
    private final boolean x;
    private final lwf y;
    private final nvb z;
    public final oqt o = onv.r();
    public final List m = new ArrayList(10);
    public final List n = new ArrayList(10);
    public final Set f = new HashSet();

    public fce(lwf lwfVar, ddf ddfVar, djh djhVar, ids idsVar, lar larVar, gqy gqyVar, Set set, Set set2, Set set3, lda ldaVar, fjs fjsVar, lda ldaVar2, lda ldaVar3, dwd dwdVar, ilk ilkVar, pyn pynVar, nvb nvbVar, hub hubVar, hug hugVar, boolean z, ojc ojcVar, ojc ojcVar2, byte[] bArr, byte[] bArr2) {
        this.y = lwfVar;
        this.q = ddfVar;
        this.a = djhVar;
        this.b = idsVar;
        this.r = larVar;
        this.c = gqyVar;
        this.s = set;
        this.t = set2;
        this.v = ldaVar;
        this.j = fjsVar;
        this.k = ldaVar2;
        this.d = set3;
        this.w = ldaVar3;
        this.p = dwdVar;
        this.e = ilkVar;
        this.g = pynVar;
        this.z = nvbVar;
        this.l = hubVar;
        this.u = hugVar;
        this.x = z;
        this.h = ojcVar;
        this.i = ojcVar2;
    }

    public final void a(Context context) {
        boolean z = false;
        for (lwd lwdVar : lwd.values()) {
            if (this.y.j(lwdVar)) {
                lvs lvsVarE = this.y.e(lwdVar);
                lvsVarE.getClass();
                z = z || this.y.f(lvsVarE).M();
            }
        }
        if (this.q.k(ddm.X)) {
            this.m.add("pref_camera_hdrplus_option_available_key");
        } else {
            this.n.add(this.v.a(new lij() { // from class: fcc
                @Override // defpackage.lij
                public final void fB(Object obj) {
                    fce fceVar = this.a;
                    if (((Boolean) obj).booleanValue()) {
                        return;
                    }
                    fceVar.c.fB(gqx.AUTO);
                }
            }, this.r));
        }
        if (!this.q.k(ddu.r)) {
            this.m.add("pref_camera_raw_output_option_available_key");
        }
        if (!this.q.k(dcv.b)) {
            List list = this.m;
        }
        ddf ddfVar = this.q;
        ddi ddiVar = dcs.a;
        ddfVar.c();
        if (!this.q.k(ddl.aQ)) {
            List list2 = this.m;
        }
        this.q.f();
        List list3 = this.m;
        if (!z) {
            List list4 = this.m;
            String str = htu.q.a;
        }
        if (!this.q.k(dcu.o) || !this.z.c()) {
            List list5 = this.m;
            String str2 = htu.r.a;
        }
        this.y.i();
        if (1 == 0) {
            this.u.e(htu.g, true);
            List list6 = this.m;
            String str3 = htu.g.a;
        }
        this.q.b();
        List list7 = this.m;
        if (!this.q.k(ddl.aV) && !this.q.k(ddl.aW)) {
            List list8 = this.m;
        }
        if (!this.q.k(ddd.a)) {
            List list9 = this.m;
        }
        if (!this.q.k(ddm.ak)) {
            List list10 = this.m;
        }
        if (!this.q.k(ddl.bo)) {
            List list11 = this.m;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager.isPermissionRevokedByPolicy("android.permission.ACCESS_COARSE_LOCATION", context.getPackageName()) || packageManager.isPermissionRevokedByPolicy("android.permission.ACCESS_FINE_LOCATION", context.getPackageName())) {
            List list12 = this.m;
            String str4 = htu.a.a;
        }
        if (!this.q.k(ddl.aH)) {
            List list13 = this.m;
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (this.x || (notificationManager != null && notificationManager.isNotificationPolicyAccessGranted())) {
            List list14 = this.m;
        }
        if (!this.q.k(ddl.K)) {
            this.w.fB(false);
            List list15 = this.m;
        }
        Set set = this.f;
        Set set2 = this.f;
        Set set3 = this.f;
        String str5 = htu.r.a;
        if (!this.q.k(ddl.bn)) {
            ddf ddfVar2 = this.q;
            ddg ddgVar = dds.a;
            ddfVar2.f();
            List list16 = this.m;
            String str6 = htu.e.a;
        }
        if (!this.q.k(deh.a)) {
            this.m.add("pref_chameleon_control_key");
        }
        oti otiVarListIterator = ((orx) this.s).listIterator();
        while (otiVarListIterator.hasNext()) {
            hve hveVar = (hve) otiVarListIterator.next();
            if (((String) hveVar.h().get(0)).equals("PhotoResolution")) {
                ListPreference listPreference = new ListPreference(context);
                listPreference.setTitle(hveVar.e());
                listPreference.setEntries(hveVar.a());
                listPreference.setEntryValues(hveVar.b());
                listPreference.setKey(hveVar.g());
                listPreference.setDefaultValue(hveVar.f());
                listPreference.setIcon(hveVar.c());
                listPreference.setSummary(hveVar.d());
                listPreference.setLayoutResource(R.layout.preference_with_margin);
                listPreference.setOrder(3);
                this.o.l("pref_category_resolution_camera", listPreference);
            }
        }
        oti otiVarListIterator2 = ((orx) this.t).listIterator();
        while (otiVarListIterator2.hasNext()) {
            hvf hvfVar = (hvf) otiVarListIterator2.next();
            if (((String) hvfVar.e().get(0)).equals("Advanced")) {
                SwitchPreference switchPreference = new SwitchPreference(context);
                switchPreference.setTitle(hvfVar.b());
                switchPreference.setSummary(hvfVar.a());
                switchPreference.setKey(hvfVar.d());
                switchPreference.setDefaultValue(hvfVar.c());
                ManagedSwitchPreference managedSwitchPreference = new ManagedSwitchPreference(context);
                managedSwitchPreference.setDefaultValue(true);
                managedSwitchPreference.setKey(switchPreference.getKey());
                managedSwitchPreference.setSummary(switchPreference.getSummary());
                managedSwitchPreference.setTitle(switchPreference.getTitle());
                managedSwitchPreference.setIcon(switchPreference.getIcon());
                managedSwitchPreference.c = switchPreference.getOnPreferenceChangeListener();
                managedSwitchPreference.setOrder(switchPreference.getOrder());
                managedSwitchPreference.setLayoutResource(R.layout.preference_with_margin);
                this.o.l("pref_category_advanced", managedSwitchPreference);
            }
        }
    }
}
