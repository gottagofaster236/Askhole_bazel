load("@rules_kotlin//kotlin:android.bzl", "kt_android_library")

package(
    default_visibility = ["//app:__subpackages__"],
)

kt_android_library(
    name = "askhole_lib",
    srcs = glob(["java/**/*.kt"]),
    manifest = "AndroidManifest.xml",
    resource_files = glob(["res/**"]),
    custom_package = "io.askhole",
    deps = [
        "@maven//:androidx_appcompat_appcompat",
        "@maven//:androidx_recyclerview_recyclerview",
        "@maven//:androidx_cardview_cardview",
        "@maven//:com_google_android_material_material",
        "@maven//:com_yuyakaido_android_card_stack_view",
        "@maven//:com_makeramen_roundedimageview",
        "@maven//:androidx_lifecycle_lifecycle_runtime",
        "@maven//:com_google_guava_guava",
    ],
)
