package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.libraries.social.licenses.LicenseActivity;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class nig extends bu implements aez {
    public LicenseMenuActivity a;
    private ArrayAdapter b;

    @Override // defpackage.bu
    public final View A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.libraries_social_licenses_license_menu_fragment, viewGroup, false);
    }

    @Override // defpackage.bu
    public final void J() {
        super.J();
        afa afaVarA = afa.a(w());
        if (afaVarA.a.c) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
        if (afa.b(2)) {
            String str = "destroyLoader in " + afaVarA + " of 54321";
        }
        afb afbVarA = afaVarA.a.a(54321);
        if (afbVarA != null) {
            afbVarA.j();
            xg xgVar = afaVarA.a.b;
            int iA = xb.a(xgVar.c, xgVar.e, 54321);
            if (iA < 0 || xgVar.d[iA] == xg.a) {
                return;
            }
            xgVar.d[iA] = xg.a;
            xgVar.b = true;
        }
    }

    @Override // defpackage.bu
    public final void M(View view, Bundle bundle) {
        by byVarW = w();
        this.b = new ArrayAdapter(byVarW, R.layout.libraries_social_licenses_license, R.id.license, new ArrayList());
        afa.a(byVarW).c(54321, this);
        ListView listView = (ListView) view.findViewById(R.id.license_list);
        listView.setAdapter((ListAdapter) this.b);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: nif
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view2, int i, long j) {
                nig nigVar = this.a;
                nic nicVar = (nic) adapterView.getItemAtPosition(i);
                LicenseMenuActivity licenseMenuActivity = nigVar.a;
                if (licenseMenuActivity != null) {
                    Intent intent = new Intent(licenseMenuActivity, (Class<?>) LicenseActivity.class);
                    intent.putExtra("license", nicVar);
                    licenseMenuActivity.startActivity(intent);
                }
            }
        });
    }

    @Override // defpackage.aez
    public final afh a() {
        return new nie(w());
    }

    @Override // defpackage.aez
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        this.b.clear();
        this.b.addAll((List) obj);
        this.b.notifyDataSetChanged();
    }

    @Override // defpackage.aez
    public final void d() {
        this.b.clear();
        this.b.notifyDataSetChanged();
    }

    @Override // defpackage.bu
    public final void e() {
        super.e();
        this.a = null;
    }

    @Override // defpackage.bu
    public final void gv(Context context) {
        super.gv(context);
        by byVarW = w();
        if (byVarW instanceof LicenseMenuActivity) {
            this.a = (LicenseMenuActivity) byVarW;
        }
    }
}
