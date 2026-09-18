# GCAM LMC 8.5 (Tecno & Infinix Edition)

<div align="center">

[![Watch GCAM LMC 8.5 Video Demo](https://i.pinimg.com/originals/ae/e6/21/aee621531d88054ed5441b0df49efda0.jpg)](https://ph.pinterest.com/pin/882564858198206050/)

</div>

Custom Google Camera (LMC 8.5 mod) tailored and optimized for Transsion devices (Tecno, Infinix, and iTel), including models like the Tecno Camon 40 Pro 5G, Infinix GT, Zero, and Note series.

## ✨ Features & Optimizations

- **100% Ultra High Quality JPEG**:
  - Direct native compression pipeline locked to 100% (`0x64`).
  - Uncompressed LibPatcher quantization matrix (`15008052`) for zero compression artifacts and maximum detail retention.
  - Hardcoded fallback and default preference tuned for pristine clarity.

- **Enhanced Video Engine**:
  - Unlocked **4K 60FPS** (`camcorder.4k60fps`) support.
  - Enabled **writable frame rates** (`fps_video_setting_writeable`) to unlock high refresh/high FPS video recording modes (e.g., 2K 60/90/120fps, 1080p 60/120fps where supported by hardware HAL).
  - Configured high bitrate default (48 Mbps up to 120 Mbps).
  - Built-in fail-safe CamcorderProfile fallback to prevent crashes on aux/sub sensors.

- **Transsion Device Hardware Compatibility**:
  - Automatic hardware detection and profile overrides for Tecno and Infinix devices.
  - Native video stabilization enabled by default.
  - Optimized HDR+ frame count.

## 📦 APK Downloads

Download the latest prebuilt, signed APK and configs from GitHub Releases:
- 🚀 **[Download LMC 8.5.apk (Direct Release)](https://github.com/willygailo/willygailo-GCAM-LMC/releases/download/v8.5.0/LMC.8.5.apk)**
- **Release Page**: [GitHub Release v8.5.0](https://github.com/willygailo/willygailo-GCAM-LMC/releases/tag/v8.5.0)
- **Version Code**: `64764892`
- **Version Name**: `8.5.300.414775575.18`
- **App Label**: `LMC8.5`

## ⚙️ XML Configurations (Optional Presets)

> [!NOTE]
> Ang **LMC 8.5** ay **100% Plug-and-Play** — naka-bake na ang lahat ng pro-settings sa mismong app kaya hindi na kailangan mag-import ng XML para sa pang-araw-araw na paggamit.
> Gayunpaman, kung nais mo ng specialized tuning profiles, maaari mong gamitin ang mga kasamang `.xml` config:

- 📄 [`Tecno_Infinix_Master_Pro.xml`](configs/Tecno_Infinix_Master_Pro.xml) — Daily driver: Leica Vibrant/Authentic, 15-frame HDR+, Shasta Denoising.
- 📄 [`Tecno_Infinix_Night_Astro.xml`](configs/Tecno_Infinix_Night_Astro.xml) — Night Sight & Astrophotography: 25-frame deep computational HDR+, long exposure.
- 📄 [`Tecno_Infinix_Cinematic_Video.xml`](configs/Tecno_Infinix_Cinematic_Video.xml) — 4K 60FPS studio video recording, 48-100 Mbps bitrate, active EIS.

### Paano I-load ang XML Config:
1. Gumawa ng folder sa phone storage: `Internal Storage/LMC8.4/`
2. Kopyahin ang nais na `.xml` file sa loob ng folder na `LMC8.4`.
3. Buksan ang GCAM LMC 8.5.
4. **Mag-double tap sa black space sa paligid o tabi ng Shutter Button**.
5. Piliin ang config mula sa pop-up menu at pindutin ang **Import**.

---

## 👤 Developer & Maintainer

- 🌐 **GitHub**: [@willygailo](https://github.com/willygailo)
- 📘 **Facebook**: [Willy Jr Carnasa Gailo](https://www.facebook.com/https.willy.jr.carnasa.gailo2026.2027)
- 📂 **Project Repository**: [willygailo/willygailo-GCAM-LMC](https://github.com/willygailo/willygailo-GCAM-LMC)

