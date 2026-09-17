package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class aau {
    public static Executor a(Context context) {
        return context.getMainExecutor();
    }

    public static void b(View view, aey aeyVar) {
        view.setTag(R.id.view_tree_view_model_store_owner, aeyVar);
    }

    public static /* synthetic */ String c(int i) {
        switch (i) {
            case 1:
                return "READY";
            case 2:
                return "STARTING_RECORDING";
            case 3:
                return "RECORDING";
            case 4:
                return "RECORDING_PAUSED";
            case 5:
                return "STOPPING_RECORDING";
            case 6:
                return "STOPPED";
            default:
                return "null";
        }
    }

    public static int d(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            default:
                return 0;
        }
    }
}
