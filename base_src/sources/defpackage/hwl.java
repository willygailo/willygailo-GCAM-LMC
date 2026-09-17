package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class hwl {
    public final Context a;
    private final NotificationManager b;
    private final khx c;

    public hwl(Context context, khx khxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = context;
        this.b = (NotificationManager) context.getSystemService(NotificationManager.class);
        this.c = khxVar;
    }

    public final NotificationChannel a() {
        NotificationChannel notificationChannel = this.b.getNotificationChannel("Sideline");
        if (notificationChannel != null) {
            return notificationChannel;
        }
        NotificationChannel notificationChannel2 = new NotificationChannel("Sideline", this.a.getString(R.string.notification_update_channel_name), 3);
        notificationChannel2.setSound(null, null);
        this.b.createNotificationChannel(notificationChannel2);
        return notificationChannel2;
    }

    final void b() {
        Notification.Builder builder = new Notification.Builder(this.a, a().getId());
        String string = this.a.getString(R.string.update_failed_notification_title);
        Notification.Builder contentText = builder.setSmallIcon(R.drawable.ic_notification).setColor(this.a.getColor(R.color.update_notification_icon_color)).setContentTitle(string).setContentText(this.a.getString(R.string.update_failed_notification_text));
        khx khxVar = this.c;
        contentText.setContentIntent(PendingIntent.getActivity(khxVar.a, 0, new Intent("com.google.android.apps.betterbug.intent.FILE_BUG_DEEPLINK").addFlags(268435456).putExtra("EXTRA_DEEPLINK", true).putExtra("EXTRA_ISSUE_TITLE", string).putExtra("EXTRA_COMPONENT_ID", 43059L).putExtra("EXTRA_HAPPENED_TIME", System.currentTimeMillis()).putExtra("EXTRA_REQUIRE_BUGREPORT", true), 1140850688)).setAutoCancel(true);
        this.b.notify(70207, builder.build());
    }
}
