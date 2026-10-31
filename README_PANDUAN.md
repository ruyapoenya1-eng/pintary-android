# PINTARY Android – Proyek WebView

## Isi
Proyek Android Studio awal untuk membuka PINTARY dari URL Google Apps Script yang diberikan. APK belum dikompilasi dan belum diuji pada perangkat fisik.

## Cara membuka
1. Ekstrak ZIP ini.
2. Buka Android Studio.
3. Pilih **Open**, lalu pilih folder `PINTARY_Android_Studio_Project`.
4. Tunggu Gradle Sync selesai. Pastikan Android SDK 35 terpasang.
5. Jika Android Studio meminta JDK, gunakan JDK 17.
6. Pilih menu **Build > Build Bundle(s) / APK(s) > Build APK(s)**.
7. APK debug biasanya berada di `app/build/outputs/apk/debug/app-debug.apk`.

## Pengujian wajib sebelum dibagikan
- Login siswa dan guru, termasuk proses pengalihan akun Google bila muncul.
- Logout dan login kembali.
- Buka materi, video, dan tautan.
- Unggah tugas dari galeri dan file manager.
- Unduh PDF/berkas.
- Uji kuis, timer, penyimpanan jawaban, dan navigasi tombol kembali.
- Uji pada beberapa versi Android dan ukuran layar.

## Catatan penting
- Aplikasi memerlukan internet.
- Data dan autentikasi tetap dikelola oleh Web App PINTARY dan Google Apps Script.
- Pembaruan HTML/CSS/JavaScript di server dapat tampil setelah deployment Web App diperbarui dan aplikasi dimuat ulang.
- Perubahan native Android (ikon, nama paket, perilaku WebView) memerlukan APK baru.
- WebView tidak otomatis menjamin semua alur login Google, unggah, dan unduh akan bekerja di semua perangkat. Jika alur Google menolak WebView, login mungkin perlu dibuka melalui Chrome atau pendekatan autentikasi yang disetujui Google.
- Jangan menambahkan `addJavascriptInterface` kecuali benar-benar diperlukan dan konten yang dimuat sepenuhnya dipercaya.
- Untuk distribusi luas, buat APK release yang ditandatangani dengan keystore milik pengelola. Simpan keystore dan kata sandinya dengan aman.
