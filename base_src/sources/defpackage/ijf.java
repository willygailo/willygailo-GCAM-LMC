package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum ijf {
    ACTIVITY_ONCREATE_START(true),
    ACTIVITY_ONCREATE_END(true),
    PERMISSIONS_STARTUP_TASK_START(true),
    PERMISSIONS_STARTUP_TASK_END(true),
    WAIT_FOR_CAMERA_DEVICES_TASK_START(true),
    WAIT_FOR_CAMERA_DEVICES_TASK_END(true),
    ACTIVITY_ONSTART_START(false),
    ACTIVITY_ONRESUME_START(false),
    ACTIVITY_ONRESUME_END(false),
    ACTIVITY_SURFACE_VIEW_CREATED(false),
    ACTIVITY_INITIALIZED(true),
    ACTIVITY_FIRST_PREVIEW_FRAME_RECEIVED(false),
    ACTIVITY_FIRST_PREVIEW_FRAME_RENDERED(false),
    ACTIVITY_FIRST_PREVIEW_FRAME_VFE_RENDERED(false, false),
    ACTIVITY_SHUTTER_BUTTON_DRAWN(false),
    ACTIVITY_SHUTTER_BUTTON_ENABLED(false),
    ACTIVITY_STEADY(false, false);

    public final boolean r;
    public final boolean s;

    ijf(boolean z) {
        this(z, true);
    }

    ijf(boolean z, boolean z2) {
        this.r = z;
        this.s = z2;
    }
}
