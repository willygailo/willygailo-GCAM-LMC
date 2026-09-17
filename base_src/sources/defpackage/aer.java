package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class aer extends Fragment {
    /* JADX WARN: Multi-variable type inference failed */
    static void a(Activity activity, adz adzVar) {
        if (activity instanceof aeg) {
            ((aeg) activity).a().c(adzVar);
        } else if (activity instanceof aee) {
            aeb aebVarC = ((aee) activity).C();
            if (aebVarC instanceof aeb) {
                aebVarC.c(adzVar);
            }
        }
    }

    public static void b(Activity activity) {
        activity.registerActivityLifecycleCallbacks(new aeq());
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new aer(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        adz adzVar = adz.ON_CREATE;
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        adz adzVar = adz.ON_CREATE;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        adz adzVar = adz.ON_CREATE;
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        adz adzVar = adz.ON_CREATE;
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        adz adzVar = adz.ON_CREATE;
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        adz adzVar = adz.ON_CREATE;
    }
}
