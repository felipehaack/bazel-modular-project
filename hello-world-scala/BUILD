load("@io_bazel_rules_scala//scala:scala.bzl", "scala_binary", "scala_library")

packagePath = "src/main/scala/com/example/scala/"

scala_binary(
    name = "MainApp",
    main_class = "com.example.scala.MainApp",
    srcs = [
        packagePath + "MainApp.scala"
    ],
    deps = [
        ":printer",
        ":services"
    ]
)

scala_library(
    name = "printer",
    srcs = [
        packagePath + "helpers/Printer.scala"
    ]
)

scala_library(
    name = "services",
    srcs = glob([
        packagePath + "services/*.scala"
    ])
)