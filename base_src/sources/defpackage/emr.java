package defpackage;

import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.job.JobScheduler;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.PowerManager;
import android.os.UserManager;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: classes.dex */
public interface emr {
    public static final emq c = new emq(AudioManager.class, "audio", 2);
    public static final emq d = new emq(AccessibilityManager.class, "accessibility", 3);
    public static final emq e = new emq(CameraManager.class, "camera", 4);
    public static final emq f = new emq(DisplayManager.class, "display", 6);
    public static final emq g = new emq(KeyguardManager.class, "keyguard", 7);
    public static final emq h = new emq(LocationManager.class, "location", 8);
    public static final emq i = new emq(NotificationManager.class, "notification", 9);
    public static final emq j = new emq(PowerManager.class, "power", 10);
    public static final emq k = new emq(SensorManager.class, "sensor", 11);
    public static final emq l = new emq(JobScheduler.class, "jobscheduler", 15);
    public static final emq m = new emq(UserManager.class, "user", 16);

    Object a(emq emqVar);
}
