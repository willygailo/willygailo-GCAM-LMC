package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bju implements Handler.Callback {
    final Map a = new HashMap();
    final Map b = new HashMap();
    private volatile ayn c;
    private final Handler d;

    public bju() {
        new Bundle();
        this.d = new Handler(Looper.getMainLooper(), this);
        int i = bhk.a;
    }

    private static Activity e(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return e(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    private static void f(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    private static boolean g(Context context) {
        Activity activityE = e(context);
        return activityE == null || !activityE.isFinishing();
    }

    public final ayn a(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (bmf.n() && !(context instanceof Application)) {
            if (context instanceof by) {
                return b((by) context);
            }
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (bmf.m()) {
                    return a(activity.getApplicationContext());
                }
                if (activity instanceof by) {
                    return b((by) activity);
                }
                f(activity);
                FragmentManager fragmentManager = activity.getFragmentManager();
                boolean zG = g(activity);
                bjt bjtVarC = c(fragmentManager);
                ayn aynVar = bjtVarC.c;
                if (aynVar != null) {
                    return aynVar;
                }
                ayn aynVarB = bkh.b(axv.b(activity), bjtVarC.a, bjtVarC.b, activity);
                if (zG) {
                    aynVarB.h();
                }
                bjtVarC.c = aynVarB;
                return aynVarB;
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return a(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    this.c = bkh.b(axv.b(context.getApplicationContext()), new bjk(), new bjo(), context.getApplicationContext());
                }
            }
        }
        return this.c;
    }

    public final ayn b(by byVar) {
        if (bmf.m()) {
            return a(byVar.getApplicationContext());
        }
        f(byVar);
        cu cuVarFm = byVar.fm();
        boolean zG = g(byVar);
        bke bkeVarD = d(cuVarFm);
        ayn aynVarB = bkeVarD.c;
        if (aynVarB == null) {
            aynVarB = bkh.b(axv.b(byVar), bkeVarD.a, bkeVarD.b, byVar);
            if (zG) {
                aynVarB.h();
            }
            bkeVarD.c = aynVarB;
        }
        return aynVarB;
    }

    public final bjt c(FragmentManager fragmentManager) {
        bjt bjtVar = (bjt) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (bjtVar != null || (bjtVar = (bjt) this.a.get(fragmentManager)) != null) {
            return bjtVar;
        }
        bjt bjtVar2 = new bjt();
        this.a.put(fragmentManager, bjtVar2);
        fragmentManager.beginTransaction().add(bjtVar2, "com.bumptech.glide.manager").commitAllowingStateLoss();
        this.d.obtainMessage(1, fragmentManager).sendToTarget();
        return bjtVar2;
    }

    public final bke d(cu cuVar) {
        bke bkeVar = (bke) cuVar.d("com.bumptech.glide.manager");
        if (bkeVar != null || (bkeVar = (bke) this.b.get(cuVar)) != null) {
            return bkeVar;
        }
        bke bkeVar2 = new bke();
        this.b.put(cuVar, bkeVar2);
        dd ddVarH = cuVar.h();
        ddVarH.n(bkeVar2, "com.bumptech.glide.manager");
        ddVarH.h();
        this.d.obtainMessage(2, cuVar).sendToTarget();
        return bkeVar2;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Object obj;
        boolean z;
        Object objRemove = null;
        switch (message.what) {
            case 1:
                FragmentManager fragmentManager = (FragmentManager) message.obj;
                obj = fragmentManager;
                objRemove = this.a.remove(fragmentManager);
                z = true;
                break;
            case 2:
                cu cuVar = (cu) message.obj;
                obj = cuVar;
                objRemove = this.b.remove(cuVar);
                z = true;
                break;
            default:
                z = false;
                obj = null;
                break;
        }
        if (!z || objRemove != null || !Log.isLoggable("RMRetriever", 5)) {
            return z;
        }
        String strValueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 61);
        sb.append("Failed to remove expected request manager fragment, manager: ");
        sb.append(strValueOf);
        Log.w("RMRetriever", sb.toString());
        return true;
    }
}
