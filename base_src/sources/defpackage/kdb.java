package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import com.google.android.camera.experimental2019.ExperimentalKeys;

/* JADX INFO: loaded from: classes2.dex */
public final class kdb {
    public static final CaptureRequest.Key a;
    public static final CaptureResult.Key b;
    public static final CaptureRequest.Key c;
    public static final CaptureResult.Key d;
    public static final CaptureRequest.Key e;
    public static final CaptureRequest.Key f;
    public static final CaptureRequest.Key g;
    public static final CameraCharacteristics.Key h;
    public static final CaptureRequest.Key i;
    public static final CaptureResult.Key j;
    public static final CaptureResult.Key k;
    public static final CaptureResult.Key l;
    public static final CaptureResult.Key m;
    public static final CaptureRequest.Key n;
    public static final CaptureRequest.Key o;
    public static final CaptureRequest.Key p;
    public static final CaptureResult.Key q;
    private static final boolean r = kde.e(4);
    private static final boolean s;
    private static final boolean t;
    private static final boolean u;

    static {
        CaptureRequest.Key key;
        CaptureResult.Key key2;
        CaptureRequest.Key key3;
        CaptureResult.Key key4;
        CaptureRequest.Key key5;
        CaptureRequest.Key key6;
        CaptureRequest.Key key7;
        CameraCharacteristics.Key key8;
        CaptureRequest.Key key9;
        CaptureResult.Key key10;
        CaptureResult.Key key11;
        CaptureResult.Key key12;
        CaptureResult.Key key13;
        CaptureRequest.Key key14;
        CaptureRequest.Key key15;
        CaptureRequest.Key key16;
        boolean zE = kde.e(5);
        s = zE;
        boolean zE2 = kde.e(6);
        t = zE2;
        boolean zE3 = kde.e(7);
        u = zE3;
        CaptureResult.Key key17 = null;
        if (a(1)) {
            key = ExperimentalKeys.REQUEST_LENS_SHADING_STATS_ENABLED;
        } else if (zE) {
            key = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_LENS_SHADING_STATS_ENABLED;
        } else if (zE2) {
            key = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_LENS_SHADING_STATS_ENABLED;
        } else {
            key = zE3 ? com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_LENS_SHADING_STATS_ENABLED : null;
        }
        a = key;
        if (a(1)) {
            CaptureResult.Key key18 = ExperimentalKeys.RESULT_LENS_SHADING_STATS_ENABLED;
        } else if (zE) {
            CaptureResult.Key key19 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_LENS_SHADING_STATS_ENABLED;
        } else if (zE2) {
            CaptureResult.Key key20 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_LENS_SHADING_STATS_ENABLED;
        } else if (zE3) {
            CaptureResult.Key key21 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_LENS_SHADING_STATS_ENABLED;
        }
        if (a(1)) {
            CaptureResult.Key key22 = ExperimentalKeys.RESULT_LENS_SHADING_STATS;
        } else if (zE) {
            CaptureResult.Key key23 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_LENS_SHADING_STATS;
        } else if (zE2) {
            CaptureResult.Key key24 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_LENS_SHADING_STATS;
        } else if (zE3) {
            CaptureResult.Key key25 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_LENS_SHADING_STATS;
        }
        if (a(2)) {
            CaptureRequest.Key key26 = ExperimentalKeys.REQUEST_GCAM_AE_MOTION_EF_ENABLED;
        } else if (zE) {
            CaptureRequest.Key key27 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_GCAM_AE_MOTION_EF_ENABLED;
        } else if (zE2) {
            CaptureRequest.Key key28 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_GCAM_AE_MOTION_EF_ENABLED;
        } else if (zE3) {
            CaptureRequest.Key key29 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_GCAM_AE_MOTION_EF_ENABLED;
        }
        if (a(2)) {
            CaptureResult.Key key30 = ExperimentalKeys.RESULT_GCAM_AE_MOTION_EF_ENABLED;
        } else if (zE) {
            CaptureResult.Key key31 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_GCAM_AE_MOTION_EF_ENABLED;
        } else if (zE2) {
            CaptureResult.Key key32 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_GCAM_AE_MOTION_EF_ENABLED;
        } else if (zE3) {
            CaptureResult.Key key33 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_GCAM_AE_MOTION_EF_ENABLED;
        }
        if (a(2)) {
            key2 = ExperimentalKeys.RESULT_GCAM_AE_OUTPUT;
        } else if (zE) {
            key2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_GCAM_AE_OUTPUT;
        } else if (zE2) {
            key2 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_GCAM_AE_OUTPUT;
        } else {
            key2 = zE3 ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_GCAM_AE_OUTPUT : null;
        }
        b = key2;
        if (a(2)) {
            key3 = ExperimentalKeys.REQUEST_LIVE_HDR_SETTINGS;
        } else if (zE) {
            key3 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_LIVE_HDR_SETTINGS;
        } else if (zE2) {
            key3 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_LIVE_HDR_SETTINGS;
        } else {
            key3 = zE3 ? com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_LIVE_HDR_SETTINGS : null;
        }
        c = key3;
        if (a(2)) {
            key4 = ExperimentalKeys.RESULT_LIVE_HDR_SETTINGS;
        } else if (zE) {
            key4 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_LIVE_HDR_SETTINGS;
        } else if (zE2) {
            key4 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_LIVE_HDR_SETTINGS;
        } else {
            key4 = zE3 ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_LIVE_HDR_SETTINGS : null;
        }
        d = key4;
        if (a(3)) {
            key5 = ExperimentalKeys.REQUEST_IPE_INFO_ENABLED;
        } else if (zE) {
            key5 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_IPE_INFO_ENABLED;
        } else {
            key5 = zE2 ? com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_IPE_INFO_ENABLED : null;
        }
        e = key5;
        if (a(3)) {
            CaptureResult.Key key34 = ExperimentalKeys.RESULT_IPE_INFO_ENABLED;
        } else if (zE) {
            CaptureResult.Key key35 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_IPE_INFO_ENABLED;
        } else if (zE2) {
            CaptureResult.Key key36 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_IPE_INFO_ENABLED;
        }
        if (a(3)) {
            CaptureResult.Key key37 = ExperimentalKeys.RESULT_IPE_INFO;
        } else if (zE) {
            CaptureResult.Key key38 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_IPE_INFO;
        } else if (zE2) {
            CaptureResult.Key key39 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_IPE_INFO;
        }
        if (a(3)) {
            key6 = ExperimentalKeys.REQUEST_IFE_INFO_ENABLED;
        } else if (zE) {
            key6 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_IFE_INFO_ENABLED;
        } else {
            key6 = zE2 ? com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_IFE_INFO_ENABLED : null;
        }
        f = key6;
        if (a(3)) {
            CaptureResult.Key key40 = ExperimentalKeys.RESULT_IFE_INFO_ENABLED;
        } else if (zE) {
            CaptureResult.Key key41 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_IFE_INFO_ENABLED;
        } else if (zE2) {
            CaptureResult.Key key42 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_IFE_INFO_ENABLED;
        }
        if (a(3)) {
            CaptureResult.Key key43 = ExperimentalKeys.RESULT_IFE_INFO;
        } else if (zE) {
            CaptureResult.Key key44 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_IFE_INFO;
        } else if (zE2) {
            CaptureResult.Key key45 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_IFE_INFO;
        }
        if (a(3)) {
            key7 = ExperimentalKeys.REQUEST_BPS_INFO_ENABLED;
        } else if (zE) {
            key7 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_BPS_INFO_ENABLED;
        } else {
            key7 = zE2 ? com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_BPS_INFO_ENABLED : null;
        }
        g = key7;
        if (a(3)) {
            CaptureResult.Key key46 = ExperimentalKeys.RESULT_BPS_INFO_ENABLED;
        } else if (zE) {
            CaptureResult.Key key47 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_BPS_INFO_ENABLED;
        } else if (zE2) {
            CaptureResult.Key key48 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_BPS_INFO_ENABLED;
        }
        if (a(3)) {
            CaptureResult.Key key49 = ExperimentalKeys.RESULT_BPS_INFO;
        } else if (zE) {
            CaptureResult.Key key50 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_BPS_INFO;
        } else if (zE2) {
            CaptureResult.Key key51 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_BPS_INFO;
        }
        if (a(4)) {
            key8 = ExperimentalKeys.CHARACTERISTICS_MESH_WARP_AVAILABLE_MODES;
        } else if (zE) {
            key8 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.CHARACTERISTICS_MESH_WARP_AVAILABLE_MODES;
        } else if (zE2) {
            key8 = com.google.android.camera.experimental2020.ExperimentalKeys.CHARACTERISTICS_MESH_WARP_AVAILABLE_MODES;
        } else {
            key8 = zE3 ? com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_MESH_WARP_AVAILABLE_MODES : null;
        }
        h = key8;
        if (a(4)) {
            key9 = ExperimentalKeys.REQUEST_MESH_WARP_MODE;
        } else if (zE) {
            key9 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_MESH_WARP_MODE;
        } else if (zE2) {
            key9 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_MESH_WARP_MODE;
        } else {
            key9 = zE3 ? com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_MESH_WARP_MODE : null;
        }
        i = key9;
        if (a(4)) {
            CaptureResult.Key key52 = ExperimentalKeys.RESULT_MESH_WARP_MODE;
        } else if (zE) {
            CaptureResult.Key key53 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_MESH_WARP_MODE;
        } else if (zE2) {
            CaptureResult.Key key54 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_MESH_WARP_MODE;
        } else if (zE3) {
            CaptureResult.Key key55 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_MESH_WARP_MODE;
        }
        if (a(4)) {
            key10 = ExperimentalKeys.RESULT_MESH_WARP_SIZE;
        } else if (zE) {
            key10 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_MESH_WARP_SIZE;
        } else if (zE2) {
            key10 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_MESH_WARP_SIZE;
        } else {
            key10 = zE3 ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_MESH_WARP_SIZE : null;
        }
        j = key10;
        if (a(4)) {
            key11 = ExperimentalKeys.RESULT_MESH_WARP_CROP_REGION;
        } else if (zE) {
            key11 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_MESH_WARP_CROP_REGION;
        } else if (zE2) {
            key11 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_MESH_WARP_CROP_REGION;
        } else {
            key11 = zE3 ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_MESH_WARP_CROP_REGION : null;
        }
        k = key11;
        if (a(4)) {
            key12 = ExperimentalKeys.RESULT_MESH_WARP_DATA;
        } else if (zE) {
            key12 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_MESH_WARP_DATA;
        } else if (zE2) {
            key12 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_MESH_WARP_DATA;
        } else {
            key12 = zE3 ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_MESH_WARP_DATA : null;
        }
        l = key12;
        if (a(8)) {
            key13 = ExperimentalKeys.RESULT_MESH_WARP_IS_IDENTITY_TRANSFORM;
        } else if (zE) {
            key13 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_MESH_WARP_IS_IDENTITY_TRANSFORM;
        } else if (zE2) {
            key13 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_MESH_WARP_IS_IDENTITY_TRANSFORM;
        } else {
            key13 = zE3 ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_MESH_WARP_IS_IDENTITY_TRANSFORM : null;
        }
        m = key13;
        if (a(5)) {
            key14 = ExperimentalKeys.REQUEST_HDRNET_MODE;
        } else if (zE) {
            key14 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_HDRNET_MODE;
        } else if (zE2) {
            key14 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_HDRNET_MODE;
        } else {
            key14 = zE3 ? com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_HDRNET_MODE : null;
        }
        n = key14;
        if (a(5)) {
            CaptureResult.Key key56 = ExperimentalKeys.RESULT_HDRNET_MODE;
        } else if (zE) {
            CaptureResult.Key key57 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_HDRNET_MODE;
        } else if (zE2) {
            CaptureResult.Key key58 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_HDRNET_MODE;
        } else if (zE3) {
            CaptureResult.Key key59 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_HDRNET_MODE;
        }
        if (a(6)) {
            key15 = ExperimentalKeys.REQUEST_AUTO_3A_SCENE_MODE;
        } else if (zE) {
            key15 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_AUTO_3A_SCENE_MODE;
        } else if (zE2) {
            key15 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_AUTO_3A_SCENE_MODE;
        } else {
            key15 = zE3 ? com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_AUTO_3A_SCENE_MODE : null;
        }
        o = key15;
        if (a(6)) {
            CaptureResult.Key key60 = ExperimentalKeys.RESULT_AUTO_3A_SCENE_MODE;
        } else if (zE) {
            CaptureResult.Key key61 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_AUTO_3A_SCENE_MODE;
        } else if (zE2) {
            CaptureResult.Key key62 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_AUTO_3A_SCENE_MODE;
        } else if (zE3) {
            CaptureResult.Key key63 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_AUTO_3A_SCENE_MODE;
        }
        if (a(7)) {
            key16 = ExperimentalKeys.REQUEST_AF_RESCAN_FRAME_COUNT;
        } else if (zE) {
            key16 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_AF_RESCAN_FRAME_COUNT;
        } else if (zE2) {
            key16 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_AF_RESCAN_FRAME_COUNT;
        } else {
            key16 = zE3 ? com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_AF_RESCAN_FRAME_COUNT : null;
        }
        p = key16;
        if (a(7)) {
            key17 = ExperimentalKeys.RESULT_AF_RESCAN_FRAME_COUNT;
        } else if (zE) {
            key17 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_AF_RESCAN_FRAME_COUNT;
        } else if (zE2) {
            key17 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_AF_RESCAN_FRAME_COUNT;
        } else if (zE3) {
            key17 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_AF_RESCAN_FRAME_COUNT;
        }
        q = key17;
        if (a(10)) {
            CaptureRequest.Key key64 = ExperimentalKeys.REQUEST_SENSOR_MODE_FULLFOV;
        } else if (zE) {
            CaptureRequest.Key key65 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_SENSOR_MODE_FULLFOV;
        } else if (zE2) {
            CaptureRequest.Key key66 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_SENSOR_MODE_FULLFOV;
        } else if (zE3) {
            CaptureRequest.Key key67 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_SENSOR_MODE_FULLFOV;
        }
        if (a(10)) {
            CaptureResult.Key key68 = ExperimentalKeys.RESULT_SENSOR_MODE_FULLFOV;
        } else if (zE) {
            CaptureResult.Key key69 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_SENSOR_MODE_FULLFOV;
        } else if (zE2) {
            CaptureResult.Key key70 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_SENSOR_MODE_FULLFOV;
        } else if (zE3) {
            CaptureResult.Key key71 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_SENSOR_MODE_FULLFOV;
        }
        if (a(11)) {
            CaptureResult.Key key72 = ExperimentalKeys.RESULT_RLS_ENABLE;
        } else if (kdc.a(3)) {
            CaptureResult.Key key73 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_RLS_ENABLE;
        } else if (zE3) {
            CaptureResult.Key key74 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_RLS_ENABLE;
        }
    }

    private static boolean a(int i2) {
        if (!r) {
            return false;
        }
        try {
            return i2 <= ExperimentalKeys.getLibraryVersion();
        } catch (NoSuchFieldError e2) {
            return false;
        } catch (NoSuchMethodError e3) {
            return false;
        }
    }
}
