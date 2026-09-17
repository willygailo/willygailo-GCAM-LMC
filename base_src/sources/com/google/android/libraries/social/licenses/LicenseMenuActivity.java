package com.google.android.libraries.social.licenses;

import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.GoogleCameraEngR18F1.R;
import defpackage.cu;
import defpackage.dd;
import defpackage.ih;
import defpackage.nig;

/* JADX INFO: loaded from: classes.dex */
public final class LicenseMenuActivity extends ih {
    @Override // defpackage.by, defpackage.ub, defpackage.ds, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.libraries_social_licenses_license_menu_activity);
        if (f() != null) {
            f().g(true);
        }
        cu cuVarFm = fm();
        if (cuVarFm.c(R.id.license_menu_fragment_container) instanceof nig) {
            return;
        }
        nig nigVar = new nig();
        dd ddVarH = cuVarFm.h();
        ddVarH.l(R.id.license_menu_fragment_container, nigVar);
        ddVarH.b();
    }

    @Override // defpackage.ub, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
