.class public Lcom/Transsion;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static overrideDefaults(Lddj;Lddf;)V
    .locals 6

    :try_start_0
    move-object v1, p0

    check-cast v1, Ldep;

    const/4 v2, 0x1

    const/4 v3, 0x0

    # Base compatibility fixes
    const-string v0, "pref_rn8p_key"
    const-string v4, "1"
    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "pref_samsungfix_key"
    const-string v4, "-1"
    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "pref_device_key"
    const-string v4, "0"
    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "pref_device_key_front"
    const-string v4, "0"
    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    # AWB White Balance (Pixel 4/6 Calibrated)
    const-string v0, "pref_awb_key"
    const-string v4, "4"
    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "pref_awb_key_front"
    const-string v4, "4"
    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    # Video Bitrate: 48-100 Mbps studio quality
    const-string v0, "pref_bitrate_key"
    const-string v4, "12"
    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    # HDR+ Frames: 15 frames for optimal dynamic range & zero lag
    const-string v0, "pref_frames_hdr_key"
    const-string v4, "15"
    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "pref_frames_hdr_key_front"
    const-string v4, "12"
    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    # Lossless JPEG 100%
    const-string v0, "pref_qjpg_key"
    const-string v4, "100"
    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "lib_hardjpgquality_key"
    const-string v4, "15008052"
    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "lib_hardjpgquality_key_front"
    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    # --- PROFESSIONAL VIEWFINDER HUD BUTTONS ---
    # 1. Leica Mode (Authentic vs Vibrant color science)
    const-string v0, "pref_show_button_leica"
    const-string v4, "1"
    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    # 2. Google Auto White Balance HUD Button
    const-string v0, "pref_show_button_awb"
    const-string v4, "1"
    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    # 3. Pro Mode Controls HUD Button (Manual controls)
    const-string v0, "pref_show_button_pro"
    const-string v4, "1"
    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    # 4. Exposure Compensation EV Slider on Viewfinder
    const-string v0, "pref_show_button_expslide"
    const-string v4, "1"
    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    # 5. OIS & Electronic Stabilization HUD Button
    const-string v0, "pref_show_button_ois"
    const-string v4, "1"
    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    # 6. Autofocus Tracking HUD Button
    const-string v0, "pref_show_button_af"
    const-string v4, "1"
    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    # --- ADVANCED ISP & LIBPATCHER ENGINE TUNING ---
    # Enable LibPatcher Master Processing
    const-string v0, "pref_enable_patcher_key"
    const-string v4, "1"
    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    # Shasta Motion & Temporal Multi-frame Denoising
    const-string v0, "lib_shastaforce_key"
    const-string v4, "1"
    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    # Recompute White Balance on Base RAW Frame (Natural skin tones)
    const-string v0, "lib_wbbaseframe_key"
    const-string v4, "1"
    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    # Discard Mismatched Exposure Frames in Bursts (Eliminates micro-shake)
    const-string v0, "lib_withtetmismatch_key"
    const-string v4, "1"
    invoke-virtual {v1, v0, v4}, Ldep;->sh(Ljava/lang/String;Ljava/lang/String;)V

    # Enable Optical & Video Stabilization
    sget-object v0, Ldcu;->q:Lddg;
    invoke-interface {v1, v0, v3}, Lddk;->s(Lddg;Z)V

    # Unlock 4K 60FPS Video
    sget-object v0, Ldcu;->E:Lddg;
    invoke-interface {v1, v0, v2}, Lddk;->s(Lddg;Z)V

    # Unlock Writable Framerates (2K 90/120fps, 1080p 60/120fps)
    sget-object v0, Ldcu;->v:Lddg;
    invoke-interface {v1, v0, v2}, Lddk;->s(Lddg;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catch_transsion_err

    return-void

    :catch_transsion_err
    move-exception v0

    return-void
.end method
