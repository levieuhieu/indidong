# indidong - Modern Android Printing Application

🖨️ **In ảnh, PDF, Word, Excel, Website và văn bản trực tiếp từ thiết bị Android của bạn**

## Giới thiệu

**indidong** là một ứng dụng Android hiện đại cho phép người dùng:

- ✅ In ảnh
- ✅ In PDF
- ✅ In Word
- ✅ In Excel
- ✅ In Website
- ✅ In văn bản
- ✅ Quản lý máy in
- ✅ Chỉnh sửa cơ bản trước khi in

## Công nghệ

- **Kotlin 100%**
- **Jetpack Compose 100%**
- **Material Design 3**
- **MVVM Architecture**
- **Repository Pattern**
- **Clean Architecture**
- **Kotlin Coroutines**
- **Gradle Kotlin DSL**

## Yêu cầu hệ thống

- Android SDK: Min API 24 (Android 7.0), Target API 34+
- Android Studio: Phiên bản mới nhất
- JDK: 17+
- Gradle: 8.0+

## Cài đặt

```bash
# Clone repository
git clone https://github.com/levieuhieu/indidong.git
cd indidong

# Mở trong Android Studio
open -a "Android Studio" .
```

## Xây dựng & Chạy

```bash
# Build debug APK
./gradlew assembleDebug

# Chạy trên thiết bị
./gradlew installDebug
```

## Cấu trúc dự án

```
indidong/
├── app/
│   ├── src/main/
│   │   ├── java/com/indidong/
│   │   │   ├── ui/
│   │   │   ├── navigation/
│   │   │   ├── theme/
│   │   │   ├── repository/
│   │   │   ├── datasource/
│   │   │   ├── model/
│   │   │   ├── service/
│   │   │   └── util/
│   │   └── res/
│   └── build.gradle.kts
├── gradle/
├── settings.gradle.kts
├── build.gradle.kts
└── README.md
```

## Roadmap

### Sprint 1 ✅
- [x] Khởi tạo Project
- [x] Setup Gradle & Dependencies
- [x] Material Design 3 Theme
- [x] Navigation Compose
- [x] Dashboard Screen
- [x] Git & GitHub Setup
- [x] README & CHANGELOG
- [ ] CI/CD (sau khi build ổn định)

### Sprint 2
- [ ] Image Selection & Capture
- [ ] Image Editing (Crop, Rotate, Flip, Resize)
- [ ] Image Filters (Brightness, Contrast, Saturation)
- [ ] Image Preview & Print

### Sprint 3
- [ ] PDF File Selection
- [ ] PDF Preview
- [ ] PDF Print

### Sprint 4
- [ ] Word File Selection
- [ ] Word Format Conversion
- [ ] Word Preview & Print

### Sprint 5
- [ ] Excel File Selection
- [ ] Sheet Selection
- [ ] Excel Preview & Print

### Sprint 6
- [ ] URL Input
- [ ] Website Preview
- [ ] Website Print

### Sprint 7
- [ ] USB Printer Support
- [ ] Bluetooth Printer Support
- [ ] Wi-Fi Printer Support

### Sprint 8
- [ ] Language Settings
- [ ] Light/Dark Theme Toggle
- [ ] Paper Size Settings
- [ ] Margins Settings
- [ ] Default Printer Settings

### Sprint 9
- [ ] Performance Optimization
- [ ] Testing

### Sprint 10
- [ ] Release Preparation v1.0

## Git Flow

Commit convention:

```
feat: Thêm tính năng mới
fix: Sửa lỗi
docs: Cập nhật documentation
refactor: Tái cấu trúc code
test: Thêm test
ci: Cập nhật CI/CD
```

## Đóng góp

Nếu bạn muốn đóng góp cho dự án, vui lòng:

1. Fork repository
2. Tạo branch feature (`git checkout -b feature/AmazingFeature`)
3. Commit changes (`git commit -m 'feat: Add amazing feature'`)
4. Push to branch (`git push origin feature/AmazingFeature`)
5. Open Pull Request

## License

MIT License - xem [LICENSE](LICENSE) để biết chi tiết

## Liên hệ

**Tác giả:** Levieuhieu
**Email:** levieuhieu@example.com
**GitHub:** [@levieuhieu](https://github.com/levieuhieu)

---

**Phiên bản hiện tại:** 0.1.0
**Trạng thái:** Đang phát triển (Sprint 1)
