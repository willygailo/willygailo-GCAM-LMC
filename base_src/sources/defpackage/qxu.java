package defpackage;

import com.google.android.GoogleCameraEngR18F1.R;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class qxu implements mdv {
    private final /* synthetic */ int a;

    public qxu(int i) {
        this.a = i;
    }

    @Override // defpackage.mdv
    public final int a() {
        switch (this.a) {
            case 0:
                return 2065731759;
            default:
                return -969197918;
        }
    }

    @Override // defpackage.mdv
    public final int b() {
        switch (this.a) {
            case 0:
                return R.raw.logs_proto_wireless_performance_mobile_system_health_metric_collection_basis_library;
            default:
                return R.raw.logs_proto_wireless_android_play_playlog_camera_log_collection_basis;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (obj != null && getClass() == obj.getClass()) {
                    mdv mdvVar = (mdv) obj;
                    if (mdvVar.a() == 2065731759 && mdvVar.b() == R.raw.logs_proto_wireless_performance_mobile_system_health_metric_collection_basis_library) {
                        return true;
                    }
                }
                return false;
            default:
                if (obj != null && getClass() == obj.getClass()) {
                    mdv mdvVar2 = (mdv) obj;
                    if (mdvVar2.a() == -969197918 && mdvVar2.b() == R.raw.logs_proto_wireless_android_play_playlog_camera_log_collection_basis) {
                        return true;
                    }
                }
                return false;
        }
    }

    public final int hashCode() {
        switch (this.a) {
            case 0:
                return Arrays.hashCode(new int[]{getClass().hashCode(), 2065731759, -2032180703, R.raw.logs_proto_wireless_performance_mobile_system_health_metric_collection_basis_library});
            default:
                return Arrays.hashCode(new int[]{getClass().hashCode(), -969197918, -2032180703, R.raw.logs_proto_wireless_android_play_playlog_camera_log_collection_basis});
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "java_hash=2065731759,feature_hash=-2032180703,res=2131951634";
            default:
                return "java_hash=-969197918,feature_hash=-2032180703,res=2131951632";
        }
    }
}
